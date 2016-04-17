
package homework.db.dao;

import homework.db.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DefaultUserDao  extends DefaultDao<User>{
private static final String FIND_ALL_USERS_SQL = "SELECT * FROM USERS";
private static final String FIND_USERS_BY_ID_SQL = "SELECT * FROM USERS WHERE ID = ?";
private static final String INSERT_USERS_SQL = "INSERT INTO USERS(USER_NAME ) VALUES(?)";
private static final String DELETE_USERS_SQL = "DELETE FROM USERS WHERE ID = ?";

    public DefaultUserDao() {
    }
    
    public static DefaultUserDao getInstance() {
        return DefaultUserDaoHolder.INSTANCE;
    }
    
    @Override
    protected User fromResultSet(ResultSet resultSet) throws SQLException {
       User user = new User();
       user.setId(resultSet.getInt("ID"));
       user.setName(resultSet.getString("USER_NAME"));
       return user;
    }

    @Override
    protected Statement fromEntity(String query, User entity, boolean withId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, entity.getName());
        if (withId) {
            statement.setInt(2, entity.getId());
        }
        return statement;
    }
    
    @Override
    protected String getFindAllSql() {
        return FIND_ALL_USERS_SQL;
    }

    @Override
    protected String getFindByIdSql() {
        return FIND_USERS_BY_ID_SQL;
    }

    @Override
    protected String getInsertSql() {
        return INSERT_USERS_SQL;
    }

    @Override
    protected String getDeleteSql() {
        return DELETE_USERS_SQL;
    }

    private static class DefaultUserDaoHolder {
        private static final DefaultUserDao INSTANCE = new DefaultUserDao();
    }
    
}
