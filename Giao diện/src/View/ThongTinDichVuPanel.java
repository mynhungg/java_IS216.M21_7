/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import ConnectDB.ConnectionUtils;
import DatabaseProcess.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Phat
 */
public class ThongTinDichVuPanel extends javax.swing.JPanel {
    /**
     * Creates new form ThongTinDichVuPanel
     * @throws java.sql.SQLException
     */
    public ThongTinDichVuPanel() throws SQLException {
        initComponents();
        loadData();
        gioiHan();
    }

    private void gioiHan(){
        if(ShareData.useraccount.getVaiTro().equals("Nhân viên")){
            txtMaDichVu.setEnabled(false);
            txtGia.setEnabled(false);
            txtTenDichVu.setEnabled(false);
            cbbLoaiHinh.setEnabled(false);
            btnThem.setEnabled(false);
            btnXoa.setEnabled(false);
            btnSua.setEnabled(false);
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTraCuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinDichVu = new javax.swing.JTable();
        btnLamMoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        txtTenDichVu = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        cbbLoaiHinh = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jLabel1.setText("Tra cứu dịch vụ:");

        btnTraCuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icons8_find_and_replace_16px.png"))); // NOI18N
        btnTraCuu.setText("Tìm kiếm");
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

        tbThongTinDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Loại hình", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbThongTinDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTinDichVu);

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icons8_restart_16px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã dịch vụ:");

        jLabel3.setText("Tên dịch vụ:");

        jLabel4.setText("Loại hình:");

        jLabel5.setText("Giá:");

        cbbLoaiHinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngoài trời", "Trong nhà" }));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icons8_add_database_16px.png"))); // NOI18N
        btnThem.setText("Thêm dịch vụ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icons8_delete_database_16px.png"))); // NOI18N
        btnXoa.setText("Xóa dịch vụ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icons8_renew_16px.png"))); // NOI18N
        btnSua.setText("Sửa dịch vụ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnThem)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(cbbLoaiHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSua)
                        .addGap(66, 66, 66)
                        .addComponent(btnLamMoi)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnXoa)))
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnTraCuu)
                .addGap(405, 405, 405))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbLoaiHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnLamMoi))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
        
    /**
     * Hàm tra cứu dịch vụ
     */
    private void FindDichVu() throws SQLException{
        String SerNo_In = txtTimKiem.getText();
        try {
            DichVu dvData = new DichVu();
            String arr[] = {"Mã dịch vụ", "Tên dịch vụ", "Loại hình", "Giá"};
            List <DichVu> listDichVu = dvData.FinđichVu(SerNo_In);
            DefaultTableModel dtm = new DefaultTableModel(arr,0);
            tbThongTinDichVu.removeAll();
            tbThongTinDichVu.setModel(dtm);
            
            for (DichVu dv : listDichVu) {
                dtm.addRow(new Object[]{
                  dv.getMaDichVuString(), dv.getTenDichVu()
                 ,dv.getLoaiHinh(), dv.getGia()
                });
            }
            
            dtm.fireTableDataChanged();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinCacPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        try {
            // TODO add your handling code here:

            FindDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDichVuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        if(ShareData.useraccount.getVaiTro().equals("Nhân viên")){
            txtMaDichVu.setEnabled(false);
            txtGia.setEnabled(false);
            txtTenDichVu.setEnabled(false);
            cbbLoaiHinh.setEnabled(false);
        }
        else
           txtMaDichVu.setEnabled(true); 
        try {
            // TODO add your handling code here:
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDichVuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtMaDichVu.setText("");
        txtTenDichVu.setText("");
        txtGia.setText("");
        txtTimKiem.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa","Xóa dịch vụ",JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            String maDichVu = txtMaDichVu.getText();
        
            int index = 0;
            DichVu dv = new DichVu();

            try {

                if(maDichVu.equals(""))
                    JOptionPane.showMessageDialog(this, "Không thể để trống mã dịch vụ"
                        , "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE); 
                else
                    index = dv.XoaDichVu(maDichVu);

                if(index > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    loadData();
                }
                else
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");

            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            }
        }  
        
    }//GEN-LAST:event_btnXoaActionPerformed

    
        /**
     * Hàm in thông tin lên các TextField
     * @param row 
     */
    private void displayToTextField(int row){
        txtMaDichVu.setEnabled(false);
        txtMaDichVu.setText((String) tbThongTinDichVu.getModel().getValueAt(row, 0));
        
        txtTenDichVu.setText((String) tbThongTinDichVu.getModel().getValueAt(row, 1));
        
        String loaiHinh = (String) tbThongTinDichVu.getModel().getValueAt(row, 2);
        if(loaiHinh.equals("Ngoài trời"))
            cbbLoaiHinh.setSelectedIndex(0);
        else
            cbbLoaiHinh.setSelectedIndex(1);
        
        txtGia.setText((String) tbThongTinDichVu.getModel().getValueAt(row, 3));
    }
    
    
    private void tbThongTinDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinDichVuMouseClicked
        // TODO add your handling code here:
        int row = tbThongTinDichVu.getSelectedRow();
        
        displayToTextField(row);
    }//GEN-LAST:event_tbThongTinDichVuMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
        
        String maDichVu = txtMaDichVu.getText();
        String tenDichVu = txtTenDichVu.getText();
        String loaiHinh = (String) cbbLoaiHinh.getSelectedItem();
        if(loaiHinh.equals("Ngoài trời"))
            loaiHinh = "0";
        else
            loaiHinh = "1"; 
        String giaDichVu = txtGia.getText();


        DichVu dv = new DichVu();
        int index = 0;
        try {
            try {             
                if(maDichVu.equals("") || tenDichVu.equals("") || giaDichVu.equals(""))
                    JOptionPane.showMessageDialog(this, "Thông tin chưa đẩy đủ"
                        , "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE); 
                else if(maDichVu.length() > 5)
                    JOptionPane.showMessageDialog(this, "Mã dịch vụ có chiều dài là 5 bao gồm số và chữ"
                        , "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE); 
                else
                    index = dv.ThemDichVuMoi(maDichVu, tenDichVu
                            , Integer.parseInt(loaiHinh), Integer.parseInt(giaDichVu));
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongTinCacPhong.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            if (index > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        }catch (SQLException  ex) {
            JOptionPane.showMessageDialog(this, "Mã dịch vụ đã tồn tại"
                , "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        
        String maDichVu = txtMaDichVu.getText();
        String tenDichVu = txtTenDichVu.getText();
        String loaiHinh = (String) cbbLoaiHinh.getSelectedItem();
        if(loaiHinh.equals("Ngoài trời"))
            loaiHinh = "0";
        else
            loaiHinh = "1"; 
        String giaDichVu = txtGia.getText();


        DichVu dv = new DichVu();
        int index = 0;
        try {
            try {               
                if(maDichVu.equals("") || tenDichVu.equals("") || giaDichVu.equals(""))
                    JOptionPane.showMessageDialog(this, "Thông tin chưa đầy đủ"
                        , "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE); 
                else
                    index = dv.SuaDichVu(maDichVu, tenDichVu
                            , Integer.parseInt(loaiHinh), Integer.parseInt(giaDichVu));
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongTinCacPhong.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            if (index > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
        }catch (SQLException  ex) {
            Logger.getLogger(ThongTinCacPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    /**
     * Hàm lấy thông tin các dịch vụ trong khách sạn
     * @throws SQLException 
     */
    private void loadData() throws SQLException{
        try {
            DichVu dvData = new DichVu();
            String arr[] = {"Mã dịch vụ", "Tên dịch vụ", "Loại hình", "Giá"};
            List <DichVu> listDichVu = dvData.getFullData();
            DefaultTableModel dtm = new DefaultTableModel(arr,0);
            tbThongTinDichVu.removeAll();
            tbThongTinDichVu.setModel(dtm);
            
            for (DichVu dv : listDichVu) {
                dtm.addRow(new Object[]{
                  dv.getMaDichVuString(), dv.getTenDichVu()
                 ,dv.getLoaiHinh(), dv.getGia()
                });
            }
            
            dtm.fireTableDataChanged();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinCacPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbLoaiHinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbThongTinDichVu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtTenDichVu;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
