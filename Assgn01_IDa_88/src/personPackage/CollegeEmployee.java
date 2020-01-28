package personPackage;
/**
 * @author Ivan Danilkin
 * Child class
 *
 */
public class CollegeEmployee extends Person implements Greeting {
	String socialNumID;
    double salary;

    public String getSocialNumID() {
        return socialNumID;
    }

    public void setSocialNumID(String socialNumID) {
        this.socialNumID = socialNumID;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String display(){
        return "First name : " + firstName + "\nLast name : " + lastName + "\nZIP : " + zip + "\nphone : " + phone + "\nSocial number is " +
                "\nSalary is " + salary;
    }
    public String displaySocialNumID() {
    	return "Social num ID: " + socialNumID;
    }
    public String displaySalary() {
    	return "Salary: " + salary;
    }
    public String greeting() {
    	return "Hello employee";
    }
}
