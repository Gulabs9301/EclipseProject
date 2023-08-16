package CollectionPractice;

public class Stringa1b2c3 {
	public static void main(String[] args) {
		String value="a1b2c3";
		char[]a=value.toCharArray();
		for(int i=0;i<value.length();i=i+2) {
			int b=a[i+1]-'0';
			for(int j=1;j<=b;j++) {
				System.out.println(a[i]);
			}
		}
	}

}
