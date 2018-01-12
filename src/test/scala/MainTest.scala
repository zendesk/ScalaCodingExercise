import org.scalatest.{FunSuite, Matchers}

class MainTest extends FunSuite with Matchers {

  test("helloWorld should return Hello World") {
    Main.helloWorld shouldBe "Hello World"
  }
}
