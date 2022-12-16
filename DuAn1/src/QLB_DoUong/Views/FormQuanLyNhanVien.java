/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLB_DoUong.Views;

import java.util.Date;
import QLB_DoUong.DomainModels.NhanVien;
import QLB_DoUong.Services.Impl.NhanVienServiceImpl;
import QLB_DoUong.Services.NhanVienService;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 0978078602
 */
public class FormQuanLyNhanVien extends javax.swing.JPanel {

    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    private List<NhanVien> listNhanVien = new ArrayList<>();
    private NhanVienService nhanVienService = new NhanVienServiceImpl();
    private ButtonGroup buttonGroup = new ButtonGroup();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form FormQuanLyNhanVien
     */
    public FormQuanLyNhanVien() {
        initComponents();
        txtID.setEnabled(false);
        lblGioiTinh.setForeground(Color.red);
        radio();
        radio2();
        radio3();
        showData(nhanVienService.getAll());
    }

    private void showData(List<NhanVien> listNhanVien) {
        dtm = (DefaultTableModel) tblDS_NhanVien.getModel();
        dtm.setNumRows(0);
        for (NhanVien nhanVien : listNhanVien) {
            dtm.addRow(nhanVien.toData());
        }
    }

    private void radio() {
        buttonGroup2.add(rdoNam);
        buttonGroup2.add(rdoNu);
    }

    private void radio2() {
        buttonGroup1.add(rdoDangLamViec);
        buttonGroup1.add(rdoNghiViec);
    }

    private void radio3() {
        buttonGroup3.add(rdoQuanLy);
        buttonGroup3.add(rdoNhanVien);
    }

    private void clear() {
        txtID.setText("");
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtEmail.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtMatKhau.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
    }

    private boolean check() {
        if (txtMaNV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên không được để trống");
            return false;
        } else if (!txtMaNV.getText().matches("^[N]{1}[V]{1}\\d+")) {
            JOptionPane.showMessageDialog(this, "Sai định dạng Mã (VD: NV001)");
            return false;
        } else if (txtTenNV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống");
            return false;
        } else if (txtTenNV.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên phải là chữ");
            return false;
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Email không được để trống");
            return false;
        } else if (!(txtEmail.getText()).matches("^(.+)@(\\S+)$")) {
            JOptionPane.showMessageDialog(this, "Sai định dạng Email");
            return false;
        } else if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn giới tính");
            return false;
        } else if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống");
            return false;
        } else if (txtDiaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống");
            return false;
        } else if (txtMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            return false;
        } else if (!rdoDangLamViec.isSelected() && !rdoNghiViec.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn trạng thái");
            return false;
        } else if (txtSDT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
            return false;
        } else if (!txtSDT.getText().matches("0\\d{9}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
            return false;
        } else if (!rdoQuanLy.isSelected() && !rdoNhanVien.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên");
            return false;
        }
        return true;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtLocDiaChi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboLocGioiTinh = new javax.swing.JComboBox<>();
        lblGioiTinh = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtTimMa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        rdoDangLamViec = new javax.swing.JRadioButton();
        rdoNghiViec = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        txtNgaySinh = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDS_NhanVien = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel11.setText("Lọc theo địa chỉ:");

        txtLocDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocDiaChiKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocDiaChiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLocDiaChiKeyTyped(evt);
            }
        });

        jLabel12.setText("Lọc theo giới tính:");

        cboLocGioiTinh.setBackground(new java.awt.Color(228, 245, 194));
        cboLocGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1", "0" }));
        cboLocGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocGioiTinhActionPerformed(evt);
            }
        });

        lblGioiTinh.setBackground(new java.awt.Color(204, 0, 0));
        lblGioiTinh.setText("(1: Nam, 0: Nữ)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtLocDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGioiTinh))
                    .addComponent(cboLocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblGioiTinh))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboLocGioiTinh)
                    .addComponent(txtLocDiaChi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtTimMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimMaFocusLost(evt);
            }
        });
        txtTimMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimMaActionPerformed(evt);
            }
        });
        txtTimMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimMaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimMaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimMaKeyTyped(evt);
            }
        });

        jLabel13.setText("Tìm theo mã:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID:");

        jLabel2.setText("Mã nhân viên:");

        jLabel3.setText("Tên nhân viên:");

        jLabel4.setText("Email:");

        jLabel5.setText("Giới tính:");

        jLabel6.setText("Địa chỉ:");

        jLabel7.setText("Mật khẩu:");

        jLabel10.setText("Trạng thái:");

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdoNam);
        rdoNam.setText("Nam");

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdoNu);
        rdoNu.setText("Nữ");

        rdoDangLamViec.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoDangLamViec);
        rdoDangLamViec.setText("Đang làm việc");

        rdoNghiViec.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNghiViec);
        rdoNghiViec.setText("Nghỉ việc");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem.setBackground(new java.awt.Color(228, 245, 194));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/them.png"))); // NOI18N
        btnThem.setText("  Thêm nhân viên");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(228, 245, 194));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/huyHoaDon.png"))); // NOI18N
        btnXoa.setText("   Xóa nhân viên");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(228, 245, 194));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/thanhDoi.png"))); // NOI18N
        btnSua.setText("  Sửa nhân viên");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(228, 245, 194));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLB_DoUong/IMG/lamMoi.png"))); // NOI18N
        btnNew.setText("   Làm mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel14.setText("Ngày sinh:");

        jLabel16.setText("Số điện thoại:");

        jLabel8.setText("Chức vụ:");

        buttonGroup3.add(rdoQuanLy);
        rdoQuanLy.setText("Quản lý");

        buttonGroup3.add(rdoNhanVien);
        rdoNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoQuanLy)
                                .addGap(68, 68, 68)
                                .addComponent(rdoNhanVien))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoDangLamViec)
                                .addGap(28, 28, 28)
                                .addComponent(rdoNghiViec))
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(txtNgaySinh)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNam)
                        .addGap(61, 61, 61)
                        .addComponent(rdoNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rdoDangLamViec)
                    .addComponent(rdoNghiViec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(jLabel16)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rdoQuanLy)
                    .addComponent(rdoNhanVien))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblDS_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã Nhân Viên", "Tên Nhân Viên", "Email", "Giới Tính", "Ngày Sinh", "Địa Chỉ", "Mật khẩu", "Trạng Thái", "SDT", "Chức Vụ"
            }
        ));
        tblDS_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDS_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDS_NhanVien);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (check()) {
            NhanVien nv = new NhanVien();
            String ma = txtMaNV.getText();
            nv.setMaNhanVien(txtMaNV.getText());
            nv.setTenNhanVien(txtTenNV.getText());
            nv.setEmail(txtEmail.getText());
            nv.setGioiTinh(rdoNam.isSelected() ? 0 : 1);
            nv.setNgaySinh(java.sql.Date.valueOf(txtNgaySinh.getText()));
            nv.setDiaChi(txtDiaChi.getText());
            nv.setSdt(txtSDT.getText());
            nv.setTrangThai(rdoDangLamViec.isSelected() ? 1 : 0);
            nv.setMatKhau(String.valueOf(txtMatKhau.getPassword()));
            nv.setChucVu(rdoQuanLy.isSelected() ? 1 : 0);
            String checkTrung = nhanVienService.checkTrung(ma);
            if (checkTrung != null) {
                JOptionPane.showMessageDialog(this, "Trùng mã");
                return;
            }
            int i = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thêm nhân viên này?", "Quản lý nhân viên", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                JOptionPane.showMessageDialog(this, nhanVienService.add(nv));
                showData(nhanVienService.getAll());
            }

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tblDS_NhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên để xóa!");
        } else {
            String maNV = tblDS_NhanVien.getValueAt(row, 1).toString();
            int i = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa nhân viên này?", "Quản lý nhân viên", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                JOptionPane.showMessageDialog(this, nhanVienService.delete(maNV));
                showData(nhanVienService.getAll());
                clear();
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tblDS_NhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên để cập nhật!");
        } else if (check()) {
            NhanVien nv = new NhanVien();
            String id = txtID.getText();
            nv.setMaNhanVien(txtMaNV.getText());
            nv.setTenNhanVien(txtTenNV.getText());
            nv.setEmail(txtEmail.getText());
            nv.setGioiTinh(rdoNam.isSelected() ? 1 : 0);
            nv.setNgaySinh(java.sql.Date.valueOf(txtNgaySinh.getText()));
            nv.setDiaChi(txtDiaChi.getText());
            nv.setSdt(txtSDT.getText());
            nv.setTrangThai(rdoDangLamViec.isSelected() ? 1 : 0);
            nv.setMatKhau(String.valueOf(txtMatKhau.getPassword()));
            nv.setChucVu(rdoQuanLy.isSelected() ? 1 : 0);
            int i = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn cập nhật nhân viên này?", "Quản lý nhân viên", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                JOptionPane.showMessageDialog(this, nhanVienService.update(nv, id));
                showData(nhanVienService.getAll());
            }
        }


    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtTimMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimMaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimMaActionPerformed

    private void txtTimMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimMaFocusLost

    }//GEN-LAST:event_txtTimMaFocusLost

    private void tblDS_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDS_NhanVienMouseClicked
        // TODO add your handling code here:
        int row = tblDS_NhanVien.getSelectedRow();
        txtID.setText(tblDS_NhanVien.getValueAt(row, 0).toString());
        txtMaNV.setText(tblDS_NhanVien.getValueAt(row, 1).toString());
        txtTenNV.setText(tblDS_NhanVien.getValueAt(row, 2).toString());
        txtEmail.setText(tblDS_NhanVien.getValueAt(row, 3).toString());
        if (tblDS_NhanVien.getValueAt(row, 4).toString().equals("Nam")) {
            rdoNam.setSelected(true);
        }
        if (tblDS_NhanVien.getValueAt(row, 4).toString().equals("Nữ")) {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(tblDS_NhanVien.getValueAt(row, 5).toString());
        txtDiaChi.setText(tblDS_NhanVien.getValueAt(row, 6).toString());
        txtSDT.setText(tblDS_NhanVien.getValueAt(row, 7).toString());
        if (tblDS_NhanVien.getValueAt(row, 8).toString().equals("Đang làm việc")) {
            rdoDangLamViec.setSelected(true);
        }
        if (tblDS_NhanVien.getValueAt(row, 8).toString().equals("Nghỉ việc")) {
            rdoNghiViec.setSelected(true);
        }
        txtMatKhau.setText(tblDS_NhanVien.getValueAt(row, 9).toString());
        if (tblDS_NhanVien.getValueAt(row, 10).toString().equals("Quản lý")) {
            rdoQuanLy.setSelected(true);
        }
        if (tblDS_NhanVien.getValueAt(row, 10).toString().equals("Nhân viên")) {
            rdoNhanVien.setSelected(true);
        }

    }//GEN-LAST:event_tblDS_NhanVienMouseClicked

    private void txtLocDiaChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocDiaChiKeyPressed
        // TODO add your handling code here:
        String diaChi = "%" + txtLocDiaChi.getText() + "%";
        List<NhanVien> listNhanVien1 = nhanVienService.searchDiaChi(diaChi);
        showData(listNhanVien1);
    }//GEN-LAST:event_txtLocDiaChiKeyPressed

    private void txtLocDiaChiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocDiaChiKeyReleased
        // TODO add your handling code here:
        String diaChi = "%" + txtLocDiaChi.getText() + "%";
        List<NhanVien> listNhanVien1 = nhanVienService.searchDiaChi(diaChi);
        showData(listNhanVien1);
    }//GEN-LAST:event_txtLocDiaChiKeyReleased

    private void txtLocDiaChiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocDiaChiKeyTyped
        // TODO add your handling code here:
        String diaChi = "%" + txtLocDiaChi.getText() + "%";
        List<NhanVien> listNhanVien1 = nhanVienService.searchDiaChi(diaChi);
        showData(listNhanVien1);
    }//GEN-LAST:event_txtLocDiaChiKeyTyped

    private void cboLocGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocGioiTinhActionPerformed
        // TODO add your handling code here:
        int gioiTinh = cboLocGioiTinh.getSelectedIndex();
        if (gioiTinh > 0) {
            String gioiTinh1 = (String) cboLocGioiTinh.getSelectedItem();
            List<NhanVien> list = nhanVienService.searchGioiTinh(gioiTinh1);
            showData(list);
        } else {
            List<NhanVien> list1 = nhanVienService.getAll();
            showData(list1);
        }
    }//GEN-LAST:event_cboLocGioiTinhActionPerformed

    private void txtTimMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimMaKeyPressed
        // TODO add your handling code here:
        String maNV = "%" + txtTimMa.getText() + "%";
        List<NhanVien> listNhanVien2 = nhanVienService.search(maNV);
        showData(listNhanVien2);
    }//GEN-LAST:event_txtTimMaKeyPressed

    private void txtTimMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimMaKeyReleased
        // TODO add your handling code here:
        String maNV = "%" + txtTimMa.getText() + "%";
        List<NhanVien> listNhanVien2 = nhanVienService.search(maNV);
        showData(listNhanVien2);
    }//GEN-LAST:event_txtTimMaKeyReleased

    private void txtTimMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimMaKeyTyped
        // TODO add your handling code here:
        String maNV = "%" + txtTimMa.getText() + "%";
        List<NhanVien> listNhanVien2 = nhanVienService.search(maNV);
        showData(listNhanVien2);
    }//GEN-LAST:event_txtTimMaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboLocGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JRadioButton rdoDangLamViec;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNghiViec;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tblDS_NhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLocDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimMa;
    // End of variables declaration//GEN-END:variables
}
