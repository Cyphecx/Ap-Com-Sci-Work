package Unit3.Quiz1;

public class Friends
{
 	
      	String name;
      	Hobbies[] hobs;
 
      	Friends()
      	{
          	
      	}
      	Friends(String x)
      	{
          	name = x;
      	}
 
      	public String toString()
      	{
          	String temp = "";
          	for (int i = 0; i<hobs.length;i++){
          	    temp = temp +" "+ hobs[i].name;
            }
          	return name+" - "+temp;
      	}
 }
 
 

