import java.util.regex.*;

public class RegularPattern {
	public static void main(String args[]){
		String n = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		String test = ".*order.*";
		
		Pattern r = Pattern.compile(pattern);
		Pattern r1 = Pattern.compile(test);
		
		Matcher m1 = r1.matcher(n);
		Matcher m = r.matcher(n);
		
		boolean matches  = m.matches();
		
		System.out.println(" n " + " test " + matches)	;
		
		if(m.find()){
			System.out.println("Found value " + m.group(0));
			System.out.println("Found value " + m.group(1));
			System.out.println("Found value " + m.group(2));
		}else{
			System.out.println("No Match");
		}
	}
}