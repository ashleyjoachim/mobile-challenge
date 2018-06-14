package com.ashleyjoachim.mobile_challenge.model;

import java.util.List;

public class MovieWrapper {

    private int page;
    private int total_results;
    private int total_pages;
    private List<TheMovieDBModel> results;

    public int getPage() {
        return page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public List<TheMovieDBModel> getResults() {
        return results;
    }
}
