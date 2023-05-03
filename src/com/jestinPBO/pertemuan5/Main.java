package com.jestinPBO.pertemuan5;

public class Main {
    public static void main(String[] args){
        //membuat array kosong
        Barang[] keranjang = new Barang[10];

        //membuat array dengan isinya
        Barang[] etalase = {
                new Barang("Indomie",3000),
                new Barang("Pulpen",2500),
                new Barang("Pensil",2000),
                new Barang("Spidol",5000),
                new Barang("Penghapus",4000)
        };

        //menampilkan julah data dalam array
        System.out.println("Jumlah barang yang ada di etalase :" + etalase.length);

        //menampilkan data yang ada di dalam array
        System.out.println("Daftar barang yang ada dalam etalase : ");

        //perulangan for each untuk memnampilkan data yang ada
        int i=1;
        for (Barang b : etalase){
            System.out.println("Barang ke-" + i);
            b.showInfo();
            i++;
        }

        for (int j = 0; j < etalase.length; j++){
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showInfo();
        }

    }
}
