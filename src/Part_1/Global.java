package Part_1;

import java.util.Locale;
import java.util.Scanner;

public class Global {


    public static float InPutFloatVal(String msg) { //���� ������������� ����� ���� float
        Scanner scanIn = new Scanner(System.in);    //�������� ������� ���� Scanner
        scanIn.useLocale(Locale.getDefault());      // ��������� ��������� ��
        float val=0;                                //��������� � �������������� ����������� ��� ������������� �����
        do{
            System.out.print(msg);
            if (scanIn.hasNextFloat()) {
                val = scanIn.nextFloat();
                break;
            } else scanIn.next();
        }while (true);

//---------------------
//        try {
//            scanIn = new Scanner(System.in);
//        } finally {
//             if (scanIn != null) scanIn.close();
//        }
//---------------------
        return val;
    }
    //---------------------
    public static int InPutIntVal(String msg) { //���� ������ ����� ���� int
        Scanner scanIn = new Scanner(System.in);  //�������� ������� ���� Scanner
        scanIn.useLocale(Locale.getDefault());    // ��������� ��������� ��
        int val = 0;                            //��������� � �������������� ����������� ��� ������������� �����
        do {
            System.out.print(msg);
            if (scanIn.hasNextInt()) {
                val = scanIn.nextInt();
                break;
            } else scanIn.next();
        } while (true);
        return val;
    }
//---------------------



}
