package com.example.sportsman;

import java.util.ArrayList;
import java.util.List;

public class SportsmanList {
    private List<Sportsman> sportsmen;

    public SportsmanList() {
        this.sportsmen = new ArrayList<>();
    }

    public List<Sportsman> getSportsmen() {
        return sportsmen;
    }

    public void setSportsmen(List<Sportsman> sportsmen) {
        this.sportsmen = sportsmen;
    }
}
