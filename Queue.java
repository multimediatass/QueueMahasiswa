import java.util.PriorityQueue;

public class Queue {
    private PriorityQueue<Mahasiswa> mahasiswas;

    public Queue(int capacity){
        mahasiswas = new PriorityQueue<>(capacity);

    }

    public void tammbahList(int noabsen, String nama){
        Mahasiswa item = new Mahasiswa(noabsen, nama);
        mahasiswas.offer(item);

    }

    public String hapusItem(){
        Mahasiswa mahasiswa = mahasiswas.poll();
        return mahasiswa.getNama();
    }

    public String intipDepan(){
        Mahasiswa mahasiswa = mahasiswas.peek();
        return mahasiswa.getNama();
    }

    public void hapuslist(){
        mahasiswas.clear();
        System.out.println("sudah di hapus");
    }


}
