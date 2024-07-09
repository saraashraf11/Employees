class Manager(val Mname:String, val Maddress:String, val Msalary:Double, val MjobTitle:String) : Employees() {
    override fun calculateBonus():Double {
        return ( Msalary * 0.5 )
    }
    fun print(){
        println("Name: " + Mname)
        println("Address: " + Maddress)
        println("Salary: " + Msalary)
        println("Job Title: " + MjobTitle)
    }
}