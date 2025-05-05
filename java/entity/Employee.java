package entity;

// Employee entity class
public class Employee extends BaseEntity {
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        super(id);
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{id=" + getId() + ", name='" + name + "', position='" + position + "'}";
    }
}
