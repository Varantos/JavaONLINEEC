package part_1;
public class Task_3_8 {
	public static void main(String[] args) {
		int a=0, b=0;
	    int  i=0, j=0, k=0;
	    int[] arr1, arr2, arr3;
	    arr1= new int[15];
	    arr2= new int[15];
	    arr3= new int[15];
      
        a=Global.InPutIntVal("������� ����� �: ");
        b=Global.InPutIntVal("������� ����� B: ");
  
	    //��������� ������ ���� ������� �����        
        while(a > 0){
            arr1[i] = a % 10;
            a = a / 10;
            i++;
        }
        int n=i;
        System.out.println("������ ������� �����: ");
        for(j = 0; j < n; j++) System.out.print(" " + arr1[j]);
        System.out.println("");

//��������� ������ ���� ������� �����
       i=0;
       while(b > 0){
            arr2[i] = b % 10;
            b = b / 10;
            i++;
       } 
	   int m=i;
	   System.out.println("������ ������� �����: ");
	   for( j = 0; j < m; j++) System.out.print(" " + arr2[j]);

//���������� ������� ���� �� ����� �����
	   System.out.println();
	   System.out.println("��������� �������� ����: ");
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
	            
	            if( arr3[j] > arr3[j+1] ){
	                int tmp = arr3[j];
	                arr3[j] = arr3[j+1];
	                arr3[j+1] = tmp;
	            }
	        }
	    }
	   System.out.println();

// ������� ���� ��� ������  
	   for( k = 0; k < l; k++)
	     if (arr3[k]!=arr3[k+1]) 
	        System.out.print(" " + arr3[k]);
	   		
	
	}
	   
	}
	
	


        


//=============================================================================================


/* ����������� ��������� �����
 * ������� ������...

� ����� ���� ���� �� ����� ��������� �� ���������� ����� ��������� ���������:

    �������� ��������� ����� ������� (a) ����� � ���������� d.
    ����� ����� ����� �� ������ ��� ����� �� �����.
    �������� ���������� c ������ ��������� ����� (b). �������� c ����� ��������. �������� b ������ ����������� ��� ����������� �������� ����������� ����.
    �� ���������� ����� ����� ��������� ��������� ����� ����� c ����� ��������� ��������� �� ��� � ������ d. ���� ��� ���, �� ������� �� �� ����� � ������� ���������� ����.

����� �������, ������ ����� ������� ����� ����� ������������ �� ����� ������� ������� �����.

var
    a, b, c: longint;
    d: byte;
begin
    readln(a,b);
    while a > 0 do begin
        d := a mod 10;
        a := a div 10;
        c := b;
        while c > 0 do begin
            if c mod 10 = d then begin
                write(d,' ');
                break;
            end;
            c := c div 10;
        end;
    end;
    writeln;
end.
 */


// ���� ��� �����: ���������� �����, �������� � �� ������
/*
   int[] arr = new int[10];
    while(a != 0){
        arr[a % 10]++;
        a /=10;
    }
    while(b != 0){
        if(arr[b % 10] != 0)
            System.out.println(b % 10);
        b /=10;
    }
 */


/*
public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("������� �: ");
    int a = in.nextInt();
    System.out.println("������� b: ");
    int b = in.nextInt();
    int i;

    HashSet<Integer> m1 = new HashSet<>();
    HashSet<Integer> m2 = new HashSet<>();

    while(a > 0){
        m1.add(a % 10);
        a /= 10;

    }
    while (b > 0){
        m2.add(b % 10);
        b /= 10;
    }
    if(m1 * m2 = [])
}
}

 */

/*
 * public class Helper {
 
    public static void main(String[] args) {
        printEqualNum(123);
        printEqualNum(121, 166261, 887827);
    }
 
    private static void printEqualNum(int... nums) {
        if (nums.length == 1) {
            System.out.println(nums[0]);
            System.out.println("============");
            return;
        }
        int[] dig = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int indDig;
            while (nums[i] != 0){
                indDig = nums[i] % 10;
                if (dig[indDig] == i) dig[indDig]++;
                nums[i] /= 10;
            }
        }
        for (int i = 0; i < dig.length; i++) {
            if (dig[i] == nums.length)
                System.out.println(i);
        }
        System.out.println("============");
    }
}
 */

