package com.jestinPBO.Tugas.mod4;

public class Main {
    public static void main(String[] args) {
        Senjata senjata = new Senjata();
        Senjata tongkatMagis = new TongkatMagis();
        Senjata pedang = new Pedang();

        senjata.info();

        tongkatMagis.info();

        pedang.info();
    }
}
