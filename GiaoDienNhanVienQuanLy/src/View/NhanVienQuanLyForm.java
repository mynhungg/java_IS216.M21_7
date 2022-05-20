/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import ConnectDB.ConnectionUtils;
import DatabaseProcess.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Phat
 */
public class NhanVienQuanLyForm extends javax.swing.JFrame {
    private RoomManagement roomPanelManagement;
    private ThongTinNVQL  nVQLPanelManagement;
    private ThongTinTaiKhoan taiKhoanPanelManagement;
    private ThongTinNhanVien nhanvienPanelManagement;
    /**
     * Creates new form NhanVienPage
     */
    public NhanVienQuanLyForm() {
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

        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuThongTin = new javax.swing.JMenu();
        menuThongTinCaNhan = new javax.swing.JMenuItem();
        menuThongTinTaiKhoan = new javax.swing.JMenuItem();
        menuRoomInfo = new javax.swing.JMenu();
        menuQuanLyPhong = new javax.swing.JMenuItem();
        NhanVienManagement = new javax.swing.JMenu();
        menuThongTinNhanVien = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANG NHÂN VIÊN QUẢN LÝ");

        menuThongTin.setText("Thông tin");

        menuThongTinCaNhan.setText("Thông tin cá nhân");
        menuThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThongTinCaNhanActionPerformed(evt);
            }
        });
        menuThongTin.add(menuThongTinCaNhan);

        menuThongTinTaiKhoan.setText("Thông tin tài khoản");
        menuThongTinTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThongTinTaiKhoanActionPerformed(evt);
            }
        });
        menuThongTin.add(menuThongTinTaiKhoan);

        jMenuBar1.add(menuThongTin);

        menuRoomInfo.setText("Quản lý phòng");
        menuRoomInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRoomInfoActionPerformed(evt);
            }
        });

        menuQuanLyPhong.setText("Quản lý thông tin phòng");
        menuQuanLyPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuanLyPhongActionPerformed(evt);
            }
        });
        menuRoomInfo.add(menuQuanLyPhong);

        jMenuBar1.add(menuRoomInfo);

        NhanVienManagement.setText("Quản lý nhân viên");

        menuThongTinNhanVien.setText("Thông tin nhân viên");
        menuThongTinNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThongTinNhanVienActionPerformed(evt);
            }
        });
        NhanVienManagement.add(menuThongTinNhanVien);

        jMenuBar1.add(NhanVienManagement);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRoomInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRoomInfoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuRoomInfoActionPerformed

    private void menuQuanLyPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuanLyPhongActionPerformed
        // TODO add your handling code here:
        if(roomPanelManagement == null){
            try {
                roomPanelManagement = new RoomManagement();
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienQuanLyForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            tplMainBoard.addTab("Quản lý phòng", roomPanelManagement);
        }
        tplMainBoard.setSelectedComponent(roomPanelManagement);
    }//GEN-LAST:event_menuQuanLyPhongActionPerformed

    private void menuThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThongTinCaNhanActionPerformed
        // TODO add your handling code here:
        if(nVQLPanelManagement == null){
            nVQLPanelManagement = new ThongTinNVQL();
            tplMainBoard.addTab("Thông tin cá nhân", nVQLPanelManagement);
        }
        
        tplMainBoard.setSelectedComponent(nVQLPanelManagement);
    }//GEN-LAST:event_menuThongTinCaNhanActionPerformed

    private void menuThongTinTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThongTinTaiKhoanActionPerformed
        // TODO add your handling code here:
        if(taiKhoanPanelManagement == null){
            taiKhoanPanelManagement = new ThongTinTaiKhoan();
            tplMainBoard.addTab("Thông tin tài khoản", taiKhoanPanelManagement);
        }
        
        tplMainBoard.setSelectedComponent(taiKhoanPanelManagement); 
    }//GEN-LAST:event_menuThongTinTaiKhoanActionPerformed

    private void menuThongTinNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThongTinNhanVienActionPerformed
        // TODO add your handling code here:
        if(nhanvienPanelManagement == null){
            try {
                nhanvienPanelManagement = new ThongTinNhanVien();
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienQuanLyForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            tplMainBoard.addTab("Thông tin nhân viên", nhanvienPanelManagement);
        }
        tplMainBoard.setSelectedComponent(nhanvienPanelManagement);
    }//GEN-LAST:event_menuThongTinNhanVienActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienQuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienQuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienQuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienQuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienQuanLyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu NhanVienManagement;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuQuanLyPhong;
    private javax.swing.JMenu menuRoomInfo;
    private javax.swing.JMenu menuThongTin;
    private javax.swing.JMenuItem menuThongTinCaNhan;
    private javax.swing.JMenuItem menuThongTinNhanVien;
    private javax.swing.JMenuItem menuThongTinTaiKhoan;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
