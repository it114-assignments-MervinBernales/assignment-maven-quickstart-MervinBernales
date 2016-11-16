/**
 * 
 */
package com.mycompany.mvn_quickstart_p4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.mycompany.mvn_quickstart_p4.ClassOneTestJUnit4;
import com.mycompany.common.exception.CannotParse2IntegerException;


/**
 * @author Mervin
 *
 */

public class ClassOneTestJUnit4 {
	private String name;
	private Integer age;
	private ClassOne classOne;
	public static Integer age2add = 10;
	public static String  strAge2add = "20";
	public static String  exceptionStrAge2add = "there She Throws";
	
	public static final String  DEFAULT_NAME = "Mervin";
	public static final Integer DEFAULT_AGE = 20;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void init() throws Exception {
		//super.setUp();
		System.out.println("Executing setUp(");
		name = ClassOne.NAME;
		age = ClassOne.AGE;
		classOne = new ClassOne();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void destruct() throws Exception {
		//super.tearDown();
		System.out.println("Executing tearDown(");
	}

	@Test
	public void testClassOne() {
		ClassOne classOne1 = new ClassOne();
		String expectedName = ClassOne.NAME + "ertop";
		Integer expectedAge = ClassOne.AGE + 100;
		String actualName = classOne1.getName();
		Integer actualAge = classOne1.getAge();
		assertEquals(expectedName, actualName);
		assertEquals(expectedAge, actualAge);
		//fail("Not yet implemented");
	}
//	@Test
	@Ignore
	public void testAppStringInteger() {
		ClassOne classOne1 = new ClassOne(name, age);
		assertEquals("Name has not been initialized to expected value:" + name , name, classOne1.getName());
		assertEquals("Age  has not been initialized to expected value:" + age ,  age, classOne1.getAge());
//		fail("Not yet implemented");
	}

	@Test
	public void testAdd2ageInteger() {
		Integer expected = age + age2add;
		Integer actual = classOne.add2age(age2add);
		assertEquals("add2age did not add " + age2add + " correctly", expected, actual);
//		assertEquals("add2age did not add " + age2add + " correctly", (age2add + age), app.add2age(age2add));	
//		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd2ageString() throws CannotParse2IntegerException {
		Integer expected = age + Integer.parseInt(strAge2add);
		Integer actual = classOne.add2age(strAge2add);
		assertEquals("add2age did not add " + strAge2add + " correctly", expected, actual);		
//		fail("Not yet implemented");
	}
	@Test(expected = CannotParse2IntegerException.class)
//	public void testAdd2ageStringCannotParse2IntegerException1() {  
	public void testAdd2ageStringCannotParse2IntegerException1() throws CannotParse2IntegerException {
		classOne.add2age(exceptionStrAge2add);
//		fail("Not yet implemented");
	}
	@Test
	public void testSuffixedName() {
		System.out.println("BEF testSuffixNmae(");
		String suffixMe = "SUFFIX";
		String expected = ClassOne.NAME + suffixMe;
		String actual = classOne.suffixedName(suffixMe);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
		System.out.println("BEF testSuffixName(");
	}
}
