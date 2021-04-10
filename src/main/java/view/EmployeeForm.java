/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BoxProcessor;
import controller.EmployeeProcessor;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Box;
import model.Employee;
import util.MyException;

/**
 *
 * @author mbralic
 */
public class EmployeeForm extends javax.swing.JFrame {
    
    private EmployeeProcessor processor;

    /**
     * Creates new form Employees
     */
    public EmployeeForm() {
        initComponents();
        setTitle(Application.TITLE_APP + " Employees");
        processor = new EmployeeProcessor();
        loadData();        
       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmployee = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtOIB = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(137, 196, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 190, -1));

        jLabel3.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 160, -1));

        jLabel4.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N
        jLabel4.setText("OIB");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 150, 20));

        jLabel5.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N
        jLabel5.setText("Mobile Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 180, 20));

        lstEmployee.setBackground(new java.awt.Color(228, 241, 254));
        lstEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstEmployee.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        lstEmployee.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEmployeeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmployee);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 310, 460));

        btnAdd.setBackground(new java.awt.Color(228, 241, 254));
        btnAdd.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconadd.png")); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 100, 40));

        btnUpdate.setBackground(new java.awt.Color(228, 241, 254));
        btnUpdate.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconeupdate.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 100, 40));

        btnDelete.setBackground(new java.awt.Color(228, 241, 254));
        btnDelete.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/icondelete.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 100, 40));

        lblMessage.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 310, 20));

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));
        jPanel3.setPreferredSize(new java.awt.Dimension(1110, 78));

        jLabel6.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/icon.png")); // NOI18N
        jLabel6.setText("Employee management ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 990, 90));

        txtCondition.setBackground(new java.awt.Color(228, 241, 254));
        txtCondition.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtCondition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConditionActionPerformed(evt);
            }
        });
        jPanel1.add(txtCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 128, 210, 30));

        btnSearch.setBackground(new java.awt.Color(228, 241, 254));
        btnSearch.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconsearch.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 127, 90, 30));

        jButton1.setBackground(new java.awt.Color(228, 241, 254));
        jButton1.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconclear.png")); // NOI18N
        jButton1.setText("Clean");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        txtFirstName.setBackground(new java.awt.Color(228, 241, 254));
        txtFirstName.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 240, 40));

        txtLastName.setBackground(new java.awt.Color(228, 241, 254));
        txtLastName.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 240, 40));

        txtOIB.setBackground(new java.awt.Color(228, 241, 254));
        txtOIB.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtOIB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtOIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 240, 40));

        txtMobileNumber.setBackground(new java.awt.Color(228, 241, 254));
        txtMobileNumber.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtMobileNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEmployeeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEmployeeValueChanged
          if(evt.getValueIsAdjusting()) {
            
            return;
        }
        
        if(lstEmployee.getSelectedValue() == null){
            
            return;
            
        }
        
        processor.setEntity(lstEmployee.getSelectedValue());
        
        txtFirstName.setText(processor.getEntity().getFirstName());
        txtLastName.setText(processor.getEntity().getLastName());
        txtMobileNumber.setText(processor.getEntity().getMobileNumber());
        txtOIB.setText(processor.getEntity().getOib());
        
        
        
        
    }//GEN-LAST:event_lstEmployeeValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
             
        processor.setEntity(new Employee());
        setValuetoEntity();
        

        try {
            processor.create();
            loadData();
            cleanUp();
            lblMessage.setText("Employee added successfully.");
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (processor.getEntity()==null || 
                processor.getEntity().getId() == null) {
           JOptionPane.showMessageDialog(rootPane, "Please first select item");
            return;
       }
        
        
        setValuetoEntity();

        try {
            processor.update();
            loadData();
            cleanUp();        
            lblMessage.setText("Employee is changed successfully.");
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            
        }    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         if (processor.getEntity()==null || 
                processor.getEntity().getId() == null) {
           JOptionPane.showMessageDialog(rootPane, "Please first select item");
            return;
       }
        
        
        setValuetoEntity();

        try {
            processor.delete();
            loadData();
            cleanUp();        
            lblMessage.setText("Employee is successfully deleted.");
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConditionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        DefaultListModel<Employee> m = new DefaultListModel<>();
        m.addAll(processor.getData(txtCondition.getText()));
        lstEmployee.setModel(m);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cleanUp();
    }//GEN-LAST:event_jButton1ActionPerformed

     private void loadData(){
       
       DefaultListModel<Employee> em = new DefaultListModel<>();
        
             
       processor.getData().forEach(g -> {
           em.addElement(g);
       });
       

        lstEmployee.setModel(em);
       
   }
   
   private void setValuetoEntity(){
       
       
       var entity =processor.getEntity();      
       
            
       entity.setFirstName(txtFirstName.getText());
       entity.setLastName(txtLastName.getText());
       entity.setMobileNumber(txtMobileNumber.getText());
       entity.setOib(txtOIB.getText());
 
        
            
   }
   
    private void cleanUp(){
       
       txtFirstName.setText("");
       txtLastName.setText("");
       txtMobileNumber.setText("");
       txtOIB.setText("");
   
   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JList<Employee> lstEmployee;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtOIB;
    // End of variables declaration//GEN-END:variables
}
