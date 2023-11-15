package example;

public class Bangau extends Burung implements Makanan,Kicau{
    
    Bangau(String nama){
        super(nama);
    }

    void terbang(){
        System.out.println(super.getNama() + " Terbang rendah");
    }
    public void memakan(Hewan hewan){
        System.out.println(super.getNama() + " memakan " + hewan.getNama());
    };

    public void kicau(){
        System.out.println(super.getNama() + " Bersuara Kwak Kwakk");
    }
   
}
