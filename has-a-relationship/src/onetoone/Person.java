package onetoone;

public class Person {
	private static int incr;
	private int id;
	
	{
		id = ++incr;
	}
	private String name;
	private int age;
	private long phone;
	private PanCard card;

	public PanCard getCard() {
		return card;
	}

	public void setCard(PanCard card) {
		this.card = card;
	}

	public static int getIncr() {
		return incr;
	}

	public static void setIncr(int incr) {
		Person.incr = incr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
}
