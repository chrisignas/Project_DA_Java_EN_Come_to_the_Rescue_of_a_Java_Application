package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		/* Above - Author names the file but does not provide path or directory
		for "symptoms.txt". Program does not know where to find "symptoms.txt".
		This is the reason for the exception.
		 */

		int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				/* "rush" should be "rash"
				 */
				rashCount++;
				/* Author may have forgotten to print "number of rashes"
				 */
			}
			else if (line.contains("pupils")) {
				pupilCount++;
				/* Author may have forgotten to print "number of pupils"
				 */
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");

		/* Above - No path given for "result.out"
		 */

		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
