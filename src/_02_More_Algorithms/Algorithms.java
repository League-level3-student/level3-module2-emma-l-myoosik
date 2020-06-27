package _02_More_Algorithms;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) counter++;
		}
		return counter;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for (int i = 1; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		int longestLength = words.get(0).length();
		String longestWord = words.get(0);
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).length() > longestLength) {
				longestLength = words.get(i).length();
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
	
	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> scores) {
		for (int i = 1; i < scores.size(); i++) {
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0
			for (int j = i; j > 0; j--) {
				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
				if (scores.get(j) < scores.get(j - 1)) {
					double temp = scores.get(j);
					scores.set(j, scores.get(j - 1));
					scores.set(j - 1, temp);
				}
			}
		}
		
		return scores;
	}
	
	public static List<String> sortDNA(List<String> unsortedSequence) {
		for (int i = 1; i < unsortedSequence.size(); i++) {
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0
			for (int j = i; j > 0; j--) {
				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
				if (unsortedSequence.get(j).length() < unsortedSequence.get(j - 1).length()) {
					String temp = unsortedSequence.get(j);
					unsortedSequence.set(j, unsortedSequence.get(j - 1));
					unsortedSequence.set(j - 1, temp);
				}
			}
		}
		return unsortedSequence;
	}

	public static List<String> sortWords(List<String> words){
		for (int i = 1; i < words.size(); i++) {
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0
			for (int j = i; j > 0; j--) {
				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
				if (words.get(j).compareTo(words.get(j - 1)) < 0) {
					String temp = words.get(j);
					words.set(j, words.get(j - 1));
					words.set(j - 1, temp);
				}
			}
		}
		return words;
	}
	
}
