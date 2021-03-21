/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author mbralic
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        Loading loadnig = new Loading();
        loadnig.start();
        
    }
    
    private class Loading extends Thread{

        @Override
        public void run() {
              Session s = HibernateUtil.getSession();
            if (s.getMetamodel().getEntities().size() > 0) {
                new Authorization().setVisible(true);
                dispose();
            }else {
                JOptionPane.showMessageDialog(rootPane, "Database problem.");
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/loading.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(590, 420, 70, 60);

        jLabel2.setFont(new java.awt.Font("Purisa", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/welcome.png")); // NOI18N
        jLabel2.setText("!");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 300, 310, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdog.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 680, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
