package introduction;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class streamexample {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void regualr() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ashish");
		names.add("Mark");
		names.add("Praneeth");
		names.add("Srikanth");
		int count=0;
		for (String name: names) {
			
			if(name.startsWith("A")) 
			{
				count+=1;
			}
		}
		
		System.out.println(count);
	}

}
