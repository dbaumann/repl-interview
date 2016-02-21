# repl-interview

An easy to use tool for conducting productive code interviews. Built out of Li Haoyi's Ammonite and uTest.

## quick start
```
git clone https://github.com/dbaumann/repl-interview.git
./install
~/bin/amm
```

## how to use

If you haven't already, familiarize yourself with Ammonite:
http://lihaoyi.github.io/Ammonite/#Ammonite-Shell#ImprovedEditing

Next, start up an ammonite shell. All of the scala problems defined in `~/.ammonite/history_seed.scala` will be loaded into the ammonite history, so that you can quickly call them up.

`~/bin/amm`

```scala
Loading...
Welcome to the Ammonite Repl 0.5.4
(Scala 2.11.7 Java 1.7.0_79)
dan-dan@ P18
```
user types up arrow
```scala
Loading...
Welcome to the Ammonite Repl 0.5.4
(Scala 2.11.7 Java 1.7.0_79)
dan-dan@ TestContext("P18 (**) Extract a slice from a list.") {
           // http://aperiodic.net/phil/scala/s-99/p18.scala
         
           val input = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
           
           def slice[A](start: Int, end: Int, ls: List[A]): List[A] = {
             ???
           }
         
           val result = slice(3, 7, input)
           val expected = List('d, 'e, 'f, 'g)
         
           assert(result == expected)
         }
```
user interactively solves the problem
```scala
Loading...
Welcome to the Ammonite Repl 0.5.4
(Scala 2.11.7 Java 1.7.0_79)
dan-dan@ TestContext("P18 (**) Extract a slice from a list.") {
           // http://aperiodic.net/phil/scala/s-99/p18.scala
         
           val input = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
           
           def slice[A](start: Int, end: Int, ls: List[A]): List[A] = {
             ls
           }
         
           val result = slice(3, 7, input)
           val expected = List('d, 'e, 'f, 'g)
         
           assert(result == expected)
         }
res0: scala.util.Try[Any] = Failure(
  utest.AssertionError: assert(result == expected)
result: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
expected: List[Symbol] = List('d, 'e, 'f, 'g)
)
dan-dan@ TestContext("P18 (**) Extract a slice from a list.") {
           // http://aperiodic.net/phil/scala/s-99/p18.scala
         
           val input = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
           
           def slice[A](start: Int, end: Int, ls: List[A]): List[A] = {
             ls drop start take (end - (start max 0))
           }
         
           val result = slice(3, 7, input)
           val expected = List('d, 'e, 'f, 'g)
         
           assert(result == expected)
         }
res1: scala.util.Try[Any] = Success(())
dan-dan@ 
```
