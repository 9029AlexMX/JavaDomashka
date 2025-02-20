package org.example;

import org.example.exception.DatabaseQueryException;
import org.example.util.ConnectionUtil;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save(User user) {
        String sqlRequest = "INSERT INTO users (email, phone, password) VALUES (?, ?, ?)";

        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlRequest,
                     Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getPassword());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows != 1) {
                throw new DatabaseQueryException("Excepted to add 1 row. But changed 0 rows are affected.");
            }
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                Long id = generatedKeys.getObject(1, Long.class);
                user.setId(id);
            }
        } catch (SQLException e) {
            throw new DatabaseQueryException("Can't save user "
                    + user.toString()
                    + ".", e);
        }
    }

    @Override
    public Optional<User> getById(Long id) {
        String sqlRequest = "SELECT id, email, phone FROM users WHERE id = ?";

        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlRequest)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return Optional.of(parseUserRow(resultSet));
            }
        } catch (SQLException e) {
            throw new DatabaseQueryException("Can't find user by id. ID=" + id, e);
        }
        return Optional.empty();
    }

    private User parseUserRow(ResultSet requestResult) {
        try {
            User user = new User();
            user.setId(requestResult.getObject("id", Long.class));
            user.setEmail(requestResult.getString("email"));
            user.setPhone(requestResult.getString("phone"));
            return user;
        } catch (SQLException e) {
            throw new DatabaseQueryException("Can't parse user "
                    + "data from resultSet", e);
        }
    }
}
