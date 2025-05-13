package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
    private static final String URL = "jdbc:mysql://localhost/gestion_stock"; // Change le nom de la base
    private static final String UTILISATEUR = "root"; // Ton utilisateur MySQL
    private static final String MOT_DE_PASSE = "";    // Ton mot de passe MySQL


//    private static Connection connexion;
//
//    public static Connection getConnexion() {
//        if (connexion == null) {
//            try {
//                connexion = DriverManager.getConnection(URL, USER, PASSWORD);
//                System.out.println("✅ Connexion à la base de données réussie !");
//            } catch (SQLException e) {
//                System.out.println("❌ Erreur de connexion à la base de données : " + e.getMessage());
//            }
//        }
//        return connexion;
//    }
    public static Connection getConnection() {
        try {
            // Charger le driver (utile avec des versions plus anciennes de Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établir la connexion
            return  DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL non trouvé.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Échec de la connexion à la base de données.");
            e.printStackTrace();
        }
        return null;
    }
}
