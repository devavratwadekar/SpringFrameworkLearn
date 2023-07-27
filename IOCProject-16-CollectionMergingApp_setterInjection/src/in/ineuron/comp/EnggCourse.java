package in.ineuron.comp;
import java.util.Set;

//27 March 2023
public class EnggCourse {

	private Set<String> subjects;

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}

}
