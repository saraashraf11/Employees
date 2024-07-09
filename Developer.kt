class Developer(val Dname:String, val Daddress:String, val Dsalary:Double, val DjobTitle:String) : Employees() {
    override fun calculateBonus():Double {
        return ( Dsalary * 0.5 )
    }
    fun print(){
        println("Name: "+ Dname)
        println("Address: "+ Daddress)
        println("Salary: "+ Dsalary)
        println("Job Title: "+ DjobTitle)
    }
}