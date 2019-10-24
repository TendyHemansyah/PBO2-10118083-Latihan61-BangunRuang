/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan61.bangunruang;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Bangun Ruang
 */
public class PBO210118083Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.setJari(7);
        System.out.printf("Volume Bola : %.1f",bola.hitungVolume()," cm³");
        
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);
        System.out.println("\nVolume Tabung : "+tabung.hitungVolume()+" cm³");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("Volume Kerucut : "+kerucut.hitungVolume()+" cm³");
    }
    
}
