/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLB_DoUong.Services.Impl;

import QLB_DoUong.DomainModels.KhuyenMai;
import QLB_DoUong.Repositories.KhuyenMaiRepository;
import QLB_DoUong.Services.KhuyenMaiService;
import java.util.ArrayList;

/**
 *
 * @author THUONG DINH
 */
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
    public KhuyenMaiRepository khuyenMaiRepository = new KhuyenMaiRepository();

    @Override
    public ArrayList<KhuyenMai> getList() {
        return khuyenMaiRepository.getFormDB();
    }

    @Override
    public boolean addNew(KhuyenMai khuyenMai) {
        return khuyenMaiRepository.addNew(khuyenMai);
    }

    @Override
    public boolean update(KhuyenMai khuyenMai, String id) {
        return khuyenMaiRepository.update(khuyenMai,id);
    }

    @Override
    public boolean delete(String id) {
        return khuyenMaiRepository.delete(id);
    }

    @Override
    public Boolean timKiem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
