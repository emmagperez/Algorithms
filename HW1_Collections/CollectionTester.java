
public class CollectionTester 
{
	public static void main(String [] args)
	{
		Collection<String> c = new Collection<>(10);
		System.out.println(c.size()+ " : size");
		System.out.println(c.isEmpty() + " : string empty");
		c.insert("h");
		c.insert("e");
		c.insert("l");
		c.insert("m");
		c.insert("o");
		System.out.println(c.isPresent("h")+ " : is present");
		System.out.println(c.isPresent("k")+ " : is present");
		System.out.println(c.isEmpty() + " : string empty");
		c.remove(0);
		System.out.println(c.get(0) + " :  removed");
		c.makeEmpty();
		System.out.println(c.get(3));
		
		System.out.println();
		
		Collection<Double> c2 = new Collection<>(10);
		System.out.println(c2.size()+ " : size");
		System.out.println(c2.isEmpty()+ " : double empty");
		c2.insert(2.4);
		c2.insert(5.84);
		c2.insert(3.6);
		c2.insert(8.90);
		c2.insert(1.22);
		c2.insert(56.89);
		System.out.println(c2.isPresent(2.4) + " : is present");
		System.out.println(c2.isPresent(34.0)+ " : is present");
		System.out.println(c2.isEmpty()+ " : double empty");
		c2.remove(5);
		System.out.println(c2.get(5)+" : removed ");
		c2.makeEmpty();
		System.out.println(c2.get(2));
		
	}
}
