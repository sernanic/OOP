public class Greeter {
	String Name;
	public Greeter(String newName) {
		Name = newName;
	}
	public void swapNames(Greeter other) {
		String tempName = other.Name;
		other.Name = Name;
		Name = tempName;
	}
	public Greeter createQualifiedGreeter(String qualifier) {
		String newName = qualifier + " " + Name;
		Greeter g = new Greeter(newName);
		return g;
		
	}
	public static void main(String[] args) {
		Greeter g = new Greeter("world");
		Greeter g2 = g.createQualifiedGreeter("beautiful");
		System.out.println(g2.Name);
		g.swapNames(g2);
		System.out.println(g.Name);
	}

}