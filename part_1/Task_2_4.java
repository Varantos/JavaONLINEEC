package part_1;

public class Task_2_4 {
    public static void main(String[] args) {
        System.out.println("������ ��� ������!");
        int a=Global.InPutIntVal("������ ��������� �: "); 	//���������
        int b=Global.InPutIntVal("������ ��������� b: ");
        int x=Global.InPutIntVal("������ ������� �: "); 	//������
        int y=Global.InPutIntVal("����� �������  y: ");
        int z=Global.InPutIntVal("������ ������� z: ");
        System.out.println("������� ���������: a="+a+"; b="+b);
        System.out.println("������� �������: x="+x+"; y="+y+"; z="+z);
        if( ((x<=a)&&(y<=b)) || ((x<=b)&&(y<=a)) || ((x<=a)&&(z<=b)) || ((x<=a)&&(z<=b)) || ((z<b)&&(x<a)) ||((y<a)&&(z<b)) || ((z<b)&&(y<a)) )
            System.out.print("������ �������!");
        else  System.out.print("������ �� �������!");
    }



}
