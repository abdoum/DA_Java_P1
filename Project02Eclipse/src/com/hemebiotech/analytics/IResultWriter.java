package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface IResultWriter {

	/**
	 * @param symtomsCount
	 *                     a dictionary containing each symptom and their counts
	 *
	 * @throws IOException
	 *                     if path is invalid or writer Object not closed
	 */
	void writeResultsToFile(Map<String, Integer> symtomsCount);

}