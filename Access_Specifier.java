class Simple{
	private int pri;
	int def;
	protected int pro;
	public int pub;
	
	Simple(){
	pri=10;
	def=20;
	pro=30;
	pub=40;
	}
}
class Access_Specifer extends Simple{
	Access_Specifer(){
		//pri=10; // can't access private
		def=200;
		pro=300;
		pub=400;	
	}

	public static void main(String[] args) {
		Access_Specifer i= new Access_Specifer();
		//can't access private
		//System.out.println(i.pri);
		System.out.println(i.def);
		System.out.println(i.pro);
		System.out.println(i.pub);
	}

}
