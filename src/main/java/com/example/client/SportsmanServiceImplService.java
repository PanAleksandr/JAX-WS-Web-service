package com.example.client;

import com.example.sportsman.SportsmanService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class SportsmanServiceImplService extends Service {

    private static final QName SERVICE_NAME = new QName("http://impl.sportsman.example.com/", "SportsmanServiceImplService");

    // konstruktoris, prieme URL for WSDL
    public SportsmanServiceImplService(URL wsdlURL) {
        super(wsdlURL, SERVICE_NAME);
    }

    // gauti porta
    public SportsmanService getSportsmanServiceImplPort() {
        return super.getPort(new QName("http://impl.sportsman.example.com/", "SportsmanServiceImplPort"), SportsmanService.class);
    }
}
