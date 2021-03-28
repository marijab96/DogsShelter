/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.BoxProcessor;
import controller.DogProcessor;
import controller.EmployeeProcessor;
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
public class Boxes extends javax.swing.JFrame {
    
    private BoxProcessor processor;
    

    /**
     * Creates new form Box
     */
    public Boxes() {
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
        txtName = new java.awt.TextField();
        lblCapacity = new javax.swing.JLabel();
        txtCapacity = new java.awt.TextField();
        lblSize = new javax.swing.JLabel();
        txtSize = new java.awt.TextField();
        lblEmployee = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBoxes = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(137, 196, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        lblName.setText("Name");

        lblCapacity.setText("Capacity");

        lblSize.setText("Size");

        lblEmployee.setText("Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCapacity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 510));

        jPanel2.setBackground(new java.awt.Color(137, 196, 244));

        jLabel7.setText("Control boxes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(778, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 90));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 80, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));
        getContentPane().add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 280, 40));

        jPanel3.setBackground(new java.awt.Color(137, 196, 244));

        lstBoxes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstBoxes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBoxesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBoxes);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnDelete)))
                .addContainerGap(24, Short.MAX_VALUE))
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
       cmbEmployee.setSelectedItem("");
   
   
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Employee> cmbEmployee;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSize;
    private javax.swing.JList<Box> lstBoxes;
    private java.awt.TextField txtCapacity;
    private java.awt.TextField txtName;
    private java.awt.TextField txtSize;
    // End of variables declaration//GEN-END:variables
}

