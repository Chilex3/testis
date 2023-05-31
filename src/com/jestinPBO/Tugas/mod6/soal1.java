package com.jestinPBO.Tugas.mod6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class soal1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Masukkan bilangan pertama: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan bilangan kedua  : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil + "(Dibulatkan)");
        }

        //Multiple Catch
        catch (ArithmeticException e){
            System.out.println("Terjadi kesalahan : Input tidak valid. Harap masukkan bilangan bulat.");
        }
        catch (InputMismatchException e){
            System.out.println("Terjadi kesalahan : Pembagian dengan nol tidak diperbolehkan");
        }
    }
}
