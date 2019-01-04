// 문자 제어 코드
package ch02;

public class Test10 {
  public static void main(String[] args) {
    System.out.println("Hello,\nworld!");  // 줄바꿈은 이 제어 문자를 사용하라!
    System.out.println("Hello,\rworld!");
    
  }
}

//# 문자 제어 코드 = 이스케이프 문자(escape character)
//- 화면에 출력하는 문자가 아니라 문자 출력을 제어하는 명령이다.
//- 제어 문자
//  \n - Line Feed(LF), 0x0a
//  \r - Carrage Return(CR), 0x0d
//  \f - Form Feed, 0x0c
//  \t - Tab, 0x09
//  \b - Backspace, 0x08
//  \' - Single Quote, 0x27
//  \" - Double Quote, 0x22
//  \\ - Backslash, 0x5c
