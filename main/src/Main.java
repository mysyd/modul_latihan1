import java.util.ArrayList;
import java.util.Scanner;

public class Kota<E> {
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return  element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : "+ jumlahKota.getElement() + " kota");
        System.out.println("Jumlah Kota di Jawa Timur : kota "+ namaKota.getElement());
    }
}

public class Konsumsi<M, I> {
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKonsumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}
public class Hidangan {
    protected String namaHidangan;

    public String getNamaHidangan(){
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan;
    }

    public String disantap() {
        return "makanan Dihidangkan";
    }
}

public class Minuman extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " diminum";
    }
}
p