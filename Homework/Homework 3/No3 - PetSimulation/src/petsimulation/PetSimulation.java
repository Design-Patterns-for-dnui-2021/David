package petsimulation;
import java.util.Scanner;

public class PetSimulation {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		String sound;
		PetFactory factory = new PetFactory();
		while (i < 3){
			System.out.println("Input pet sound: ");
			sound = input.nextLine();
			Pet pet = factory.createBy(sound);
			pet.displayInfo();
                        System.out.println("---");
			i++;
		}
	}
	 
}