trait Philosophical{
def philosophize() {
println("I consum memory")

}
}

trait HasLegs

class Animal

class Frog extends Animal with  Philosophical with HasLegs
{
 override def toString="green"
 override def philosophize(){
 println("It aren't easy being "+ toString + "!")
 }
}

val frog=new Frog
frog.philosophize()

val phil:Philosophical = frog
phil.philosophize()


