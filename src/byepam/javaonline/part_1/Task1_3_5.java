package byepam.javaonline.part_1;
/* ������ 3.5 :
*    ���� �������� ��� � �������� ����� �. ����� ����� ��� ������ ����, ������ �������
*    ������ ��� ����� ��������� �. ����� ��� ���� ���� ����� ���:
*   												a=1/Math.pow(2,n)+1/Math.pow(3,n) 
*/
import global.Global;
public class Task1_3_5 {
    public static void main(String[] args) {
        int 	i=0;
        double	n=0;
        double	e=0;
        double	a=0;
        double	sum=0;
        n=Global.InPutFloatVal("������� ������ ��������� ���� n: ");
        e=Global.InPutFloatVal("������� ����� �: ");
         
        while (i<=n){							// ���� i <=n
            a=1/Math.pow(2,i)+1/Math.pow(3,i);	// ��������� ���� ����
            if (Math.abs(a)>=e) sum=sum+a;		// ���� ������ �������� ������ ���� ������ - ���������
            i++;								// ����������� ������� i
        }
        System.out.println("�����: "+sum);		// ����� �� ����� ���������� �����
    }


}
