/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan62.livingthing;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Program menggunakan konsep abstraksi dengan konsep pendekatan berbasis objek
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath (String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat (String nama){
        System.out.println(nama + " Makan");
    }
}
