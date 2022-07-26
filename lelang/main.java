package lelang;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Laporan laporan = new Laporan();

        laporan.laporan(petugas);
        System.out.print("Masukkan ID Petugas : ");
        int id = input.nextInt();
        System.out.println("Selamat datang " + petugas.getNama(id));
        System.out.println("");

        Barang barang = new Barang();
        laporan.laporan(masyarakat);
        lelang.prosesLelang(petugas, masyarakat, lelang, barang, laporan);
        laporan.laporan(barang);
    }

}