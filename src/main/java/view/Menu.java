/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import model.Box;



/**
 *
 * @author mbralic
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setTitle(Application.TITLE_APP + " Menu");
        new Time().start();
    }
    
    
    
    private class Time extends Thread{
        
        private SimpleDateFormat df = 
                new SimpleDateFormat("dd. MMMM YYYY. HH:mm:ss");

        @Override
        public void run() {
            while (true) { 
                    lblTimeAndDate.setText(df.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();
        lblDog = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        lblSickness = new javax.swing.JLabel();
        lblSpecies = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTimeAndDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(137, 196, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Karumbi", 3, 48)); // NOI18N
        lblTitle.setText("Dogs Shelter");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 50));

        lblBox.setFont(new java.awt.Font("Purisa", 3, 20)); // NOI18N
        lblBox.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconforbox.png")); // NOI18N
        lblBox.setText("  Box");
        lblBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBoxMousePressed(evt);
            }
        });
        jPanel1.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 80));

        lblDog.setFont(new java.awt.Font("Purisa", 3, 20)); // NOI18N
        lblDog.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/icondog.png")); // NOI18N
        lblDog.setText("  Dog");
        lblDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDogMousePressed(evt);
            }
        });
        jPanel1.add(lblDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 70));

        lblEmployee.setFont(new java.awt.Font("Purisa", 3, 20)); // NOI18N
        lblEmployee.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconemployee.png")); // NOI18N
        lblEmployee.setText("  Employee");
        lblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEmployeeMousePressed(evt);
            }
        });
        jPanel1.add(lblEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 60));

        lblSickness.setFont(new java.awt.Font("Purisa", 3, 20)); // NOI18N
        lblSickness.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconforsickness.png")); // NOI18N
        lblSickness.setText("  Sickness");
        lblSickness.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSicknessMousePressed(evt);
            }
        });
        jPanel1.add(lblSickness, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 230, 60));

        lblSpecies.setFont(new java.awt.Font("Purisa", 3, 20)); // NOI18N
        lblSpecies.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconforspecies.png")); // NOI18N
        lblSpecies.setText("  Species");
        lblSpecies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSpeciesMousePressed(evt);
            }
        });
        jPanel1.add(lblSpecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 220, 60));

        jPanel3.setBackground(new java.awt.Color(137, 196, 244));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        lblTimeAndDate.setFont(new java.awt.Font("Nimbus Mono L", 2, 18)); // NOI18N
        lblTimeAndDate.setForeground(new java.awt.Color(137, 196, 244));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(lblTimeAndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTimeAndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 780, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/homepage.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 780, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBoxMousePressed
        new BoxForm().setVisible(true);
    }//GEN-LAST:event_lblBoxMousePressed

    private void lblDogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDogMousePressed
       new DogForm().setVisible(true);
    }//GEN-LAST:event_lblDogMousePressed

    private void lblEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmployeeMousePressed
       new EmployeeForm().setVisible(true);
    }//GEN-LAST:event_lblEmployeeMousePressed

    private void lblSpeciesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSpeciesMousePressed
       new SpeciesForm().setVisible(true);
    }//GEN-LAST:event_lblSpeciesMousePressed

    private void lblSicknessMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSicknessMousePressed
       new SicknessForm().setVisible(true);
    }//GEN-LAST:event_lblSicknessMousePressed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblDog;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblSickness;
    private javax.swing.JLabel lblSpecies;
    private javax.swing.JLabel lblTimeAndDate;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
