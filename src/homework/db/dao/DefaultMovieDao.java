package homework.db.dao;

import homework.db.entity.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DefaultMovieDao extends DefaultDao<Movie> {

    private static final String FIND_ALL_MOVIES_SQL = "SELECT * FROM MOVIES";
    private static final String FIND_MOVIES_BY_ID_SQL = "SELECT * FROM MOVIES WHERE ID = ?";
    private static final String INSERT_MOVIE_SQL = "INSERT INTO MOVIES(MOVIE_TITLE,MOVIE_DIRECTOR,"
            + "MOVIE_MAIN_CHARACTER,MOVIE_PRODUCTION_YEAR,"
            + "MOVIE_EXPIRE_DATE,MOVIE_IS_PIRATED,MOVIE_IS_RENTED ) VALUES(?,?,?,?,?,?,?)";
    private static final String DELETE_MOVIE_SQL = "DELETE FROM MOVIES WHERE ID = ?";

    private DefaultMovieDao() {
    }

    public static DefaultMovieDao getInstance() {
        return DefaultMovieDaoHolder.INSTANCE;
    }

    @Override
    protected Movie fromResultSet(ResultSet resultSet) throws SQLException {
        Movie movie = new Movie();
        movie.setId(resultSet.getInt("ID"));
        movie.setMovieTitle(resultSet.getString("MOVIE_TITLE"));
        movie.setMovieDirector(resultSet.getString("MOVIE_DIRECTOR"));
        movie.setMovieMainCharacter(resultSet.getString("MOVIE_MAIN_CHARACTER"));
        movie.setMovieProductionYear(resultSet.getInt("MOVIE_PRODUCTION_YEAR"));
        movie.setMovieExpirationDate(resultSet.getDate("MOVIE_EXPIRE_DATE"));
        movie.setIsPirated(resultSet.getBoolean("MOVIE_IS_PIRATED"));
        movie.setIsRented(resultSet.getBoolean("MOVIE_IS_RENTED"));
        return movie;
    }

    @Override
    protected Statement fromEntity(String query, Movie entity, boolean withId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, entity.getMovieTitle());
        statement.setString(2, entity.getMovieDirector());
        statement.setString(3, entity.getMovieMainCharacter());
        statement.setInt(4, entity.getMovieProductionYear());
        statement.setDate(5, entity.getMovieExpirationDate());
        statement.setBoolean(6, entity.isIsPirated());
        statement.setBoolean(7, entity.isIsRented());
        if (withId) {
            statement.setInt(8, entity.getId());
        }
        return statement;
    }

    @Override
    protected String getFindAllSql() {
        return FIND_ALL_MOVIES_SQL;
    }

    @Override
    protected String getFindByIdSql() {
        return FIND_MOVIES_BY_ID_SQL;
    }

    @Override
    protected String getInsertSql() {
        return INSERT_MOVIE_SQL;
    }

    @Override
    protected String getDeleteSql() {
        return DELETE_MOVIE_SQL;
    }

    private static class DefaultMovieDaoHolder {

        private static final DefaultMovieDao INSTANCE = new DefaultMovieDao();
    }
}
