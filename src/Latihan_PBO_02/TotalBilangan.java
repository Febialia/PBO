package Latihan_PBO_02;

import java.util.Scanner;

public class TotalBilangan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: "); 
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            System.out.println("total = 0");
        } else {
            int total = 0;
            System.out.println("Masukkan " + N + " bilangan:");
            for (int i = 0; i < N; i++) {
                int bilangan = scanner.nextInt();
                total += bilangan;
            }
            System.out.println("total = " + total);
        }      
    }
}