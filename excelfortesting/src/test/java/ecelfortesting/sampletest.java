package ecelfortesting;

import java.io.IOException;
import java.util.ArrayList;

public class sampletest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		exceldatadrivern d=new exceldatadrivern();
		ArrayList<String> a=d.getData("add Profile");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));

	}

}
