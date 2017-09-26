package test;

import java.util.Scanner;

public class DogTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many dogs would you like?");
		Dog[] dogs = new Dog[scan.nextInt()];
		scan.nextLine();
		for(int i = 0; i < dogs.length; i++){
			System.out.println("Please enter name, breed, age, height, weight for dog number " + i);
			String data = scan.nextLine();
			int spaces = 0;
			for(int k = 0; k < data.length(); k++){
				if(data.charAt(k) == ' '){
					spaces++;				
				}
			}
			if(spaces != 4){
				System.out.println("Your data is formatted incorrectly!");
				i--;
				continue;
			}
			int lastSpace = -1;
			spaces = 0;
			String name = null;
			String breed = null;
			int age = 0;
			int height = 0;
			int weight = 0;
			for(int k = 0; k < data.length(); k++){
				if(data.charAt(k) == ' '){
					switch(spaces){
					case 0:
						name = data.substring(lastSpace+1, k);
						break;
					case 1:
						breed = data.substring(lastSpace+1, k);
						break;
					case 2:
						age = Integer.parseInt(data.substring(lastSpace+1, k));
						break;
					case 3:
						height = Integer.parseInt(data.substring(lastSpace+1, k));
						break;
					}
					if(k == data.length()-1){
						weight = Integer.parseInt(data.substring(lastSpace+1));
					}
					lastSpace = k;
					spaces++;
				}
			}
			dogs[i] = new Dog(name, breed, age, height, weight);
		}
		for(Dog d : dogs){
			System.out.println(d.name);
		}

	}

}
