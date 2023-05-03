package com.jestinPBO.Tugas.mod3;

import com.jestinPBO.pertemuan3.SepedaMotor;

public class Utama {
    public static void main(String[] args) {
        senjata pedang = new senjata("Pedang", "Dekat", 50);
        senjata perisai = new senjata("Perisai", "Dekat", 30);
        senjata tongkatMagis = new senjata("Tongkat Magis", "Jauh", 100);

        pedang.showInfo();
        perisai.showInfo();
        tongkatMagis.showInfo();


        System.out.println("Nama senajata   : " + pedang.getNama());
        System.out.println("Jarak           : " + pedang.getJarak());
        System.out.println("Harga           : " + pedang.getHarga());
        System.out.println();

        System.out.println("Nama senajata   : " + tongkatMagis.getNama());
        System.out.println("Jarak           : " + tongkatMagis.getJarak());
        System.out.println("Harga           : " + tongkatMagis.getHarga());
        System.out.println();

        System.out.println("Total : " + pedang.harga + tongkatMagis.harga);





        /*
        honda.setTipe("Beat 110");
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (sesudah) : " + honda.getTipe());
        honda.setTipe("Honda 200");
        */

    }
}
