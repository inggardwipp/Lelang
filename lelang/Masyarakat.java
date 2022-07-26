package lelang;
import java.util.ArrayList;

public class Masyarakat implements User {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        //indeks 0
        this.namaMasyarakat.add("Aurel");
        this.alamat.add("Bali");
        this.telepon.add("1254561427");

        //indeks 1
        this.namaMasyarakat.add("Dira");
        this.alamat.add("Nganjuk");
        this.telepon.add("2345609874");

    }

    public int getJumlahMasyarakat() {
        return this.namaMasyarakat.size();
    }

    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelephone(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelephone(int id) {
        return this.telepon.get(id);
    }
}
