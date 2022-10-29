package ua.lviv.lgs.shared;

import ua.lviv.lgs.domain.Product;

import java.sql.SQLException;
import java.util.List;

public interface AbstractDao <T> {
    List<Product> readAll() throws SQLException;
    T read(int id) throws SQLException;
    T create(T t) throws SQLException;
    T update(T t) throws Exception;
    void delete(T t) throws SQLException;
}
