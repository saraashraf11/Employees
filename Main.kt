/*
     Sara Ashraf
 */

fun main() {
   val obj1 = Manager("sara","fayoum",100.2,"manager")
   val obj2 = Developer("menna","egypt",200.5,"developer")
   val obj3 = Programmer("shahd","Alex",300.5,"Programmer" )

   //Print Manager Details
   obj1.print()
   println("Bonus for manager is "+ obj1.calculateBonus())

   //Print Developer Details
   obj2.print()
   println("Bonus for developer is "+ obj2.calculateBonus())

   //Print Programmer Details
   obj3.print()
   println("Bonus for programmer is "+ obj3.calculateBonus())
}