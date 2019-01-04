// 키보드로 입력한 값을 받기 III
package ch03;

public class Test08 {
  public static void main(String[] args) {
    // 1) 키보드로 입력한 데이터를 읽을 때 사용할 도구를 준비한다.
  
   java.util.Scanner Keyboard = new java.util.Scanner(System.in);
   
   // 사용자에게 입려하라고 간단히 출력하자.
   System.out.print("a? ");
   int a  = Keyboard.nextInt();
   // nextInt()는 한 개의 토큰(token)울 읽을 때까지 기다린다.
   // 한 개의 token을 읽으면 4바이트 정수 값으로 바꾼 다음에 리턴한다.
   // 토큰(token)?
   // =>토큰이란 공백으로 구분되는 단어를 뜻한다.
   // 공백(whitespace)?
   // => 스페이스(space), 탭 , 줄바꿈 코드를 말한다.
   // 예) aaa    bbb cc ===> aaa, bbb, cc
   
   System.out.print("b? ");
   int b = Keyboard.nextInt();
   
   System.out.printf("%d * %d = %d\n", a, b, a*b);
  }
}