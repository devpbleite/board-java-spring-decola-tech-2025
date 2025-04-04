package pbleite.dev.board;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import pbleite.dev.board.persistence.migration.MigrationStrategy;
import pbleite.dev.board.ui.MainMenu;

import java.sql.SQLException;

import static pbleite.dev.board.persistence.config.ConnectionConfig.getConnection;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws SQLException {
		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}
		new MainMenu().execute();
	}

}
