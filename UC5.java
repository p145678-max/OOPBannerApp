/*
* OOPBannerApp UC5: Print OOPS in a banner in console using String Array and Loop
*/

public class UC5 {
	public static void main(String[] args) {
		String[] lines = {
		
		String.join("" , "    ***    " , "    ***    " , " *******  " , "   *****  "),
		String.join("" , "  **   **  " , "  **   **  " , " **    ** " , " **    ** "),
		String.join("" , " **     ** " , " **     ** " , " **    ** " , " **       "),
		String.join("" , " **     ** " , " **     ** " , " *******  " , "  *****   "),
		String.join("" , " **     ** " , " **     ** " , " **       " , "       ** "),
		String.join("" , "  **   **  " , "  **   **  " , " **       " , " **    ** "),
		String.join("" , "    ***    " , "    ***    " , " **       " , "   *****  "),
		
		};
	
		for (String line : lines) {
			System.out.println(line);
		}
	}
}