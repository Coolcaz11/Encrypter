/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newencryption;

/**
 *
 * @author hbhaa
 */

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EncryptController {
    @FXML
    private Button lg;

    @FXML
    void lggo(ActionEvent event) throws IOException {
        NewEncryption m = new NewEncryption();
        
        m.changeScene("ESS.fxml");
    }
}
