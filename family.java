import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Family {
	
	public static void main(String[] args) throws IOException {
		
		int countGG = 0;
		int countBG = 0;
		int countBB = 0;
		int countGB = 0;
		int count = 0;
		
		File fileName = new File("familyMembers.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext()){
			String token = inFile.next();
			if (token.equals("BB")) {
				countBB++;
				count++;
			}
			else if (token.equals("GG")) {
				countGG++;
				count++;
			}
			else if (token.equals("BG")) {
				countBG++;
				count++;
			}
			else if (token.equals("GB")) {
				countGB++;
				count++;
			}
		}
		
		int size = count;
                int totalGB = countGB + countBG;
		
		System.out.println("Sample size: " + size);
		System.out.println("Families with two boys: " + countBB);
		System.out.println("Families with two girls: " + countGG);
		System.out.println("Families with one boy, one girl: " + totalGB);
		System.out.print("\n");
		
		inFile.close();
		double bbPercent = countBB / (double)size * 100;
		double ggPercent = countGG / (double)size * 100;
        double totalGBPercent = (countGB + countBG) / (double)size * 100 ;

         DecimalFormat df = new DecimalFormat("#.##");
        
		System.out.println("Probability of Two Boys: " + df.format(bbPercent) + "%");
		System.out.println("Probability of Two Girls: " + df.format(ggPercent) + "%");
		System.out.println("Probability of One boy, one girl: " + df.format(totalGBPercent) + "%");
	}
}
