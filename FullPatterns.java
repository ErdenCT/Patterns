
public class FullPatterns {
	int n=14;
	public void full1() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0|| (i+j<=n/2)||(j-i>=n/2)
				||(j==0&&i>n/2)||i==n||(j==n&&i>n/2))
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void full2() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i-j>=n/2)||(i+j>=(3*n)/2)||(i==n-1&&j==n/2))
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void full3() {
		System.out.println();
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i+j<=n/2)||(i-j>=n/2)||i==0||i==n)
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		FullPatterns pattern1 = new FullPatterns();
		pattern1.full1();
		pattern1.full2();
		pattern1.full3();
		
		
	}

	

}
