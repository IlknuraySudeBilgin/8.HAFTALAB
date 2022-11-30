package Lab8.Hafta;

public class Fish extends Animal implements Pet{
	
	private String name ;
	public Fish(int legs)
	{
		super(legs);
	}
	
	public Fish(int legs,String name)
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
		System.out.println("Balik kurugunu sallayarak denizde oynuyor...");
	}
	
	public void walk()
	{
		System.out.println("Baliklar yuruyemez, yuzer...");
	}
	
	
	

}
