
public class Collection<T>
{
	private Object[] collection;
	private int size = 0;
	
	public Collection (int setSize)
	{
		collection = new Object[setSize];
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public void makeEmpty()
	{
		Object[] a = collection;
		int s = size; 
		for( int i = 0; i < size; i++)
		{
			a[i] = null;
		}
		
	}
	
	public void insert(T o)
	{
		Object[] a = collection;
		int s = size;
		if(s == collection.length)
		{
			Object[] addArray = new Object[s + 10];
			System.arraycopy(a, 0, addArray, 0, s);
			collection = a = addArray;
		}
		a[s] = o;
		size = s + 1;
		
	}
	
	public void remove(int index)
	{
		Object[] a = collection;
		int s = size;
		a[index] = null;
		size = s - 1;
	}
	
	public boolean isPresent(Object o)
	{
		Object[] a = collection;
		int s = size;
		for(int i = 0; i < size; i++)
		{
			if(a[i].equals(o)) {return true;}	
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index)
	{
		return (T) collection[index];
	}
	
	public int size()
	{
		return collection.length;
		
	}
	
}
