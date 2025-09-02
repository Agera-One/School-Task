package Main.java.com.agera;

import java.util.Scanner;

public class Persegi {
  protected double panjang;
  protected double lebar;

  public Persegi(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public boolean isPersegi() {
    return panjang == lebar;
  }

  public double luas() {
    return panjang * lebar;
  }

  public String jenis() {
    return isPersegi() ? "Persegi" : "Persegi Panjang";
  }

  // Method untuk menerima input user dan menghitung luas
  public static void inputDanHitung() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang; ");
    double panjang = sc.nextDouble();
    System.out.print("Masukkan lebar: ");
    double lebar = sc.nextDouble();

    Persegi p = new Persegi(panjang, lebar);
    System.out.println("Bangun: n" + p.jenis());
    System.out.println("Luas: " + p.luas());
    
    sc.close();
  }
}