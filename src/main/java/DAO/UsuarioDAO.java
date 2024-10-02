package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conex;

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conex = new ConexaoDAO().conectaDB();

        try {
            String sql = "select * from cliente where nome_usuario = ? and senha_usuario = ?";
            
            PreparedStatement pstm = conex.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return null;
        }

    }
}
