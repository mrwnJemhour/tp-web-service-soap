package org.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.domain.Compte;

import java.util.List;

@WebService(serviceName = "BanqueService")
public class BanqueService {

    @WebMethod(operationName = "convertionEuroToDh")
    public double convertion(@WebParam(name = "montant") double mt) {
        return mt * 10;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte() {
        return Compte.getInstance();
    }

    @WebMethod(operationName = "getListOfAccounts")
    public List<Compte> getComptes() {
        return List.of(
                Compte.getInstance(),
                Compte.getInstance(),
                Compte.getInstance()
        );
    }
}
