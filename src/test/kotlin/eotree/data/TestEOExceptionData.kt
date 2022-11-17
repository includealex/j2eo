package eotree

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOComment
import org.polystat.j2eo.eotree.data.EOExceptionData

/*
  EO exceptions data tests
*/
class TestEOExceptionData {
  @Test
  fun testGenerateEOZeroIndent() {
    val exc = EOExceptionData("Stack overflow")
    Assertions.assertEquals(exc.generateEO(0), "Stack overflow")
  }

  @Test
  fun testGenerateEONonZeroIndent() {
    val exc = EOExceptionData("Some exception")
    Assertions.assertEquals(exc.generateEO(1), "  Some exception")
  }
}