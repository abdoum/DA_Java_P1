package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Writes the result to a file
 *
 * @author Abdallah Mansour
 */
public class WriteSymtomsCountToFile implements IResultWriter {

	private String filePath;

	/**
	 * @param filePath
	 *                 a full or partial path to file to write results into
	 */
	public WriteSymtomsCountToFile(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @param symptomsCount
	 *                      a dictionary containing each symptom and their counts
	 *
	 * @throws IOException
	 *                     if path is invalid or writer Object not closed
	 */
	@Override
	public void writeResultsToFile(Map<String, Integer> symptomsCount) {

		if (filePath != null) {

			try (FileWriter writer = new FileWriter(filePath);) {

				for (Entry<String, Integer> symptom : symptomsCount.entrySet()) {
					writer.write(symptom.toString() + "\n");
				}

			} catch (IOException e) {

				e.printStackTrace();

			}
		}

	}
}
