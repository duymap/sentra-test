using System;
using System.Collections.Generic;
using System.Linq;

public class Employee : Person
{
    public string Position { get; set; }
    public double Salary { get; set; }

    public void Promote(string newPosition, double newSalary)
    {
        this.Position = newPosition;
        this.Salary = newSalary;
        Console.WriteLine($"Employee {Name} promoted to {Position} with salary {Salary}.");
    }
}