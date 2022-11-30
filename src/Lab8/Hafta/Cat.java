package Lab8.Hafta;

public class Cat extends Animal implements Pet {
	
	private String name;
	
	public Cat(int legs)
	{
		super(legs);
	}
	
	public Cat(int legs,String name)
	{
		super(legs);
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void play()
	{
		System.out.println(name + " cinsli kedi oynuyor...");
	}
	
	

	
	

}
