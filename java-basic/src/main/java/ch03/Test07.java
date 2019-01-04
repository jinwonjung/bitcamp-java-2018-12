// 키보드로 입력한 값을 받기 II
package ch03;

public class Test07 {
  public static void main(String[] args) {
    // 1) 키보드로 입력한 데이터를 읽을 때 사용할 도구를 준비한다.
  
   java.util.Scanner Keyboard = new java.util.Scanner(System.in);
   
   // 사용자에게 입려하라고 간단히 출력하자.
   System.out.println("이름을 입력하세요:");
   java.lang.String name = Keyboard.nextLine();
   
   System.out.println("나이를 입력하세요:");
   String age = Keyboard.nextLine();
   
   System.out.printf("%s(%s)\n", name, age);
  }
}