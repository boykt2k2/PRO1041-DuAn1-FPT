/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QLB_DoUong.Services;

import QLB_DoUong.DomainModels.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author THUONG DINH
 */
public interface LoginService {
     public ArrayList<NhanVien> getList(String sdt, String pw);
    public boolean check(String sdt, String pw);
}
