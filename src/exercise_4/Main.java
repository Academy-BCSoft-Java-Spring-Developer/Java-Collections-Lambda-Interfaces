package exercise_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("rosso");
		l.add("blu");
		l.add("giallo");
		l.add("arancione");
		
		l.forEach(s -> System.out.println(s));

	}

}
