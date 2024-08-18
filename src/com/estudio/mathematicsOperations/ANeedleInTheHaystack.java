package com.estudio.mathematicsOperations;

public class ANeedleInTheHaystack {

    public  String findNeedle(Object[] haystack) {

        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "Found the needle at position " + i;
            }
        }
        return "Needle not found";
    }

//    Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
    static String removeExclamationMarks(String s) {
            return s.replace("!", "");
    }

//    Write a function which calculates the average of the numbers in a given list.


}
