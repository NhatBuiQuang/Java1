/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author WBPC.VN
 */
public class findNumber {

    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        char[] check = str.toCharArray();
        StringBuilder sb = new StringBuilder(); //Lớp StringBuilder để tạo string có thể thay đổi (mutable)
        int sum = 0;
        for (char c : check) {
            if (Character.isDigit(c)) {
                sb.append(c); //Được sử dụng để phụ thêm (append) chuỗi đã cho với chuỗi này. Phương thức append() được nạp chồng giống dạng append(char),...
                sum += c;
            }
        }
        System.out.println(sb + " ");
    }
}
