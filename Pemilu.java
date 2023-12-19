import java.util.Scanner;

public class Pemilu {
    public static void main(String[] args) {
        System.out.println("Program Penentuan Calon Pemilih");

        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan masukkan umur anda : ");
        int umur = input.nextInt();

        if( umur < 17){
            System.out.println("Maaf anda tidak bisa mengikuti pemilu");
        } else{
            System.out.println("Selamat and aberhak mengikuti pemilu");
        }
    }
}
