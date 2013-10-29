import scala.collection.mutable.Map
class Checker{
 var sum=0
 def add(b:Byte):Unit={
sum+=b
}
 def checksum():Int={
return ~(sum&0xFF)+1
}
}

object Checker{
 private val cache=Map[String,Int]()
 def calculate(s:String):Int=
  if (cache.contains(s))
   cache(s)
  else{
   val acc=new Checker
   for(c <- s)
	acc.add(c.toByte)
	val cs=acc.checksum()
	cache+=(s->cs)
	cs
    }
}
