package in.ineuron.comp;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
	private Map<Integer, String> facultyinfo;
	private Map<String, Date> datesInfo;
	private Properties iplInfo;

	public void setIplInfo(Properties iplInfo) {
		this.iplInfo = iplInfo;
		System.out.println("Implementation class of Properties is :: " + iplInfo.getClass().getName());
	}

	public void setFacultyinfo(Map<Integer, String> facultyinfo) {
		this.facultyinfo = facultyinfo;
		System.out.println("Implementation class of Map is :: " + facultyinfo.getClass().getName());
	}

	public void setDatesInfo(Map<String, Date> datesInfo) {
		this.datesInfo = datesInfo;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyinfo=" + facultyinfo + ", datesInfo=" + datesInfo + ", iplInfo=" + iplInfo + "]";
	}

}
