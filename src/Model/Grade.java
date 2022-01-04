/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class Grade {
    private int id ;
    private SinhVien sv;
    private double anhVan, tinHoc,laptrinh;

    public Grade(int id, SinhVien sv, double anhVan, double tinHoc, double gdtc) {
        this.id = id;
        this.sv = sv;
        this.anhVan = anhVan;
        this.tinHoc = tinHoc;
        this.laptrinh = laptrinh;
    }

    public Grade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setNv(SinhVien sv) {
        this.sv = sv;
    }

    public double getAnhVan() {
        return anhVan;
    }

    public void setAnhVan(double anhVan) {
        this.anhVan = anhVan;
    }

    public double getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(double tinHoc) {
        this.tinHoc = tinHoc;
    }

    public double getlaptrinh() {
        return laptrinh;
    }

    public void setLaptrinh(double laptrinh) {
        this.laptrinh = laptrinh;
    }
    public double getTBC(){
         return(getAnhVan()+ getlaptrinh()+getTinHoc())/3;
    }
    public String getXeploai(){
        String xl="";
        double tbc = getTBC();
        if(tbc>8){
            xl= "GIOI";
            
        }else if(tbc>=7){
            xl = "Kha";
        }else if(tbc>=5){
            xl="TRUNG BINH";
        }else{
            xl="YEU";
        }
        return xl;
    }
    
    
}
