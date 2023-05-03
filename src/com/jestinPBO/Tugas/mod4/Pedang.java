package com.jestinPBO.Tugas.mod4;

public class Pedang extends Senjata{
    int kerusakan = 60;
    int harga = 100;

    public void info(){
        System.out.println("Memberi serangan kerusakan fisikal sebanyak " + kerusakan + " dengan harga "+ harga) ;
    }
}
