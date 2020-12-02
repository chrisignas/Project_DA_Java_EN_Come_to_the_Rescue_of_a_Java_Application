package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String[] args) throws Exception {

		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));

        Map<String, String> map = new TreeMap<String, String>();
        String line = "";
        while((line = reader.readLine())!=null){
            map.put(getField(line),line);
        }
//        Map<String, Integer> map = new TreeMap<String, Integer>();
//        for (String a : args) {
//            Integer freq = map.get(a);
//            map.put(a, (freq == null) ? 1 : freq + 1);
//        }
        reader.close();

        // write output
        FileWriter writer = new FileWriter("result1.out");
        for(String val : map.values()){
            writer.write(val);
            writer.write('\n');
        }
        writer.close();
    }

    private static String getField(String line) {
        return line.split(" ")[0];
    }
}



//		String line = reader.readLine();

//		while (line != null) {
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headacheCount++;
//			}
//
//			else if (line.equals("rash")) {
//				rashCount++;
//			}
//
//			else if (line.contains("pupils")) {
//				pupilCount++;
//			}
//
//			line = reader.readLine();	// get another symptom
//		}
		
		// next generate output
//		FileWriter writer = new FileWriter ("result.out");
//
//		writer.write("headache: " + headacheCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();
//	}
//}
