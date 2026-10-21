package exercise_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> numbers = new HashSet<>();
		
		boolean b = true;
		
		while(b) {
			
			System.out.println("Inserisci un numero. I duplicati NON verranno registrati.");
			int num = sc.nextInt();
			numbers.add(num);
			
			System.out.println("Vuoi inserire un altro numero? Premi 0 per terminare, premi 1 per inserire un altro numero");
			int choice = sc.nextInt();
			
			switch(choice) {
			
				case 1: break;
				
				case 0: System.out.println("Termine del programma.");
						b = false;
						sc.close();
						break;
						
				default: System.out.println("Non hai inserito 0 ne 1.");
				
			}
		}
		
		System.out.println("I numeri registrati sono: " + numbers);
		

	}

}
