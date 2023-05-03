package com.jestinPBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajerkami = new Manajer();
        Pegawai pegawaikami = new Pegawai();

        manajerkami.nip = 1234567;
        manajerkami.nama = "Obama";

        pegawaikami.nip = 2132321;
        pegawaikami.nama = "Trump";

        manajerkami.showInfo();
        manajerkami.extraInfo();
        manajerkami.bonus(42000000);
        manajerkami.bonus();

        pegawaikami.showInfo();

    }
}
