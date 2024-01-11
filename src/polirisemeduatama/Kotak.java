/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polirisemeduatama;

/**
 *
 * @author KAK DUATAMA
 */
public class Kotak extends ObjekGeometri{
    //overidde
     public double keliling;
    //overidde
    public void ukuran(){
        System.out.println("ukuran persegi");
    }
    //override
    public void warna(){
        System.out.println("warna persegi merah");
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getKeliling(){
        double keliling;
        keliling = panjang*panjang;
        return keliling;
    }
}
