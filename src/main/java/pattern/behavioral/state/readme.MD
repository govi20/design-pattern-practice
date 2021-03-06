The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

* With the State Pattern, we have a set of behaviors encapsulated in state objects; at any time the context is delegating to one of those states. Over time, the current state changes across the set of state objects to reflect the internal state of the context, so the context’s behavior changes over time as well. The client usually knows very little, if anything, about the state objects.

* With Strategy, the client usually specifies the strategy object that the context is composed with. Now, while the pattern provides the flexibility to change the strategy object at runtime, often there is a strategy object that is most appropriate for a context object. For instance, in Chapter 1, some of our ducks were configured to fly with typical flying behavior (like mallard ducks), while others were configured with a fly behavior that kept them grounded (like rubber ducks and decoy ducks).

* In general, think of the Strategy Pattern as a flexible alternative to subclassing; if you use inheritance to define the behavior of a class, then you’re stuck with that behavior even if you need to change it. With Strategy you can change the behavior by composing with a different object.

* Think of the State Pattern as an alternative to putting lots of conditionals in your context; by encapsulating the behaviors within state objects, you can simply change the state object in context to change its behavior.

<b>Steps to implement State Pattern</b>

① First, gather up your states:

<img src="https://learning.oreilly.com/library/view/head-first-design/0596007124/figs/web/396fig01.png.jpg" />



② Next, create an instance variable to hold the current state, and define values for each of the states.

③ Now we gather up all the actions that can happen in the system, and the state transitions

<img src="https://learning.oreilly.com/library/view/head-first-design/0596007124/figs/web/394fig02.png.jpg" />
