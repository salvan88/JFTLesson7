package gerzen777gmail.com.library.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public List<Book> books;

    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
