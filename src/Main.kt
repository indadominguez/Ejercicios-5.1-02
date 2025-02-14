

fun main() {

    val empleado1 = EmpleadoFijo("Indalecio", "0004", 22456.6, 4)
    val empleado2 = EmpleadoPorHora("Paula", "0002", 700.8, 6.00)
    val empleado3 = EmpleadoFijo("Rodrigo", "0003", 30000.00, 8)


    val ventas = Departamento()

    ventas.agregarEmpleado(empleado1)
    ventas.agregarEmpleado(empleado2)
    ventas.agregarEmpleado(empleado3)


    ventas.mostrarSalarios()
}

