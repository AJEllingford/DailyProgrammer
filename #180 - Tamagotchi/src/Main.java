import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the name of your tamagotchi!");
		String name = s.next();
		s.close();
		Tamagotchi t = new Tamagotchi(name);
		t.begin();
		
	}

}
