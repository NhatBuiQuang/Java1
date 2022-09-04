/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sun.xml.internal.stream.Entity;
import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class Bai2_checkPrime {

    private static boolean isPrime(int x) {
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
        System.out.println("Nhap so can kiem tra: ");
        n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("Day la so nguyen to");
        } else {
            System.out.println("Day khong phai so nguyen to");
        }
    }
}
