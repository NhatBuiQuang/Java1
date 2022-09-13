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
public class Address {

    private String city;
    private String province;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thành phố: ");
        city = sc.nextLine();
        System.out.println("Nhập tỉnh: ");
        province = sc.nextLine();
    }

    public String Output() {
        return city + " " + province;
    }

    public Address() {
    }

    public Address(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}
