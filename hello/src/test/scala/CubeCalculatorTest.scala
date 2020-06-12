import org.scalatest.FlatSpec

class ExampleSpec extends FlatSpec {

  "Testing CubeCalculator" should "Test One" in
    {
      CubeCalculator.cube(3)
    }

}

/*class ExampleSpec extends FunSpec {

  describe("Testing CubeCalculator") {

    it("Test One")
    {
      CubeCalculator.cube(3)
    }
  }
}
*/

/*class CubeCalculatorTest extends org.scalatest.FunSuite {
    test("CubeCalculator.cube") {
      assert(CubeCalculator.cube(3) === 27)
    }
  }*/
