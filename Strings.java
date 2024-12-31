public class Strings {

	public static void main(String[] args) {
		String s= new String("Hippocloud ");
		String a= new String("Hippocloud");
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("i"));
		System.out.println(s.substring(0, 5));
		System.out.println(s.length());
		System.out.println(s.substring(5));
		System.out.println(s.trim());
		System.out.println(a.compareTo(s));
		System.out.println(a.compareTo(s.trim()));
		System.out.println(a.contentEquals(s));
		System.out.println(a.contentEquals(s.trim()));

	}
}