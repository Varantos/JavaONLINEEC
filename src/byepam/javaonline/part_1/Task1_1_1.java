package byepam.javaonline.part_1;
/* ������ 1.1 :
 *   ������� �������� ������� z=((a-3)*b/2)+�
 */
import global.Global;
public class Task1_1_1 {

	
    public static void main(String[] args) {
        float a=0;
        float b=0;
        float c=0;
        a=Global.InPutFloatVal(" a: "); 
        b=Global.InPutFloatVal(" b: ");
        c=Global.InPutFloatVal(" c: ");
        System.out.println("a="+a+"; b="+b+"; c="+c);   
        System.out.println("z= "+SolveMath(a, b, c) ); 
    }
//��������� �������
    private static float SolveMath(float a, float b, float c) {  
        float rez=0;
        rez=((a-3)*b/2)+c;
        return rez;
    }




}
