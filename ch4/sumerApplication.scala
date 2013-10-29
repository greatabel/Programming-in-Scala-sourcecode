import Checker.calculate
object FourSeason extends App{
 for(season <- List("fall","winter","spring","summer"))
  println(season+":"+calculate(season))
}
