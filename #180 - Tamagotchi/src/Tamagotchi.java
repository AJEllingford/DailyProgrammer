
public class Tamagotchi {
	static boolean ifelse = true;
	String name;
	
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	public int getTiredness() {
		return tiredness;
	}
	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

	int hunger;
	int tiredness;
	int health;
	Tamagotchi(){
		
	}
	public Tamagotchi(String name){
		super();
		this.name = name;
		this.age = 0;
		this.hunger = 10; //10 will be the maximum value for attributes
		this.tiredness = 10;
		this.health = 20; //Health has 20
	}

	public void begin(){
		if (ifelse = true){
			Thread checking = new Thread();
			checking.start();
			Attributes c = new Attributes();
			c.check();
			c.live();
			ifelse = false;//This can't be ran again.
		}
		
	
	
	}
}
