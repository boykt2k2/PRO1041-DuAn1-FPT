/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QLB_DoUong.Services;

import QLB_DoUong.DomainModels.DoUong;
import QLB_DoUong.DomainModels.DoUong_HoaDon;
import QLB_DoUong.DomainModels.HoaDon;
import QLB_DoUong.ViewModel.DoUongVM;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface BanHangService {
    public ArrayList<DoUongVM> getList();
    public ArrayList<DoUongVM> timKiemDoUong(String ten);
    public ArrayList<HoaDon> getListHoaDon();
    public String getByIDMaHD(String ma);
    public String getByIDMaDU(String ma);
    public ArrayList<DoUong_HoaDon> getListHoaDonChiTiet();
    public Boolean check(String ten,String ma);
}
