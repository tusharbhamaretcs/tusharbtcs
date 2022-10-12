package Star_patterns;

public class New22 {
	public static void main(String[] args) {
		for(int i=1;1<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j||j+i==5) {
					System.out.println("*");
				}
				else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
		
	}

}
