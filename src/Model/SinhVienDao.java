/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class SinhVienDao {
     public static List<SinhVien> ls = new ArrayList<>();

    
     
    public int add(SinhVien nv){
        ls.add(nv);
        return 1;
    }
    public List<SinhVien> getALLSinhVien(){
        return ls;
    }
    public int delSinhVienByID(String ma){
        for (SinhVien nv : ls){
            if(nv.getMaSV().equalsIgnoreCase(ma)){
                ls.remove(nv);
                return 1;
            }
                
        }
        return -1;
        
    }
    public SinhVien getSinhVienByID(String id){
        for(SinhVien nv :ls){
            if(nv.getMaSV().equalsIgnoreCase(id)){
                return nv;
            }
        }
        return null;
    }
    public int updateSinhVienByID(SinhVien nvNew){
        for (SinhVien nv: ls){
            if(nv.getMaSV().equalsIgnoreCase(nvNew.getMaSV())){
                nv.setDiachi(nvNew.getDiachi());
                nv.setGioitinh(nv.isGioitinh());
                nv.setHinhanh(nv.getHinhanh());
                nv.setNgaySinh(nvNew.getNgaySinh());
                nv.setTenSV(nvNew.getTenSV());
                return 1;
            }
        
    }
        return -1;
    }
            
}
