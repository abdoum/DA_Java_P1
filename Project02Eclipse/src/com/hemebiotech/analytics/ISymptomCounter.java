package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomCounter {

	/**
	 * @param symptomsList
	 *                     the list of symptoms
	 *
	 * @return a Map using List element as keys and occurrences as values
	 */
	Map<String, Integer> countArrayDuplicates();

}