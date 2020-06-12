package practices



 object TestMethod extends App{

   var i = addThenDouble(3,2)
   print(i)

   /*
   def addThenDouble(a: Int, b: Int): Int = {
     val sum = a + b
     val doubled = sum * 2
     doubled
   }
  */

    def addThenDouble(a: Int, b: Int) = (a + b) *2
 }

