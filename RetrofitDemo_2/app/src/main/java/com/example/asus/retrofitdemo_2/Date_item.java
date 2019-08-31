package com.example.asus.retrofitdemo_2;

import java.util.Arrays;

public class Date_item {
    private String error;
    private String[] results;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Date_item{" +
                "error='" + error + '\'' +
                ", results=" + Arrays.toString(results) +
                '}';
    }
}
