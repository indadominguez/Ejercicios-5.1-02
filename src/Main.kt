
fun Double.redondear(posDecimal: Int) : Double{

}

fun main(){

    val ventas = Departamento("Ventas")

    val empleado1 = EmpleadoFijo(2456.6, 4, "Indalecio","0004")
    val empleado2 = EmpleadoPorHora(1200.8, 6.00, "Paula","0002")
    val empleado3 = EmpleadoFijo(30000.00, 8, "Rodrigo","0003")

    ventas.agreagarEmpleado(empleado1)
    ventas.agreagarEmpleado(empleado2)
    ventas.agreagarEmpleado(empleado3)

    ventas.mostrarEmpleados()

}