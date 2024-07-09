class Programmer(val Pname:String, val Paddress:String, val Psalary:Double, val PjobTitle:String) : Employees() {
    override fun calculateBonus():Double {
        return ( Psalary * 0.5 )
    }
    fun print(){
        println("Name: "+ Pname)
        println("Address: "+ Paddress)
        println("Salary: "+ Psalary)
        println("Job Title: "+ PjobTitle)
    }
}