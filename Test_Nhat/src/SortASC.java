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
public class SortASC {

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
        sortASC(a);
        System.out.println("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]" + " " + a[i]);
        }
    }

    public static void sortASC(int a[]) {
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
        }
    }
}
