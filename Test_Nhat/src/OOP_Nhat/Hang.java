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
public class Hang {

    private int maHang;
    private String tenHang;
    private NSX Manufacturer = new NSX();

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        maHang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        Manufacturer.Input();
    }

    public void Output() {
        System.out.println("Thông tin mặt hàng: ");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        Manufacturer.Output();
    }

    public Hang(int maHang, String tenHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
    }

    public Hang() {
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(NSX Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

}
