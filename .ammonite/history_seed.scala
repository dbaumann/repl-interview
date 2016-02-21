TestContext("P18 (**) Extract a slice from a list.") {
  // http://aperiodic.net/phil/scala/s-99/p18.scala

  val input = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  
  def slice[A](start: Int, end: Int, ls: List[A]): List[A] = {
    ???
  }

  val result = slice(3, 7, input)
  val expected = List('d, 'e, 'f, 'g)

  assert(result == expected)
}

// %separator%

TestContext("P19 (**) Rotate a list N places to the left.") {
  // http://aperiodic.net/phil/scala/s-99/p19.scala

  val input = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  
  def rotate[A](n: Int, ls: List[A]): List[A] = {
    ???
  }

  val result = rotate(3, input)
  val expected = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

  assert(result == expected)
}
