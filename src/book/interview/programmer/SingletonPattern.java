package book.interview.programmer;

/**
 *
 * @author lionel
 *
 * @source 169题
 *
 */
class Person{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

public class SingletonPattern {
		private static Person person = new Person();
		public static Person getPerson(){
			return person;
		}
}
