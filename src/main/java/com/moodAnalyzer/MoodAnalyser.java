package com.moodAnalyzer;

public class MoodAnalyser
{
    private String message;

    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message)
    {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood()
    {
        try
        {
            if(message.contains("Sad"))
            {
                return "SAD";
            }
            else
            {
                return "HAPPY";
            }
        }
        catch(NullPointerException e)
        {
            throw new MoodAnalysisException("Please enter proper mood");
        }
    }

}

