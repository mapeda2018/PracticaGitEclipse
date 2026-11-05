//RAMA DESARROLLO

package PracticaGithub;

public class PracGithub {
	public static void main(String[] args) {
		//VARIABLES
		int i;
		int j;
		
		//EJERCICIO
		System.out.println("Letra H");
		for (i = 1; i <= 7; i++) {
			for (j = 1; j <= 7; j++) {
				if (i == 4 || j == 1 || j == 7)  {
					System.out.print("*");
				}	else {
						System.out.print(" ");
					}
			}
			System.out.println("");
		}
	}
}