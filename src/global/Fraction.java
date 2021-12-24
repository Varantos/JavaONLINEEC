package global;

public class Fraction {
	    public int numerator;	//���������
	    public int denominator;//�����������

	 	public Fraction(int numerator, int denominator){
	        this.denominator = denominator;
	        this.numerator = numerator;
	    }
	 	public int getNumerator() {
	        return numerator;
	    }
	    public int getDenominator() {
	        return denominator;
	    }
	
	    public  String ShortFractToStr() {//��������� � ������� � �������
	        int gcd = NOD(numerator, denominator);
	        return (numerator / gcd) + "/" + (denominator / gcd);
	    }
	    public String toString(){ //������� � �������
	        return numerator + "/" + denominator;
	    }
	    
	////���	
	    private static int NOD(int a, int b) {
	       return b == 0 ? a : NOD(b, a % b);
	    }
	    ////���
	    private static int NOK(int n1, int n2) 
	    	{ 
	    	  return n1*n2 / NOD(n1, n2); 
	    	}
	    public  String ShowFractStr() {//��������� � ������� � �������
	               return (numerator) + "/" + (denominator)+"  ";
	    }

	    public Fraction add(Fraction other) { //�������� ������
	        Fraction result = new Fraction(1, 1);
	        if (this.denominator == other.denominator) { //���� ����������� ����������
	            result.denominator = this.denominator;
	            result.numerator = this.numerator + other.numerator;
	        }else{											// ���� ����������� ������
	            int nok = NOK(this.denominator, other.denominator);
	            result.denominator = nok;
	            result.numerator = this.numerator * (nok/this.denominator) + other.numerator * (nok/other.denominator);
	        }
	        return result;
	    }
	    
}



