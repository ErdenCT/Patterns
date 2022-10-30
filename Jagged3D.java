import java.util.Scanner;

public class Jagged3D {

	public static void main(String[] args) {
		int[][][] array = new int[3][][];
		
		array[0] = new int[3][];
		array[1] = new int[2][];
		array[2] = new int[2][];
		
		array[0][0] = new int[5];
		array[0][1] = new int[6];
		array[0][2] = new int[3];
		
		array[1][0] = new int[3];
		array[1][1] = new int[4];
		
		array[2][0] = new int[5];
		array[2][1] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfStudents=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				for(int k=0; k<array[i][j].length; k++) {
					
					System.out.println("Enter Student Id: "+ "School-"+i+" Class-"+j+" Student-"+k);
					array[i][j][k] = scan.nextInt();
					numberOfStudents++;
				}
	
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				for(int k=0; k<array[i][j].length; k++) {
					System.out.println(array[i][j][k]);

					
				}
				
			}
			
		}
		System.out.println();
		System.out.println("Total Number Of Students:"+numberOfStudents);
		
		scan.close();
		
	}

}
