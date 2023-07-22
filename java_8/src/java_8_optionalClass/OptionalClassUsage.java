package java_8_optionalClass;

import java.util.Optional;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name= name;
		this.age= age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}

class PersonService {
	private static final Person[] people = {
			new Person("Jack", 30),
			new Person("Bob", 28),
			new Person("Alice", 35),
			
	};
	
	public Optional<Person> findPersonByName(String name){
		for(Person person: people) {
			if(person.getName().equals(name)) {
				return Optional.of(person);
			}
		}
		
		return Optional.empty();
	}
}

public class OptionalClassUsage {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		
		//Trying to find a person by name
		String searchName = "net";
		Optional<Person> personOptional = personService.findPersonByName(searchName);
		
		//Using Optional methods to handle the presence or absence of the person
		if(personOptional.isPresent()) {
			Person person = personOptional.get();
			System.out.println("Person found: " + person.getName() + ", " + person.getAge());
			
		} else {
			System.out.println("Person not found: " + searchName);
		}
	}

}
