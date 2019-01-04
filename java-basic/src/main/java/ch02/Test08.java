// 논리 리터럴


package ch02;

public class Test08{
  public static void main(String[] args) {
    System.out.println(true);
    System.out.println(false);
    
    //System.out.println((boolean)1); //자바는 정수 값을 true/false로 형변환할 수 없다.
    
    // 작은 따옴표(single quote)의 리턴 값을 2바이트 정수 값(UTF-16 코드)이다.
    if ('가' == 0xac00) { //== 연산의 결과는 true/false 이다.
      System.out.println("맞다!");
    }  else {
        System.out.println("아니다!");
    }
}
}
    
    /* 컴파일 오류!
    if (10 - 10) { // c언어에서는 0은 false, 그 외의 모든 수는 true이다. 자바는 아니다!
      System.out.println("참이다!");
    }
    */
  


//# 논리 리터럴
//- 자바 참, 거짓을 표현하는 키워드를 제공한다.
//- 참: true , 거짓: false
//
//# 논리 값을 메모리에 저장할 때 크기
//-4 바이트 int 메모리에 저장한다.
//- true는 1, false는 0 값으로 저장한다.
    

