package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/**
	 * @param args
	 *             if any
	 *
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		analyseSymptoms((args[0] != null) ? args[0] : "symptoms.txt",
				(args[1] != null) ? args[1] : "result.out");

	}

	/**
	 * reads symptoms from a file and count occurrences then writes the count
	 * results to a new file.
	 *
	 * @param inputFilePath
	 *                       a path to the file containing the collected symptoms
	 * @param resultFilePath
	 *                       a full path and a filename to store the results that
	 *                       will be generated
	 */
	private static void analyseSymptoms(String inputFilePath, String resultFilePath) {

		final ISymptomReader reader = new ReadSymptomDataFromFile(inputFilePath);

		final List<String> symptoms = reader.getSymptoms();

		final ISymptomCounter counter = new CountSymptoms(symptoms);

		final Map<String, Integer> symptomsCount = counter.countArrayDuplicates();

		final IResultWriter writer = new WriteSymtomsCountToFile(resultFilePath);

		writer.writeResultsToFile(symptomsCount);
	}
}
