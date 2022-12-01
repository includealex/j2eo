package org.polystat.j2eo.eotree

class EOTry(var bnds: List<EOBnd>) : EONode() {
    var tryline = "try > @\n\t[]\n" // what should I do with indents???
    override fun generateEO(indent: Int): String =
        "${bnds.joinToString(tryline) { bnd: EOBnd -> bnd.generateEO(indent) }}"
}
