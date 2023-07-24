package FirstTest;

public class Dog {
	String name,breed;
	public Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
		
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog("shero","german");
		Dog dog2=new Dog("rocky","buldog");
		System.out.println("Name:"+dog1.name+" Breed:"+dog1.breed);
		System.out.println("Name:"+dog2.name+" Breed:"+dog2.breed);
		dog1.setName("rock");
		dog1.setBreed("husky");
		dog2.setName("raju");
		dog2.setBreed("pitbul");
		System.out.println("Updated= "+"Name:"+dog1.name+" Breed:"+dog1.breed);
		System.out.println("Updated= "+"Name:"+dog2.name+" Breed:"+dog2.breed);

	}

}
