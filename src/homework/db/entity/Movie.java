package homework.db.entity;

import java.sql.Date;
import java.util.Objects;


public class Movie extends PersistentEntity{
    
    private String movieTitle;
    private String movieDirector;
    private String movieMainCharacter;
    private Integer movieProductionYear;
    private Date movieExpirationDate;
    private Boolean isPirated;
    private Boolean isRented;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieMainCharacter() {
        return movieMainCharacter;
    }

    public void setMovieMainCharacter(String movieMainCharacter) {
        this.movieMainCharacter = movieMainCharacter;
    }

    public Integer getMovieProductionYear() {
        return movieProductionYear;
    }

    public void setMovieProductionYear(Integer movieProductionYear) {
        this.movieProductionYear = movieProductionYear;
    }

    public Date getMovieExpirationDate() {
        return movieExpirationDate;
    }

    public void setMovieExpirationDate(Date movieExpirationDate) {
        this.movieExpirationDate = movieExpirationDate;
    }

    public boolean isIsPirated() {
        return isPirated;
    }

    public void setIsPirated(Boolean isPirated) {
        this.isPirated = isPirated;
    }
    public boolean isIsRented() {
        return isPirated;
    }
    public void setIsRented(Boolean isRented){
        this.isRented = isRented;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.movieTitle);
        hash = 67 * hash + Objects.hashCode(this.movieDirector);
        hash = 67 * hash + Objects.hashCode(this.movieMainCharacter);
        hash = 67 * hash + Objects.hashCode(this.movieProductionYear);
        hash = 67 * hash + Objects.hashCode(this.movieExpirationDate);
        hash = 67 * hash + (this.isPirated ? 1 : 0);
        hash = 67 * hash + (this.isRented ? 1 : 0);
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
        final Movie other = (Movie) obj;
        if (this.isPirated != other.isPirated) {
            return false;
        }
        if (this.isRented != other.isRented) {
            return false;
        }
        if (!Objects.equals(this.movieTitle, other.movieTitle)) {
            return false;
        }
        if (!Objects.equals(this.movieDirector, other.movieDirector)) {
            return false;
        }
        if (!Objects.equals(this.movieMainCharacter, other.movieMainCharacter)) {
            return false;
        }
        if (!Objects.equals(this.movieProductionYear, other.movieProductionYear)) {
            return false;
        }
        if (!Objects.equals(this.movieExpirationDate, other.movieExpirationDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie{" + "movieTitle=" + movieTitle + ", movieDirector=" + movieDirector + ", movieMainCharacter=" + movieMainCharacter + ", movieProductionYear=" + movieProductionYear + ", movieExpirationDate=" + movieExpirationDate + ", isPirated=" + isPirated + '}';
    }
    
    @Override
    public Object get(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return movieTitle;
            case 1:
                return movieDirector;
            case 2:
                return movieMainCharacter;
            case 3:
                return movieProductionYear;    
            case 4:
                return movieExpirationDate;
            case 5:
                return isPirated;
            case 6:
                return isRented;
            default: 
                return null;
        }
    }

    @Override
    public void set(int columnIndex, Object value) {
        switch (columnIndex) {
            case 0:
                setMovieTitle((String) value);
                break;
            case 1:
                setMovieDirector((String) value);
                break;
            case 2:
                setMovieMainCharacter((String) value);
                break;
            case 3:
                setMovieProductionYear((Integer) value);
                break;
            case 4:
                setMovieExpirationDate((Date) value);
                break;
            case 5:
                setIsPirated((Boolean) value);
                break;
            case 6:
                setIsRented((Boolean) value);
                break;
        }
    }
    
}
