import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        System.out.println("KM to M Converter");

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka dalam satuan kilometer : ");
        int km = input.nextInt();

        int hasil = km * 1000;
        System.out.println(hasil + " meter adalah satuan dari " + km + " Kilometer");
    }
}
