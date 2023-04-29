package onetoone;

import java.time.LocalDate;

public class TestOneToOne {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("ABC");
		p1.setAge(24);
		p1.setPhone(8888);

		PanCard card = new PanCard();
		card.setDobl(LocalDate.parse("1998-01-24"));
		card.setNumber("iuafggf4565");
		card.setPincode(560004);
		p1.setCard(card);// Assiginig PanCard for Person

		System.out.println("person DetAils");
		System.out.println("ID:" + p1.getId());
		System.out.println("Name:" + p1.getName());
		System.out.println("Age:" + p1.getAge());
		System.out.println("Phone:" + p1.getPhone());
		System.out.println("Pancard Number:" + p1.getCard().getNumber());
		System.out.println("Pancard id:" + p1.getCard().getId());
		System.out.println("dob:" + p1.getCard().getDobl());
		System.out.println("PiNCODE:" + p1.getCard().getPincode());

	}
}
