package Interface;

public class Main
{
	static ITest human = new _Human();
	static ITest orc = new _Orc();
	static ITest devil = new _Devil();

	public static void main(String[] args)
	{
		Main.human.show();
		Main.orc.show();
		Main.devil.show();
	}
}
