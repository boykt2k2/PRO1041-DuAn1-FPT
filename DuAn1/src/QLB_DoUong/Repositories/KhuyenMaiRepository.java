/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLB_DoUong.Repositories;

import QLB_DoUong.DomainModels.KhuyenMai;
import QLB_DoUong.Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author THUONG DINH
 */
public class KhuyenMaiRepository {

    public DBConnection Connection;

    public ArrayList<KhuyenMai> getFormDB() {
        ArrayList<KhuyenMai> listdb = new ArrayList<>();
        String sql = "select * from khuyenmai";
        try (Connection con = Connection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai khuyenMai = new KhuyenMai();
                khuyenMai.setId(rs.getString(1));
                khuyenMai.setMaKhuyenMai(rs.getString(2));
                khuyenMai.setPhamTramKhuyenMai(rs.getFloat(3));
                khuyenMai.setNgayBatDau(rs.getDate(4));
                khuyenMai.setNgayKetThuc(rs.getDate(5));
                khuyenMai.setTrangThai(rs.getInt(6));
                listdb.add(khuyenMai);

            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listdb;
    }

    public boolean addNew(KhuyenMai khuyenMai) {
        String sql = "insert into KhuyenMai (MaKhuyenMai,GiaTriKhuyenMai,NgayBatDau,NgayKetThuc,TrangThai) values (?,?,?,?,?)";
        try (Connection con = Connection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, khuyenMai.getMaKhuyenMai());
            ps.setObject(2, khuyenMai.getPhamTramKhuyenMai());
            ps.setObject(3, khuyenMai.getNgayBatDau());
            ps.setObject(4, khuyenMai.getNgayKetThuc());
            ps.setObject(5, khuyenMai.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return false;
    }

    public boolean update(KhuyenMai khuyenMai, String id) {
        String sql = "update KhuyenMai set MaKhuyenMai = ?, GiaTriKhuyenMai = ? , "
                + "NgayBatDau = ?, NgayKetThuc = ?,TrangThai = ? where id = ?";
        try (Connection con = Connection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, khuyenMai.getMaKhuyenMai());
            ps.setObject(2, khuyenMai.getPhamTramKhuyenMai());
            ps.setObject(3, khuyenMai.getNgayBatDau());
            ps.setObject(4, khuyenMai.getNgayKetThuc());
            ps.setObject(5, khuyenMai.getTrangThai());
            ps.setObject(6, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return false;
    }

    public boolean delete(String ma) {
        String sql = "delete KhuyenMai where id = ?";
        try (Connection con = Connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return false;

    }

    public Boolean updateTinhTrang(KhuyenMai khuyenMai, Date ngayKetThuc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date ngayBatDau() {
        String sql = "select KhuyenMai.NgayBatDau from KhuyenMai";
        try (Connection con = Connection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getDate(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date ngayKetThuc() {
        String sql = "select KhuyenMai.NgayKetThuc from KhuyenMai";
        try (Connection con = Connection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getDate(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date locNgayKhuyenMai(Date ngayBatDau, Date ngay, Date ngayKetThuc) {
        String sql = "select NgayBatDau, NgayKetThuc from  KhuyenMai where NgayBatDau <= ? and NgayKetThuc >= ?";
        try (Connection con = Connection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setDate(1, ngay);
           
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
