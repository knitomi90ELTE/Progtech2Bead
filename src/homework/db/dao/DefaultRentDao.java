package homework.db.dao;

import homework.db.entity.Rent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DefaultRentDao extends DefaultDao<Rent>{
private static final String FIND_ALL_RENTALS_SQL = "SELECT * FROM RENTS";
private static final String FIND_RENTALS_BY_ID_SQL = "SELECT * FROM RENTS WHERE ID = ?";
private static final String INSERT_RENTALS_SQL = "INSERT INTO RENTS(USER_ID,MOVIE_ID ) VALUES(?,?)";
private static final String DELETE_RENTALS_SQL = "DELETE FROM RENTS WHERE ID = ?";

    public DefaultRentDao() {
    }
    
    public static DefaultRentDao getInstance() {
        return DefaultRentDaoHolder.INSTANCE;
    }
    
    @Override
    protected Rent fromResultSet(ResultSet resultSet) throws SQLException {
       Rent rent = new Rent();
       rent.setId(resultSet.getInt("ID"));
       rent.setUser_ID(resultSet.getInt("USER_ID"));
       rent.setMovie_ID(resultSet.getInt("MOVIE_ID"));
       return rent;
    }

    @Override
    protected Statement fromEntity(String query, Rent entity, boolean withId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, entity.getUser_ID());
        statement.setInt(2, entity.getMovie_ID());
        if (withId) {
            statement.setInt(3, entity.getId());
        }
        return statement;
    }
    
    @Override
    protected String getFindAllSql() {
        return FIND_ALL_RENTALS_SQL;
    }

    @Override
    protected String getFindByIdSql() {
        return FIND_RENTALS_BY_ID_SQL;
    }

    @Override
    protected String getInsertSql() {
        return INSERT_RENTALS_SQL;
    }

    @Override
    protected String getDeleteSql() {
        return DELETE_RENTALS_SQL;
    }

    private static class DefaultRentDaoHolder {
        private static final DefaultRentDao INSTANCE = new DefaultRentDao();
    }
    
}
