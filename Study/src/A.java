
public class A {
	public static void main(String[] args) {
		B bo=new B(1,2);
		bo.show();
	}
}
 class A1 {
	int i;
}

class B extends A1{
	int i;
	 B(int a,int b)
	{
		super.i=a;
		i=b;
	}
	 void show() {
		 System.out.println("superclass:"+super.i);
		 System.out.println("subclass "+i);
	 }
}
