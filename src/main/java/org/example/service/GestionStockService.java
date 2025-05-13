package org.example.service;

import org.example.model.Produit;

import java.util.ArrayList;
import java.util.List;

public class GestionStockService {

    private List<Produit> produits;

    public GestionStockService() {
        this.produits = new ArrayList<>();
    }

    // Ajouter un produit
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Supprimer un produit par ID
    public boolean supprimerProduitParId(int id) {
        return produits.removeIf(p -> p.getId() == id);
    }

    // Mettre à jour un produit existant (par ID)
    public boolean mettreAJourProduit(Produit produit) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getId() == produit.getId()) {
                produits.set(i, produit);
                return true;
            }
        }
        return false;
    }

    // Afficher tous les produits
    public void afficherProduits() {
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }

    // Rechercher un produit par nom
    public Produit rechercherParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        return null;
    }

    // Rechercher un produit par ID
    public Produit rechercherParId(int id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    // Optionnel : Getter pour la liste
    public List<Produit> getProduits() {
        return produits;
    }

}
