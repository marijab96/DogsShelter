/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.BoxProcessor;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import model.Box;
import javax.swing.ListModel;
import model.Employee;

/**
 *
 * @author mbralic
 */
public class Boxes extends javax.swing.JFrame {
    
    private final BoxProcessor processor;
    private Box entity;

    /**
     * Creates new form Box
     */
    public Boxes() {
        initComponents();
        setTitle(Application.TITLE_APP + " Boxes");
        processor = new BoxProcessor();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstBoxes = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        txtCapacity = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtSize = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbDog = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstBoxes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstBoxes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBoxesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBoxes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 360, 460));

        jLabel1.setText("Name");

        jLabel2.setText("Capacity");

        jLabel3.setText("Size");

        jLabel4.setText("Employee");

        jLabel5.setText("Dog");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDog, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 450, 460));

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
        
        entity = lstBoxes.getSelectedValue();
        txtName.setText(entity.getName());
        txtCapacity.setText(entity.getCapacity().toString());
        txtSize.setText(entity.getSize().toString());
        cmbEmployee.setSelectedItem(entity.getEmployee());
        cmbDog.setSelectedItem(entity.getDogs());
    }//GEN-LAST:event_lstBoxesValueChanged

   private void loadData(){
       
        DefaultListModel<Box> b = new DefaultListModel<>();
        
        b.addAll(processor.getData());

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

       // entity.setDogs((Dog) cmbDog.getSelectedItem());
        entity.setEmployee((Employee) cmbEmployee.getSelectedItem());
        
       
       
       
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDog;
    private javax.swing.JComboBox<String> cmbEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Box> lstBoxes;
    private java.awt.TextField txtCapacity;
    private java.awt.TextField txtName;
    private java.awt.TextField txtSize;
    // End of variables declaration//GEN-END:variables
}


