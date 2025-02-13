class Departamento(nombre: String) {

    var listaEmpleado = mutableListOf<Empleado>()

    constructor(nombre: String, listaEmpleado: MutableList<Empleado>): this(nombre) {

        this.listaEmpleado = listaEmpleado
    }

    fun agreagarEmpleado(empleado: EmpleadoPorHora){
        listaEmpleado.add(empleado)
    }


    fun calculaSalarioTotal(): Double{
        var salarioTotal = 0.0

        for(empleado in listaEmpleado){

            salarioTotal += empleado.calcularSalario()
        }

        return salarioTotal
    }

}