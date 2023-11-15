package example;

public abstract class Burung {
    private String nama;

    Burung(String nama){
        this.nama = nama;
    }

    abstract void terbang();

    String getNama(){
        return this.nama;
    }

}
