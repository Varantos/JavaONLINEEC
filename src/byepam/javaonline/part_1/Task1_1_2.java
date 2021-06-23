package byepam.javaonline.part_1;
/* ������ 1.2 :
 *   ��������� �������� ��������� �� ������� (��� ��������� ��������� �������������� ��������):
 *       ( b+Math.sqrt( Math.pow(b,2)+4*a*c ) )/2*a - Math.pow(a,3)*c + Math.pow(b,-2)
 */
import global.Global;
public class Task1_1_2 {
    public static void main(String[] args) {
    	double z=0;
    	double a=Global.InPutFloatVal(" a: "); 				// ���� �������� ������
    	double b=Global.InPutFloatVal(" b: ");
    	double c=Global.InPutFloatVal(" c: ");
       System.out.println("a="+a+"; b="+b+"; c="+c);		//����� �������� ������
       z=SolveMath(a, b, c);								//����� ������ ��� ���������� ���������
       String s ="";
       s= z!=-9999 ? "���������� ���������. z="+z : "������! ";	//��������� ������:  ������������� ��� ������ � �� ������� �� ����	
  	   System.out.print(s);									// ������ ����������
    }

    private static double SolveMath(double a, double b, double c) { //��������� ���������
        double rez = 0, rrt=0;
        rrt=Math.pow(b,2)+4*a*c;
        if (rrt<0) {	//�������� ������������ ���������
            System.out.print("������ �� ���������� : ");
            return -9999;
        }
         if (a==0){		//�������� ������� �� ����
             System.out.print("������� �� ���� : ");
            return -9999;
        }
        rez =  ( b + Math.sqrt(rrt) ) / (2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return rez;
    }

    }