package example;

public class Hewan {
    private String nama;

    Hewan(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    void show(){
        System.out.println("Hewan : " + this.nama);
    }
}
