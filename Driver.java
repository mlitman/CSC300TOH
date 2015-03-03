
public class Driver 
{
	public static void main(String[] args) 
	{
		Tower t = new Tower();
		System.out.println(t.addDisc(new Disc(1)));
		System.out.println(t.addDisc(new Disc(0)));
		System.out.println(t.addDisc(new Disc(5)));
		t.display();
		System.out.println(t.removeDisc());
		System.out.println(t.removeDisc());
		System.out.println(t.removeDisc());
	}
}
