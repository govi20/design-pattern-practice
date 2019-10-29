Classes should be open for extension, but closed for modification.

Our goal is to allow classes to be easily extended to incorporate new behavior without modifying existing code. What do we get if we accomplish this? Designs that are resilient to change and flexible enough to take on new functionality to meet changing requirements.


Question: Open for extension and closed for modification? That sounds very contradictory. How can a design be both?

Anwser: 
That’s a very good question. It certainly sounds contradictory at first. After all, the less modifiable something is, the harder it is to extend, right?
As it turns out, though, there are some clever OO techniques for allowing systems to be extended, even if we can’t change the underlying code. Think about the Observer Pattern (in Chapter 2)... by adding new Observers, we can extend the Subject at any time, without adding code to the Subject. 
You’ll see quite a few more ways of extending behavior with other OO design techniques.

Be careful when choosing the areas of code that need to be extended; applying the Open-Closed Principle EVERYWHERE is wasteful and unnecessary, and can lead to complex, hard-to-understand code.


Meet the Decorator Pattern
--------------------------

Why? 
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

- Decorators have the same supertype as the objects they decorate.
- You can use one or more decorators to wrap an object.
- Given that the decorator has the same supertype as the object it decorates, we can pass around a decorated object in place of the original (wrapped) object.
- The decorator adds its own behavior either before and/or after delegating to the object it decorates to do the rest of the job.

Real-World use case:
Java I/O => https://learning.oreilly.com/library/view/head-first-design/0596007124/figs/web/103fig01.png.jpg
    
            
