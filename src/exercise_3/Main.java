
package exercise_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci 3 coppie chiave-valore");
        
        Map<Integer, String> map = new HashMap<>();
        
        for(int i = 0; i < 3; i++) {
        	
        	System.out.println("Inserisci chiave Integer");
        	int integer = sc.nextInt();
        	
        	sc.nextLine();
        	
        	System.out.println("Inserisci valore String");
        	String string = sc.nextLine();
        	
        	map.put(integer, string);
        	
        }
        
        System.out.println("Le tue coppie chiave-valore sono: " + map);
        
        System.out.println("Scegli una chiave int per visualizzarne il valore:");
        int key = sc.nextInt();
        
        if(map.containsKey(key)) {
        	
        	System.out.println("la chiave integer che hai scelto contiene il valore string: "
        						+ map.get(key));
        } else {
        	
        	System.out.println("la chiave integer scelta non esiste");
        }
        sc.close();
    }
}
