package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.AtualizaDados;
import model.ExcluirUsuario;
import model.Usuario;

public class UsuarioController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;
    
    private Usuario usuarioAtual;
    
    public void recebeUsuario(Usuario usuario) {
    	this.usuarioAtual = usuario;
    	txtLogin.setText(usuario.getLogin());
    	txtNome.setText(usuario.getNome());
    	txtSenha.setText(usuario.getSenha());
    }
    
    
    @FXML
    void onClickAtualizar(ActionEvent event) throws SQLException {
    	//Capturar os novos dados do usuario
    	String novoNome = txtNome.getText();
    	String novoSenha = txtSenha.getText();
    	String novoLogin = txtLogin.getText();
    	
    	//Salvar o login antigo
    	String loginAntigo = usuarioAtual.getLogin();
    	
    	//Alterar os dados
    	usuarioAtual.setNome(novoNome);
    	usuarioAtual.setLogin(novoLogin);
    	usuarioAtual.setSenha(novoSenha);
    
    	
    	//Chamar a classe para salvar os dados
    	AtualizaDados dadosAtualizados = new AtualizaDados();
    	boolean sucesso = dadosAtualizados.AtualizarUsuario(usuarioAtual, loginAntigo);
    	
    	if (sucesso) {
    		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    		alerta.setTitle("Usuario atualizado");
    		alerta.setContentText("Usuario atualizado com sucesso");
    		alerta.showAndWait();
    	}
    	
    }

    @FXML
    void onClickExcluir(ActionEvent event) throws SQLException, IOException {
    	String loginAntigo = usuarioAtual.getLogin();
    	
    	ExcluirUsuario excluir = new ExcluirUsuario();
    	boolean sucesso = excluir.deletarUsuario(loginAntigo);
    	
    	if (sucesso) {
    		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    		alerta.setTitle("Usuario deletado");
    		alerta.setContentText("Usuario deletado com sucesso");
    		alerta.showAndWait();
    		AlterarTelaController.mudarTela(event, "/view/TelaHome.fxml", "login Home");
    	} 
    	
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
    	AlterarTelaController.mudarTela(event, "/view/TelaLogin.fxml", "Tela Login");
    }


}
