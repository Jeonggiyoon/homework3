import java.util.*;

 class Days {

  
      public static void main(String[] args) {
              
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오. : ");
		int month = s.nextInt();
				              
		System.out.print("일을 입력하시오. : ");
		int day = s.nextInt();
		int sum = 0;

		for (int i =1; i < month; i++)
		{
		switch (i) {
			case 1:
			sum += 31;		
			break;
			
			case 2:
			sum += 28;
			break;
					
			case 3:
			sum += 31;
			break;
										
			case 4:	
			sum += 30;
			break;
					
			case 5:
			sum += 31;
			break;
							
			case 6:
			sum += 30;
			break;
					
			case 7:
			sum += 31;
			break;
				
			case 8:
			sum += 31;
			break;
			
			case 9:
			sum += 30;
			break;
			
			case 10:
			sum += 31;
			break;
			
			case 11:
			sum += 30;
			break;
			
			case 12:
			sum += 31;
			break;
			
			default :
				System.out.print("잘못입력하셨습니다.");
				
			   }   
			
			}
			
			int day_count = sum + day;    
			
			System.out.printf("이날짜는 1년중 %d 번째 날에 해당 됩니다. ", day_count);
			
			}       
			
			}
			


