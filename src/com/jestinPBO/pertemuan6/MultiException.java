package com.jestinPBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Masukkan bilangan : ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan bilangan 2 : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil + "(Dibulatkan)");
        }

        /* Multi Exception
        catch (ArithmeticException | InputMismatchException e){
            System.out.println("Error, tidak dapat di proses"); */

        //Multiple Catch
        catch (ArithmeticException e){
            System.out.println("Error, tidak bisa di proses");
        }
        catch (InputMismatchException e){
            System.out.println("Input hanya bisa menerima angka");
        }
        System.out.println("Proses sudah selesai");
    }
}
