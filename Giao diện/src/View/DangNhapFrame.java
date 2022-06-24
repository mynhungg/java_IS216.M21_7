/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DatabaseProcess.*;
import javax.swing.JOptionPane;
import DatabaseProcess.User;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author Thanh Phat
 */
public class DangNhapFrame extends javax.swing.JFrame {
    private NhanVienQuanLyForm quanLyPage;
    private KhachHangPage khachHangPage;
    private static User us;
    private static TaiKhoan nd;
    private static NhanVienQuanLy nvqlData;
    private static NhanVien nvData;
    private static KhachHang khData;
    private DangKyNVienFrame dangKyFrame;
    private NhanVienForm nhanvienFrame;
    private TrangNhanVien nhanVienForm;
    /**
     * Creates new form LoginForm
     */
    public DangNhapFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jList1 = new javax.swing.JList<>();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jpMatKhau = new javax.swing.JPasswordField();
        txtTenTaiKhoan = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        ManHinhNen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jMenu1.setText("jMenu1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/White Clean and Simple Hotel Facebook Story Ad (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,10));

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("ĐĂNG NHẬP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tên tài khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        btnDangNhap.setBackground(new java.awt.Color(204, 204, 204));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/sign-in.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        jpMatKhau.setBackground(new java.awt.Color(204, 204, 204));

        txtTenTaiKhoan.setBackground(new java.awt.Color(204, 204, 204));
        txtTenTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnThoat.setBackground(new java.awt.Color(204, 204, 204));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDangNhap)
                                .addGap(35, 35, 35)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtTenTaiKhoan))
                                .addGap(9, 9, 9)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDangNhap)
                    .addComponent(btnThoat))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 240));

        ManHinhNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Màn hình đăng nhập.png"))); // NOI18N
        getContentPane().add(ManHinhNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 340));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/nền 1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 650, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát","Thoát",JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            System.exit(0);
        }        
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        // kiểm tra tên tài khoản
 
        nd = new TaiKhoan();
        try {
            us = nd.CheckLoginUser(txtTenTaiKhoan.getText(), new String(jpMatKhau.getPassword()));
            ShareData.useraccount = us;
            nvqlData = nd.ThongTinNhanVien(txtTenTaiKhoan.getText());
            ShareData.nvql = nvqlData;
            nvData = nd.nhanVienInfo(txtTenTaiKhoan.getText());
            ShareData.nv = nvData;
            khData = nd.khachHangInfo(txtTenTaiKhoan.getText());
            ShareData.kh = khData;
            if(txtTenTaiKhoan.getText().equals("") || jpMatKhau.getPassword().equals("")){
                JOptionPane.showMessageDialog(this, "Thông tin chưa đẩy đủ"
                        , "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);                
            }
            else if(us == null){
                JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không tồn tại"
                        , "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
            }
            else if (us.getVaiTro().equals("Nhân viên quản lý")){ 
                this.quanLyPage = new NhanVienQuanLyForm();
                quanLyPage.setVisible(true);
                this.dispose();
            }
            else if (us.getVaiTro().equals("Nhân viên")){ 
//                this.nhanvienFrame = new NhanVienForm();
//                nhanvienFrame.setVisible(true);
//                this.dispose();
                this.nhanVienForm = new TrangNhanVien();
                nhanVienForm.setVisible(true);
                this.dispose();
            }
            else if (us.getVaiTro().equals("Khách hàng")){ 
                this.khachHangPage = new KhachHangPage();
                khachHangPage.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnDangNhap.doClick();
        }
    }//GEN-LAST:event_btnDangNhapKeyPressed


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
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DangNhapFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManHinhNen;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jpMatKhau;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
