/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.BoxProcessor;
import controller.DogProcessor;
import controller.EmployeeProcessor;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Box;
import javax.swing.ListModel;
import model.Dog;
import model.Employee;
import util.MyException;

/**
 *
 * @author mbralic
 */
public class BoxForm extends javax.swing.JFrame {
    
    private BoxProcessor processor;
    

    /**
     * Creates new form Box
     */
    public BoxForm() {
        initComponents();
        setTitle(Application.TITLE_APP + " Boxes");
        processor = new BoxProcessor();
        loadData();        
        loadEmployee();
        
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
        lblName = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtCapacity = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBoxes = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(137, 196, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblName.setText("Name");
        lblName.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N

        lblCapacity.setText("Capacity");
        lblCapacity.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N

        lblSize.setText("Size");
        lblSize.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N

        lblEmployee.setText("Employee");
        lblEmployee.setFont(new java.awt.Font("Nimbus Mono L", 3, 18)); // NOI18N

        cmbEmployee.setBackground(new java.awt.Color(228, 241, 254));
        cmbEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbEmployee.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconclean.png")); // NOI18N
        jButton1.setText("Clean");
        jButton1.setBackground(new java.awt.Color(228, 241, 254));
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtName.setBackground(new java.awt.Color(228, 241, 254));
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCapacity.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtCapacity.setBackground(new java.awt.Color(228, 241, 254));
        txtCapacity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSize.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtSize.setBackground(new java.awt.Color(228, 241, 254));
        txtSize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmployee, 0, 247, Short.MAX_VALUE)
                    .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize)
                    .addComponent(lblName)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 410, 510));
        jPanel1.getAccessibleContext().setAccessibleName("Box Infomration ");

        jPanel2.setBackground(new java.awt.Color(137, 196, 244));

        jPanel4.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/icon.png")); // NOI18N
        jLabel1.setText("Box management ");
        jLabel1.setFont(new java.awt.Font("Purisa", 3, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(767, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 90));

        jPanel3.setBackground(new java.awt.Color(137, 196, 244));

        lstBoxes.setBackground(new java.awt.Color(228, 241, 254));
        lstBoxes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstBoxes.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        lstBoxes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstBoxes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBoxesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBoxes);

        btnDelete.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/icondelete.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBackground(new java.awt.Color(228, 241, 254));
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconadd.png")); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBackground(new java.awt.Color(228, 241, 254));
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdd.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconeupdate.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBackground(new java.awt.Color(228, 241, 254));
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N

        txtCondition.setFont(new java.awt.Font("Nimbus Mono L", 0, 14)); // NOI18N
        txtCondition.setBackground(new java.awt.Color(228, 241, 254));
        txtCondition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConditionActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon("/home/mbralic/IDEA Projekt/DogsShelter/src/main/resources/iconsearch.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBackground(new java.awt.Color(228, 241, 254));
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.setFont(new java.awt.Font("Nimbus Mono L", 3, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCondition)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 730, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstBoxesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstBoxesValueChanged
        
        if(evt.getValueIsAdjusting()) {
            
            return;
        }
        
        if(lstBoxes.getSelectedValue() == null){
            
            return;
            
        }
        
        processor.setEntity(lstBoxes.getSelectedValue());
        
        txtName.setText(processor.getEntity().getName());
        
        if (processor.getEntity().getCapacity()!= null) {
            txtCapacity.setText(processor.getEntity().getCapacity().toString());
        } else {
            txtCapacity.setText("");
        }
        
        try {
            txtSize.setText(processor.getEntity().getSize().toString());
        } catch (Exception e) {
            txtSize.setText("");
        }

        
       
        cmbEmployee.setSelectedItem(processor.getEntity().getEmployee());
       
    }//GEN-LAST:event_lstBoxesValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            
        processor.setEntity(new Box());
        setValuetoEntity();
        

        try {
            processor.create();
            loadData();
            cleanUp();
            lblMessage.setText("Box added successfully.");
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
            lblMessage.setText("Box is changed successfully.");
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
            lblMessage.setText("Box is successfully deleted.");
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          DefaultListModel<Box> m = new DefaultListModel<>();
        m.addAll(processor.getData(txtCondition.getText()));
        lstBoxes.setModel(m);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConditionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cleanUp();
    }//GEN-LAST:event_jButton1ActionPerformed

   private void loadData(){
       
       DefaultListModel<Box> b = new DefaultListModel<>();
        
             
       processor.getData().forEach(g -> {
           b.addElement(g);
       });
       

        lstBoxes.setModel(b);
       
   }
   
   private void setValuetoEntity(){
       
       
       var entity =processor.getEntity();      
       
            
       entity.setName(txtName.getText());

        try {
            entity.setCapacity(Integer.parseInt(txtCapacity.getText()));
        } catch (Exception e) {
            entity.setCapacity(0);
        }

        try {
            entity.setSize(new BigDecimal(txtSize.getText()));
        } catch (Exception e) {
            entity.setSize(BigDecimal.ZERO);
        }

        //entity.setDogs((Dog) cmbDog.getSelectedItem());
        entity.setEmployee((Employee) cmbEmployee.getSelectedItem());
        
            
       
   }
   
   private void loadEmployee(){
       
       DefaultComboBoxModel<Employee> e =
               new DefaultComboBoxModel<>();
       
       //e.addAll(new EmployeeProcessor().getData());
       
       //new EmployeeProcessor().getData().forEach(p -> {
          //  e.addElement(p);
       // });
       
       Employee em = new Employee();
       em.setId(-1L);
       em.setFirstName("Choose");
       em.setLastName(" employee");
       e.addElement(em);
       e.addAll(new EmployeeProcessor().getData());
       
       
       cmbEmployee.setModel(e);     
       cmbEmployee.setSelectedIndex(0);
   
   
   }
   
  
   
   private void cleanUp(){
       
       txtName.setText("");
       txtCapacity.setText("");
       txtSize.setText("");
       cmbEmployee.setSelectedItem(false);
   
   
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Employee> cmbEmployee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSize;
    private javax.swing.JList<Box> lstBoxes;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}


