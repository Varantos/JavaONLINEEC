package byepam.javaonline.part_1;
/* ������ 1.5 :
 *   ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
 *   ������� ������ �������� ������������ � �����,������� � �������� � ��������� �����:
 *   ���. �����. SS���.
 */
import global.Global;
public class Task1_1_5 {
    public static void main(String[] args) {
        int T=Global.InPutIntVal("������� ����� � � ��������: ");
        System.out.print("�����: "+SolveMath(T));
    }
    private static String SolveMath(int x) {// ���������� ������� � ����� ������� � ��������
        int sec	=0;
        int mins=0;
        int hrs	=0;
        String ssec ="";
        String smins="";
        String shrs ="";
        String Srez ="";
        hrs =x/3600; 	// ���������� �����
        mins=(x/60)%60;	// ���������� �����
        sec =x%60;		// ���������� ������
        if (hrs <10) {  shrs=  "0"+Integer.toString(hrs); } else shrs=Integer.toString(hrs);	//��������� ���������
        if (mins<10) {  smins= "0"+Integer.toString(mins);} else smins=Integer.toString(mins);
        if (sec <10) {  ssec=  "0"+Integer.toString(sec); } else ssec=Integer.toString(sec);
        Srez=shrs+"�. "+smins+"���. "+ssec+"���. ";// ���������� ��������� ��������������� �������� �������
        return Srez;
    }
}
