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
public class Ba_ngoi {

    public static void main(String[] args) {
        int a[] = new int[0];
        int select;
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();
        do{
        switch (select) {
            case 1: //Nhap Mang
                int n;
                System.out.println("Nhat so luong phan tu cua mang: ");
                n = sc.nextInt();
                a = new int[n];
                System.out.println("Nhap mang: ");
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                break;
            case 2: //Xuat mang
                for (int i = 0; i < a.length; i++) {
                    System.out.println("a[" + i + "] = " + a[i]);
                }
                break;
            case 3: //Tim phan tu lon nhat
                int max = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (a[i] > max) {
                        max = a[i];

                    }
                }
                System.out.println("Phan tu lon nhat cua mang la: " + max);
                break;

            case 0:
                System.out.println("Ket thuc chuong tring.");
                break;
            default:
                System.out.println("Hay lua chon chuc nang: ");
                break;
        }
        

    }while (select != 0);
    }
