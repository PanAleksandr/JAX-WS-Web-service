package com.example.client;

import com.example.sportsman.SportsmanService;
import java.net.URL;

public class SportsmanServiceClient {
    public static void main(String[] args) {
        try {
            URL wsdlURL = new URL("http://localhost:8082/ws/sportsman?wsdl");
            SportsmanServiceImplService service = new SportsmanServiceImplService(wsdlURL);
            SportsmanService sportsmanService = service.getSportsmanServiceImplPort();

            //metodas getAllSportsmen
            System.out.println(sportsmanService.getAllSportsmen());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
