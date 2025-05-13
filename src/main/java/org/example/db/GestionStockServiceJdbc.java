package org.example.db;

import org.example.model.Produit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestionStockServiceJdbc {

    // Méthode pour ajouter un produit dans la base
    public void ajouterProduit(Produit produit) {
        // Requête SQL avec des paramètres (?)
        String sql = "INSERT INTO produits (id, nom, quantite, prix) VALUES (?, ?, ?, ?)";

        // Obtenir une connexion à la base de données
        try (Connection connexion = ConnexionDB.getConnection();
             PreparedStatement statement = connexion.prepareStatement(sql)) {

            // Remplir les paramètres de la requête
            statement.setInt(1, produit.getId());
            statement.setString(2, produit.getNom());
            statement.setInt(3, produit.getQuantite());
            statement.setDouble(4, produit.getPrix());

            // Exécuter la requête
            int lignesAjoutees = statement.executeUpdate();

            if (lignesAjoutees > 0) {
                System.out.println("Produit ajouté avec succès !");
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du produit :");
            e.printStackTrace();
        }
    }
}

