
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fahim MuntasirAkib
 */
public class MemberPage extends javax.swing.JFrame {

    /**
     * Creates new form MemberPage
     */
    public MemberPage() {
        initComponents();
         showMemberTable();
    }

    
    private void showMemberTable(){
        String columnNames[]={ "Name","Email","Mobile"};
        DefaultTableModel memberModel= new DefaultTableModel(columnNames,0);
        String query= "select *from user_login";
        try{
            //String query;
        ResultSet rs = DBUTILS.queryExecute(query);
        while(rs.next()){
            String Name=rs.getString("name");
            String Email=rs.getString("email");
            String Mobile=rs.getString("number");
            String data[]={Name,Email,Mobile};
            memberModel.addRow(data);

        }
        Members_Table.setModel(memberModel);
        }catch(Exception e){}
    }
    
    
    
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Members_Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        name_take_mp = new javax.swing.JTextField();
        email_take_mp = new javax.swing.JTextField();
        mobile_take_mp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add_member_mp_button = new javax.swing.JToggleButton();
        member_delete_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Back_To_dashBoard_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Members_Table.setBackground(new java.awt.Color(0, 51, 51));
        Members_Table.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        Members_Table.setForeground(new java.awt.Color(255, 255, 255));
        Members_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Members_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Members_Table.setRowHeight(35);
        Members_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Members_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Members_Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 410, 360));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_take_mp.setBackground(new java.awt.Color(0, 51, 51));
        name_take_mp.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        name_take_mp.setForeground(new java.awt.Color(255, 255, 255));
        name_take_mp.setBorder(null);
        name_take_mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_take_mpActionPerformed(evt);
            }
        });
        jPanel2.add(name_take_mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 167, -1));

        email_take_mp.setBackground(new java.awt.Color(0, 51, 51));
        email_take_mp.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        email_take_mp.setForeground(new java.awt.Color(255, 255, 255));
        email_take_mp.setBorder(null);
        email_take_mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_take_mpActionPerformed(evt);
            }
        });
        jPanel2.add(email_take_mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 167, -1));

        mobile_take_mp.setBackground(new java.awt.Color(0, 51, 51));
        mobile_take_mp.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        mobile_take_mp.setForeground(new java.awt.Color(255, 255, 255));
        mobile_take_mp.setBorder(null);
        mobile_take_mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_take_mpActionPerformed(evt);
            }
        });
        jPanel2.add(mobile_take_mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 167, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 57, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 63, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 63, -1));

        add_member_mp_button.setBackground(new java.awt.Color(0, 102, 0));
        add_member_mp_button.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        add_member_mp_button.setForeground(new java.awt.Color(255, 255, 255));
        add_member_mp_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-add-user-male-34.png")); // NOI18N
        add_member_mp_button.setText("Add ");
        add_member_mp_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        add_member_mp_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_member_mp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_mp_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(add_member_mp_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, 40));

        member_delete_button.setBackground(new java.awt.Color(153, 0, 0));
        member_delete_button.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        member_delete_button.setForeground(new java.awt.Color(255, 255, 255));
        member_delete_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-removeMember-34.png")); // NOI18N
        member_delete_button.setText("Delete");
        member_delete_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        member_delete_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        member_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_delete_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(member_delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("___________________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("___________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 196, 180, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("___________________________________");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 420, 310));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel4.setText("Member Details");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 320, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        Back_To_dashBoard_button.setBackground(new java.awt.Color(25, 111, 61));
        Back_To_dashBoard_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back_To_dashBoard_button.setForeground(new java.awt.Color(255, 255, 255));
        Back_To_dashBoard_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-dashboard-43letest.png")); // NOI18N
        Back_To_dashBoard_button.setBorder(null);
        Back_To_dashBoard_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_To_dashBoard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_To_dashBoard_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_To_dashBoard_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 40, 40));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 40, 110));

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 40, 90));

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 90));

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 40, 90));

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 40, 90));

        jPanel9.setBackground(new java.awt.Color(153, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 40, 90));

        jPanel10.setBackground(new java.awt.Color(153, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 40, 90));

        jPanel11.setBackground(new java.awt.Color(153, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 40, 90));

        jPanel12.setBackground(new java.awt.Color(153, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 40, 90));

        jPanel13.setBackground(new java.awt.Color(153, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 40, 60));

        jPanel14.setBackground(new java.awt.Color(153, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 40, 110));

        jPanel15.setBackground(new java.awt.Color(153, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 40, 100));

        jPanel16.setBackground(new java.awt.Color(153, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 40, 120));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Member Add  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 230, 40));

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" to the ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-add-user-group-man-man-100.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 140));

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bachelor Family .");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jPanel17.setBackground(new java.awt.Color(153, 0, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobile_take_mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_take_mpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_take_mpActionPerformed

    private void name_take_mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_take_mpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_take_mpActionPerformed

    private void add_member_mp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_mp_buttonActionPerformed
        
        String name_user_mp = name_take_mp.getText();
        String email_user_mp = email_take_mp.getText();
        String mobile_user_mp = mobile_take_mp.getText();
        String pass_user_mp="";
        
     if(name_user_mp.length()!=0 && email_user_mp.length()!=0 && mobile_user_mp.length()==11){
            String query="insert into user_login (name,email,password,number) values ('"+name_user_mp+"','"+ email_user_mp+"','"+ pass_user_mp+"','"+mobile_user_mp+"')";
           
         try{
              JOptionPane.showMessageDialog(this,"Member Add Successful.");
             int rs=DBUTILS.queryUpdate(query);
         }catch(Exception e){
         }
        }
        else{
             JOptionPane.showMessageDialog(this,"Member added failed!\nPlease fill the form. ");
        }
        
   
       showMemberTable(); 
        
    }//GEN-LAST:event_add_member_mp_buttonActionPerformed

    private void member_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_delete_buttonActionPerformed
         //TODO add your handling code here:
        String email_take_delete=email_take_mp.getText();
        if(email_take_delete.length()!=0){
        String query="delete from user_login where email= '"+email_take_delete+"'";
        try{
              JOptionPane.showMessageDialog(this,"Deleted Successful.");
             int rs=DBUTILS.queryUpdate(query);
         }catch(Exception e){
         }
        }
        else{
            JOptionPane.showMessageDialog(this,"Deleted failed.\nPlease enter email.");
        }
         showMemberTable(); 
        
    }//GEN-LAST:event_member_delete_buttonActionPerformed

    private void Back_To_dashBoard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_To_dashBoard_buttonActionPerformed
        
             this.setVisible(false);
             new DashBoard().setVisible(true);
    }//GEN-LAST:event_Back_To_dashBoard_buttonActionPerformed

    private void email_take_mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_take_mpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_take_mpActionPerformed

    private void Members_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Members_TableMouseClicked
//       TableColumnModel modelecolonene=Members_Table.getColumnModel();
//        TableModel modele=Members_Table.getModel();
//        int total=modelecolonene.getColumnCount();
//        for(int i=0;i<total;i++) {
//            int taille=0;
//            int total2=modele.getRowCount();
//            for(int j=0;i<total2;j++) {
//                if(modele.getValueAt(j,i)!=null) {
//                int taille2=modele.getValueAt(j,i).toString().length()*7;
//                if(taille2>taille) {
//                    taille=taille2;
//                }
//                
//                }modelecolonene.getColumn(i).setPreferredWidth(taille);
//                }
//        }
    }//GEN-LAST:event_Members_TableMouseClicked

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
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_To_dashBoard_button;
    private javax.swing.JTable Members_Table;
    private javax.swing.JToggleButton add_member_mp_button;
    private javax.swing.JTextField email_take_mp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton member_delete_button;
    private javax.swing.JTextField mobile_take_mp;
    private javax.swing.JTextField name_take_mp;
    // End of variables declaration//GEN-END:variables
}
