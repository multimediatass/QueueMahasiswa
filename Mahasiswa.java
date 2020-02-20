public class Mahasiswa implements Comparable<Mahasiswa>  {
    private Integer noabsen;
    private String nama;


    public Mahasiswa(Integer noabsen, String nama) {
        this.noabsen = noabsen;
        this.nama = nama;
    }

    public Integer getNoabsen() {
        return noabsen;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return this.getNoabsen().compareTo(o.getNoabsen());
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "noabsen=" + noabsen +
                ", nama='" + nama + '\'' +
                '}';
    }
}
