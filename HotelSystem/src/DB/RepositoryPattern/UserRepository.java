package DB.RepositoryPattern;

import model.User;

import java.util.ArrayList;

public abstract class UserRepository {
    public abstract ArrayList<User> getAll();
    public abstract User get(long id);
    public abstract User insert(User user);
    public abstract User update(User user);
    public abstract User remove(long id);

}
