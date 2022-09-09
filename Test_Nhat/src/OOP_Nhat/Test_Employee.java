/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Nhat;

/**
 *
 * @author WBPC.VN
 */
public class Test_Employee {

    public static void main(String[] args) {
        Employee staff1 = new Employee();
        Employee staff2 = new Employee("Nathan", 27, "BA");
        staff1.input();
        staff1.display();
        staff2.display();
        
    }
}
