/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class Bai3_countPrimeArray {

    private static boolean isPrime(int x) { //Check if a number is prime number or not
        int sqrtValue = (int) Math.sqrt(x);
        for (int i = 2; i <= sqrtValue; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return x >= 2;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) {
                count ++;
            }
        }
        System.out.println("Co " + count + " phan tu la so nguyen to");
    }
}
