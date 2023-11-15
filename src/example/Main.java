package example;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello");

        Hewan ikan1 = new Hewan("Sarden");
        Hewan jangkrik1 = new Hewan("Jangkrik");

        Bangau b1 = new Bangau("Bangau Hitam");

        b1.memakan(ikan1);
        b1.terbang();
        b1.kicau();

        System.out.println("-------------");

        Kutilang k1 = new Kutilang("Kutilang Merah");
        k1.terbang();
        k1.memakan(jangkrik1);
        k1.kicau();

    }
}
