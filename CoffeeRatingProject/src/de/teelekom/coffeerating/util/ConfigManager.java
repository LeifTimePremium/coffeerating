/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.teelekom.coffeerating.util;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigManager {

    private static final String CONFIG_FILE = "config.properties";
    private final Properties properties = new Properties();
    private final Path configPath;

    public ConfigManager() {
        this.configPath = Paths.get(CONFIG_FILE);
        ensureConfigFileExists();
        loadProperties();
    }

    /**
     * Prüft, ob die Config-Datei existiert, und legt sie ggf. an.
     */
    private void ensureConfigFileExists() {
        try {
            if (Files.notExists(configPath)) {
                Files.createFile(configPath);
                System.out.println("Config-Datei angelegt: " + configPath.toAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Anlegen der Config-Datei: " + e.getMessage());
        }
    }

    /**
     * Lädt vorhandene Properties aus der Datei (falls welche da sind).
     */
    private void loadProperties() {
        try (FileInputStream in = new FileInputStream(configPath.toFile())) {
            properties.load(in);
        } catch (IOException e) {
            // Datei ist leer oder nicht lesbar – wir können später trotzdem speichern
        }
    }

    /**
     * Liest den gespeicherten Benutzernamen (oder null, falls noch keiner gesetzt).
     */
    public String getUsername() {
        return properties.getProperty("username");
    }

    /**
     * Speichert den übergebenen Benutzernamen in der Config-Datei.
     */
    public void setUsername(String username) {
        properties.setProperty("username", username);
        saveProperties();
    }

    /**
     * Schreibt die Properties in die Datei.
     */
    private void saveProperties() {
        try (FileOutputStream out = new FileOutputStream(configPath.toFile())) {
            properties.store(out, "Application Configuration");
            System.out.println("Benutzername gespeichert: " + properties.getProperty("username"));
        } catch (IOException e) {
            System.err.println("Fehler beim Speichern der Config: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ConfigManager cfg = new ConfigManager();

        // Beispiel: vorhandenen Benutzernamen auslesen
        String existingUser = cfg.getUsername();
        if (existingUser != null) {
            System.out.println("Aktueller Benutzer: " + existingUser);
        } else {
            System.out.println("Noch kein Benutzer gesetzt.");
        }

        // Beispiel: neuen Benutzernamen setzen
        String newUser = "MaxMustermann";
        cfg.setUsername(newUser);
    }
}
