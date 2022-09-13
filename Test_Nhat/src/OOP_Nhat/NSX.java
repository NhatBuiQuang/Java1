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
public class NSX {

    private int MaNSX;
    private String TenNSX;
    private String diaChi;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã NSX: ");
        MaNSX = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên NSX: ");
        TenNSX = sc.nextLine();
        System.out.println("Nhập địa chỉ NSX: ");
        diaChi = sc.nextLine();
    }
    
    public void Output(){
        System.out.println("Thông tin NSX: ");
        System.out.println(MaNSX + " " + TenNSX + " " + diaChi);
    }

    public NSX() {
    }

    public NSX(int MaNSX, String TenNSX, String diaChi) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.diaChi = diaChi;
    }

    public int getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(int MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
    
}
