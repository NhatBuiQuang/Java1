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
public class Faculty {
    private String name;
    private String date;
    School school = new School();
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khoa: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày thành lập: ");
        date = sc.nextLine();
        System.out.println("Nhập tên trường: ");
        school.getName();
        System.out.println("Nhập ngày thành lập trường: ");
        school.getDate();
    }
    
    public void Output(){
        System.out.println("Thông tin khoa: ");
        System.out.println(name + '\n' + date + '\n' + school.getName() + '\n' + school.getDate());
    }

    public Faculty() {
    }

    public Faculty(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
    
    
    
    
}
