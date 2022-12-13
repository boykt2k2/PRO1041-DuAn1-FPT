/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QLB_DoUong.Services;

import QLB_DoUong.DomainModels.KhuyenMai;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author THUONG DINH
 */
public interface KhuyenMaiService {
    public ArrayList<KhuyenMai> getList();
    public boolean addNew(KhuyenMai khuyenMai);
    public boolean update(KhuyenMai khuyenMai, String id);
    public Boolean updateTinhTrang(KhuyenMai khuyenMai,Date ngayKetThuc);
    public boolean delete(String id);
    public Date ngayBatDau();
    public Date ngayKetThuc();
    public Date locNgayKhuyenMai(Date ngayBatDau,Date ngay,Date ngayKetThuc);
    public Boolean timKiem();
}
