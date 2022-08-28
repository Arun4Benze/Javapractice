
public class Sample extends Cli {
	public void add(String name) {
		System.out.println(name);

	}
	public void sub(int id) {
		
		System.out.println("Sub of two number is 4536");
		super.sub(45);
		

	}
	public static void main(String[] args) {
		Sample sa = new Sample();
		sa.add("benz");
		sa.sub(567);
		
	}

}
