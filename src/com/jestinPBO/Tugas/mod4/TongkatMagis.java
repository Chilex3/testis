package com.jestinPBO.Tugas.mod4;

public class TongkatMagis extends Senjata{
    int kerusakan = 100;
    int harga = 200;

    public void info(){
        System.out.println("Memberi serangan kerusakan magis sebanyak " + kerusakan + " dengan harga "+ harga) ;
    }
}
