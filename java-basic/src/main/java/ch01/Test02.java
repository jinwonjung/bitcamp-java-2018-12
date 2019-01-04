

package ch01;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
      Scanner Keyboard = new Scanner(System.in);
     
      
      System.out.print("번호?");
      int no = Keyboard.nextInt();
      
      System.out.print("이름?");
      String name = Keyboard.next();
      
      System.out.print("이메일?");
      String email = Keyboard.next();
      
      System.out.print("암호?");
      String pwd = Keyboard.next();
      
      System.out.print("사진?");
      String pic = Keyboard.next();
      
      System.out.print("전화?");
      String tel = Keyboard.next();
      
      System.out.print("가입일?");
      String startday = Keyboard.next();
      
      System.out.printf("번호 %d\n", no);
      System.out.printf("이름: %s\n", name);
      System.out.printf("이메일: %s\n", email);
      System.out.printf("암호: %s\n", pwd);
      System.out.printf("사진: %s\n", pic);
      System.out.printf("전화: %s\n", tel);
      System.out.printf("가입일: %s\n", startday);
      
      
   }
}