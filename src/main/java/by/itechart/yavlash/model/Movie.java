package by.itechart.yavlash.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String name;
    private String genre;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (obj == null || getClass() != obj.getClass()) {return false;}
        Movie aThat = (Movie) obj;

        if(getName() == null) {
            if(aThat.getName() != null){return false;}
        } else if(!getName().equals(aThat.getName())){return false;}

        if(getGenre() == null) {
            return aThat.getGenre() == null;
        } else return getGenre().equals(aThat.getGenre());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (getName() == null ? 0 : getName().hashCode());
        result = prime * result + (getGenre() == null ? 0 : getGenre().hashCode());
        return result;
    }
}