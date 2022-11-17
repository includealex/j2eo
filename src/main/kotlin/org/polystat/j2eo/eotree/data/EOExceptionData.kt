package org.polystat.j2eo.eotree

/**
 * EBNF representation:
 * `
 * /"[^"]*"/
` *
 */

class EOExceptionData(var exception: String) : EONode() {
  override fun generateEO(indent: Int): String = 
    indent(indent) + "$exception"
  override fun toString(): String = 
    "$exception"
}