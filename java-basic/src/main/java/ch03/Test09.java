// 키보드로 입력한 값을 받기 III
package ch03;

public class Test09 {
  public static void main(String[] args) {
    
   java.util.Scanner Keyboard = new java.util.Scanner(System.in);
   
   
   System.out.print("나이? ");
   int age  = Keyboard.nextInt();
   
   
   
   System.out.print("이름? ");
   String name = Keyboard.nextLine();
   
   System.out.printf("%d(%s)\n", age, name);
  }
}