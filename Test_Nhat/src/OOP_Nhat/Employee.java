/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Nhat;

import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class Employee {

    private String name;
    private int age;
    private String position;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = sc.nextLine();
    }

    public void display() {
        System.out.println("Thong tin nhan vien: " + name + ", " + age + ", " + position);
    }

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
