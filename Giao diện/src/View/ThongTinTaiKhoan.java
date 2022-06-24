/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import DatabaseProcess.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Thanh Phat
 */
public class ThongTinTaiKhoan extends javax.swing.JPanel { 
    /**
     * Creates new form ThongTinTaiKhoan
     */
    private TaiKhoan thongtintaiKhoan;
    private DangNhapFrame loginInfo;
    private DoiMatKhau doiMatKhauFrame;
    private NhanVienQuanLyForm nvqlForm;
    
    public ThongTinTaiKhoan() {
        initComponents();
        this.txtTenDangNhap.setEnabled(false);
        this.txtVaiTro.setEnabled(false);  
        try {
            
            txtTenDangNhap.setText(ShareData.useraccount.getTenDangNhapString());
            txtVaiTro.setText(ShareData.useraccount.getVaiTro());
        } catch (Exception e) {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtVaiTro = new javax.swing.JTextField();
        btnDoiMatKhau = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 222, 217));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tên đăng nhập:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Vai trò:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, -1));
        add(txtVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, -1));

        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/đổi mật khẩu.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        add(btnDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(214, 172, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN TÀI KHOẢN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel1)
                .addContainerGap(538, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/thông_tin_tài_khoản_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 470, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:

        doiMatKhauFrame = new DoiMatKhau();
        doiMatKhauFrame.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtVaiTro;
    // End of variables declaration//GEN-END:variables
}
