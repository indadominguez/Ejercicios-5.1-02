
class EmpleadoFijo(
    override val nombre: String,
    override val id: String,
    var salarioFijo: Double,
    var numPagas: Int
) : Empleado() {
    init {
        require(salarioFijo >= 0) { "El salario fijo debe ser un valor positivo." }
        require(numPagas > 0) { "El número de pagas debe ser mayor a 0." }
    }

    override fun calcularSalario(): Double {
        return salarioFijo / numPagas
    }
}
