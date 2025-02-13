class EmpleadoPorHora(var horasTrabajadas: Double, var tarifaPorHora: Double, nombre: String, id: String) : Empleado(nombre, id) {
    override fun calcularSalario(): Double {
        return (tarifaPorHora * horasTrabajadas)
    }
}