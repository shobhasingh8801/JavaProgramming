package Practice.String;

public class RemoveExtraSpaces {
	public static void main(String[] args) {
		String str = "      ram      is        good";
		str = str.trim().replaceAll("\\s+", " ");
		System.out.println(str);
	}
}
