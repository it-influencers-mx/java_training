package com.accenture.chapter5.interfaces;

public class InterfaceInheritance {

}

//Ejemplo 1
interface HasTail {
	public int getTailLength();
}

interface HasWhiskers {
	public int getNumberOfWhiskers();
}

interface Seal extends HasTail, HasWhiskers {
}

//Ejemplo 2
abstract class HarborSeal implements HasTail, HasWhiskers {
}

class LeopardSeal implements HasTail, HasWhiskers { // DOES NOT COMPILE. Las clases concretas deben implementar todos
													// los métodos abstractos.
}

//Ejemplo 3
interface CanRun {}

class Cheetah extends CanRun {} // DOES NOT COMPILE

class Hyena {}

public interface HasFur extends Hyena {} // DOES NOT COMPILE
