package byepam.javaonline.part_1;
/* ������ 1.6 :
 *   ��� ������ ������� ��������� �������� ���������, ������� �������� "true", ���� 
 *   ����� ������������� ����������� ����������� �������, � "false" - � ��������� ������.
 *  
 */  
import global.Global;
public class Task1_1_6 {
    public static void main(String[] args) {
    	boolean flag=false;
    	int x=0;
    	int y=0;
    	x=Global.InPutIntVal("������� ���������� X: ");
        y=Global.InPutIntVal("������� ���������� Y: ");
        if (y>=0 & y<=4) {						//����������� ������ �������
            if (x>=-2 & x<=2)  flag=true;	 	//������� ����� ��������������
        }
        if (y>=-3 & y<=0) {						//����������� ������ �������
            if (x>=-4 & x<=4)  flag=true; 		//������� ����� ��������������
        }
        if (x==0 & y==-1) {flag=false;} 		//����������� ����� �� �������????
        if (flag==true) System.out.print("(TRUE) ����� ("+x+","+y+") ����������� ����������� �������.");
            else System.out.print("(FALSE) ����� ("+x+","+y+") �� ����������� ����������� �������.");
    }
}

