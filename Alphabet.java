package Ineuron;

public class Alphabet {
	public static void main(String[] args) {
		int n=6;
		for(int i=0; i<=n; i++) { //A
			for(int j=0; j<n; j++) {
				if((j==0 && i>0)||(i==0 && j>0 && j<n-1)
						||(j==n-1&&i>0) || (i==(n/2))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //B
				if((j==0)||(i==0 && j>0 && j<n-1)
				|| (j==n-1 && i>0 && i<n/2)||(j==n-1 && i>n/2 & i<n)
				|| (i==n/2 && j<n-1) || (i==n && j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //C
				if((j==0 && i>0 && i<n) || (i==0 && j>0 && j<n-1)
				||(i==1 && j==n-1)
				||(i==n && j>0 && j<n-1)||(i==n-1&&j==n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //D
				if((j==0)||(i==0&&j<n-1)||(j==n-1&&i>0&&i<n)
				||(i==n&&j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //E
				if((j==0)||(i==0)||(i==n/2&&j<n-2)
				||(i==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //F
				if((j==0)||(i==0)||(i==n/2&&j<n-2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //G
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
			System.out.print(" ");
			for(int j=0; j<n; j++) { //H
				if((j==0)||(i==n/2)||(j==n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //I
				if((j==n/2) || (i==0&&j>0&&j<n)||
				  (i==n&&j>0&&j<n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //J
				if((j==n/2) || (i==0&&j>0&&j<n)||
				  (i==n&&j>0&&j<n/2)||(i==n-1&&j==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //K
				if(j==0 || i+j==2*n/3 || i-j==n/3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) { //L
				if(j==0 || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) {
				if(j==0 || (i==j&&i<=n/2)||(i+j==n&&i<=n/2)
				||(j==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
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
		System.out.println(); //SecondRow
		for(int i=0; i<=n; i++) { //N
			
			for(int j=0; j<=n; j++) { //O
				if((i==0 && j>0 && j<n) || (j==0 && i>0 && i<n)
				||(i==n && j>0 && j<n) || (j==n && i>0&& i<n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //P
				if((i==0 && j>0 && j<n) || (j==0 && i>0)
				|| (j==n && i>0&& i<n/2) || (i==n/2&&j<n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //Q
				if((i==0 && j>0 && j<n) || (j==0 && i>0 && i<n)
				||(i==n && j>0 && j<n) || (j==n && i>0&& i<n)
				||(i==j&&i>n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //R
				if((i==0 && j>0 && j<n) || (j==0 && i>0)
				|| (j==n && i>0&& i<n/2) || (i==n/2&&j<n)
				|| (i==j&&i>n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //S
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
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //T
				if(i==0 || j==n/2)
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //U
				if((j==0 && i<n) || (i==n&&j>0&&j<n)
				||(j==n&&i<n))
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //V
				if((j==0&&i<n/2)||(i-j==n/2)
				||(i+j==3*n/2)||(j==n&&i<n/2))
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //W
				if((j==0&&i<n)||(i+j==n+1&&i>n/2)
				||(i==j+1&&i>n/2)||(j==n&&i<n))
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //X
				if(i==j || i+j==n)
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //Y
				if((i==j&&i<n-2)||(i+j==n&&i<n-2)
				||(j==n/2&&i>n/2))
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<=n; j++) { //Z
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


}
