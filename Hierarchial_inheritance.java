class parents{
	void show()
	{
		System.out.println("We are parents");
	}
}
class son1 extends parents{
	void disp()
	{
		System.out.println("i am son1 class");
	}
}
class daughter extends son1{
	void disp()
	{
		System.out.println("i am daughter class");
	}
}
public class Hierarchial_inheritance {

	public static void main(String[] args) {
		son1 s=new son1();
		daughter d=new daughter();
		s.show();
		d.disp();
		s.disp();
		d.disp();

	}

}
