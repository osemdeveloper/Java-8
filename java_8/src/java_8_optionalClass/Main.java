package java_8_optionalClass;

import java.util.Optional;

class Address {
	private String street;
	private String city;
	private String zipCode;

	public Address(String street, String city, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

}

class User {
	private String name;
	private Optional<Address> address;

	public User(String name, Address address) {
		this.name = name;
		this.address = Optional.ofNullable(address);
	}

	public String getName() {
		return name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

}

public class Main {
	public static void main(String[] args) {
		Address address1 = new Address("123 Main st", "Jayanagar", "560072");
		User user1 = new User("Akash", address1);
		User user2 = new User("Arun", null);

		// Example usage of Optional to retrieve the address safely
		System.out.println(user1.getName());
		user1.getAddress()
				.ifPresentOrElse(address -> System.out.println(
						"Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getZipCode()),
						() -> System.out.println("Address Not Available"));

		System.out.println(user2.getName());
		user2.getAddress()
				.ifPresentOrElse(address -> System.out.println(
						"Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getZipCode()),
						() -> System.out.println("Address Not Available"));
	}

}
