/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.VisitorManagement;

import closermeapp.Bussiness.Interfaces.MemberManager;
import closermeapp.Bussiness.MemberManager.MembersManager;


public class MemberRegistrationView extends javax.swing.JFrame {

    /**
     * Creates new form MemberRegistrationView
     */
    public MemberRegistrationView() {
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

        memberGeneralDataPanel = new javax.swing.JPanel();
        memberNameLabel = new javax.swing.JLabel();
        memberNameTextBox = new javax.swing.JTextField();
        memberPhoneLabel = new javax.swing.JLabel();
        memberPhoneTextBox = new javax.swing.JTextField();
        memberCelPhoneLabel = new javax.swing.JLabel();
        memberCelPhoneTextBox = new javax.swing.JTextField();
        addressSubPanel = new javax.swing.JPanel();
        memberAdressStreetLabel = new javax.swing.JLabel();
        memberAdressStreetTextBox = new javax.swing.JTextField();
        memberAdressNumberLabel = new javax.swing.JLabel();
        memberAdressNumberTextBox = new javax.swing.JTextField();
        memberAdressSidesLabel = new javax.swing.JLabel();
        memberAdressFirstSideTextBox = new javax.swing.JTextField();
        andWordLabel = new javax.swing.JLabel();
        memberAdressSecondSideTextBox = new javax.swing.JTextField();
        memberAdressNeightboorLabel = new javax.swing.JLabel();
        memberAdressNeightboorTextBox = new javax.swing.JTextField();
        membershipInformationPanel = new javax.swing.JPanel();
        membershipTypeLabel = new javax.swing.JLabel();
        membershipTypeComboBox = new javax.swing.JComboBox();
        membershipDiscountLabel = new javax.swing.JLabel();
        membershipDiscountTextBox = new javax.swing.JTextField();
        addMemberButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        memberGeneralDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales"));

        memberNameLabel.setText("Nombre:");

        memberNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberNameTextBoxActionPerformed(evt);
            }
        });

        memberPhoneLabel.setText("Telefono: ");

        memberCelPhoneLabel.setText("Celular:");

        addressSubPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));

        memberAdressStreetLabel.setText("Calle");

        memberAdressNumberLabel.setText("Numero");

        memberAdressNumberTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberAdressNumberTextBoxActionPerformed(evt);
            }
        });

        memberAdressSidesLabel.setText("Cruzamientos:");

        memberAdressFirstSideTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberAdressFirstSideTextBoxActionPerformed(evt);
            }
        });

        andWordLabel.setText("y");

        memberAdressNeightboorLabel.setText("Colonia:");

        javax.swing.GroupLayout addressSubPanelLayout = new javax.swing.GroupLayout(addressSubPanel);
        addressSubPanel.setLayout(addressSubPanelLayout);
        addressSubPanelLayout.setHorizontalGroup(
                addressSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addressSubPanelLayout.createSequentialGroup()
                                .addComponent(memberAdressStreetLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressStreetTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressSidesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressFirstSideTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(andWordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressSecondSideTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGroup(addressSubPanelLayout.createSequentialGroup()
                                .addComponent(memberAdressNeightboorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberAdressNeightboorTextBox))
        );
        addressSubPanelLayout.setVerticalGroup(
                addressSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addressSubPanelLayout.createSequentialGroup()
                                .addGroup(addressSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(memberAdressStreetLabel)
                                        .addComponent(memberAdressStreetTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberAdressNumberLabel)
                                        .addComponent(memberAdressNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberAdressSidesLabel)
                                        .addComponent(memberAdressFirstSideTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(andWordLabel)
                                        .addComponent(memberAdressSecondSideTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addressSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(memberAdressNeightboorLabel)
                                        .addComponent(memberAdressNeightboorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout memberGeneralDataPanelLayout = new javax.swing.GroupLayout(memberGeneralDataPanel);
        memberGeneralDataPanel.setLayout(memberGeneralDataPanelLayout);
        memberGeneralDataPanelLayout.setHorizontalGroup(
                memberGeneralDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberGeneralDataPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(memberGeneralDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, memberGeneralDataPanelLayout.createSequentialGroup()
                                                .addComponent(memberNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(memberNameTextBox))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, memberGeneralDataPanelLayout.createSequentialGroup()
                                                .addComponent(memberPhoneLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(memberPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(memberCelPhoneLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(memberCelPhoneTextBox)))
                                .addContainerGap())
                        .addComponent(addressSubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        memberGeneralDataPanelLayout.setVerticalGroup(
                memberGeneralDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(memberGeneralDataPanelLayout.createSequentialGroup()
                                .addGroup(memberGeneralDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(memberNameLabel)
                                        .addComponent(memberNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(memberGeneralDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(memberPhoneLabel)
                                        .addComponent(memberPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberCelPhoneLabel)
                                        .addComponent(memberCelPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(addressSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        membershipInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Membresia"));

        membershipTypeLabel.setText("Tipo:");

        membershipTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Semanal", "Mensual", "Anual"}));

        membershipDiscountLabel.setText("Descuento:");

        javax.swing.GroupLayout membershipInformationPanelLayout = new javax.swing.GroupLayout(membershipInformationPanel);
        membershipInformationPanel.setLayout(membershipInformationPanelLayout);
        membershipInformationPanelLayout.setHorizontalGroup(
                membershipInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(membershipInformationPanelLayout.createSequentialGroup()
                                .addGroup(membershipInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(membershipInformationPanelLayout.createSequentialGroup()
                                                .addComponent(membershipTypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(membershipTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(membershipInformationPanelLayout.createSequentialGroup()
                                                .addComponent(membershipDiscountLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(membershipDiscountTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        membershipInformationPanelLayout.setVerticalGroup(
                membershipInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(membershipInformationPanelLayout.createSequentialGroup()
                                .addGroup(membershipInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(membershipTypeLabel)
                                        .addComponent(membershipTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(membershipInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(membershipDiscountLabel)
                                        .addComponent(membershipDiscountTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        addMemberButton.setText("Agregar");
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(memberGeneralDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(membershipInformationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(addMemberButton)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(memberGeneralDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(membershipInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addMemberButton)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        String name = this.memberNameTextBox.getText();
        String phone = this.memberPhoneTextBox.getText();
        String adress = this.memberAdressStreetTextBox.getText() + " " +
                this.memberAdressNumberTextBox.getText() + " " +
                this.memberAdressFirstSideTextBox.getText() + " y " +
                this.memberAdressSecondSideTextBox.getText() + " " +
                this.memberAdressNeightboorTextBox.getText();
        String celPhone = this.memberCelPhoneTextBox.getText();
        String membershipType = "weekly";
        double discount = Double.parseDouble(this.membershipDiscountTextBox.getText());

        MemberManager memberManager = new MembersManager();
        memberManager.addMemberWithMemberhip(name, phone, adress, celPhone, membershipType, discount);

    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void memberNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberNameTextBoxActionPerformed

    private void memberAdressNumberTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberAdressNumberTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberAdressNumberTextBoxActionPerformed

    private void memberAdressFirstSideTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberAdressFirstSideTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberAdressFirstSideTextBoxActionPerformed

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
            java.util.logging.Logger.getLogger(MemberRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberRegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberButton;
    private javax.swing.JPanel addressSubPanel;
    private javax.swing.JLabel andWordLabel;
    private javax.swing.JTextField memberAdressFirstSideTextBox;
    private javax.swing.JLabel memberAdressNeightboorLabel;
    private javax.swing.JTextField memberAdressNeightboorTextBox;
    private javax.swing.JLabel memberAdressNumberLabel;
    private javax.swing.JTextField memberAdressNumberTextBox;
    private javax.swing.JTextField memberAdressSecondSideTextBox;
    private javax.swing.JLabel memberAdressSidesLabel;
    private javax.swing.JLabel memberAdressStreetLabel;
    private javax.swing.JTextField memberAdressStreetTextBox;
    private javax.swing.JLabel memberCelPhoneLabel;
    private javax.swing.JTextField memberCelPhoneTextBox;
    private javax.swing.JPanel memberGeneralDataPanel;
    private javax.swing.JLabel memberNameLabel;
    private javax.swing.JTextField memberNameTextBox;
    private javax.swing.JLabel memberPhoneLabel;
    private javax.swing.JTextField memberPhoneTextBox;
    private javax.swing.JLabel membershipDiscountLabel;
    private javax.swing.JTextField membershipDiscountTextBox;
    private javax.swing.JPanel membershipInformationPanel;
    private javax.swing.JComboBox membershipTypeComboBox;
    private javax.swing.JLabel membershipTypeLabel;
    // End of variables declaration//GEN-END:variables
}
