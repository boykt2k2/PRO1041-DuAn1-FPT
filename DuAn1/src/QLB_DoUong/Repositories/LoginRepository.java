/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLB_DoUong.Repositories;

import QLB_DoUong.DomainModels.NhanVien;
import QLB_DoUong.Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author THUONG DINH
 */
public class LoginRepository {
 public DBConnection connection;
    public ArrayList<NhanVien> getFormDb(String sdt, String pw) {
         ArrayList<NhanVien> list = new ArrayList<>();        
        String sql = "select nhanvien.MaNhanVien, nhanvien.TenNhanVien, nhanvien.sdt, nhanvien.matkhau,nhanvien.TrangThai, nhanvien.ChucVu from nhanvien where sdt = ? and matkhau = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sdt);
            ps.setString(2, pw);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(rs.getString(1));
                nhanVien.setTenNhanVien(rs.getString(2));
                nhanVien.setSdt(rs.getString(3));
                nhanVien.setMatKhau(rs.getString(4));
                nhanVien.setTrangThai(rs.getInt(5));
                nhanVien.setChucVu(rs.getInt(6));
                list.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } return list;
    }

    public boolean check(String sdt, String pw) {
           boolean trangthai = true;
                    
         String sql = "select nhanvien.sdt, nhanvien.matkhau,nhanvien.TrangThai from nhanvien where sdt = ? and matkhau = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sdt);
            ps.setString(2, pw);
            
          ResultSet rs = ps.executeQuery();
          trangthai = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trangthai;
   
    }
    
    
}
