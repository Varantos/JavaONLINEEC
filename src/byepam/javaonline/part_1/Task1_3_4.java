package byepam.javaonline.part_1;
/* ������ 3.4 :
 *   ��������� ��������� ���������� ������������ ��������� ������ ������� �����.
 */
import java.math.BigInteger;
public class Task1_3_4 {
    public static void main(String[] args) {
// ��� ������� ������ ���������� ��� BigIntreger.
// ��� ��� ��� �� ������� ������� ���� Long.
// ��� ������������ ���������� ������ ������ ����.
    	
    	BigInteger rez   = new BigInteger("1"); // �������������� ���������� ���� BigInteger �� ��������� 1.
        BigInteger kvadr = new BigInteger("1");
        BigInteger count = new BigInteger("1");
        BigInteger stp   = new BigInteger("1");
        int n=200; 						   // ���������� �����, ������������ � ��������
        
        while (count.longValue() <= n) {   // ���� �� ���������� �������� �������� n=200, ����
            kvadr = count.multiply(count); // ���������� �������� �����
            rez   = rez.multiply(kvadr);   // ���������� ������������
            System.out.println("rez_kv="+kvadr.toString()+" rez="+rez.toString()+" cnt="+count.toString()); // �������� ���������� 
            count=count.add(stp) ;		   // ���������� ����
        }
        System.out.println("������������ ��������� ������ "+n+" ����� �����: "+ rez); //����� ��������� ���������
    }
}
