/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.persegipanjang;

/**
 *
 * @author User
 */
public class PersegiPanjang {

    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getPanjang() {
        return panjang;
    }
    
    public int getLebar() {
        return lebar;
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public static void main(String[] args) {
        // Buat objek PersegiPanjang
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        // Cetak informasi persegi panjang
        System.out.println("Persegi Panjang 1:");
        System.out.println("Panjang: " + persegiPanjang1.getPanjang());
        System.out.println("Lebar: " + persegiPanjang1.getLebar());
        System.out.println("Luas: " + persegiPanjang1.getLuas());

        System.out.println("\nPersegi Panjang 2:");
        System.out.println("Panjang: " + persegiPanjang2.getPanjang());
        System.out.println("Lebar: " + persegiPanjang2.getLebar());
        System.out.println("Luas: " + persegiPanjang2.getLuas());

        System.out.println("\nPersegi Panjang 3:");
        System.out.println("Panjang: " + persegiPanjang3.getPanjang());
        System.out.println("Lebar: " + persegiPanjang3.getLebar());
        System.out.println("Luas: " + persegiPanjang3.getLuas());
    }
}

