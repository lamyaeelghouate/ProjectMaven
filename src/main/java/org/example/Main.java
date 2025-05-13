package org.example;

import org.example.db.GestionStockServiceJdbc;
import org.example.model.Produit;
import org.example.service.GestionStockService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        GestionStockService service = new GestionStockService();
//        Scanner scanner = new Scanner(System.in);
//        int choix;
//
//
//        do {
//            System.out.println("\n--- Menu de Gestion de Stock ---");
//            System.out.println("1. Ajouter un produit");
//            System.out.println("2. Supprimer un produit");
//            System.out.println("3. Mettre à jour un produit");
//            System.out.println("4. Afficher tous les produits");
//            System.out.println("5. Rechercher un produit");
//            System.out.println("6. Quitter");
//            System.out.print("Choix : ");
//            choix = scanner.nextInt();
//            scanner.nextLine(); // Consomme le retour à la ligne
//
//            switch (choix) {
//                case 1:
//                    System.out.print("ID : ");
//                    int id = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.print("Nom : ");
//                    String nom = scanner.nextLine();
//                    System.out.print("Quantité : ");
//                    int quantite = scanner.nextInt();
//                    System.out.print("Prix : ");
//                    double prix = scanner.nextDouble();
//                    Produit nouveauProduit = new Produit(id, nom, quantite, prix);
//                    service.ajouterProduit(nouveauProduit);
//                    System.out.println("Produit ajouté avec succès !");
//                    break;
//
//                case 2:
//                    System.out.print("ID du produit à supprimer : ");
//                    int idSupprimer = scanner.nextInt();
//                    boolean supprime = service.supprimerProduitParId(idSupprimer);
//                    if (supprime) {
//                        System.out.println("Produit supprimé.");
//                    } else {
//                        System.out.println("Produit non trouvé.");
//                    }
//                    break;
//
//                case 3:
//                    System.out.print("ID du produit à mettre à jour : ");
//                    int idMaj = scanner.nextInt();
//                    scanner.nextLine();
//                    Produit produitExistant = service.rechercherParId(idMaj);
//                    if (produitExistant != null) {
//                        System.out.print("Nouveau nom : ");
//                        String nouveauNom = scanner.nextLine();
//                        System.out.print("Nouvelle quantité : ");
//                        int nouvelleQuantite = scanner.nextInt();
//                        System.out.print("Nouveau prix : ");
//                        double nouveauPrix = scanner.nextDouble();
//                        Produit produitMisAJour = new Produit(idMaj, nouveauNom, nouvelleQuantite, nouveauPrix);
//                        service.mettreAJourProduit(produitMisAJour);
//                        System.out.println("Produit mis à jour.");
//                    } else {
//                        System.out.println("Produit non trouvé.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("--- Liste des produits ---");
//                    service.afficherProduits();
//                    break;
//
//                case 5:
//                    System.out.println("Rechercher par : 1. ID | 2. Nom");
//                    int critere = scanner.nextInt();
//                    scanner.nextLine();
//                    if (critere == 1) {
//                        System.out.print("Entrez l'ID : ");
//                        int idRecherche = scanner.nextInt();
//                        Produit p1 = service.rechercherParId(idRecherche);
//                        if (p1 != null) {
//                            System.out.println(p1);
//                        } else {
//                            System.out.println("Produit non trouvé.");
//                        }
//                    } else if (critere == 2) {
//                        System.out.print("Entrez le nom : ");
//                        String nomRecherche = scanner.nextLine();
//                        Produit p2 = service.rechercherParNom(nomRecherche);
//                        if (p2 != null) {
//                            System.out.println(p2);
//                        } else {
//                            System.out.println("Produit non trouvé.");
//                        }
//                    } else {
//                        System.out.println("Choix invalide.");
//                    }
//                    break;
//
//                case 6:
//                    System.out.println("Au revoir !");
//                    break;
//
//                default:
//                    System.out.println("Choix invalide, réessayez.");
//                    break;
//            }
//
//        } while (choix != 6);
//
//        scanner.close();

        Produit produit = new Produit(1, "Stylo", 100, 1.50);
        GestionStockServiceJdbc service = new GestionStockServiceJdbc();
        service.ajouterProduit(produit);

    }
}