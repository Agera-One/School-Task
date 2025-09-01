package Main.java.com.agera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih bangun ruang:");
        System.out.println("1. Persegi/Persegi Panjang");
        System.out.println("2. Balok");
        System.out.println("3. Limas");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                Persegi.inputDanHitung();
                break;
            case 2:
                Balok.inputDanHitung();
                break;
            case 3:
                Limas.inputDanHitung();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}