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
public class HocSinh {

    Faculty faculty = new Faculty();
    private String lop;
    private float score;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        faculty.Input();
        System.out.println("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.println("Nhập điểm: ");
        score = sc.nextFloat();
    }

    public void Output() {
        System.out.println("Thông tin học sinh: ");
        faculty.Output();
        System.out.println(lop);
        System.out.println(score);
    }

    public HocSinh() {
    }

    public HocSinh(String lop, float score) {
        this.lop = lop;
        this.score = score;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

}
