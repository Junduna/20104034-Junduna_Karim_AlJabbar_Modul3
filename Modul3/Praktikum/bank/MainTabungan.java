package Modul3.Praktikum.bank;

import java.util.Scanner;

public class MainTabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo Awal Tabungan\t: ");
        int isi = scanner.nextInt();
        Tabungan tabungan = new Tabungan(isi);

        System.out.print("Jumlah uang yang diambil\t: ");
        int ambil = scanner.nextInt();
        tabungan.ambilUang(ambil);

        System.out.print("Saldo tabungan sekarang\t: ");
        System.out.println(tabungan.getSaldo());


    }
}
