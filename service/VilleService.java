package fr.diginamic.springdemo.service;

// VilleService.java
import fr.diginamic.springdemo.Ville;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VilleService {

    private final List<Ville> listeVilles = new ArrayList<>(Arrays.asList());

    public List<Ville> getListeVilles() {
        return listeVilles;
    }

    public void ajouterVille(Ville nouvelleVille) {
        listeVilles.add(nouvelleVille);
    }

    public boolean villeExisteDeja(String nomVille) {
        return listeVilles.stream().anyMatch(ville -> ville.getNom().equals(nomVille));
    }
}
