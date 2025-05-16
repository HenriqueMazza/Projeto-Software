package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CadastroUsuario {

	public void cadastrarUsuario(Usuario usuario) throws SQLException {
		
		//Comando para inserir dados no banco
		
		String sql = "INSERT INTO usuarios (id, nome, login, senha) values (?,?,?,?)";
		
		//Preparando a consulta SQL
		Connection conn = ConexaoDB.conectar();
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		//Substituir as ? pelos dados do objeto usuario
		stmt.setInt(1, usuario.getId());
		stmt.setString(2, usuario.getNome());
		stmt.setString(3, usuario.getLogin());
		stmt.setString(4, usuario.getSenha());
		
		//Executar o comando SQL
		stmt.executeUpdate();
		
		//Encerro a consulta e a conexao com o banco de dados
		stmt.close();
		conn.close();
		
		//Criar uma janela caso o cadastro tenha sido feito
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Cadastro realizado com sucesso");
		alert.setHeaderText("Usuario cadastrado com sucesso");
		alert.setContentText("o novo usuario foi cadastrado com sucesso");
		alert.showAndWait();
	}
	
}
