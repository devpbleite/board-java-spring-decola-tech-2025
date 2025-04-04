package pbleite.dev.board.service;

import lombok.AllArgsConstructor;
import pbleite.dev.board.persistence.dao.BoardColumnDAO;
import pbleite.dev.board.persistence.entity.BoardColumnEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnQueryService {

  private final Connection connection;

  public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
    var dao = new BoardColumnDAO(connection);
    return dao.findById(id);
  }

}