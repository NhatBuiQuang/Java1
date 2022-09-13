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
public class School {

    private String name;
    private String date;

    public School(String name, String date) {
        this.name = name;
        this.date = date;
    }

    School() {
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

}
