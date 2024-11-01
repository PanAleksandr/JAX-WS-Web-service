package com.example.publisher;

import com.example.sportsman.impl.SportsmanServiceImpl;
import javax.xml.ws.Endpoint;

public class SportsmanServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/ws/sportsman", new SportsmanServiceImpl());
        System.out.println("Web service is published at http://localhost:8082/ws/sportsman");
    }
}
