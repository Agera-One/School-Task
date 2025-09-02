package Main.java.com.agera;

import java.util.Scanner;

public class Limas extends Persegi {
    private double tinggi;

    public Limas(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double luasPermukaan() {
        double luasAlas = luas();
        double sisiMiring = Math.sqrt(Math.pow((panjang / 2), 2) + Math.pow(tinggi, 2));
        double luasSelubung = 2 * (panjang * sisiMiring) + 2 * (lebar * sisiMiring);
        return luasAlas + luasSelubung;
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

        Limas l = new Limas(panjang, lebar, tinggi);
        System.out.println("Luas permukaan limas: " + l.luasPermukaan());
        
        sc.close();
    }
}
