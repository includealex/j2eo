package org.polystat.j2eo.eotree

abstract class EOCatch(var bnds: List<EOBnd>) : EONode() {
    override fun generateEO(indent: Int): String =
        "${bnds.joinToString("\n\t") { bnd: EOBnd -> bnd.generateEO(indent) }}"
}
