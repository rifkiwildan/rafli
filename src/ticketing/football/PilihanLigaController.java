/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.football;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Wiwik Andarwati
 */
public class PilihanLigaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inggris(ActionEvent event) {
                 try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("liga spanyol.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Ticketing Football");
            stage.show();
            } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            }
    }

    @FXML
    private void indonesia(ActionEvent event) {
                 try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home tiket.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Ticketing Football");
            stage.show();
            } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            }
    }

    @FXML
    private void spanyol(ActionEvent event) {
                 try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("liga inggris.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Ticketing Football");
            stage.show();
            } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            }
    }

}
