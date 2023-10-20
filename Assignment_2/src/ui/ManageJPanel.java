/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

//import java.awt.CardLayout;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.AdminDirectory;
//import model.AdminDirectory;
import model.User;
import model.UserDirectory;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Chinmay K
 */
public class ManageJPanel extends javax.swing.JPanel {

    private JPanel UserProcessContainer;
    private User user;
    private UserDirectory UserDirectory;
    private AdminDirectory AdminDirectory;
    /**
     * Creates new form ManageJPanel
     */
    

    ManageJPanel(JPanel UserProcessContainer, UserDirectory UserDirectory) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.UserDirectory = UserDirectory;
        this.user = user;
        this.AdminDirectory = AdminDirectory;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbl_users.getModel();
        dtm.setRowCount(0);
        for (User user: UserDirectory.getUserList()){
            Object[] row = new Object[7];
            row[0] = user;
            row[1] = user.getUsername();
            String hashedPassword = BCrypt.hashpw(new String(user.getPassword()), BCrypt.gensalt());
            row[2] = hashedPassword;
            row[3] = user.getEmail();
            row[4] = user.getFirst_name();
            row[5] = user.getLast_name();
            row[6] = user.getCourse_name();
            
            dtm.addRow(row);
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

        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        btnDelete.setText("Delete Entry");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setText("View Entry");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUID", "Username", "Password", "Email", "First Name", "Last Name", "Course Enrolled"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_users);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome Administrator !!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 195, Short.MAX_VALUE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(181, 181, 181)
                .addComponent(btnBack)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl_users.getSelectedRow();
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, " Would you like to delete the account details?","Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION){
                User user = (User) tbl_users.getValueAt(selectedRow, 0);
                UserDirectory.deleteUser(user);
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        /*String searchTxt = txtSearch.getText().trim();
        
        if(searchTxt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill the text field", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for(User user : UserDirectory.getUserList()){
            if(user.getNUID().equals(searchTxt)){
                if(user.isCreatedstatus()){
                }
                else{
                    DefaultTableModel dtm = new DefaultTableModel();
                    ViewJPanel panel;
                    panel = new ViewJPanel(UserProcessContainer, UserDirectory.searchUser(searchTxt),dtm, UserDirectory,AdminDirectory);
                    UserProcessContainer.add("ViewJPanel",panel);
                    CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
                    layout.next(UserProcessContainer);
                    txtSearch.setText("");
                    return;
                }
            }
        }*/
        
        User user = UserDirectory.searchUser(txtSearch.getText().trim());
        
        if(txtSearch.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter NUID to search", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (user == null){
            JOptionPane.showConfirmDialog(null, "NUID you entered doesn't exist", "Information", JOptionPane.INFORMATION_MESSAGE );
        }
        else {
            ViewJPanel panel = new ViewJPanel(UserProcessContainer, user);
            UserProcessContainer.add("ViewJPanel",panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl_users.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "Please select a row from table first to view the details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            User user = (User)tbl_users.getValueAt(selectedRow, 0);
            ViewJPanel panel = new ViewJPanel(UserProcessContainer, user);
            UserProcessContainer.add("ViewJPanel", panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
            populateTable();
        }
    
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout =(CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tbl_users;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
