
class Departamento {
    private val listaEmpleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        listaEmpleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        var salarioTotal = 0.0
        for (empleado in listaEmpleados) {
            salarioTotal += empleado.calcularSalario()
        }
        return salarioTotal
    }

    fun mostrarSalarios() {
        listaEmpleados.forEach {
            println("${it.toString()} tiene un salario de %.2f al mes.".format(it.calcularSalario()))
        }
    }
}
