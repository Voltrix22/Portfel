/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inteliger.portfel;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 48602
 */
public class Content_Menu extends javax.swing.JFrame {

    GregorianCalendar kalendarz = new GregorianCalendar();
    
    public Content_Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        PortfelLabel = new javax.swing.JLabel();
        raportB = new javax.swing.JButton();
        nowyParagonB = new javax.swing.JButton();
        pensjaB = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        getOutButton = new javax.swing.JButton();
        jPopupMenu1.getAccessibleContext().setAccessibleName("RaportCreate");
        jPopupMenu1.getAccessibleContext().setAccessibleDescription("");
        jPopupMenu1.getAccessibleContext().setAccessibleParent(raportB);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portfel");
        setLocation(new java.awt.Point(700, 400));

        PortfelLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PortfelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortfelLabel.setText("Portfel");

        raportB.setText("Raport");
        raportB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raportBActionPerformed(evt);
                RaportCreate(evt);
            }
        });

        nowyParagonB.setText("Nowy Paragon");
        nowyParagonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nowyParagonBActionPerformed(evt);
            }
        });

        pensjaB.setText("Pensja");
        pensjaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pensjaBActionPerformed(evt);
            }
        });

        getOutButton.setText("Wyjście");
        getOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(raportB)
                        .addGap(56, 56, 56)
                        .addComponent(nowyParagonB)
                        .addGap(52, 52, 52)
                        .addComponent(pensjaB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(PortfelLabel)))
                .addGap(0, 78, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getOutButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PortfelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raportB)
                    .addComponent(nowyParagonB)
                    .addComponent(pensjaB))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(getOutButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raportBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raportBActionPerformed
        int dzien = kalendarz.get(Calendar.DAY_OF_MONTH);
        int miesiac = kalendarz.get(Calendar.MONTH+2);
        miesiac += 2;
        int rok = kalendarz.get(Calendar.YEAR);
        
        String nazwa = "Raport_"+dzien+"."+miesiac+"."+rok+".txt";
        
        File plik = new File("C:\\Users\\48602\\Desktop", nazwa);
        try {
            plik.createNewFile();
        } catch (IOException ex) {
            System.out.println("BŁĄD");
        }
    }//GEN-LAST:event_raportBActionPerformed

    private void nowyParagonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nowyParagonBActionPerformed
        Paragon paragon = new Paragon();
        paragon.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nowyParagonBActionPerformed

    private void RaportCreate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaportCreate
        
    }//GEN-LAST:event_RaportCreate

    private void getOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOutButtonActionPerformed
        System.exit(NORMAL);
    }//GEN-LAST:event_getOutButtonActionPerformed

    private void pensjaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pensjaBActionPerformed
        this.setVisible(false);
        Pensja pensja = new Pensja();
        pensja.setVisible(true);
    }//GEN-LAST:event_pensjaBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Content_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Content_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Content_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Content_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Content_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PortfelLabel;
    private javax.swing.JButton getOutButton;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton nowyParagonB;
    private javax.swing.JButton pensjaB;
    private javax.swing.JButton raportB;
    // End of variables declaration//GEN-END:variables
}
