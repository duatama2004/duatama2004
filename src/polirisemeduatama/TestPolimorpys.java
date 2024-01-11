/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polirisemeduatama;

/**
 *
 * @author KAK DUATAMA
 */
public class TestPolimorpys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //dynamic binding
        JajarGenjang ganjar = new JajarGenjang();
        ganjar.warna();
        ganjar.setPanjang(100);
        ganjar.getKeliling(); 
        System.out.println("kelilingnya adalah = " + ganjar.getKeliling());
        
        Lingkaran ling = new Lingkaran();
        ling.warna();
        ling.setPanjang(30);
        ling.getKeliling();
        System.out.println("kelilingnya adalah = " + ling.getKeliling());
        
        Pentagon penta = new Pentagon();
        penta.warna();
        penta.setPanjang(10);
        penta.getKeliling(); 
        System.out.println("kelilingnya adalah = " + penta.getKeliling());
       
       ObjekGeometri bangun;
        bangun = new Kotak();
        bangun.warna();
        bangun.setPanjang(20);
        bangun.getKeliling();
        System.out.println("kelilingnya adalah = " + bangun.getKeliling());
        
       //
     
    }
    public static void displayObject(ObjekGeometri obj)
    {
        System.out.println(obj.getColor());
       
    }
    
}
