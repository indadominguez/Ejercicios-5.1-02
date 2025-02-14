
class EmpleadoPorHora(
    override val nombre: String,
    override val id: String,
    var horasTrabajadas: Double,
    var tarifaPorHora: Double
) : Empleado() {
    init {
        require(horasTrabajadas >= 0) { "Las horas trabajadas deben ser un valor positivo." }
        require(tarifaPorHora >= 0) { "La tarifa por hora debe ser un valor positivo." }
    }

    override fun calcularSalario(): Double {
        return tarifaPorHora * horasTrabajadas
    }
}
