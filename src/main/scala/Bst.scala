case class Bst[T](value: T, left: Option[Bst[T]], right: Option[Bst[T]]):

   def insert(t: T): Bst[T] = ???
   def toList: List[T] = ???

object Bst:
   def apply[T](v: T): Bst[T] = Bst(v, None, None)
   def fromList[T](l: List[T]): Bst[T] = ???
   def toList[T](bst: Bst[T]): List[T] = bst.toList
