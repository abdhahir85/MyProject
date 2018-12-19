package programs;

public class Armsrong {

	public static void main(String[] args) {
		
		int n=153;
		int arm=0;
		while(n>0){
			arm=arm+((n%10)*(n%10)*(n%10));
			n=n/10;
			System.out.println(arm);

		}
	}

}
