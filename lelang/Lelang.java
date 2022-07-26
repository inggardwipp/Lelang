package lelang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lelang {

    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    static Scanner input = new Scanner(System.in);

    public Lelang() {
        //ini untuk mengambil jumlah masyarakatnya
        this.idMasyarakat.add(0);
        this.idMasyarakat.add(1);

        this.idBarang.add(0);
        //ini untuk berapa kali ditawarnya
        this.hargaTawar.add(0);
        this.hargaTawar.add(0);
    }

    public void prosesLelang(Petugas petugas, Masyarakat masyarakat, Lelang lelang, Barang barang, Laporan laporan) {
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        int i = 0;
        int idmasyarakat = 0;
        String temp;
        if (barang.getStatus(i) == true) {
            System.out.println("\n======SILAHKAN MELAKUKAN PENAWARAN BARANG!======");
            do {
                System.out.print("\nApakah ada harga penawaran terbaru?[yes/no] : ");
                temp = input.next();
                if (!"no".equalsIgnoreCase(temp)) { //equalsignore ini membandingkan String dengan String lain tanpa mempertimbangkan perbedaan besar atau kecilnya huruf
                    System.out.print("Masukkan Id Penawar                : ");
                    idmasyarakat = input.nextInt();
                    System.out.println("Selamat datang " + masyarakat.getNama(idmasyarakat));
                    System.out.print("Masukkan harga tawar barang        : Rp.");
                    int hargatawar = input.nextInt();
                    editHargaTawar(idmasyarakat, hargatawar);
                    System.out.println(" ");
                    i++;
                }
            } while (!"no".equals(temp));
            System.out.println("\nLelang ditutup! Barang sudah tidak dapat ditawar!");
            barang.editStatus(0, false);
            System.out.println("Status barang saat ini : " + barang.getStatus(0));

            System.out.println("\n=======HASIL LELANG SEBAGAI BERIKUT=======");
            System.out.println("Nama Masyarakat \tNama Barang \tHarga Tawar \t");
            int x = hargaTawar.size();
            for (int j = 0; j < x; j++) {
                System.out.println(masyarakat.getNama(j) + "            \t" + barang.getNamaBarang(0) + "       \t" + "Rp." + hargaTawar.get(j));
            }
            //ini untuk mengambil harga tawar paling besar
            int max = Collections.max(hargaTawar); //sekumpulan objek yang tidak memiliki posisi yang tetap dan menerima duplikat
            int maxId = hargaTawar.indexOf(max); //ini untuk mengambil nama nya berdasarkan id, pokok harga paling besarnya siapa
            System.out.println(" ");
            System.out.println("Pemenang lelang adalah dengan harga tawar : Rp" + max + " atas nama " + masyarakat.getNama(maxId));
            System.out.println(" ");

        } else {
            System.out.println("\nBARANG TIDAK BOLEH DITAWAR!");
            System.out.println("\n======SILAHKAN MELAKUKAN PEMBELIAN BARANG!======");
            System.out.print("Masukkan Id Masyarakat              : ");
            idmasyarakat = input.nextInt();
            System.out.println("Selamat datang " + masyarakat.getNama(idmasyarakat));
            System.out.print("Apakah Anda yakin membeli " + barang.getNamaBarang(0) + "\nDengan harga Rp." + barang.getHargaAwal(0) + "(yes/no)      : ");
            String answer = input.next();
            if ("yes".equals(answer)) {
                System.out.println("BARANG BERHASIL ANDA BELI!");

                System.out.println("\n===========LAPORAN PEMBELIAN===========");
                System.out.println("Nama Masyarakat \tNama Barang \tHarga Barang");
                int x = barang.getHargaAwal(0);
                System.out.println(masyarakat.getNama(idmasyarakat) + "     \t\t" + barang.getNamaBarang(0) + "     \t\t" + "Rp." + barang.getHargaAwal(0));
            } else {
                System.out.println("BARANG TIDAK JADI ANDA BELI!");
            }

        }

        {
        }
    }

    public void setLelang(Barang barang, int idMasyarakat, int idBarang, int hargaTawar) {
        this.idMasyarakat.add(idMasyarakat);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
        barang.editStatus(idBarang, barang.getStatus(idBarang));
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idMasyarakat.get(id);
    }

    public int getJmlLelang() {
        return this.idMasyarakat.size();
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public int getHargaTawar(int idBarang) {
        return this.hargaTawar.get(idBarang);
    }

    public void editHargaTawar(int idBarang, int harga) {
        this.hargaTawar.set(idBarang, harga);
    }

}
