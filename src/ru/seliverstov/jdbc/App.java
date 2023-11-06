package ru.seliverstov.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        initDataBase();
    }

    private static void initDataBase() throws SQLException {
        Connection connection = getConnection();

        //create users table
        Statement statement = connection.createStatement();
        String createUsersTable = """
            create table if not exists users (
            	id serial primary key,
            	full_name varchar ( 50 )
            );
            """;
        statement.execute(createUsersTable);
        connection.commit();

        //create book table
        String createBookTable = """
            create table if not exists book (
                id serial primary key,
                name varchar(50) not null,
                author varchar(50) not null
            );
            """;
        String addConstraintBookNameUnq = """
            alter table if exists book
            add constraint book_name_unq unique(name);
            """;
        statement.execute(createBookTable);
        statement.execute(addConstraintBookNameUnq);
        connection.commit();
    }

    private static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/library";
        String user = "postgres";
        String pass = "postgres";

        Connection connection = DriverManager.getConnection(url, user, pass);
        connection.setAutoCommit(false);
        return connection;
    }
}
