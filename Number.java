import java.util.*;

 class Number {


     public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
	             
		int array [] = new int [3];
			             
		int max_num = 0;
		int min_num = 9999999;
					             
		for(int i = 0; i<3; i++)
		{
			System.out.printf("%d 번째 숫자를 입력하세요 : ", i + 1);
			array[i] = s.nextInt();
												                 
			if(array[i] > max_num)
		        max_num =  array[i];
																	        	    if( array[i] < min_num)
			min_num =  array[i];

			System.out.printf("가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다.", max_num, min_num);																							          
																												          
		}	
											        
										
					}
	}
