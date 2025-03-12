package java15.practice;

public class Main_p1502{
	public String Fandf(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}
}