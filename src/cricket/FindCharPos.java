package cricket;
import java.util.Scanner;
public class FindCharPos {
	private static Scanner sc;
	public static void main(String[] args) {
		String Str;
		char ch;
		int i = 0, findex = 0, lindex = -1;
		sc = new Scanner(System.in);
		System.out.print("Enter String =  ");
		Str = sc.nextLine();
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
		while (i < Str.length()) {
			if (Str.charAt(i) == ch) {
				findex++;
				break;
			}
			i++;
		}
		if (findex == 0) {
			System.out.println("not found the Character ");
		} else {
			System.out.format("\nThe First Character Occurrence of %c at %d position", ch, i);
		}
		while (i < Str.length()) {
			if (Str.charAt(i) == ch) {
				lindex++;
			}
			i++;
		}
		if (lindex == -1) {
			System.out.println("\nSorry! We haven't found the Character ");
		} else {
			System.out.format("\nThe Last Character Occurrence of %c at %d position", ch, i);
		}
	}

}
