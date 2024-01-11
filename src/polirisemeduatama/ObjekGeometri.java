/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polirisemeduatama;


/**
 *
 * @author KAK DUATAMA
 */
public class ObjekGeometri {
    private String color = "red";
    public String Bentuk;
    public double panjang,diameter;
    public double phi = 3.14;
    
    
    ObjekGeometri(){
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color
    ;
    }
    
    //override
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getKeliling(){
        double keliling;
        keliling = panjang*panjang;
        return keliling;
    }

    //overidde
    public void ukuran(){
        System.out.println("ukuran geometri");
    }
    //override
    public void warna(){
        System.out.println("warna geometri");
    }
}
 //override
//    public void setPanjang(double panjang) {
//        this.panjang = panjang;
//    }
//    
//    public double getKeliling(){
//        double keliling;
//        keliling = panjang*panjang;
//        return keliling;
//    }
//
//    //overidde
//    public void ukuran(){
//        System.out.println("ukuran geometri");
//    }
//    //override
//    public void warna(){
//        System.out.println("warna geometri");
//    }
// 
//}
////    
////    public void setbentuk(String Bentuk){
////        
////        this.Bentuk = Bentuk ;
////        
////    }
////    public String getBentuk(){
////        return this.Bentuk;
////    }
//    
//
////        System.out.println("objek geometri....");
//////override
////    public void setPanjang(double panjang) {
////        this.panjang = panjang;
////    }
////    
////    public double getKeliling(){
////        double keliling;
////        keliling = panjang*panjang;
////        return keliling;
////    }
////
////    //overidde
////    public void ukuran(){
////        System.out.println("ukuran geometri");
////    }
////    //override
////    public void warna(){
////        System.out.println("warna geometri");
////    }
// 
//}
