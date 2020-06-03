package programs;

public class Armsrong {

	public static void main(String[] args) {
		
		int n=153;
		int temp=n;
		int arm=0;
		for(int i=0;i<1000;i++){
			n=i;
		while(n>0){
			arm=arm+((n%10)*(n%10)*(n%10));
			n=n/10;
		}
		if(arm==i){
			System.out.println("The given number is armstrong no" + i);
		}
		arm=0;
		}
	}

}
