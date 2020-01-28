package personPackage;
/**
 * @author Ivan Danilkin
 * Date:2020:01-21
 * parent class
 */
public abstract class Person {
	String firstName;
    String lastName;
    String zip;
    String phone;
    Integer age;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String display(){
        return "First name : " + firstName + "\nLast name : " + lastName + "\nZIP : " + zip + "\nPhone : " + phone + "\nAge: " + age;
    }   
    public String dislpayName() {
    	return "First name: " + firstName + "\nLast name: " + lastName;
    }
    public String displayAge() {
    	return "First name: " + firstName + "\nLast name: " + lastName + "\nAge: " + age;
    }
}
