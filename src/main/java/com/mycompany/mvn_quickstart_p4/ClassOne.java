package com.mycompany.mvn_quickstart_p4;

import com.mycompany.common.exception.CannotParse2IntegerException;
public class ClassOne {
	private String name;
	private Integer age;
	public static final String NAME = "Mervin";
	public static final Integer AGE = 20;
	public ClassOne(){
		this(NAME, AGE);

	}
	public ClassOne(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	public Integer add2age(Integer addMe){
		return age + addMe;
	}
	public Integer add2age(String _add2age) throws CannotParse2IntegerException {
//		return age + Integer.parseInt(_add2age);
		
		Integer add2age = 0;
		try {
			add2age = Integer.parseInt(_add2age);
		} catch (NumberFormatException nfe) {
			throw new CannotParse2IntegerException(_add2age);
		} finally {
			// TODO: handle finally clause
		}
		return add2age(add2age);
//		return age + add2age;
	}
	
	public String prefixedName(String _prefix){
		return _prefix + name;
	}
	public String suffixedName(String _suffix){
		return name + _suffix;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name:").append(name).append("age:").append(age);
		return sb.toString();		
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
	}
}