package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner resul = new Scanner(System.in);
        System.out.println("nhap nam");
        int year = resul.nextInt();
        if(year>0){
            if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0)){
                System.out.println(year+"la nam nhuan");
            }else {
                System.out.println(year+"khong phai la nam nhuan");
            }
        }else {
            System.out.println(year + "khong phai la nam nhuan");
        }
    }
}