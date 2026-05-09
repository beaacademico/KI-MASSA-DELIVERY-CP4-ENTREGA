package br.com.kimassa.dao;

import br.com.kimassa.model.Pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {

    public void salvarPedido(Pedido pedido) {

        String sql =
                "INSERT INTO pedido(id) VALUES (?)";

        try (Connection conn =
                     ConexaoBD.conectar();

             PreparedStatement stmt =
                     conn.prepareStatement(sql)) {

            stmt.setInt(1,
                    pedido.getId());

            stmt.executeUpdate();

            System.out.println(
                    "Pedido salvo!");

        } catch (SQLException e) {

            System.out.println(
                    "Erro: " + e.getMessage());
        }
    }
}