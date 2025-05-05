using System;
using System.Collections.Generic;
using System.Linq;

public class EntityBase
{
    public int Id { get; set; }
    private static List<EntityBase> database = new List<EntityBase>();

    // Common CRUD methods for all entities
    public void Create()
    {
        database.Add(this);
        Console.WriteLine($"Entity {Id} created.");
    }

    public EntityBase Read(int id)
    {
        return database.FirstOrDefault(e => e.Id == id);
    }

    public void Delete()
    {
        database.RemoveAll(e => e.Id == Id);
        Console.WriteLine($"Entity {Id} deleted.");
    }

    // A method that only exists in EntityBase
    public void LogEntity()
    {
        Console.WriteLine($"[LOG] Entity {Id} exists in the system.");
    }
}