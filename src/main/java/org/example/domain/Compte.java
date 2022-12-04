package org.example.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.TypeCompte;


import java.util.Date;
import java.util.Random;

@Setter
@Getter
@NoArgsConstructor
public class Compte {

    private int code;
    private double solde;
    private Date creationDate;
    private TypeCompte type;

    public Compte(int code, double solde, Date creationDate, TypeCompte type) {
        this.code = code;
        this.solde = solde;
        this.creationDate = creationDate;
        this.type = type;
    }

    public static Compte getInstance() {
        Compte compte = new Compte();

        compte.code = (int) (Math.random() * 10);
        compte.creationDate = new Date();
        compte.type = TypeCompte.TYPE2;
        compte.solde = Math.random() * 1000;

        return compte;
    }
}
