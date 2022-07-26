package lelang;
public class Laporan {

    public void laporan(Barang barang) {
        int x = barang.getJumlahBarang();

        System.out.println(" ");
        System.out.println("Tabel Barang Yang Dilelang");
        System.out.println("ID \tNama Barang \tHarga \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + barang.getNamaBarang(i) + "\t" + "\t" + "Rp." + barang.getHargaAwal(i) + "\t" + barang.getStatus(i));

        }
    }

    public void laporan(Masyarakat masyarakat, Barang barang) {
        int x = masyarakat.getJumlahMasyarakat();

        System.out.println(" \n ");
        System.out.println("Tabel Masyarakat (Penawar)");
        System.out.println();
        System.out.println("ID \tNama   \tAlamat \tTelepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + masyarakat.getNama(i) + "    \t" + masyarakat.getAlamat(i) + "\t" + masyarakat.getTelephone(i));
        }
    }

    public void laporan(Petugas petugas) {
        int x = petugas.getJumlahPetugas();

        System.out.println(" ");
        System.out.println("Tabel Petugas");
        System.out.println("ID \tNama       \tAlamat        \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + petugas.getNama(i) + "   \t" + petugas.getAlamat(i) + "  \t" + petugas.getTelephone(i));
        }
        System.out.println(" ");
    }

    public void laporan(Masyarakat masyarakat) {
        int x = masyarakat.getJumlahMasyarakat();

        System.out.println(" ");
        System.out.println("Tabel Masyarakat");
        System.out.println("ID \tNama       \tAlamat    \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + masyarakat.getNama(i) + "    \t" + masyarakat.getAlamat(i) + "\t" + "\t" + masyarakat.getTelephone(i));
        }
        System.out.println(" ");
    }

}
