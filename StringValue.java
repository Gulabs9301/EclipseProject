package CollectionPractice;

import java.util.Arrays;

public class StringValue {
	public static void main(String[] args) {
		String value="cbafed";
		char[]a=value.toCharArray();
		Arrays.sort(a);
		//StringBuilder s=new StringBuilder();
		String b=new String(a);
		System.out.println(b);
		
		
	}

}
