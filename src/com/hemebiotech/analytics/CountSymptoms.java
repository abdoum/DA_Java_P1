package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Count symptom occurrences and returns dictionary containing each symptom and
 * the number of occurrences
 * 
 * @author Abdallah Mansour
 *
 */
public class CountSymptoms implements ISymptomCounter {

	private List<String> symptomsList;
	
	/**
	 * @param symptomsList a list of strings representing the symptoms
	 */
	public CountSymptoms(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	/**
	 * @param symptomsList the list of symptoms
	 * @return a Map using List element as keys and occurrences as values
	 */
	@Override
	public Map<String, Integer> countArrayDuplicates() {

		if (symptomsList.isEmpty()) {
			return new HashMap<String, Integer>();
		}

		Map<String, Integer> symptomsDictionary = new TreeMap<String, Integer>();

		for (String symptom : symptomsList) {
			symptomsDictionary.put(symptom,
					(symptomsDictionary.containsKey(symptom)) ? symptomsDictionary.get(symptom) + 1 : 1);
		}
			
		return symptomsDictionary;
	}

}
