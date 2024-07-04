import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class UserManager {
    protected List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null; // Kullanıcı bulunamadı
    }

    public void removeUser(String id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public List<User> getAllUsers() {
        return users;
    }


        }
