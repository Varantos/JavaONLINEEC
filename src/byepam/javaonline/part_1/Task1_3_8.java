package byepam.javaonline.part_1;
/* ������ 3.7 
 *   ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
 */
import global.Global;
public class Task1_3_8 {
	public static void main(String[] args) {
		int a=0; //����� � 
		int	b=0; //����� �
	    int i=0; //������� ��� �
	    int	j=0; //������� ��� B
	    int	k=0; //������� ��� ��������� ������� ����� ����
	    int[] arr1, arr2, arr3; // ������� ���� ����� � � � � ������� ����� ����
	    arr1= new int[15];
	    arr2= new int[15];
	    arr3= new int[15];
      
        a=Global.InPutIntVal("������� ����� �: ");
        b=Global.InPutIntVal("������� ����� B: ");
  
	    // ��������� ������ ���� ������� �����        
        while(a > 0){			// ���� a>0
            arr1[i] = a % 10;	// ��� ���������� ������� ��������� ����� �� 10 � ��������� 
            a = a / 10;			// ����� ����� �� 10 - ����� ��������� ������ 
            i++;				// ����������� ������� ���� �����
        }
        int n=i;
        System.out.println("������ ������� �����: "); // ������� � ������� ������ ���� ����� ��� ��������
        for(j = 0; j < n; j++) System.out.print(" " + arr1[j]);
        System.out.println("");

        // ���������� ��������� ������ ���� ������� �����
       i=0;
       while(b > 0){
            arr2[i] = b % 10;
            b = b / 10;
            i++;
       } 
	   int m=i;
	   System.out.println("������ ������� �����: "); //������� � ������� ��� ��������
	   for( j = 0; j < m; j++) System.out.print(" " + arr2[j]);

	   //������� ����� ����� �� ����� �����: ���������� ����� � ����� ��������
	   //� ��������� ������ ���������� ����� 
	   System.out.println();
	   System.out.println("����� �����: ");
	   k=0;
	   for ( i = 0; i < n; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	        	if (arr1[i]==arr2[j]) {
	               arr3[k]=arr1[i];
	               k++;
	        	}	
	        }
	     }
		
	   int l=k; k=0;
//	   for( k = 0; k < l; k++) System.out.print(" " + arr3[k]);
	
	   //��������� �������� ������ ����� ���� arr3 (���������)
	   for( i = l-1 ; i > 0 ; i--){
	        for( j = 0 ; j < i ; j++){
	            
	            if( arr3[j] > arr3[j+1] ){ // ���� ����������� �� ������� ��������� ������,
	                int tmp = arr3[j];	   // ����� ��������� ���������� - ������ �������
	                arr3[j] = arr3[j+1];
	                arr3[j+1] = tmp;
	            }
	        }
	    }
	   System.out.println();
  
	   for( k = 0; k < l; k++) // ������� ���� ��� ������
	     if (arr3[k]!=arr3[k+1]) 
	        System.out.print(" " + arr3[k]);
	   		
	
	}
	   
	}
	
       
