package org.polystat.j2eo.eotree

abstract class EOFinally(var bnds: List<EOBnd>) : EONode() {
    override fun generateEO(indent: Int): String =
        "${bnds.joinToString("\n[]\n\t") { bnd: EOBnd -> bnd.generateEO(indent) }}"
}
