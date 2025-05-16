package controller;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.CadastroUsuario;
import model.Usuario;

public class CadastroController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void onClick(ActionEvent event) throws SQLException {
    	
    	//Salvando as informações digitadas pelo usuario em uma variavel
    	int id = (int) (Math.random() * 100);
    	String login = this.txtLogin.getText();
    	String nome = this.txtNome.getText();
    	String senha = this.txtSenha.getText();
    	
    	//Instanciando as classes Úsuario e CadastrarUsuario
    	Usuario novoUsuario = new Usuario(id, nome, login, senha);
    	CadastroUsuario cadastrarUsuario = new CadastroUsuario();
    	
    	//Chamar o metodo que registra o usuario
    	cadastrarUsuario.cadastrarUsuario(novoUsuario);
    	
    }

    @FXML
    void onClickVoltar(ActionEvent event) {

    }

}
