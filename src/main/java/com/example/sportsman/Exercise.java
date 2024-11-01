package com.example.sportsman;

public class Exercise {
    private String name;
    private int reps;
    private int sets;
    private float weight;
    private boolean isTimed;
    private char difficulty;

    // Конструктор по умолчанию
    public Exercise() {
    }

    // Конструктор с параметрами
    public Exercise(String name, int reps, int sets, float weight, boolean isTimed, char difficulty) {
        this.name = name;
        this.reps = reps;
        this.sets = sets;
        this.weight = weight;
        this.isTimed = isTimed;
        this.difficulty = difficulty;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isTimed() {
        return isTimed;
    }

    public void setTimed(boolean isTimed) {
        this.isTimed = isTimed;
    }

    public char getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(char difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", reps=" + reps +
                ", sets=" + sets +
                ", weight=" + weight +
                ", isTimed=" + isTimed +
                ", difficulty=" + difficulty +
                '}';
    }
}
