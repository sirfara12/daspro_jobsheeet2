package mingguke9;
import java.util.Scanner;
public class arraynilairata28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaimhs = new int[10];
        double total = 0;
        double ratarata;

        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaimhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaimhs.length; i++) {
            total += nilaimhs[i];
        }
        ratarata = total/nilaimhs.length;
        System.out.println("ratarata nilai = "+ratarata);
        
    }
}
