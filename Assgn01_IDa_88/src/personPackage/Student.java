package personPackage;
/**
 * @author Ivan Danilkin
 * Child class
 *
 */
public class Student extends Person implements Greeting{
	String field;
    double averageGrade;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }


    @Override
    public String display(){
        return "First name : " + firstName + " Last name : " + lastName + " ZIP : " + zip + " phone : " + phone + "Field is " + field + " average grade : " + averageGrade;
    }
    public String displayField() {
    	return "Field: " + field;
    }
    public String displayGrade() {
    	return "Grade: " + averageGrade;
    }
    
    public String greeting() {
    	return "Hello student";
    }
}
