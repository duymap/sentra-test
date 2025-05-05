using System;
using System.Collections.Generic;
using System.Linq;

public class Person : EntityBase
{
    public string Name { get; set; }
    public int Age { get; set; }

    // A method that only exists in Person
    public void Greet()
    {
        Console.WriteLine($"Hello, my name is {Name} and I am {Age} years old.");
    }

    // Sealed method: Cannot be overridden by Employee
    public sealed void UpdateAge(int newAge)
    {
        this.Age = newAge;
        Console.WriteLine($"Person {Name} updated age to {Age}.");
    }
}