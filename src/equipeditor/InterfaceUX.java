package equipeditor;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class InterfaceUX extends javax.swing.JFrame {
    
    Methods me = new Methods();

    public InterfaceUX() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos/IconEquipEditor.png")).getImage());
        btnChange1.setEnabled(false);
        btnChange2.setEnabled(false);
        new TextFilter(txtMega);
        new TextFilter(txtOthers);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FinalMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMega = new javax.swing.JTextField();
        btnOpen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnChange1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtOthers = new javax.swing.JTextField();
        btnChange2 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equip Editor");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FinalMessage.setBackground(new java.awt.Color(0, 30, 30));
        FinalMessage.setForeground(new java.awt.Color(0, 0, 0));
        FinalMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/TextPanel3.png"))); // NOI18N
        jPanel1.add(FinalMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/megamorph.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 0, -1, -1));

        txtMega.setBackground(new java.awt.Color(194, 194, 194));
        txtMega.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtMega.setForeground(new java.awt.Color(15, 15, 15));
        txtMega.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        txtMega.setCaretColor(new java.awt.Color(48, 22, 98));
        txtMega.setPreferredSize(new java.awt.Dimension(80, 36));
        txtMega.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        txtMega.setSelectionColor(new java.awt.Color(48, 22, 98));
        jPanel1.add(txtMega, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 260, 250, -1));

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/JButtomSLUS.png"))); // NOI18N
        btnOpen.setBorder(null);
        btnOpen.setBorderPainted(false);
        btnOpen.setContentAreaFilled(false);
        btnOpen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/JButtomPRESS.png"))); // NOI18N
        btnOpen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/JButtomROLL.png"))); // NOI18N
        btnOpen.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/JButtomROLL.png"))); // NOI18N
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 142, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 15, 15));
        jLabel2.setText("Megamorph:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 242, 130, 20));

        btnChange1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Change.png"))); // NOI18N
        btnChange1.setBorder(null);
        btnChange1.setBorderPainted(false);
        btnChange1.setContentAreaFilled(false);
        btnChange1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeDISA.png"))); // NOI18N
        btnChange1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeDISA.png"))); // NOI18N
        btnChange1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangePRESS.png"))); // NOI18N
        btnChange1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeROLL.png"))); // NOI18N
        btnChange1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeROLL.png"))); // NOI18N
        btnChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnChange1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 15, 15));
        jLabel3.setText("Others:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 357, 130, 20));

        txtOthers.setBackground(new java.awt.Color(194, 194, 194));
        txtOthers.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtOthers.setForeground(new java.awt.Color(15, 15, 15));
        txtOthers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        txtOthers.setCaretColor(new java.awt.Color(48, 22, 98));
        txtOthers.setPreferredSize(new java.awt.Dimension(80, 36));
        txtOthers.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        txtOthers.setSelectionColor(new java.awt.Color(48, 22, 98));
        jPanel1.add(txtOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 375, 250, -1));

        btnChange2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Change.png"))); // NOI18N
        btnChange2.setBorder(null);
        btnChange2.setBorderPainted(false);
        btnChange2.setContentAreaFilled(false);
        btnChange2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeDISA.png"))); // NOI18N
        btnChange2.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeDISA.png"))); // NOI18N
        btnChange2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangePRESS.png"))); // NOI18N
        btnChange2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeROLL.png"))); // NOI18N
        btnChange2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ChangeROLL.png"))); // NOI18N
        btnChange2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnChange2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 375, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnClo.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCloPRESS.png"))); // NOI18N
        btnClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCloROLL.png"))); // NOI18N
        btnClose.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCloROLL.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, -1, -1));

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMin.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.setBorderPainted(false);
        btnMin.setContentAreaFilled(false);
        btnMin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMinPRESS.png"))); // NOI18N
        btnMin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMinROLL.png"))); // NOI18N
        btnMin.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMinROLL.png"))); // NOI18N
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 19, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // Minimizar:
        setState(InterfaceUX.ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // Salir
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // Instanciando objeto JFileChooser:
        JFileChooser slus = new JFileChooser();
        //Creando el filtro
        FileNameExtensionFilter slusFilter = new FileNameExtensionFilter("SLUS_014", "11");
        //Le pasamos el filtro
        slus.setFileFilter(slusFilter);
        //Abrimos la ventana y guardamos la opción del usuario
        int select = slus.showOpenDialog(this);
        
        if (select == JFileChooser.APPROVE_OPTION) {
            File archivo = slus.getSelectedFile();
            me.setArchivo(archivo);
            JOptionPane.showMessageDialog(null, "Data loaded successfully!");
            
            //Habilitando botones para cambiar los valores
            btnChange1.setEnabled(true);
            btnChange2.setEnabled(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Select the file SLUS_014.11!");
          }
        
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange1ActionPerformed
        // Declaramos variables que serán enviadas al método que modifica los valores:
        short valorMega = Short.parseShort(txtMega.getText());
        File slus014 = me.getArchivo();
        
        //Condición para que el usuario ingrese valores dentro de un rango establecido
        if (valorMega >= 1 && valorMega <=10000) {
        me.ChangeMega(slus014, valorMega); //Llamamos al método que sobreescribe los valores
        } else {
            JOptionPane.showMessageDialog(null, "Enter a valid value!"); //Si no se cumple se muestra mensaje
            txtMega.setText("0"); // Se establece valor 0 defecto
          }
        
    }//GEN-LAST:event_btnChange1ActionPerformed

    private void btnChange2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange2ActionPerformed
        // Declaramos variables que serán enviadas al método que modifica los valores:
        short valorOthers = Short.parseShort(txtOthers.getText());
        File slus014 = me.getArchivo();
        
        //Condición para que el usuario ingrese valores dentro de un rango establecido
        if (valorOthers >= 1 && valorOthers <=10000) {
        me.changeOthers(slus014, valorOthers); //Llamamos al método que sobreescribe los valores
        } else {
            JOptionPane.showMessageDialog(null, "Enter a valid value!"); //Si no se cumple se muestra mensaje
            txtOthers.setText("0"); // Se establece valor 0 defecto
          }
        
    }//GEN-LAST:event_btnChange2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(InterfaceUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FinalMessage;
    private javax.swing.JButton btnChange1;
    private javax.swing.JButton btnChange2;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnOpen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMega;
    private javax.swing.JTextField txtOthers;
    // End of variables declaration//GEN-END:variables
}
