package domain;

import java.util.ArrayList;
import java.util.Collection;

public class Person {

	private int person_id;
	private String name;
	private int age;

	// 定义集合属性
	private Collection<String> schools = new ArrayList<String>();

	public int getId() {
		return person_id;
	}

	public void setId(int person_id) {
		this.person_id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Collection<String> getSchools() {
		return schools;
	}

	public void setSchools(Collection<String> schools) {
		this.schools = schools;
	}

}
