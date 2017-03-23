package konversi;

import java.util.Scanner;

public class konversiTes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        konversiAH kr = new konversiAH();
        int a; 
        String b;
        System.out.print("ubah angka:");
        a = in.nextInt();
        System.out.println("output : "+ kr.proses(a));
        System.out.print("Ubah huruf :");
        String huruf = in.nextLine();
        b = in.nextLine();
        System.out.println("output : "+ kr.proses(b));

    }
}
