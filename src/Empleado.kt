
abstract class Empleado {
    abstract val nombre: String
    abstract val id: String

    abstract fun calcularSalario(): Double

    override fun toString(): String {
        return "$nombre con ID-$id"
    }
}
