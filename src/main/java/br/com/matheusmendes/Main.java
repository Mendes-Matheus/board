package br.com.matheusmendes;

import br.com.matheusmendes.persistence.migration.MigrationStrategy;
import br.com.matheusmendes.ui.MainMenu;

import java.sql.SQLException;

import static br.com.matheusmendes.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}