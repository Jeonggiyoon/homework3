import java.util.*;

class B04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("연봉을 입력하세요. :");
    
    double salary = s.nextDouble();
    
    if (salary < 10000000)
      double tax = salary * 0.95;
    else if ((salary >= 10000000) && (salary < 40000000))
      tax = salary * 1.9;
    else if ((salary >= 40000000) && (salary < 80000000))      
      tax = salary * 2.8;
    else if (salary > 80000000)       
      tax = salary * 3.7;
    else
      System.out.println("error");
  }
  
  System.out.printf("연봉 금액에 대한 소득세는 %f 입니다.",tax); 
  
}
