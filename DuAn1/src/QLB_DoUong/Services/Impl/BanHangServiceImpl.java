/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLB_DoUong.Services.Impl;

import QLB_DoUong.DomainModels.DoUong_HoaDon;
import QLB_DoUong.DomainModels.HoaDon;
import QLB_DoUong.Repositories.BanHangRepository;
import QLB_DoUong.Services.BanHangService;
import QLB_DoUong.ViewModel.DoUongVM;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BanHangServiceImpl implements  BanHangService{
private BanHangRepository banHangRepository = new BanHangRepository();

    

    @Override
    public ArrayList<HoaDon> getListHoaDon() {
        return banHangRepository.getListHoaDon();
    }

    @Override
    public ArrayList<DoUongVM> getList() {
        return banHangRepository.getList();
    }

    @Override
    public String getByIDMaHD(String ma) {
        return banHangRepository.getByIDMaHD(ma);
    }

    @Override
    public String getByIDMaDU(String ma) {
        return banHangRepository.getByIDMaDU(ma);
    }

    @Override
    public ArrayList<DoUong_HoaDon> getListHoaDonChiTiet() {
        return banHangRepository.getListHoaDonChiTiet();
    }

    @Override
    public Boolean check(String ma) {
        return banHangRepository.check(ma);
    }

 
    
}
