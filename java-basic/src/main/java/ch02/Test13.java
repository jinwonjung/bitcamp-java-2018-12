// 문자 제어 코드

package ch02;

public class Test13 {
  public static void main(String[] args) {
    // 현재 날짜 및 시각 정보를 생성한다.
    // java.lang 패키지의 멤버를 사용할 때는 그냥 이름을 지정하면 된다.
    // 그외 다른 패키지의 멤버를 사용할 때는 반드시 패키지 이름을 함께 지정해야 한다.
    
    java.util.Date today = new java.util.Date(); 
    
    // %t[날짜 및 시각 옵션]
    // 날짜 및 시간 옵션
    // Y : 날짜 및 시각 데이터에서 년도를 추출하여 4자리로 표현한다.
    // y : 날짜 및 시각 데이터에서 년도를 추출하여 뒤의 2자리로 표현한다.
    System.out.printf("%1$tY, %1$ty\n", today);
   
    // B : 날짜 및 시각 데이터에서 월을 추출하여 전체 이름으로 표현한다. ex) January
    // b : 날짜 및 시각 데이터에서 월을 추출하여 단축 이름으로 표현한다. ex) jan
    System.out.printf("%1$tB, %1$tb\n", today);

    // m : 날짜 및 시각 데이터에서 월을 추출하여 2자리 숫자로 표현한다. ex) 12, 01
    System.out.printf("%1$tm\n", today);

    // d : 날짜 및 시각 데이터에서 일을 추출하여 2자리 숫자로 표현한다. ex) 01, 22
    // e : 날짜 및 시각 데이터에서 일을 추출하여 1자리 숫자로 표현한다. ex) 1, 22
    System.out.printf("%1$td %1$te\n", today);
    
    // A : 날짜 및 시각 데이터에서 요일을 추출하여 긴 이름으로 표현한다. ex) Sunday
    // a : 날짜 및 시각 데이터에서 요일을 추출하여 짧은 이름으로 표현한다. ex) Sun
    System.out.printf("%1$tA %1$ta\n", today);

    // H : 날짜 및 시 데이터에서 시각을 추출하여 2자리 시로 표현한다.
    // I : 날짜 및 시 데이터에서 시각을 추출하여 2자리 시로 표현한다.
    System.out.printf("%1$tH %1$tI\n", today);
   
    System.out.printf("%1$tM\n", today);
    
    System.out.printf("%1$tS %1$tL %1$tN\n", today);
    
    System.out.printf("%1$tN\n", today);
  
    System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);
  
  
  }
}