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
public class LigaInggrisController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fcbvsrm(ActionEvent event) {
                 try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("br rm.fxml"));
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
    private void atmvssev(ActionEvent event) {
                  try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("atm vs svl.fxml"));
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
    private void back(ActionEvent event) {
         try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("pilihan liga.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
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
