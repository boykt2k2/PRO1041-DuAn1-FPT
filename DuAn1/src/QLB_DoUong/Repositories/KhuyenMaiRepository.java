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
        try ( Connection con = Connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai khuyenMai = new KhuyenMai();
                khuyenMai.setId(rs.getString(1));
                khuyenMai.setMaKhuyenMai(rs.getString(2));
                khuyenMai.setTenKhuyenMai(rs.getString(3));
                khuyenMai.setPhamTramKhuyenMai(rs.getFloat(4));
                khuyenMai.setNgayBatDau(rs.getDate(5));
                khuyenMai.setNgayKetThuc(rs.getDate(6));
                listdb.add(khuyenMai);

            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listdb;
    }

    public boolean addNew(KhuyenMai khuyenMai) {
        String sql = "insert into KhuyenMai (MaKhuyenMai,TenKhuyenMai,PhanTramKhuyenMai,NgayBatDau,NgayKetThuc) values (?,?,?,?,?)";
        try ( Connection con = Connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, khuyenMai.getMaKhuyenMai());
            ps.setObject(2, khuyenMai.getTenKhuyenMai());
            ps.setObject(3, khuyenMai.getPhamTramKhuyenMai());
            ps.setObject(4, khuyenMai.getNgayBatDau());
            ps.setObject(5, khuyenMai.getNgayKetThuc());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return false;
    }

    public boolean update(KhuyenMai khuyenMai, String id) {
        String sql = "update KhuyenMai set MaKhuyenMai = ?, TenKhuyenMai = ?, PhanTramKhuyenMai = ? , "
                + "NgayBatDau = ?, NgayKetThuc = ? where id = ?";
        try ( Connection con = Connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, khuyenMai.getMaKhuyenMai());
            ps.setObject(2, khuyenMai.getTenKhuyenMai());
            ps.setObject(3, khuyenMai.getPhamTramKhuyenMai());
            ps.setObject(4, khuyenMai.getNgayBatDau());
            ps.setObject(5, khuyenMai.getNgayKetThuc());
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

}
