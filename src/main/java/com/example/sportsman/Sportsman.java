package com.example.sportsman;

import java.util.List;

public class Sportsman {
    private String name;
    private int age;
    private String profession;       // Профессия спортсмена
    private float height;            // Рост спортсмена
    private float weight;            // Вес спортсмена
    private boolean isProfessional;  // Профессиональный спортсмен или нет
    private char gender;             // Пол (M/F)
    private List<Exercise> exercises; // Список упражнений

    // Конструктор по умолчанию
    public Sportsman() {
    }

    public Sportsman(String name, int age, String profession, float height, float weight, boolean isProfessional, char gender, List<Exercise> exercises) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.height = height;
        this.weight = weight;
        this.isProfessional = isProfessional;
        this.gender = gender;
        this.exercises = exercises;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isProfessional() {
        return isProfessional;
    }

    public void setProfessional(boolean professional) {
        isProfessional = professional;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", isProfessional=" + isProfessional +
                ", gender=" + gender +
                ", exercises=" + exercises +
                '}';
    }
}
