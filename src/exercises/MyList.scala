package exercises

abstract class MyList[+A] {
  /*
  * singly linked list that holds integers
  *  --> head: first element of list
  *  --> tail: remainder of the list
  *  --> isEmpty: function; boolean; is list empty?
  *  --> addInt(int): returns new list with int added
  *  --> toString: override, returns string representation
  * */
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A] (element: A): MyList[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"

  trait MyPredicate[T] {
  }
  trait MyTransformer[A, B] {

  }

  def map: MyList = new MyList
  def filter: myList = new MyList[] {}
  def flatMap: myList = new MyList[B]
}

//object Empty extends MyList {
//  def head: Int = throw new NoSuchElementException
//  def tail: MyList = throw new NoSuchElementException
//  def isEmpty: Boolean = true
//  def add(element: Int) = new Cons(element, Empty)
//}

abstract class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
  def head: A = h
  def tail: MyList[A]= t
  def isEmpty: Boolean = false
  def add[B >:A](element: B): MyList[B] = new Cons(element, this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

