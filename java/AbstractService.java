import entity.BaseEntity;
import java.util.ArrayList;
import java.util.List;

// Generic abstract class with default CRUD implementations
public abstract class AbstractService<T> {
    // A list to simulate the database
    private List<T> database = new ArrayList<>();

    public void create(T entity) {
        database.add(entity);
        System.out.println("Created: " + entity);
    }

    public T read(int id) {
        for (T entity : database) {
            if (((BaseEntity) entity).getId() == id) {
                return entity;
            }
        }
        System.out.println("Entity with ID " + id + " not found.");
        return null;
    }

    public void update(T entity) {
        for (int i = 0; i < database.size(); i++) {
            if (((BaseEntity) entity).getId() == ((BaseEntity) database.get(i)).getId()) {
                database.set(i, entity);
                System.out.println("Updated: " + entity);
                return;
            }
        }
        System.out.println("Entity not found to update.");
    }

    public void delete(int id) {
        database.removeIf(entity -> ((BaseEntity) entity).getId() == id);
        System.out.println("Deleted entity with ID " + id);
    }

    public List<T> getAll() {
        return database;
    }
}
