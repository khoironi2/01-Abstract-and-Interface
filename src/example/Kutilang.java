package example;

public class Kutilang extends Burung implements Makanan, Kicau {
    
    Kutilang(String nama){
        super(nama);
    }

    void terbang(){
        System.out.println(super.getNama() + " Terbang Tinggi sekali ");
    }

    public void memakan(Hewan hewan){
        System.out.println(super.getNama() + " Memakan " + hewan.getNama());
    }
    public void kicau(){
        System.out.println(super.getNama() + " Suaranya Kiw Kiw...");
    }
}
