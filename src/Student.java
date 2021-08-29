

public class Student {
	private String name;
	private String surname;
	private int id;
	private String streetname;
	private int postcode;
	private String city;

	Student(String name, String surname, int id, String streetname, int postcode, String city) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.streetname = streetname;
		this.postcode = postcode;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
