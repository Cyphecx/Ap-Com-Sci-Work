package Unit2.Day2;

public class Dog {
	String name = "";
 	String breed = "";
 	int height = 0;
 	int weight = 0;
 	int age = 0;
 	boolean fetch = false;
 	static int numDogs = 0;
 	
 	Dog()
 	{
      	numDogs++;
 	}
 	
 	Dog(String n, String b)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
 	}
 	Dog(String n, String b, int a)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
      	age = a;
 	}
 	Dog(String n, String b, int a, int h, int w)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
      	age = a;
      	height = h;
      	weight = w;
 	}
 	boolean isOld()
 	{
      	if (age>=10)
          	return true;
      	else
          	return false;
 	}
}
