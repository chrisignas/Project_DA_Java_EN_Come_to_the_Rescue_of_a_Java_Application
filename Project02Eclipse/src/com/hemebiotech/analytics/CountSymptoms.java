package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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