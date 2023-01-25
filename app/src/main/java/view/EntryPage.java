/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserController;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Leonny Sousa
 */
public class EntryPage extends javax.swing.JFrame {
    
    UserController userController = new UserController();
    
    
    /**
     * Creates new form PrimeiraTela
     */
    public EntryPage() {
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

        jTabbedPaneEntry = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldUser = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelMoveToRegisterEntry = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldNewUser = new javax.swing.JTextField();
        jButtonSignUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldNewUser = new javax.swing.JPasswordField();
        jPasswordFieldNewUser2 = new javax.swing.JPasswordField();
        jLabelMoveToLoginEntry = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneEntry.setOpaque(true);
        jTabbedPaneEntry.setPreferredSize(new java.awt.Dimension(405, 475));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel1HierarchyChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ToolBarTitle.png"))); // NOI18N
        jLabel3.setLabelFor(jLabel3);
        jLabel3.setText("Project Manager APP");
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jTextFieldUser.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldUser.setToolTipText("Digite seu Username ou E-mail");
        jTextFieldUser.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

        jButtonLogin.setBackground(new java.awt.Color(0, 153, 102));
        jButtonLogin.setText("Entrar");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bem Vindo");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Esqueceu sua senha?");

        jPasswordField1.setBackground(new java.awt.Color(204, 255, 204));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButtonLogin)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jPasswordField1.getAccessibleContext().setAccessibleDescription("Digite sua senha");

        jLabelMoveToRegisterEntry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMoveToRegisterEntry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMoveToRegisterEntry.setText("Clique aqui para Realizar Cadastro");
        jLabelMoveToRegisterEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMoveToRegisterEntryMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabelMoveToRegisterEntry)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMoveToRegisterEntry)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPaneEntry.addTab("Login", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ToolBarTitle.png"))); // NOI18N
        jLabel5.setLabelFor(jLabel3);
        jLabel5.setText("Project Manager APP");
        jLabel5.setFocusable(false);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jTextFieldNewUser.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldNewUser.setToolTipText("Digite seu Username ou E-mail");
        jTextFieldNewUser.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

        jButtonSignUp.setBackground(new java.awt.Color(0, 153, 102));
        jButtonSignUp.setText("Cadastrar");
        jButtonSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSignUpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSignUpMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bem Vindo");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPasswordFieldNewUser.setBackground(new java.awt.Color(204, 255, 204));
        jPasswordFieldNewUser.setText("jPasswordField1");
        jPasswordFieldNewUser.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        jPasswordFieldNewUser2.setBackground(new java.awt.Color(204, 255, 204));
        jPasswordFieldNewUser2.setText("jPasswordField2");
        jPasswordFieldNewUser2.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirme a senha"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldNewUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNewUser)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldNewUser2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextFieldNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPasswordFieldNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPasswordFieldNewUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonSignUp)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTextFieldNewUser.getAccessibleContext().setAccessibleName("Novo Usuário");

        jLabelMoveToLoginEntry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMoveToLoginEntry.setText("Retornar a tela de Login");
        jLabelMoveToLoginEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMoveToLoginEntryMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMoveToLoginEntry)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMoveToLoginEntry)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPaneEntry.addTab("Criar Conta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1HierarchyChanged

    private void jLabelMoveToRegisterEntryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMoveToRegisterEntryMousePressed
        // TODO add your handling code here:
        jTabbedPaneEntry.setSelectedIndex(1);
    }//GEN-LAST:event_jLabelMoveToRegisterEntryMousePressed

    private void jLabelMoveToLoginEntryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMoveToLoginEntryMousePressed
        // TODO add your handling code here:
        jTabbedPaneEntry.setSelectedIndex(0);
    }//GEN-LAST:event_jLabelMoveToLoginEntryMousePressed

    private void jButtonSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignUpMousePressed

    }//GEN-LAST:event_jButtonSignUpMousePressed

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        // TODO add your handling code here:
        List<User> users = userController.getAll();
        
        String email = jTextFieldUser.getText();
        String senha = jPasswordField1.getText();
        
        for (int i = 0; i < users.size(); i++){
            User user = users.get(i);
            
            if(user.getEmail().equals(email) & user.getSenha().equals(senha)){
                this.dispose();
                MainScreen mainscreen = new MainScreen();
                mainscreen.setLocationRelativeTo(null);
                mainscreen.idUser = user.getId();
                mainscreen.initComponentsModel();
                mainscreen.setVisible(true);
                break;
            }else if(i == users.size()-1){
                JOptionPane.showMessageDialog(rootPane, "Login Inválido!!");
            }
            
        }
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jButtonSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignUpMouseClicked
        // TODO add your handling code here:
               
        User user = new User();
        user.setEmail(jTextFieldNewUser.getText());
        
        String pwd1 = jPasswordFieldNewUser.getText();
        
        String pwd2 = jPasswordFieldNewUser2.getText();
        
        
        if( pwd1.equals(pwd2) ){
            user.setSenha(pwd1);
        }else{
            JOptionPane.showMessageDialog(rootPane, "A senhas não são idênticas!");
        }
        
        
        userController.save(user);
    }//GEN-LAST:event_jButtonSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelMoveToLoginEntry;
    private javax.swing.JLabel jLabelMoveToRegisterEntry;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldNewUser;
    private javax.swing.JPasswordField jPasswordFieldNewUser2;
    private javax.swing.JTabbedPane jTabbedPaneEntry;
    private javax.swing.JTextField jTextFieldNewUser;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
