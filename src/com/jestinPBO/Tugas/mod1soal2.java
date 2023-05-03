package com.jestinPBO.Tugas;
import java.util.Scanner;

public class mod1soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pajak = 7.65;

        System.out.println("Nama : ");
        String nama = input.nextLine();

        System.out.println("Gaji : ");
        int gaji = input.nextInt();

        System.out.println("Tunjangan : ");
        int tunjangan = input.nextInt();

        int gajiKot = gaji + tunjangan;
        double pajakNeg = gajiKot * pajak;
        double gajiBer = gajiKot - pajakNeg;

        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBer);
    }
}
