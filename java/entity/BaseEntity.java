package entity;

public abstract class BaseEntity {
  private int id;

  protected BaseEntity(int id) {
      this.id = id;
  }

  public int getId() {
      return id;
  }

  @Override
  public String toString() {
      return "ID: " + id;
  }
}
