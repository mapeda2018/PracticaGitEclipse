package tareas;
import java.util.Scanner;

public class Tarea5bk {
	public static void main(String[] args) {
		//VARIABLES										//CERRAR EL SCANNER
		//VARIABLES EJERCICIO 1

		//VARIABLES EJERCICIO 2

		//VARIABLES EJERCICIO 3
		int numDia;
		//VARIABLES EJERCICIO 4
		int horasTrabajadas;
		int horasExtras;
		int salarioSemanal;
		//VARIABLES EJERCICIO 5
		int a;
		int b;
		double x;
	
		//EJERCICIO 1


		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 2

		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 3
		System.out.println("Escribe un número del 1 al 7 para recibir el respectivo día de la semana:");
		numDia = sc.nextByte();
		if (numDia == 1) {
			System.out.println("Lunes.");
		}	else if (numDia == 2) {
				System.out.println("Martes.");
			}	else if (numDia == 3) {
					System.out.println("Miércoles.");
				}	else if (numDia == 4) {
						System.out.println("Jueves.");
					}	else if (numDia == 5) {
							System.out.println("Viernes.");
						}	else if (numDia == 4) {
								System.out.println("Jueves.");
							}	else if (numDia == 5) {
									System.out.println("Viernes.");
								}	else if (numDia == 6) {
										System.out.println("Sábado.");
									}	else if (numDia == 7) {
											System.out.println("Domingo.");
										}	else {
												System.out.println("Introduce un número de día válido.");
											}

		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 4
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
		horasTrabajadas = sc.nextByte();
		if (horasTrabajadas <= 40) {
			salarioSemanal = horasTrabajadas * 12;			
		}	else {
				horasExtras = horasTrabajadas -40;
				salarioSemanal = (40 * 12) + (horasExtras * 16);
			}
		System.out.println("El sueldo semanal que le corresponde es de " + salarioSemanal + " euros.");
		
		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 5
		System.out.println("Introduce el valor 'a' para la ecuación ax+b=0 :");
		a = sc.nextInt();
		
		
		
		//6
		int num1;
		int num2;
		int num3;
		double media;
		//7
		String calificacion= "a";
		//8
		int a;
		int b;
		int c;
		double x1;
		double x2;
		// raíz cuadrada -> Math.sqrt
	
		//6
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		num2 = sc.nextInt();
		System.out.println("Introduce el tercer número:");
		num3 = sc.nextInt();
		media = (num1 + num2 + num3) / 3;
		.out.println("La media de las notas es " + media);
				
		//7
		System.out.println("Introduce el primer número (SOBRE 10):");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número (SOBRE 10):");
		num2 = sc.nextInt();
		System.out.println("Introduce el tercer número (SOBRE 10):");
		num3 = sc.nextInt();
		media = (num1 + num2 + num3) / 3;
			if (media >= 0  &&  media < 5) {
		   		calificacion = "suspenso";
		   	}	else if (media >= 5  &&  media < 6) {
		   		calificacion = "aprobado";
		   		}	else if (media >= 6  &&  media < 7) {
		   				calificacion = "bien";
		   			}	else if (media >= 7  &&  media < 9) {
		   					calificacion = "notable";
		   				}	else if (media >= 9  &&  media <= 10) {
		   						calificacion = "sobresaliente";
		   					}	else {
		   							System.out.println("Nota incorrecta");
		   						}
		System.out.println("La media de las notas es " + media + " , un " + calificacion);
		   	
		   	
		//8
		System.out.println("Introduce la 'a' en (ax2 + bx + c = 0)");
		a = sc.nextInt();
		System.out.println("Introduce la 'b' en (ax2 + bx + c = 0)");
		b = sc.nextInt();
		System.out.println("Introduce la 'c' en (ax2 + bx + c = 0)");
		c = sc.nextInt();
	   	System.out.println("NIGGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}
}