package pac;

public class Animal {void noise()
	{
	System.out.println("animal");
	}
}
class Cat extends Animal
{
	void noise()
	{
		System.out.println("mew");
	}
}
class dog extends Animal
{
	void noise()
	{
		System.out.println("bow");
	}
}
class snake extends Animal
{
	void noise()
	{
		System.out.println("hiss");
	}
}