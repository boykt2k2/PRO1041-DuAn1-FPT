/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLB_DoUong.Views;

import QLB_DoUong.DomainModels.NhanVien;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 0978078602
 */
public class ViewGiaoDienBanHang extends javax.swing.JFrame {

    private JPanel panel1;

    /**
     * Creates new form ViewGiaoDienBanHang
     */
    public ViewGiaoDienBanHang(int ChucVu, String manhanvien, String tennhanvien) {
        initComponents();
        setLocationRelativeTo(null);
        btnBanHang.setBackground(new Color(165, 245, 157));
        setpanal(new FormBanHang());
        btnNhanVien.setEnabled(false);
        btnKhuyenMai.setEnabled(false);
        btnThongKe.setEnabled(false);
        lblma.setText(manhanvien);
        lblten.setText(tennhanvien);
    }
public ViewGiaoDienBanHang() {
        initComponents();
        setLocationRelativeTo(null);
        btnBanHang.setBackground(new Color(165, 245, 157));
        setpanal(new FormBanHang());
    }

    private void setpanal(JPanel panel) {
        panel1 = panel;
        formPhanMem.removeAll();
        formPhanMem.add(panel1);
        formPhanMem.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPhanMem = new javax.swing.JPanel();
        PanelDoanhMuc = new javax.swing.JPanel();
        jpanel = new javax.swing.JPanel();
        btnDoUong = new javax.swing.JButton();
        btnKhuyenMai = new javax.swing.JButton();
        btnBan = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnDanhMuc = new javax.swing.JButton();
        btnSize = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        lblma = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formPhanMem.setBackground(new java.awt.Color(228, 245, 194));
        formPhanMem.setLayout(new java.awt.BorderLayout());
        getContentPane().add(formPhanMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1190, 740));

        PanelDoanhMuc.setBackground(new java.awt.Color(228, 245, 194));
        PanelDoanhMuc.setForeground(new java.awt.Color(0, 153, 153));

        jpanel.setBackground(new java.awt.Color(228, 245, 194));

        btnDoUong.setBackground(new java.awt.Color(228, 245, 194));
        btnDoUong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoUong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/doUong2.png"))); // NOI18N
        btnDoUong.setText("      Đồ Uống");
        btnDoUong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoUongActionPerformed(evt);
            }
        });

        btnKhuyenMai.setBackground(new java.awt.Color(228, 245, 194));
        btnKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/khuyenMai2.png"))); // NOI18N
        btnKhuyenMai.setText("  Khuyến Mãi");
        btnKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMaiActionPerformed(evt);
            }
        });

        btnBan.setBackground(new java.awt.Color(228, 245, 194));
        btnBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/ban2.png"))); // NOI18N
        btnBan.setText("           Bàn");
        btnBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(228, 245, 194));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/nhanVien2.png"))); // NOI18N
        btnNhanVien.setText("   Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(228, 245, 194));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/thongKe2.png"))); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(228, 245, 194));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/dangXuat2.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnDanhMuc.setBackground(new java.awt.Color(228, 245, 194));
        btnDanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/danhmuc2.png"))); // NOI18N
        btnDanhMuc.setText("    Danh Mục");
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });

        btnSize.setBackground(new java.awt.Color(228, 245, 194));
        btnSize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/size.png"))); // NOI18N
        btnSize.setText("             Size");
        btnSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeActionPerformed(evt);
            }
        });

        btnBanHang.setBackground(new java.awt.Color(228, 245, 194));
        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/banhang2.png"))); // NOI18N
        btnBanHang.setText("     Bán Hàng");
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        lblma.setText("l");

        lblten.setText("l");

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDoUong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(btnDanhMuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblten)
                .addGap(28, 28, 28)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoUong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/logo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelDoanhMucLayout = new javax.swing.GroupLayout(PanelDoanhMuc);
        PanelDoanhMuc.setLayout(PanelDoanhMucLayout);
        PanelDoanhMucLayout.setHorizontalGroup(
            PanelDoanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDoanhMucLayout.createSequentialGroup()
                .addGroup(PanelDoanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDoanhMucLayout.setVerticalGroup(
            PanelDoanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDoanhMucLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDoanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jPanel1.setBackground(new java.awt.Color(228, 245, 194));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("PHẦN MỀM QUẢN LÝ BÁN ĐỒ UỐNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoUongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoUongActionPerformed
        // TODO add your handling code here:
        btnDoUong.setBackground(new Color(165, 245, 157));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FormQuanLyDoUong());
    }//GEN-LAST:event_btnDoUongActionPerformed

    private void btnKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMaiActionPerformed
        // TODO add your handling code here:
        btnKhuyenMai.setBackground(new Color(165, 245, 157));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FormKhuyenMai());
    }//GEN-LAST:event_btnKhuyenMaiActionPerformed

    private void btnBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanActionPerformed
        // TODO add your handling code here:
        btnBan.setBackground(new Color(165, 245, 157));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FormBan());
    }//GEN-LAST:event_btnBanActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        btnNhanVien.setBackground(new Color(165, 245, 157));
        btnBan.setBackground(new Color(228, 245, 194));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FormQuanLyNhanVien());
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        btnThongKe.setBackground(new Color(165, 245, 157));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FromThongKe());
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        btnDangXuat.setBackground(new Color(165, 245, 157));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Phần mềm bán hàng", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            new ViewLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        // TODO add your handling code here:
        btnDanhMuc.setBackground(new Color(165, 245, 157));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        setpanal(new FormDanhMucDoUong());
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
        // TODO add your handling code here:
        btnSize.setBackground(new Color(165, 245, 157));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnBanHang.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FormSize());
    }//GEN-LAST:event_btnSizeActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        btnBanHang.setBackground(new Color(165, 245, 157));
        btnDoUong.setBackground(new Color(228, 245, 194));
        btnKhuyenMai.setBackground(new Color(228, 245, 194));
        btnBan.setBackground(new Color(228, 245, 194));
        btnNhanVien.setBackground(new Color(228, 245, 194));
        btnThongKe.setBackground(new Color(228, 245, 194));
        btnDangXuat.setBackground(new Color(228, 245, 194));
        btnSize.setBackground(new Color(228, 245, 194));
        btnDanhMuc.setBackground(new Color(228, 245, 194));
        setpanal(new FormBanHang());
    }//GEN-LAST:event_btnBanHangActionPerformed

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
            java.util.logging.Logger.getLogger(ViewGiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDoanhMuc;
    private javax.swing.JButton btnBan;
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDoUong;
    private javax.swing.JButton btnKhuyenMai;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSize;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel formPhanMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanel;
    private javax.swing.JLabel lblma;
    private javax.swing.JLabel lblten;
    // End of variables declaration//GEN-END:variables
}
