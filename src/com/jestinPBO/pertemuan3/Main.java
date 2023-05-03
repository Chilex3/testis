package com.jestinPBO.pertemuan3;

public class Main {
    public static void main(String[] args){
        //pembuatan class
        SepedaMotor honda = new SepedaMotor("Honda","Vario1", 20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha","N-MAX", 40000000);
        SepedaMotor vespa = new SepedaMotor("Vespa","Vespa-Matic", 60000000);

        /*
        //mengisi nilai atribut object honda
        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 3500000;

        //mengisi nilai atribut object yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "N-MAX";
        yamaha.harga = 4000000;

        //mengisi nilai atribut object vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa Matic";
        vespa.harga = 6000000; */

        //Untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        //uji coba getter dan setter
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (sesudah) : " + honda.getTipe());
        honda.setTipe("Honda 200");
    }
}
