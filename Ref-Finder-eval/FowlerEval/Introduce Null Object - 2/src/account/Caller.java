package account;

import people.Person;

public class Caller {

	public void call() {
		try {
			Account s = new Account();
			s.withdraw(23);
			System.out.println("haha");
		} catch (BalanceException e) {
			System.out.println("eerror");
		}
	}

	int dd;

	public boolean testing() {
		Person p = new Person();
		return p.getDepartment().isNull();
	}
}
