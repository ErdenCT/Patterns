
public class Patterns {
	int n=6;
	
	public void letterA() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0 && i>0)||(i==0 && j>0 && j<n-1)
						||(j==n-1&&i>0) || (i==(n/2))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	public void letterB() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0)||(i==0 && j>0 && j<n-1)
				|| (j==n-1 && i>0 && i<n/2)||(j==n-1 && i>n/2 & i<n)
				|| (i==n/2 && j<n-1) || (i==n && j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterC() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0 && i>0 && i<n) || (i==0 && j>0 && j<n-1)
				||(i==1 && j==n-1)
				||(i==n && j>0 && j<n-1)||(i==n-1&&j==n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterD() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0)||(i==0&&j<n-1)||(j==n-1&&i>0&&i<n)
				||(i==n&&j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterE() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0)||(i==0)||(i==n/2&&j<n-2)
				||(i==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterF() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0)||(i==0)||(i==n/2&&j<n-2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterG() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0 && i>0 && i<n) || (i==0 && j>0 && j<n-1)
				||(i==1 && j==n-1)
				||(i==n && j>0 && j<n-1)||(i==n-1&&j==n-1)
				||(i==n-2&&j==n-1)
				||(i==n/2&&j>n/2-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterH() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==0)||(i==n/2)||(j==n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public void letterI() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==n/2) || (i==0&&j>0&&j<n)||
				  (i==n&&j>0&&j<n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public void letterJ() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if((j==n/2) || (i==0&&j>0&&j<n)||
				  (i==n&&j>0&&j<n/2)||(i==n-1&&j==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
	public void letterK() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || i+j==2*n/3 || i-j==n/3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public void letterL() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public void letterM() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(j==0 || (i==j&&i<=n/2)||(i+j==n&&i<=n/2)
				||(j==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public void letterN() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(j==0 || (i==j)
				||(j==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public void letterO() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n) || (j==0 && i>0 && i<n)
				||(i==n && j>0 && j<n) || (j==n && i>0&& i<n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterQ() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n) || (j==0 && i>0 && i<n)
				||(i==n && j>0 && j<n) || (j==n && i>0&& i<n)
				||(i==j&&i>n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterP() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n) || (j==0 && i>0)
				|| (j==n && i>0&& i<n/2) || (i==n/2&&j<n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterR() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n) || (j==0 && i>0)
				|| (j==n && i>0&& i<n/2) || (i==n/2&&j<n)
				|| (i==j&&i>n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void letterS() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n) || (j==0 && i>0 && i<n/2)
				|| (i==n/2 && j>0 &&j<n)||(j==n&&i>n/2&&i<n)
				|| (i==n&&j>0&&j<n)||(j==n&&i==1)||(j==0&&i==n-1))
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
	public void letterT() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==n/2)
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
	public void letterU() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((j==0 && i<n) || (i==n&&j>0&&j<n)
				||(j==n&&i<n))
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
	public void letterV() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((j==0&&i<n/2)||(i-j==n/2)
				||(i+j==3*n/2)||(j==n&&i<n/2))
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
	public void letterW() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((j==0&&i<n)||(i+j==n+1&&i>n/2)
				||(i==j+1&&i>n/2)||(j==n&&i<n))
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
	public void letterX() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==j || i+j==n)
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
	public void letterY() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==j&&i<n-2)||(i+j==n&&i<n-2)
				||(j==n/2&&i>n/2))
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
	public void letterZ() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || i+j==n || i==n)
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
	public void heart() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n/2)||(i==0&&j>n/2&&j<n)
				||(j==0&&i>0&&i<n/2)||(i-j==n/2)||(i+j==3*n/2)
				||(j==n/2&&i==1)||(j==n&&i>0&&i<n/2))
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
	public void heartFull() {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((i==0 && j>0 && j<n/2)||(i==0&&j>n/2&&j<n)
				||(i>0 && i<=n/2)||(i==2*n/3&&j>0&&j<n)
				||(i==n-1&&j>=n/3&&j<=2*n/3)
				||(i==n&&j==n/2))
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
		Patterns word = new Patterns();
		word.letterQ();
		
		

	}

}
