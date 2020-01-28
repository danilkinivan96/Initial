package personPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assgn01_IDa_88 extends HttpServlet {
	String str1;
	String str2;
	String str3;
	String str4;
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter object = res.getWriter();
		String input = req.getParameter("class");
		if (input.equals("employee")) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setFirstName("Vladimir");
			emp.setLastName("Pashkevich");
			emp.setAge(35);
			emp.setPhone("+1(604) 444-4444");
			emp.setSalary(75000);
			emp.setSocialNumID("4327647268");
			emp.setZip("5V5 2R9");
			str1 = emp.greeting();
			str2 = emp.display();
			object.println(str1);
			object.println(str2);
		}
		if (input.equals("student")) {
			Student stud = new Student();
			stud.setFirstName("Ruslan");
			stud.setLastName("Kamusov");
			stud.setAge(23);
			stud.setField("Biology");
			stud.setAverageGrade(2.33);
			stud.setPhone("+1(604) 333-3333");
			stud.setZip("2W5 7R1");
			str3 = stud.greeting();
			str4 = stud.display();
			object.println(str3);
			object.println(str4);
		}
	}
}
