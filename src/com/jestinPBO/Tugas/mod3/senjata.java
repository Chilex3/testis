package com.jestinPBO.Tugas.mod3;

public class senjata {

    String jarak, nama;
    int harga;

    public senjata(String nama, String jarak, int harga){
        this.nama = nama;
        this.jarak = jarak;
        this.harga = harga;
    }

    public String getNama(){return nama;}
    public void setNama(String nama){this.nama = nama;}

    public String getJarak(){return jarak;}
    public void setJarak(String jarak){this.jarak = jarak;}

    public int getHarga(){return harga;}
    public void setHarga(int harga){this.harga = harga;}


    public void showInfo(){
        System.out.println("Nama    : " + nama);
        System.out.println("Jarak   : " + jarak);
        System.out.println("Harga   : " + harga);
        System.out.println();
    }
}
