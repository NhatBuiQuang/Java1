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
public class Student {

    private String fullName;
    private int age;
    private Address address = new Address();

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        fullName = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address.Input();
    }
    
    public void Output(){
        System.out.println("Thông tin học sinh: " + fullName + " " + " " + age + " " + address.Output());
    }

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
