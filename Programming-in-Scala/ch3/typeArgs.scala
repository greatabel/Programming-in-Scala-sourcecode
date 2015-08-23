val big=new java.math.BigInteger("123")
val greetStrings=new Array[String](5)

greetStrings(0)="hello"
greetStrings(1)=", "
greetStrings(2)="world!\n"
greetStrings(3)="new world "
for(i<-0 to 3)
 print(greetStrings(i))

println("another way to do it")
val g=new Array[String](5)
g.update(0,"Hello")
g.update(1,", ")
g.update(2,"world\n")
g.update(3," scala!\n")
for(i<- 0.to(3))
 print(g.apply(i))

println("numbers")
val numbers=Array("zero","one","two")
for(i<- 0.to(2))
 print(numbers.apply(i)+" ")

val numbers1=Array.apply("1","2","3","4")
for(i<- 0.to(3))
 print(numbers1(i)+" ")







