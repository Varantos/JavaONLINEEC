package byepam.javaonline.part_1;
/* ������ 3.2 :
 *   ��������� �������� ������� �� ������� [a,b] c ����� h:
 *   	  y= x, x> 2;
 *   	  y=-x, x<=2.
 */
import global.Global;
public class Task1_3_2 {
    public static void main(String[] args) {
        int[] xy = new int[2];
        int x	 =0;
        int y	 =0;
        int step =0;
       
       
        xy=Global.InPutCrds("�������(������ ����� ������): ");
        step=Global.InPutIntVal("��� h: "); 
  

        for (x=xy[0]; x<=xy[1] ; x+=step){ //���������
            if (x<=2)  y=-x;
            if (x>2)   y=x;
            System.out.println("��� x="+x+" y="+y);
        }

    }
}
