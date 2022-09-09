/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1_Circle;

import java.util.*;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author WBPC.VN
 */
public class HinhTron {

    private float radius;

    HinhTron() {
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = sc.nextFloat();
    }

    public HinhTron(float radius) {
        this.radius = radius;
    }

    public void getPerimeter() {
        System.out.println("Perimeter: " + Math.round(radius * 2 * Math.PI));
    }

    public void getArea() {
        System.out.println("Area: " + Math.round(radius * radius * Math.PI));
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
}
