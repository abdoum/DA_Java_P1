package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;


public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));

		String line = reader.readLine();

		Map<String, Long> symptoms = new HashMap<String, Long>();

		while (line != null) {

			if (symptoms.containsKey(line)) {

				symptoms.put(line, symptoms.get(line) + 1); // if symptom is already in dictionary, increment its count
															// by 1
			} else {

				symptoms.put(line, (long) 1); // else add symptom to dictionary and mark its count as 1

			}

			line = reader.readLine(); // get next line
		}

		reader.close();

		// next generate output
		FileWriter writer = new FileWriter("result.out");

		for (Object symptom : symptoms.entrySet()) {

			writer.write(symptom.toString() + "\n");

		}

		writer.close();

	}
}
