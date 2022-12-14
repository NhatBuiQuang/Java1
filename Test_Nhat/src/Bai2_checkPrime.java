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
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
