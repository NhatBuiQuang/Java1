/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapChong;

import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class testCircle {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int radius;
        float radius2;
        System.out.println("Nhap ban kinh: ");
        radius = sc.nextInt();
        double area = Circle.getArea(radius);
        System.out.println("Dien tich la: " + area);
        System.out.println("Nhap ban kinh 2: ");
        radius2 = sc.nextFloat();
        double area2 = Circle.getArea(radius2);
        System.out.println("Dien tich 2 la: " + area2);
    }

}
