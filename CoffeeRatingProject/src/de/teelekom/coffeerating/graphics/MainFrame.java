/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package de.teelekom.coffeerating.graphics;
import java.util.ArrayList;
import de.teelekom.coffeerating.util.JDBCOperator;
import de.teelekom.coffeerating.util.Item;
import de.teelekom.coffeerating.main.Main;
import de.teelekom.coffeerating.graphics.StartPage;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.SwingUtilities;


/**
 *
 * @author deter
 */
public class MainFrame extends javax.swing.JPanel {

    private int sqlDataCounter = 0;
    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nav_ViewRatings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Nav_Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nav_AddRating = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nav_Filler = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        New_Rating_Panel = new javax.swing.JPanel();
        ratingPanel = new javax.swing.JPanel();
        priceSlider = new javax.swing.JSlider();
        tasteLabel = new javax.swing.JLabel();
        taste_Slider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        commitPanel = new javax.swing.JPanel();
        sendReviewButton = new javax.swing.JButton();
        cancelReviewButton = new javax.swing.JButton();
        attributesPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nameLabel = new javax.swing.JLabel();
        calorieLabel = new javax.swing.JLabel();
        caffeineLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        allergyLabel = new javax.swing.JLabel();
        HomePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 105, 122));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nav_ViewRatings.setBackground(new java.awt.Color(72, 159, 181));
        Nav_ViewRatings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_ViewRatingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_ViewRatingsMouseExited(evt);
            }
        });
        Nav_ViewRatings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Ratings");
        Nav_ViewRatings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel1.add(Nav_ViewRatings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 90, 30));

        Nav_Home.setBackground(new java.awt.Color(72, 159, 181));
        Nav_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_HomeMouseExited(evt);
            }
        });
        Nav_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        Nav_Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel1.add(Nav_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 30));

        Nav_AddRating.setBackground(new java.awt.Color(72, 159, 181));
        Nav_AddRating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_AddRatingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NavAddRatingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NavAddRatingMouseExited(evt);
            }
        });
        Nav_AddRating.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New Rating");
        Nav_AddRating.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel1.add(Nav_AddRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 90, 30));

        Nav_Filler.setBackground(new java.awt.Color(72, 159, 181));
        Nav_Filler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_FillerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_FillerMouseExited(evt);
            }
        });
        Nav_Filler.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Filler");
        Nav_Filler.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel1.add(Nav_Filler, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 90, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 460));

        jPanel2.setBackground(new java.awt.Color(22, 105, 122));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 770, 70));

        jPanel3.setBackground(new java.awt.Color(237, 231, 227));
        jPanel3.setLayout(new java.awt.CardLayout());

        New_Rating_Panel.setBackground(new java.awt.Color(237, 231, 227));
        New_Rating_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ratingPanel.setBackground(new java.awt.Color(237, 231, 227));
        ratingPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        ratingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        priceSlider.setMaximum(90);
        priceSlider.setMinimum(10);
        priceSlider.setMinorTickSpacing(10);
        priceSlider.setPaintLabels(true);
        priceSlider.setToolTipText("");
        priceSlider.setName("rating_slider"); // NOI18N
        priceSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                priceSliderMouseDragged(evt);
            }
        });
        ratingPanel.add(priceSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, -1));
        priceSlider.getAccessibleContext().setAccessibleName("ppcSlider");

        tasteLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tasteLabel.setForeground(new java.awt.Color(51, 51, 51));
        tasteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasteLabel.setText("Taste: 5/10");
        ratingPanel.add(tasteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, -1));

        taste_Slider.setMaximum(10);
        taste_Slider.setMinimum(1);
        taste_Slider.setPaintLabels(true);
        taste_Slider.setToolTipText("");
        taste_Slider.setValue(5);
        taste_Slider.setName("rating_slider"); // NOI18N
        taste_Slider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                taste_SliderMouseDragged(evt);
            }
        });
        ratingPanel.add(taste_Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        taste_Slider.getAccessibleContext().setAccessibleName("tasteSlider");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Price per serving: 50 c");
        jLabel6.setToolTipText("");
        ratingPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 20));

        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(5);
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        ratingPanel.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total rating: 5/10");
        ratingPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(237, 231, 227));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ratingPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 100));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Comment");
        ratingPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        New_Rating_Panel.add(ratingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 250, 370));

        commitPanel.setBackground(new java.awt.Color(237, 231, 227));
        commitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sendReviewButton.setBackground(new java.awt.Color(255, 166, 43));
        sendReviewButton.setForeground(new java.awt.Color(0, 0, 0));
        sendReviewButton.setText("Send review");
        sendReviewButton.setFocusPainted(false);
        sendReviewButton.setFocusable(false);
        sendReviewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendReviewButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendReviewButtonMouseExited(evt);
            }
        });
        sendReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReviewButtonActionPerformed(evt);
            }
        });
        commitPanel.add(sendReviewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 50));

        cancelReviewButton.setBackground(new java.awt.Color(255, 166, 43));
        cancelReviewButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelReviewButton.setText("Cancel");
        cancelReviewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelReviewButtonMouseClicked(evt);
            }
        });
        cancelReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReviewButtonActionPerformed(evt);
            }
        });
        commitPanel.add(cancelReviewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 50));

        New_Rating_Panel.add(commitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 180, 250));

        attributesPanel.setBackground(new java.awt.Color(237, 231, 227));
        attributesPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.black, null, null));
        attributesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(72, 159, 181));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        attributesPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Choose Coffee");
        attributesPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, -1));

        calorieLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calorieLabel.setForeground(new java.awt.Color(0, 0, 0));
        calorieLabel.setText("Calories per serving: ");
        attributesPanel.add(calorieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        caffeineLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caffeineLabel.setForeground(new java.awt.Color(0, 0, 0));
        caffeineLabel.setText("Caffeine per serving:");
        attributesPanel.add(caffeineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, -1));

        typeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Type: ");
        attributesPanel.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, -1));

        allergyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allergyLabel.setForeground(new java.awt.Color(0, 0, 0));
        allergyLabel.setText("Allergy information:");
        attributesPanel.add(allergyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, -1));

        New_Rating_Panel.add(attributesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 370));

        jPanel3.add(New_Rating_Panel, "card2");

        HomePanel.setBackground(new java.awt.Color(237, 231, 227));
        jPanel3.add(HomePanel, "card3");

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 750, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void sendReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReviewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendReviewButtonActionPerformed

    private void cancelReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReviewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelReviewButtonActionPerformed

    private void taste_SliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taste_SliderMouseDragged
         if(evt.getSource() == taste_Slider) {
            tasteLabel.setText("Taste: " + taste_Slider.getValue() + " /10");
        }
    }//GEN-LAST:event_taste_SliderMouseDragged

    private void priceSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceSliderMouseDragged
        if(evt.getSource() == priceSlider) {
            jLabel6.setText("Price per serving: " + priceSlider.getValue() + " c");
        }
    }//GEN-LAST:event_priceSliderMouseDragged

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
       if(evt.getSource() == jSlider1) {
            jLabel5.setText("Total rating: " + jSlider1.getValue() + " /10");
        }
    }//GEN-LAST:event_jSlider1MouseDragged

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        if(sqlDataCounter == 0) {
        StartPage page2 = (StartPage) SwingUtilities.getWindowAncestor(this);
        LoginPanel lgnPanel = page2.getLgnPanel();
        JDBCOperator operator = lgnPanel.getOperator();
        ArrayList<String> names = operator.getCoffeeNames();
        jComboBox1.removeAllItems();
        jComboBox1.addItem("SELECT");
        for(String s : names) {
        jComboBox1.addItem(s);
    }
         sqlDataCounter++;
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        StartPage page2 = (StartPage) SwingUtilities.getWindowAncestor(this);
        LoginPanel lgnPanel = page2.getLgnPanel();
        JDBCOperator operator = lgnPanel.getOperator();
        
        if(jComboBox1.getSelectedItem() != "SELECT") {
            Item i = operator.findByName(String.valueOf(jComboBox1.getSelectedItem()));
            typeLabel.setText("Type: " + i.getType());
            calorieLabel.setText("Calories per serving: " + i.getCalories());
            caffeineLabel.setText("Caffeine per serving: " + i.getCaffeine());
            allergyLabel.setText("Allergy information: " + i.getAllergyInfo());
        } 
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void sendReviewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendReviewButtonMouseClicked
        
        String name = String.valueOf(jComboBox1.getSelectedItem());
        
        if(!name.equals("SELECTED")) {
        StartPage page2 = (StartPage) SwingUtilities.getWindowAncestor(this);
        LoginPanel lgnPanel = page2.getLgnPanel();
        JDBCOperator operator = lgnPanel.getOperator();    
            
        double taste = taste_Slider.getValue();
        int price = priceSlider.getValue();
        double pricePerformance = (taste + price)  / 2;
        String comment = jTextArea1.getText();
        double totalRating = jSlider1.getValue();
        operator.postReview(name, taste, price, pricePerformance, comment, totalRating);
        CardLayout layout = (CardLayout) jPanel3.getLayout();
        resetRatingView();
        layout.show(jPanel3, "card3");
        
        
        }
    }//GEN-LAST:event_sendReviewButtonMouseClicked

    private void cancelReviewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelReviewButtonMouseClicked
        CardLayout layout = (CardLayout) jPanel3.getLayout();
        resetRatingView();
        layout.show(jPanel3, "card3");
        
    }//GEN-LAST:event_cancelReviewButtonMouseClicked

    private void sendReviewButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendReviewButtonMouseExited
        
    }//GEN-LAST:event_sendReviewButtonMouseExited

    private void Nav_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_HomeMouseEntered
        Nav_Home.setBackground(new Color(255, 166, 43));
    }//GEN-LAST:event_Nav_HomeMouseEntered

    private void Nav_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_HomeMouseExited
        Nav_Home.setBackground(new Color(72, 159, 181));
    }//GEN-LAST:event_Nav_HomeMouseExited

    private void Nav_ViewRatingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_ViewRatingsMouseEntered
        Nav_ViewRatings.setBackground(new Color(255, 166, 43));
    }//GEN-LAST:event_Nav_ViewRatingsMouseEntered

    private void Nav_ViewRatingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_ViewRatingsMouseExited
        Nav_ViewRatings.setBackground(new Color(72, 159, 181));
    }//GEN-LAST:event_Nav_ViewRatingsMouseExited

    private void Nav_FillerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_FillerMouseEntered
        Nav_Filler.setBackground(new Color(255, 166, 43));
    }//GEN-LAST:event_Nav_FillerMouseEntered

    private void Nav_FillerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_FillerMouseExited
        Nav_Filler.setBackground(new Color(72, 159, 181));
    }//GEN-LAST:event_Nav_FillerMouseExited

    private void NavAddRatingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavAddRatingMouseEntered
        Nav_AddRating.setBackground(new Color(255, 166, 43));
    }//GEN-LAST:event_NavAddRatingMouseEntered

    private void NavAddRatingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavAddRatingMouseExited
        Nav_AddRating.setBackground(new Color(72, 159, 181));
    }//GEN-LAST:event_NavAddRatingMouseExited

    private void Nav_AddRatingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_AddRatingMouseClicked
        CardLayout layout = (CardLayout) jPanel3.getLayout();
        resetRatingView();
        layout.show(jPanel3, "card2");
    }//GEN-LAST:event_Nav_AddRatingMouseClicked

    private void Nav_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_HomeMouseClicked
        CardLayout layout = (CardLayout) jPanel3.getLayout();
        layout.show(jPanel3, "card3");
    }//GEN-LAST:event_Nav_HomeMouseClicked
   
    private void resetRatingView() {
        taste_Slider.setValue(5);
        tasteLabel.setText("Taste: 5/10");
        priceSlider.setValue(50);
        jLabel6.setText("Price per serving: 50 c");
        jTextArea1.setText("");
        jSlider1.setValue(5);
        jLabel5.setText("Total rating: 5/10");
        jComboBox1.setSelectedItem("SELECT");
        typeLabel.setText("Type: ");
        caffeineLabel.setText("Caffeine per serving: ");
        calorieLabel.setText("Calories per serving: ");
        allergyLabel.setText("Allergy information: ");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel Nav_AddRating;
    private javax.swing.JPanel Nav_Filler;
    private javax.swing.JPanel Nav_Home;
    private javax.swing.JPanel Nav_ViewRatings;
    private javax.swing.JPanel New_Rating_Panel;
    private javax.swing.JLabel allergyLabel;
    private javax.swing.JPanel attributesPanel;
    private javax.swing.JLabel caffeineLabel;
    private javax.swing.JLabel calorieLabel;
    private javax.swing.JButton cancelReviewButton;
    private javax.swing.JPanel commitPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JSlider priceSlider;
    private javax.swing.JPanel ratingPanel;
    private javax.swing.JButton sendReviewButton;
    private javax.swing.JLabel tasteLabel;
    private javax.swing.JSlider taste_Slider;
    private javax.swing.JLabel typeLabel;
        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
}
