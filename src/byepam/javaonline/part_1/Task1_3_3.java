package byepam.javaonline.part_1;
/* ������ 3.3 :
 *   ����� ����� ��������� ������ ��� �����.
 */

public class Task1_3_3 {
    public static void main(String[] args) {
        int count =0;
        int rez	  =0;

        while (count <= 100) {
            rez+=count*count;
            count++ ;
                }
        System.out.println("����� ��������� ������ ��� ����� �����: "+ rez);
    }

}
