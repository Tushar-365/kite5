import java.util.Scanner;
public class Run {

//	int i, j, row = 4 ;
//	for(i=0;i<row; i++) {
//		System.out.print("*");
//		for (j=0;j<=i;j++) {
//			System.out.println("*");
//		}
//	}
		
	
	public static void main(String[] args) {
	
		System.out.println("Kite5 ii");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern number: ");
		int r=sc.nextInt();
		
		
		int i, j, row = 4 ;
		for(i=0;i<=r; i++) {
//			System.out.print("*");
			for (j=1;j<=r;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
