package f1;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public final class add extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt =  null;
    ResultSet rs = null;
    
    
    public add() {
        
        super("ADD");
        initComponents();
        conn = DB.dbc.connection();
        deptFillData();
        itemFillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        B2 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        device = new javax.swing.JTextField();
        B6 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        B7 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        B8 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        B10 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B11 = new javax.swing.JLabel();
        usage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dept = new javax.swing.JComboBox<>();
        remark = new javax.swing.JComboBox<>();
        brand = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD ENTRY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/submit.png"))); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 0, 0));
        B2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("User Name");

        B4.setBackground(new java.awt.Color(0, 0, 0));
        B4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("Device No");

        B1.setBackground(new java.awt.Color(0, 0, 0));
        B1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("No#");

        B3.setBackground(new java.awt.Color(0, 0, 0));
        B3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("Department");

        B5.setBackground(new java.awt.Color(0, 0, 0));
        B5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("Item");

        device.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 0, 0));
        B6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setText("Model");

        B7.setBackground(new java.awt.Color(0, 0, 0));
        B7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("Qty");

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 0, 0));
        B8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("Unit");

        unit.setText("pcs");

        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(0, 0, 0));
        B10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B10.setForeground(new java.awt.Color(255, 255, 255));
        B10.setText("Price");

        B9.setBackground(new java.awt.Color(0, 0, 0));
        B9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("Remarks");

        B11.setBackground(new java.awt.Color(0, 0, 0));
        B11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B11.setForeground(new java.awt.Color(255, 255, 255));
        B11.setText("Usage");

        usage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usageKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dept.setEditable(true);
        dept.setMaximumRowCount(15);
        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "____________________________________________" }));
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        remark.setEditable(true);
        remark.setMaximumRowCount(15);
        remark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Broken", "Change", "Damaged", "New", "Repair" }));

        brand.setEditable(true);
        brand.setMaximumRowCount(15);
        brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "____________________________________________" }));
        brand.setToolTipText("");
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B10)
                            .addComponent(B9)
                            .addComponent(B11)
                            .addComponent(B7)
                            .addComponent(B3)
                            .addComponent(B2)
                            .addComponent(B4)
                            .addComponent(B5)
                            .addComponent(B6)
                            .addComponent(B1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(device)
                            .addComponent(model)
                            .addComponent(user)
                            .addComponent(dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(no)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(B8)
                                .addGap(18, 18, 18)
                                .addComponent(unit))
                            .addComponent(remark, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(price)
                            .addComponent(usage))))
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B3)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B2)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4)
                    .addComponent(device, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B5)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B6)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B9)
                    .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(639, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{

            stmt = conn.createStatement();
            
            String NO = no.getText();
            String USER = user.getText();
            String DEPT = (String) dept.getSelectedItem();
            String DEVICE = device.getText();
            String BRAND = (String) brand.getSelectedItem();
            String MODEL = model.getText();
            int QTY = Integer.parseInt(qty.getText());
            String UNIT = unit.getText();
            String REMARK = (String) remark.getSelectedItem();
            int PRICE = Integer.parseInt(price.getText());
            String USAGE = usage.getText();

            String sql = "INSERT INTO f1 (`No`, `User`, `Department`, `Device`, `Item`, `Model`, `Qty`, `Unit`, `Remarks`, `Price`, `Duration`) VALUES ('"+NO+"','"+USER+"','"+DEPT+"','"+DEVICE+"','"+BRAND+"','"+MODEL+"','"+QTY+"','"+UNIT+"','"+REMARK+"','"+PRICE+"','"+USAGE+"')" ;
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Uploaded");

        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home object = new home();
        object.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void deviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviceActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            no.setText("");
            user.setText("");
            device.setText("");
            model.setText("");
            qty.setText("");
            unit.setText("");
            price.setText("");
            usage.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:    
    }//GEN-LAST:event_jButton3KeyPressed

    private void usageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usageKeyPressed
        // TODO add your handling code here:
                if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
            stmt = conn.createStatement();

            int NO = Integer.parseInt(no.getText());
            String USER = user.getText();
            String DEPT = (String) dept.getSelectedItem();
            String DEVICE = device.getText();
            String BRAND = (String) brand.getSelectedItem();
            String MODEL = model.getText();
            int QTY = Integer.parseInt(qty.getText());
            String UNIT = unit.getText();
            String REMARK = (String) remark.getSelectedItem();
            int PRICE = Integer.parseInt(price.getText());
            String USAGE = usage.getText();
            
            

            String sql = "INSERT INTO f1 (`No`, `User Name`, `Department`, `Device Number`, `Brand/Item`, `Model/Configuration`, `Qty`, `Unit`, `Remarks`, `Price`, `Duration of usage`) VALUES ('"+NO+"','"+USER+"','"+DEPT+"','"+DEVICE+"','"+BRAND+"','"+MODEL+"','"+QTY+"','"+UNIT+"','"+REMARK+"','"+PRICE+"','"+USAGE+"')" ;
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Uploaded");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty!!");
        }
        }
    }//GEN-LAST:event_usageKeyPressed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        // TODO add your handling code here:

            String DEPT; 
            DEPT = (String) dept.getSelectedItem();
            
            LocalDateTime date = LocalDateTime.now();  
            DateTimeFormatter cd = DateTimeFormatter.ofPattern("yyyyMMdd");  
            String formattedDate = date.format(cd);

            no.setText(DEPT +" "+ formattedDate);
    }//GEN-LAST:event_noMouseClicked

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

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
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B11;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JComboBox<String> brand;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JTextField device;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField model;
    private javax.swing.JTextField no;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JComboBox<String> remark;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField usage;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    public void deptFillData()
    {
        try{
            
            stmt = conn.createStatement();
            String sql="select Dept from dept";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                dept.addItem(rs.getString("Dept"));   
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void itemFillData()
    {
        try{
            
            stmt = conn.createStatement();
            String sql="select Item from item";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                brand.addItem(rs.getString("Item"));   
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
