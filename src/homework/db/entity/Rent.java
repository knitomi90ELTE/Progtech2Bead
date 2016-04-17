
package homework.db.entity;


public class Rent extends PersistentEntity{
private Integer user_ID;
private Integer movie_ID;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.user_ID != null ? this.user_ID.hashCode() : 0);
        hash = 59 * hash + (this.movie_ID != null ? this.movie_ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rent other = (Rent) obj;
        if (this.user_ID != other.user_ID && (this.user_ID == null || !this.user_ID.equals(other.user_ID))) {
            return false;
        }
        if (this.movie_ID != other.movie_ID && (this.movie_ID == null || !this.movie_ID.equals(other.movie_ID))) {
            return false;
        }
        return true;
    }

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public Integer getMovie_ID() {
        return movie_ID;
    }

    public void setMovie_ID(Integer movie_ID) {
        this.movie_ID = movie_ID;
    }

    @Override
    public Object get(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return user_ID;
            case 1:
                return movie_ID;
            default:
                return null;
        }
    }

    @Override
    public void set(int columnIndex, Object value) {
        switch (columnIndex) {
            case 0:
                setUser_ID((Integer) value);
                break;
            case 1:
                setMovie_ID((Integer) value);
                break;
        }
    }
    
}
