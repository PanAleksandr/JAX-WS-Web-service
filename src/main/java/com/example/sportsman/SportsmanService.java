package com.example.sportsman;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface SportsmanService {

    @WebMethod
    Sportsman getSportsmanById(int id);

    @WebMethod
    List<Sportsman> getAllSportsmen();

    // Новый метод для получения упражнений конкретного спортсмена
    @WebMethod
    List<Exercise> getExercisesBySportsmanId(int sportsmanId);
}
