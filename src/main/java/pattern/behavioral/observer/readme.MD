Meet the Observer Pattern
You know how newspaper or magazine subscriptions work:

① A newspaper publisher goes into business and begins publishing newspapers.

② You subscribe to a particular publisher, and every time there’s a new edition it gets delivered to you. As long as you remain a subscriber, you get new newspapers.

③ You unsubscribe when you don’t want papers anymore, and they stop being delivered.

④ While the publisher remains in business, people, hotels, airlines, and other businesses constantly subscribe and unsubscribe to the newspaper.

**Publishers + Subscribers = Observer Pattern**

- If you understand newspaper subscriptions, you pretty much understand the Observer Pattern, only we call the publisher the SUBJECT and the subscribers the OBSERVERS.

- The subject and observers define the one-to-many relationship. The observers are dependent on the subject such that when the subject’s state changes, the observers get notified. Depending on the style of notification, the observer may also be updated with new values.

**The power of Loose Coupling**

When two objects are loosely coupled, they can interact, but have very little knowledge of each other.

The Observer Pattern provides an object design where subjects and observers are loosely coupled.

Why?

The only thing the subject knows about an observer is that it implements a certain interface (the Observer interface). It doesn’t need to know the concrete class of the observer, what it does, or anything else about it.<br />

We can add new observers at any time. Because the only thing the subject depends on is a list of objects that implement the Observer interface, we can add new observers whenever we want. In fact, we can replace any observer at runtime with another observer and the subject will keep purring along. Likewise, we can remove observers at any time.<br />

We never need to modify the subject to add new types of observers. Let’s say we have a new concrete class come along that needs to be an observer. We don’t need to make any changes to the subject to accommodate the new class type; all we have to do is implement the Observer interface in the new class and register as an observer. The subject doesn’t care; it will deliver notifications to any object that implements the Observer interface.<br />

We can reuse subjects or observers independently of each other. If we have another use for a subject or an observer, we can easily reuse them because the two aren’t tightly coupled.

Changes to either the subject or an observer will not affect the other. Because the two are loosely coupled, we are free to make changes to either, as long as the objects still meet their obligations to implement the subject or observer interfaces.<br />

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.<br />


How Java’s built-in Observer Pattern works
The built-in Observer Pattern works a bit differently than the implementation that we used on the Weather Station. The most obvious difference is that WeatherData (our subject) now extends the Observable class and inherits the add, delete, and notify Observer methods (among a few others). Here’s how we use Java’s version:

For an Object to become an observer...

As usual, implement the Observer interface (this time the java.util.Observer interface) and call addObserver() on any Observable object. Likewise, to remove yourself as an observer, just call deleteObserver().

For the Observable to send notifications...

First of all you need to be Observable by extending the java.util.Observable superclass. From there it is a two-step process:

① You first must call the setChanged() method to signify that the state has changed in your object.

② Then, call one of two notifyObservers() methods:

- The setChanged() method is used to signify that the state has changed and that notifyObservers(), when it is called, should update its observers. If notifyObservers() is called without first calling setChanged(), the observers will NOT be notified.
The java.util.Observable has implemented its notifyObservers() method such that the Observers are notified in a different order than our own implementation. Who’s right? Neither; we just chose to implement things in different ways.

- Why is this necessary? The setChanged() method is meant to give you more flexibility in how you update observers by allowing you to optimize the notifications. For example, in our Weather Station, imagine if our measurements were so sensitive that the temperature readings were constantly fluctuating by a few tenths of a degree. That might cause the WeatherData object to send out notifications constantly.

The java.util.Observable has implemented its notifyObservers() method such that the Observers are notified in a different order than our own implementation. Who’s right? Neither; we just chose to implement things in different ways.

**The dark side of java.util.Observable**
Yes, good catch. As you’ve noticed, Observable is a class, not an interface, and worse, it doesn’t even implement an interface. Unfortunately, the java.util.Observable implementation has a number of problems that limit its usefulness and reuse. That’s not to say it doesn’t provide some utility, but there are some large potholes to watch out for.

**Real usecases in JDK**
- If you’re curious about the Observer Pattern in JavaBeans, check out the PropertyChangeListener interface.
- Let’s take a look at a simple part of the Swing API, the JButton. If you look under the hood at JButton’s superclass, AbstractButton, you’ll see that it has a lot of add/ remove listener methods. These methods allow you to add and remove observers, or, as they are called in Swing, listeners, to listen for various types of events that occur on the Swing component.
