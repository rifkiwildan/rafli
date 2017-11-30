/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.football;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
/**
 * FXML Controller class
 *
 * @author Wiwik Andarwati
 */
public class PembayaranController implements Initializable {

    @FXML
    private TextField rek;

    @FXML
    private TextField total;

    @FXML
    private Button selesai;

    @FXML
    private TextField nama;

    @FXML
    private TextArea ta;
    
     @FXML
    private RadioButton bni;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton mandiri;

    @FXML
    private RadioButton bri;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selesai(ActionEvent event) {
        if(nama.getText().equals("") || rek.getText().equals("") || total.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data Anda");
        }else{
            String ta11 = "";
            String Nama = nama.getText();
            int Rek = Integer.parseInt(rek.getText());
            int Ttl = Integer.parseInt(total.getText());
            
            if(bni.isSelected()){
                ta.setText("Nama : "+Nama+"\n Rekening :"+Rek+"\n Total : "+Ttl);
            }
            else if(mandiri.isSelected()){
            ta.setText("Nama : "+Nama+"\n Rekening :"+Rek+"\n Total : "+Ttl);
            }
            else if(bri.isSelected()){
            ta.setText("Nama : "+Nama+"\n Rekening :"+Rek+"\n Total : "+Ttl);
            }
            else{
                JOptionPane.showMessageDialog(null, "Harap Lengkapi Data Anda");
                ta11 = "";
                ta.setText(ta11);
              
            }
        }
        }
    }