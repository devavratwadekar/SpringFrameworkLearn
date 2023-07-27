package in.ineuron.comp;

import java.util.Set;

//27 March 2023
public class EnggCourse {

	private Set<String> subjects;

	public EnggCourse(Set<String> subjects) {
		this.subjects = subjects;
		System.out.println("EnggCourse :: 1 param constructor");
	}

	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}

}
