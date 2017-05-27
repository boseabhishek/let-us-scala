# Functors and Monads

Many collection and other container types have a map method that behaves this way. Any parametrised type that does have a map method like this is known as a Functor. Again, the name is due to category theory, but that doesn’t matter for this post. From a Scala-programmer perspective, a functor can be thought of as a trait, in pseudo-code as

trait F[T] {
  def map(f: T => S): F[S]
}
with F representing the functor.

Recalling that a functor is a parameterised type with a map method, we can now say that a monad is just a functor which also has a flatMap method. We can write this in pseudo-code as

trait M[T] {
  def map(f: T => S): M[S]
  def flatMap(f: T => M[S]): M[S]
}
Not all functors can have a flattening operation, 
   # so not all functors are monads, but all monads are functors. 

Monads are therefore more powerful than functors. Of course, more power is not always good. The principle of least power is one of the main principles of functional programming, but monads are useful for sequencing dependent computations, as illustrated by for-comprehensions.

Collections supporting map and flatMap are referred to as monadic. Most Scala collections are monadic, and operating on them using map and flatMap operations, or using for-comprehensions is referred to as monadic-style. People will often refer to the monadic nature of a collection (or other container) using the word monad, eg. the “List monad”.

So far the functors and monads we have been working with have been collections, but not all monads are collections, and in fact collections are in some ways atypical examples of monads. Many monads are containers or wrappers, so it will be useful to see examples of monads which are not collections.

# presence of map , flatMap , and withFilter makes monad

Monad examples: Option and Future, list
