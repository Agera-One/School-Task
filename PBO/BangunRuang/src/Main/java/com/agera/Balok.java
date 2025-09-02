package Main.java.com.agera;

import java.util.Scanner;

public class Balok extends Persegi {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double luasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    // Method untuk menerima input user dan menghitung luas permukaan
    public static void inputDanHitung() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();

        Balok b = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas permukaan balok: " + b.luasPermukaan());
        
        sc.close();
    }
}
