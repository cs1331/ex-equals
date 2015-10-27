# ex-equals
Illustrates the need to override the equals method when using a class in a collection

This demonstration shows how certain methods in the Collections Framework behave differently depending on whether the equals() and hashCode() methods are properly overridden or not. Specifically, add(), contains(), and remove() are demonstrated.

To run the demo of correct behavior with equals() and hashCode() properly overridden, `java DemoWithEquals`

To run the demo of incorrect behavior when equals() and hashCode() are not overridden, `java DemoNoEquals`

 - NoEquals is a class with a value that does not override equals() or hashCode()
 - WithEquals is a subclass of NoEquals that properly overrides equals() and hashCode(), but behaves the same as NoEquals in all other respects
 - Demo is a generic demo implementation that can take either two NoEquals or two WithEquals (thus ensuring the demo performs the same steps in either scenario)
 - DemoWithEquals runs the demo code (in the Demo class) using two different WithEquals instances that have the same value, thus showing the proper behavior when equals() and hashCode() are correctly implemented
 - DemoNoEquals runs the demo code (in the Demo class) using two different NoEquals instances that have the same value, thus showing the incorrect behavior that results when equals() and hashCode() are not overriden and the default implementations in the Object class are used instead

