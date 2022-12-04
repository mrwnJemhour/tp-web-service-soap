package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.service.BanqueService;

import static org.example.constants.ConfigConsts.PATH;

public class Main {
    public static void main(String[] args) {

        Endpoint.publish(PATH, new BanqueService());
        System.out.println("WebService deployed successfully at : " + PATH);
    }
}