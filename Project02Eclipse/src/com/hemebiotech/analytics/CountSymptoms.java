package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <h1>Count Symptoms Class</h1>
 * The CountSymptoms program implements an application that
 * simply counts occurrences of symptoms within a list of strings
 * (symptoms) and alphabetizes them.
 * <p>
 *
 * @author  Christopher Ignas
 * @version 1.0
 * @since   2020-12-17
 */

public class CountSymptoms {

    Map<String, Integer> getSymptoms(List<String> symptomsListFromFile) {

        //Use TreeMap to order the list within the Map alphabetically

        Map<String, Integer> symptoms = new TreeMap<>();

        for(String symptom : symptomsListFromFile) {

            Integer count = symptoms.get(symptom);

            //Check if symptom exists, then map and count

            if (count != null) {
                count++;
            }
            else {
                count = 1;
            }
            symptoms.put(symptom, count);
        }
        return symptoms;
    }
}