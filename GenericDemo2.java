class Gen<T extends Number>
{
	T obj;

	Gen(T obj)
	{
		this.obj = obj;
	}

	public void show()
	{
		System.out.println("The type of object: "+obj.getClass().getName());
	}

	public T getObj()
	{
		return obj;
	}
}

class GenericDemo2
{
	public static void main(String[] args) 
	{
		Gen<Integer> gen1 = new Gen<Integer>(10);
		gen1.show();
		System.out.println(gen1.getObj());

		Gen<Double> gen2 = new Gen<Double>(10.5);
		gen2.show();
		System.out.println(gen2.getObj());
	}
}