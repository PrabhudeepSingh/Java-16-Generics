class Gen<T>
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

class GenericDemo1
{
	public static void main(String[] args) 
	{
		Gen<String> gen1 = new Gen<String>("Prabhu");
		gen1.show();
		System.out.println(gen1.getObj());	

		Gen<Integer> gen2 = new Gen<Integer>(10);
		gen2.show();
		System.out.println(gen2.getObj());

		Gen<Double> gen3 = new Gen<Double>(10.5);
		gen3.show();
		System.out.println(gen3.getObj());
	}
}