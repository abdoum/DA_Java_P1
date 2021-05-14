package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filePath;

	/**
	 * @param filePath
	 *                 a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @throws IOException
	 *                     if path is invalid or writer Object not closed
	 */

	@Override
	public List<String> getSymptoms() {

		ArrayList<String> result = new ArrayList<String>();

		if (filePath != null) {
			try (
					FileReader fileConnection = new FileReader(filePath);
					BufferedReader reader = new BufferedReader(fileConnection);) {

				String line = reader.readLine();

				while (line != null) {
					result.add(line.toLowerCase().trim());
					line = reader.readLine();
				}

			} catch (IOException e) {
				e.printStackTrace();

			}
		}

		return result;
	}

}
