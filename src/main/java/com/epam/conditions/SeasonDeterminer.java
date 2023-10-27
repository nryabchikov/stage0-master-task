package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String result;
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            result = "Winter";
        } else if (monthNumber > 2 && monthNumber < 6) {
            result = "Spring";
        } else if (monthNumber > 5 && monthNumber < 9) {
            result = "Summer";
        } else if (monthNumber > 8 && monthNumber < 12) {
            result = "Autumn";
        } else {
            result = "Wrong month number";
        }
        System.out.println(result);
    }

}
