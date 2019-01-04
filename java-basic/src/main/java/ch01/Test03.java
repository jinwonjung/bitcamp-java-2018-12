

package ch01;

public class Test03 {

  public static void main(String[] args) {
    java.util.Scanner Keyboard = new java.util.Scanner(System.in);

    System.out.print("번호?");
    int no = Keyboard.nextInt();// 입력하는 코드 
    
    System.out.print("내용?");
    String write = Keyboard.next();
    
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", write);
    System.out.println("작성일: 2019-01-01");
    System.out.println("조회수:0");
  }
  
  
}