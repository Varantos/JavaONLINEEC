package byepam.javaonline.part_2;
/* ������ 4.8
* 	����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
* ���������. ���������  �����(������)  ��� ���������� ����� ���� ��������������� ������������� ��������� 
* ������� � �������� �� k �� m.
* 	 
*/
public class Task2_4_8 {
	
static void GenVectorInt_rnd(int n, int[] vec) { 
	int cnt	= 0;
	System.out.println("��������� ������: ");
	for (cnt=0;cnt<=n-1;cnt++) { 		
		vec[cnt]=(int) Math.round(Math.random()*40);
		System.out.print("\t"+vec[cnt]);
	}
}
	
static int summ_elmts( int k, int m, int[] vec) {
		int summ=0;
		for (int cnt=k;cnt<=m;cnt++) {
			System.out.print("\t"+vec[cnt]);
			summ=summ+vec[cnt];
		}
		return summ;
	}
	public static void main(String[] args) {
		int n=6;
//		int cnt=2;
		int[] vec= new int[n];
		GenVectorInt_rnd(n,vec);
	
		System.out.println();
		
		System.out.println("\t summ= "+summ_elmts(0,2,vec));
		System.out.println("\t summ= "+summ_elmts(2,4,vec));
		System.out.println("\t summ= "+summ_elmts(3,5,vec));
//		do {
//			if (cnt<n) System.out.println("\t summ="+summ_elmts(cnt,cnt+2,vec));
//			 cnt=cnt+2;
//		}while(cnt <=n);
		
	}
	
}
