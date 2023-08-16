package Collection;

public class fib {
	public static void main(String[] args) {
		
		//fibonacci
//		int n=20;
//		int a=0;
//		int b=1;
//		int c=0;
//		for(int i=1;i<n;i++) {
//			c=a+b;
//			if(a>=20) {
//				continue;
//			}else {
//			System.out.println(a);
//			a=b;
//			b=c;
//			}
//			
//		}
		
		int []a= {1,2,3,4,5,6};
		int b=0;
		int c=10;
		for(int i=0;i<a.length;i++) {
				if(a[i]-a[i+1]>1) {
					b=a[i]+(a[i]-a[i+1]);
				}else {
					continue;
				}
		}
		for(int i=0;i<c;i++) {
			if(a[i]==i||a[i]!=0) {
				System.out.println(i);
			}
		}
	}
		
				
			
		
		
	
}
			


