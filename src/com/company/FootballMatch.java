package com.company;

public class FootballMatch extends Service {

    public int MatchOutcome;

    public int MatchForecast(int firstRealScore, int secondRealScore, int firstForecastScore, int secondForecastScore) {
        if ((firstRealScore == firstForecastScore && secondRealScore == secondForecastScore))
            MatchOutcome = 2;
        else {
            if ((firstRealScore >= secondRealScore && firstForecastScore >= secondForecastScore) ||
                    ((firstRealScore <= secondRealScore && firstForecastScore <= secondForecastScore)))
                MatchOutcome = 1;
            else
                MatchOutcome = 0;
        }
        return MatchOutcome;

    }
}
