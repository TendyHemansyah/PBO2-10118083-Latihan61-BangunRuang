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
public class Tabung implements BangunRuang{
    private int jari;
    private int tinggi;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume(){
        return 22.0/7.0 * Math.pow(jari, 2) * tinggi;
    }
}
