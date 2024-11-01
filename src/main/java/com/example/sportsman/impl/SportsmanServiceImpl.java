package com.example.sportsman.impl;

import com.example.sportsman.Sportsman;
import com.example.sportsman.Exercise;
import com.example.sportsman.SportsmanService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "com.example.sportsman.SportsmanService")
public class SportsmanServiceImpl implements SportsmanService {

    private List<Sportsman> sportsmen;

    public SportsmanServiceImpl() {
        // Инициализация тестовых данных
        sportsmen = new ArrayList<>();

        sportsmen = Arrays.asList(
                new Sportsman("Ivan", 25, "Programmer", 1.80f, 75.0f, true, 'M',
                        Arrays.asList(
                                new Exercise("Bench Press", 4, 10, 80.0f, false, 'A'),
                                new Exercise("Deadlift", 3, 8, 100.0f, false, 'A'),
                                new Exercise("Treadmill", 3, 15, 0.0f, true, 'B'),
                                new Exercise("Dumbbell Rows", 3, 12, 25.0f, false, 'B'),
                                new Exercise("Cycling", 5, 20, 0.0f, true, 'C')
                        )
                ),
                new Sportsman("Alexandra", 30, "Footballer", 1.70f, 65.0f, false, 'F',
                        Arrays.asList(
                                new Exercise("Squats", 4, 12, 60.0f, false, 'A'),
                                new Exercise("Lunges", 3, 15, 20.0f, false, 'B'),
                                new Exercise("Leg Press", 3, 10, 100.0f, false, 'A'),
                                new Exercise("Box Jumps", 3, 20, 0.0f, true, 'B'),
                                new Exercise("Running", 5, 30, 0.0f, true, 'C')
                        )
                ),
                new Sportsman("Dmitry", 22, "Student", 1.75f, 68.0f, false, 'M',
                        Arrays.asList(
                                new Exercise("Push-ups", 3, 20, 0.0f, false, 'B'),
                                new Exercise("Jump Rope", 5, 60, 0.0f, true, 'C'),
                                new Exercise("Lat Pulldown", 3, 12, 50.0f, false, 'B'),
                                new Exercise("Leg Curls", 3, 15, 35.0f, false, 'A'),
                                new Exercise("Rowing Machine", 5, 20, 0.0f, true, 'C')
                        )
                ),
                new Sportsman("Maria", 28, "Manager", 1.65f, 60.0f, true, 'F',
                        Arrays.asList(
                                new Exercise("Treadmill Run", 5, 10, 0.0f, true, 'B'),
                                new Exercise("Rowing Machine", 3, 10, 0.0f, true, 'C'),
                                new Exercise("Kettlebell Swings", 3, 15, 16.0f, false, 'B'),
                                new Exercise("Seated Leg Press", 3, 12, 50.0f, false, 'A'),
                                new Exercise("Elliptical Trainer", 5, 20, 0.0f, true, 'C')
                        )
                ),
                new Sportsman("Sergey", 35, "Analyst", 1.82f, 80.0f, false, 'M',
                        Arrays.asList(
                                new Exercise("Bench Press", 4, 8, 90.0f, false, 'A'),
                                new Exercise("Lat Pulldown", 3, 12, 70.0f, false, 'B'),
                                new Exercise("Leg Press", 3, 15, 100.0f, false, 'B'),
                                new Exercise("Stationary Bike", 4, 20, 0.0f, true, 'C'),
                                new Exercise("Treadmill Walking", 3, 30, 0.0f, true, 'C')
                        )
                ),
                new Sportsman("Olga", 26, "Lawyer", 1.68f, 58.0f, true, 'F',
                        Arrays.asList(
                                new Exercise("Elliptical Trainer", 5, 15, 0.0f, true, 'C'),
                                new Exercise("Goblet Squats", 3, 12, 12.0f, false, 'B'),
                                new Exercise("Rowing Machine", 3, 15, 0.0f, true, 'C'),
                                new Exercise("Kettlebell Deadlifts", 3, 10, 20.0f, false, 'B'),
                                new Exercise("Jump Rope", 5, 50, 0.0f, true, 'B')
                        )
                ),
                new Sportsman("Nikolay", 40, "Engineer", 1.78f, 85.0f, true, 'M',
                        Arrays.asList(
                                new Exercise("Chest Fly", 4, 12, 15.0f, false, 'A'),
                                new Exercise("Seated Row", 3, 10, 80.0f, false, 'B'),
                                new Exercise("Cable Tricep Pushdown", 3, 12, 25.0f, false, 'B'),
                                new Exercise("Stationary Bike", 5, 25, 0.0f, true, 'C'),
                                new Exercise("Leg Press", 4, 15, 90.0f, false, 'A')
                        )
                ),
                new Sportsman("Elena", 23, "Teacher", 1.60f, 55.0f, false, 'F',
                        Arrays.asList(
                                new Exercise("Jump Rope", 5, 60, 0.0f, true, 'C'),
                                new Exercise("Bodyweight Squats", 4, 15, 0.0f, false, 'B'),
                                new Exercise("Shoulder Press", 3, 10, 10.0f, false, 'B'),
                                new Exercise("Elliptical Trainer", 3, 20, 0.0f, true, 'A'),
                                new Exercise("Russian Twists", 4, 20, 0.0f, false, 'C')
                        )
                )
        );
    }


    @Override
    public Sportsman getSportsmanById(int id) {
        return null;
    }

    @Override
    public List<Sportsman> getAllSportsmen() {
        return sportsmen;
    }

    @Override
    public List<Exercise> getExercisesBySportsmanId(int sportsmanId) {
        Sportsman sportsman = getSportsmanById(sportsmanId);
        if (sportsman != null) {
            return sportsman.getExercises();
        }
        return new ArrayList<>();
    }
}
