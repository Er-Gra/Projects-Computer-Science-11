/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ergra0573
 */
public class MakingPurchases extends javax.swing.JFrame {

    /**
     * Creates new form MakingPurchases
     */
    public MakingPurchases() {
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

        lblTitle = new javax.swing.JLabel();
        lblInstruct1 = new javax.swing.JLabel();
        lblInstruct2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lblLemon = new javax.swing.JLabel();
        lblApple = new javax.swing.JLabel();
        lblBlueberry = new javax.swing.JLabel();
        lblCoconut = new javax.swing.JLabel();
        lblStrawberry = new javax.swing.JLabel();
        txtLemon = new javax.swing.JTextField();
        txtApple = new javax.swing.JTextField();
        txtBlueberry = new javax.swing.JTextField();
        txtCoconut = new javax.swing.JTextField();
        txtStrawberry = new javax.swing.JTextField();
        lblTaxes = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        lblTaxOut = new javax.swing.JLabel();
        lblSubtotalOut = new javax.swing.JLabel();
        lblGrandtotalOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Trajan Pro", 3, 20)); // NOI18N
        lblTitle.setText("Sara's Pies");

        lblInstruct1.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        lblInstruct1.setText("Enter the number of each pie you would");

        lblInstruct2.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        lblInstruct2.setText(" like to purchase and click Calculate");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        btnCalculate.setBackground(new java.awt.Color(0, 153, 51));
        btnCalculate.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(102, 51, 0));
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblLemon.setFont(new java.awt.Font("Trajan Pro", 0, 20)); // NOI18N
        lblLemon.setText("Lemon Pie ($10.25):");

        lblApple.setFont(new java.awt.Font("Trajan Pro", 0, 20)); // NOI18N
        lblApple.setText("Apple Pie ($9.99):");

        lblBlueberry.setFont(new java.awt.Font("Trajan Pro", 0, 20)); // NOI18N
        lblBlueberry.setText("Blueberry Pie ($12.50):");

        lblCoconut.setFont(new java.awt.Font("Trajan Pro", 0, 20)); // NOI18N
        lblCoconut.setText("Coconut Pie ($11.99):");

        lblStrawberry.setFont(new java.awt.Font("Trajan Pro", 0, 20)); // NOI18N
        lblStrawberry.setText("Strawberry Pie ($9.89):");

        txtLemon.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        txtLemon.setText("0");
        txtLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLemonActionPerformed(evt);
            }
        });

        txtApple.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        txtApple.setText("0");

        txtBlueberry.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        txtBlueberry.setText("0");

        txtCoconut.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        txtCoconut.setText("0");

        txtStrawberry.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        txtStrawberry.setText("0");

        lblTaxes.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        lblTaxes.setText("Taxes(13%):");

        lblSubtotal.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        lblGrandTotal.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        lblGrandTotal.setText("Grand Total:");

        lblTaxOut.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        lblTaxOut.setText("$0.00");

        lblSubtotalOut.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        lblSubtotalOut.setText("$0.00");

        lblGrandtotalOut.setFont(new java.awt.Font("Trajan Pro", 0, 15)); // NOI18N
        lblGrandtotalOut.setText("$0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblInstruct1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInstruct2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtStrawberry, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtApple, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCoconut, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtBlueberry, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(txtLemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(btnCalculate))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTaxes)
                                                    .addComponent(lblSubtotal)
                                                    .addComponent(lblGrandTotal))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblGrandtotalOut)
                                                    .addComponent(lblSubtotalOut)
                                                    .addComponent(lblTaxOut)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblLemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblApple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblBlueberry)
                            .addComponent(lblCoconut)
                            .addComponent(lblStrawberry))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInstruct1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruct2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtLemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaxOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApple, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotalOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBlueberry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBlueberry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCoconut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrandtotalOut))
                    .addComponent(lblCoconut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        lblTaxOut.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLemonActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Declared variables
        int lemon = 0;
        double lemonTotal = 0.0;
        int apple = 0;
        double appleTotal = 0.0;
        int blueberry = 0;
        double blueberryTotal = 0.0;
        int coconut = 0;
        double coconutTotal = 0.0;
        int strawberry = 0;
        double strawberryTotal = 0.0;
        final double TAX = 0.13;
        double totalTax = 0;
        double subtotal = 0;
        double grandtotal = 0;
        
        //get inputs from the user
        lemon = Integer.parseInt(txtLemon.getText());
        apple = Integer.parseInt(txtApple.getText());
        blueberry = Integer.parseInt(txtBlueberry.getText());
        coconut = Integer.parseInt(txtCoconut.getText());
        strawberry = Integer.parseInt(txtStrawberry.getText());
        
        //perform calculations
        lemonTotal = lemon * 10.25;
        appleTotal = apple * 9.99;
        blueberryTotal = blueberry * 12.50;
        coconutTotal = coconut * 11.99;
        strawberryTotal = strawberry * 9.89;
        
        //final calculations
        subtotal = lemonTotal + appleTotal + blueberryTotal + coconutTotal + strawberryTotal;
        totalTax = subtotal * TAX;
        grandtotal = subtotal + totalTax;
        
        //rounding to two decimal places
        subtotal = subtotal * 100;
        subtotal = Math.round(subtotal);
        subtotal = subtotal /100;
        
        totalTax = totalTax * 100;
        totalTax = Math.round(totalTax);
        totalTax = totalTax /100;
        
        grandtotal = grandtotal * 100;
        grandtotal = Math.round(grandtotal);
        grandtotal = grandtotal / 100;
        
        //output information to the user
        lblTaxOut.setText(String.valueOf(totalTax));
        lblSubtotalOut.setText(String.valueOf(subtotal));
        lblGrandtotalOut.setText(String.valueOf(grandtotal));
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakingPurchases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblApple;
    private javax.swing.JLabel lblBlueberry;
    private javax.swing.JLabel lblCoconut;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblGrandtotalOut;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstruct1;
    private javax.swing.JLabel lblInstruct2;
    private javax.swing.JLabel lblLemon;
    private javax.swing.JLabel lblStrawberry;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotalOut;
    private javax.swing.JLabel lblTaxOut;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtApple;
    private javax.swing.JTextField txtBlueberry;
    private javax.swing.JTextField txtCoconut;
    private javax.swing.JTextField txtLemon;
    private javax.swing.JTextField txtStrawberry;
    // End of variables declaration//GEN-END:variables
}