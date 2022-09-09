/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2_CanBo;

import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class CanBo {

    private int ID, workDay, luong;
    private String fullName, DoB;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can bo: ");
        ID = sc.nextInt();
        System.out.println("Nhap ho ten: ");
        fullName = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        DoB = sc.nextLine();
        System.out.println("Nhap so ngay lam viec: ");
        workDay = sc.nextInt();
    }

    public CanBo() {
    }

    public void TinhLuong() {
        luong = workDay * 250000;
        System.out.println(luong);
    }

    public void Xuat() {
        System.out.println("Thong tin nhan vien: ");
        System.out.println(ID);
        System.out.println(fullName);
        System.out.println(DoB);
        System.out.println(luong);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

}
