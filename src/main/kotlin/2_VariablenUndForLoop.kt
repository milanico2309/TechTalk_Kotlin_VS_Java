 fun main() {

     //Department nicht initialisiert
     val bob = Employee("Bob Fizz", 1)
     println(bob.name + " Dep.: " + bob.dep?.name)

     //Employee ist null
     val jack: Employee? = null
     println(jack?.name + " Dep.: " + jack?.dep?.name)

     //Department ist null, write trotzdem möglich
     var james = Employee("James Buzz", 2)
     james.dep?.name = "IT"
     println(james.name + " Dep.: " + james.dep?.name)

     //Alles Vorhanden
     james = Employee("James Buzz", 2, Department("IT", 1))
     println(james.name + " Dep.: " + james.dep?.name)
 }

//Employee Klasse
class Employee(val name: String, val id: Int) {
    var dep:Department? = null
    constructor(name: String, id: Int, dep: Department) : this(name, id) {
        this.dep = dep
    }

}
//Department Klasse
data class Department(var name: String, val id: Int)
