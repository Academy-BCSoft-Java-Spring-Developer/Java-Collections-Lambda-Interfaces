package exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		
		boolean b = true;
		
		while(b) {
			
			System.out.println("Inserisci numero");
			int num = sc.nextInt();
			numbers.add(num);
			
			System.out.println("Vuoi inserire un altro numero? Premi 0 per uscire dal programma e 1 per inserire un altro numero");
			int choice = sc.nextInt();
			
			switch(choice) {
				
				case 1: break;
				
				case 0: System.out.println("Termine programma.");
						b = false;
						sc.close();
				
			}
			
		}
		
		
		System.out.println("I numeri che hai inserito sono: " + numbers);
	}
}
