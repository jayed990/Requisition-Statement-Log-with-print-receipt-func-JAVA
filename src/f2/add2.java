package f2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class add2 extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt =  null;
    ResultSet rs = null;
    
    public add2() {
        
        super("ADD");
        initComponents();
        conn = DB.dbc.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        B1 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        B8 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        B9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dept = new javax.swing.JComboBox<>();
        remark = new javax.swing.JComboBox<>();
        item = new javax.swing.JComboBox<>();
        B2 = new javax.swing.JLabel();
        ldate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD ENTRY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 0, 0));
        B1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("SN");

        B3.setBackground(new java.awt.Color(0, 0, 0));
        B3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("Department");

        B5.setBackground(new java.awt.Color(0, 0, 0));
        B5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("Item");

        B7.setBackground(new java.awt.Color(0, 0, 0));
        B7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("Qty");

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

        B9.setBackground(new java.awt.Color(0, 0, 0));
        B9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("Remarks");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dept.setMaximumRowCount(15);
        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Financial", "Shipping", "Customs", "Admin GA", "HR & SD", "PAC", "Business", "PC", "Warehouse", "IE", "A1F Affairs", "A2F Affairs", "B1F Affairs", "B2F Affairs", "C1F Affairs", "QC", "Incoming Materials", "TTC", "Lamination", "Cutting Dye", "GA Warehouse", "Electrical", "Maintenance", "Orisol Computer Stitching", "Lean 1A", "Lean 2A", "Lean 3A", "Lean 1B", "Lean 2B", "Lean 3B", "Lean 1C", "Lean 2C", "Lean 3C", "Lean 1D", "Lean 2D", "Lean 3D", "IT", "Stockfitting", "Engineering" }));
        dept.setToolTipText("");
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        remark.setMaximumRowCount(15);
        remark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Finished", "Change", "Damaged", "New" }));

        item.setMaximumRowCount(15);
        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Brother DCP-7055", "Cartridge - Cyan - C9371A", "Cartridge - Grey - C9374A", "Cartridge - Magenta - C9372A", "Cartridge - Mat Black - C940A", "Cartridge - Photo Black - C9370A", "Cartridge - Yellow - C9373A", "Epson DLQ - 3500", "EPSON L130 - Black", "EPSON L130 - Cyan", "EPSON L130 - Magenta", "EPSON L130 - Yellow", "Epson LQ - 2190", "HP Laser Jet P1005", "HP Laser Jet P1102", "HP Pro 15M - 248A", "Jolimark 9000K", "Jolimark 9000K - JMR105 Orginal", "SAMSUNG ML- 1666 - (MLT-D1043S)", "" }));

        B2.setBackground(new java.awt.Color(0, 0, 0));
        B2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("Last Taken Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B2)
                        .addGap(18, 18, 18)
                        .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(B7)
                                            .addComponent(B3)
                                            .addComponent(B5)
                                            .addComponent(B1))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(item, 0, 284, Short.MAX_VALUE)
                                            .addComponent(no)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(B8)
                                                .addGap(18, 18, 18)
                                                .addComponent(unit))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(B9)
                                        .addGap(18, 18, 18)
                                        .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B5)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B2)
                    .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(639, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            stmt = conn.createStatement();

            String NO = no.getText();
            String DEPT = (String) dept.getSelectedItem();
            String ITEM = (String) item.getSelectedItem();
            int QTY = Integer.parseInt(qty.getText());
            String UNIT = unit.getText();
            String REMARK = (String) remark.getSelectedItem();
            SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
            String LDATE = sdf.format(ldate.getDate());
            
            String sql = "INSERT INTO f2 (`No`, `Department`, `Item`, `Qty`, `Unit`, `Remarks`, `LDate`) VALUES ('"+NO+"','"+DEPT+"','"+ITEM+"','"+QTY+"','"+UNIT+"','"+REMARK+"','"+LDATE+"')" ;
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Uploaded");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home2 object = new home2();
        object.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            no.setText("");
            qty.setText("");
            unit.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:    
    }//GEN-LAST:event_jButton3KeyPressed

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
            java.util.logging.Logger.getLogger(add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser ldate;
    private javax.swing.JTextField no;
    private javax.swing.JTextField qty;
    private javax.swing.JComboBox<String> remark;
    private javax.swing.JTextField unit;
    // End of variables declaration//GEN-END:variables

}
