package byepam.javaonline.part_3;
/* 	 Задача NNNNNN 
 * 	 
 */
public class Task_NN {
	
	static int  solution(int num) {
		   
		    int k1=3;
		    int k2=5;
		    int sum=0;
		    for(int i=0; i<num;  i++) {
		      if ( i%k1==0 || i%k2==0) { sum=sum+ i;
		    System.out.println("n: "+i);
		      }
		    }
		    return sum;
  }


	
	
	public static void main(String[] args) {
		
		System.out.println("Summ: "+solution(25 ));
		 
	 }
}
	