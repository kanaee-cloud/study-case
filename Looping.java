import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        System.out.println("Program Perulangan dan Penjumlahan");

        Scanner input = new Scanner(System.in);

        System.out.println("Berapa kali perulangan akan dilakukan bos");
        int n = input.nextInt();
        int k = 1, total = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("Ini adalah cetakan ke " + i + " , total nilainya adalah " + total);
            k = k + 1;
            total = total + k;
        }

    }
}
