The builder pattern, as name implies, is an alternative way to construct complex objects. This should be used only when you want to build different immutable objects using same object building process.

Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

* Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
* Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
* If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.


