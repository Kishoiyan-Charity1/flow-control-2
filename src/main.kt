fun main() {
 oddNumbers()
 var y=peopleArrays(arrayOf("joann", "kennedy", "lucia", "anenabe"))
 println(y)
 robotServe( 2)
 robotServe( 10)
 robotServe( 22)
 newLine()



}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
 for (numb in 1..100){
  if (numb % 2 !=0){
   println(numb)
  }
 }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun peopleArrays(names:Array<String>):Int{
 var x=0
 names.forEach { names->
  if (names.length >5){
   x++
  }
 }
  return x

}
fun robotServe(age:Int){
 if (age <6) {
  println("serves milk")
 }
  else if (age>6 && age <15){
   println("serves fanta orange")

  }
  else {
      println("serves cocacola")
    }
 }

fun newLine(){
 for (numbers in 1..100){
  if (numbers % 3==0 && numbers% 5==0)
   println("FizzBuzz")
  else if (numbers %3==0)
   println("fizz")
  else if (numbers %5==0)
   println("buzz")
  else
   println(numbers)
 }

}

















