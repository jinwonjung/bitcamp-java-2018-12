// 키보드로 입력한 값을 받기 III
package ch03;

public class Test10 {
  public static void main(String[] args) {
    
   java.util.Scanner Keyboard = new java.util.Scanner(System.in);
   
   
   System.out.print("나이? ");
   int age  = Keyboard.nextInt();
   
   
   
   System.out.print("이름? ");
   String name = Keyboard.next();
   // next()는 토큰 단위로 문자열을 읽는다.
   // nextInt()를 호출한 후 엔터 코드(LF)가 남아 있다 하더라도
   
   System.out.printf("%d(%s)\n", age, name);
  }
}