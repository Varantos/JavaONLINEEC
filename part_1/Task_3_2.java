package part_1;

public class Task_3_2 {//на целых числах!
    public static void main(String[] args) {
        int[] xy = new int[2];
        int i=0,x=0, y=0, step=0;
        xy=Global.InPutCrds("�������: ");
        step=Global.InPutIntVal("���: ");

        for (x=xy[0]; x<=xy[1] ; x+=step){
            if (x<=2)  y=-x;
            if (x>2)   y=x;
            System.out.println("���� x="+x+" y="+y);
        }

    }
}
