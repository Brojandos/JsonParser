import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by Brojandos on 20.04.2017.
 */
public class BaseEntity implements Serializable {
    @Expose
    private long id;
    @Expose
    private String name;

    public BaseEntity() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
