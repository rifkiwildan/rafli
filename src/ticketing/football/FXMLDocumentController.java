/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.football;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Wiwik Andarwati
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField nama;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private JFXButton login;
    @FXML
    private JFXButton singup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) throws IOException {
          // deklarasi
        Connection con;
        Statement stat;
        ResultSet rs;
        String sql;

        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = (Statement) DB.stm;
        
        if(nama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tulisan Username Anda");
        }
        else if(pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tulisan Password Anda");
        }
        else{
        try {
            sql = "SELECT * FROM admin WHERE username='"+nama.getText()+"' AND password='"+pass.getText()+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if(nama.getText().equals(rs.getString("username")) && pass.getText().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    // Hide this current window (if this is what you want)
                     ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("pilihan liga.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 525, 390);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("Data Catcher");
                    stage.show();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Username Atau Password Salah");
                }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }
    @FXML
    private void singup(ActionEvent event) {
    }
    
}
