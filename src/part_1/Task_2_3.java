package part_1;

public class Task_2_3 {
    public static void main(String[] args) {
        System.out.println("����������� �� ����� ����� ������? ������� ���������� ����� ������.");
        if (SolveMath( Global.InPutCrds("����� �: "), Global.InPutCrds("����� B: "), Global.InPutCrds("����� C: ") )==0)
            System.out.print("����������� ����� ������!");
                else System.out.print(" �� ����������� ����� ������.");

    }
    private static int SolveMath(int[] pnt1, int[] pnt2, int[] pnt3) {  //рассчет математического выражения
        System.out.print("������ A("+pnt1[0]+","+pnt1[1]+"); B("+pnt2[0]+","+pnt2[1]+"); C("+pnt3[0]+","+pnt3[1]+")");
        return  (pnt1[0]-pnt3[0])*(pnt2[1]-pnt3[1])-(pnt2[0]-pnt3[0])*(pnt1[1]-pnt3[1]);
    }

}
