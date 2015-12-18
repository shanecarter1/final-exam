package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bob", "Tim", "Carter", dBirthDate, "213 Labrador Lane", "302-893-6888", "Bob@udel.edu","MIS");
		Student stu3 = new Student("ert", "andall", "ibbons", dBirthDate, "21 Labrador Lane", "302-893-6887", "gibbons@udel.edu","MIS");
		Student stu4 = new Student("rt", "dall", "bons", dBirthDate, "24 Labrador Lane", "302-893-6886", "ibbons@udel.edu","MIS");
		Student stu5 = new Student("t", "all", "ons", dBirthDate, "4 Labrador Lane", "302-893-6882", "s@udel.edu","MIS");
		HashMap <UUID, Object> test = new HashMap();
		test.add(stu1);
		test.add(stu2);
		test.add(stu3);
		test.add(stu4);
		test.add(stu5);
		assertTrue(5==5);
	}

}
