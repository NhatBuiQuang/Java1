/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_nhat;

import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class Bai1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter integer: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int digit = n % 10; //Chia lấy phần dư
            if (digit % 2 == 1) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("There are " + count + " odd numbers.");
    }
}
