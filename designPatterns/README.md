# Design Patterns
This repo is about various design patterns.

## Memento Pattern
It is used to implement an **undo mechanism**. The memento pattern is
a software design pattern that provides the ability to restore an
object to its previous state. The memento pattern is implemented
with three objects: the originator, a caretaker and a memento.
The originator is some object that has an internal state.

* Editor = Originator
* EditorState = Memento
* History = CareTaker

![Memento UML](./images/Memento_UML.png)
