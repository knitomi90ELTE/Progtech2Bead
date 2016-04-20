package homework.db.init;

import homework.db.dao.*;
import homework.db.entity.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DatabaseInitializer {

    private Connection connection;
    private Properties properties;

    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/demo";
    private static final String DELETE_MOVIES_TABLE_SQL = "DROP TABLE MOVIES";
    private static final String CREATE_MOVIES_TABLE_SQL = "CREATE TABLE MOVIES ("
            + " ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
            + " MOVIE_TITLE VARCHAR(50),"
            + " MOVIE_DIRECTOR VARCHAR(50),"
            + " MOVIE_MAIN_CHARACTER VARCHAR(50),"
            + " MOVIE_PRODUCTION_YEAR INTEGER,"
            + " MOVIE_EXPIRE_DATE DATE,"
            + " MOVIE_IS_PIRATED BOOLEAN,"
            + " MOVIE_IS_RENTED BOOLEAN"
            + ")";
    private static final String DELETE_USERS_TABLE_SQL = "DROP TABLE USERS";
    private static final String CREATE_USERS_TABLE_SQL = "CREATE TABLE USERS("
            + " ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
            + " USER_NAME VARCHAR(20)"
            + ")";
    private static final String DELETE_RENTS_TABLE_SQL = "DROP TABLE RENTS";
    private static final String CREATE_RENTS_TABLE_SQL = "CREATE TABLE RENTS("
            + " ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
            + " USER_ID INT CONSTRAINT FK_RENT_USER REFERENCES USERS ON DELETE CASCADE ON UPDATE RESTRICT,"
            + " MOVIE_ID INT CONSTRAINT FK_RENT_MOVIE REFERENCES MOVIES ON DELETE CASCADE ON UPDATE RESTRICT"
            + ")";

    private DatabaseInitializer() {
        properties = new Properties();
        properties.put("user", "Mira");
        properties.put("password", "macska");
    }

    public void init() {
        deleteTables();
        createTables();
        uploadMovieTable();
        uploadUserTable();
        uploadRentTable();
    }

    private void deleteTables() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, properties);
            Statement statement = connection.createStatement();
            statement.executeUpdate(DELETE_RENTS_TABLE_SQL);
            statement.executeUpdate(DELETE_MOVIES_TABLE_SQL);
            statement.executeUpdate(DELETE_USERS_TABLE_SQL);
            close(statement);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void createTables() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, properties);
            Statement statement = connection.createStatement();
            statement.addBatch(CREATE_MOVIES_TABLE_SQL);
            statement.addBatch(CREATE_USERS_TABLE_SQL);
            statement.addBatch(CREATE_RENTS_TABLE_SQL);
            statement.executeBatch();
            close(statement);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void uploadMovieTable() {
        List<Movie> movies = new ArrayList<>();
        movies.add(createMovie("The fog", "Mira", "Tamás", 1987, Date.valueOf("1980-01-02"), true, false));
        movies.add(createMovie("The guradian", "Petra", "Tamás", 1988, Date.valueOf("1981-04-30"), true, true));
        movies.add(createMovie("The frog", "Sára", "Tamás", 1989, Date.valueOf("1982-05-17"), true, false));
        movies.add(createMovie("The dog", "Gergo", "Tamás", 1990, Date.valueOf("1983-06-02"), true, true));

        for (Movie movie : movies) {
            DefaultMovieDao.getInstance().create(movie);
        }
    }

    private void uploadUserTable() {
        List<User> users = new ArrayList<>();
        users.add(createUser("Marci"));
        users.add(createUser("Tomi"));

        for (User user : users) {
            DefaultUserDao.getInstance().create(user);
        }
    }

    private void uploadRentTable() {
        List<Rent> rents = new ArrayList<>();
        rents.add(createRent(1, 2));
        rents.add(createRent(2, 4));

        for (Rent rent : rents) {
            DefaultRentDao.getInstance().create(rent);
        }
    }

    private void close(Statement statement) throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    private Movie createMovie(String title, String director, String mainCharacter, Integer prodYear, Date expDate, Boolean pirated, Boolean rented) {
        Movie movie = new Movie();
        movie.setMovieTitle(title);
        movie.setMovieDirector(director);
        movie.setMovieMainCharacter(mainCharacter);
        movie.setMovieProductionYear(prodYear);
        movie.setMovieExpirationDate(expDate);
        movie.setIsPirated(pirated);
        movie.setIsRented(rented);
        return movie;
    }

    private User createUser(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    private Rent createRent(Integer userID, Integer movieID) {
        Rent rent = new Rent();
        rent.setUser_ID(userID);
        rent.setMovie_ID(movieID);
        return rent;
    }

    public static DatabaseInitializer getInstance() {
        return DatabaseInitializerHolder.INSTANCE;
    }

    private static class DatabaseInitializerHolder {
        private static final DatabaseInitializer INSTANCE = new DatabaseInitializer();
    }
}
