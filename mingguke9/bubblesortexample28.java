package mingguke9;
import java.util.Scanner;
public class bubblesortexample28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intdata = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        for (int i=0; i <  intdata.length; i++){
            for (int j=1; j < intdata.length-i; j++){
                if (intdata[j-1] > intdata[j]) {
                    //swap elemen
                    temp = intdata[j];
                    intdata[j] = intdata[j-1];
                    intdata[j-1] = temp;
                }
            }
        } 
        System.out.println("hasil perguruan:");
        for (int i=0; i < intdata.length; i++) {
            System.out.println(intdata[i]);

        }
        
    }
}
