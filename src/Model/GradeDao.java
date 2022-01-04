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
public class GradeDao {
    List<Grade> ls = new ArrayList<>();
    public int add(Grade d){
        ls.add(d);
        return 1;
    }
    public List<Grade> getAllGrade(){
        return ls;
    }
    public Grade getOnegGradeByMaSV(String masv){
        for(Grade d : ls){
            if (d.getSv().getMaSV().equalsIgnoreCase(masv)){
                return d;
               
            }
        }
        return null;
    }
    public int updateGrade(Grade dNew){
        for(Grade d:ls){
            if(d.getSv().getMaSV().equalsIgnoreCase(dNew.getSv().getMaSV())){
                d.setAnhVan(dNew.getAnhVan());
                d.setLaptrinh(dNew.getlaptrinh());
                d.setTinHoc(dNew.getTinHoc());
                return 1;
            }
        }
        return  -1;
    }
    public int delGrade(String masv){
        Grade d = getOnegGradeByMaSV(masv);
        if(d!=null){
            ls.remove(d);
            return 1;
        }
        return -1;
    }

   
}
