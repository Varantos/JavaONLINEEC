package part_1;
public class Task_1_6 {
    public static void main(String[] args) {
        int x=Global.InPutIntVal("������� ���������� X: ");
        int y=Global.InPutIntVal("������� ���������� Y: ");
        boolean flag=false;
        if (y>=0 & y<=4) {
            if (x>=-2 & x<=2)  flag=true;
        }
        if (y>=-3 & y<=0) {
            if (x>=-4 & x<=4)  flag=true;
        }
        if (x==0 & y==-1) {flag=false;}
        if (flag==true) System.out.print("(TRUE) ����� ("+x+","+y+") ����������� ����������� �������.");
            else System.out.print("(FALSE) Точка ("+x+","+y+") �� ����������� ����������� �������.");
    }
}

