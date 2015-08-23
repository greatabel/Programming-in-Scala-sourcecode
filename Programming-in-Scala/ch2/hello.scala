println("hello world, from a scala script")
println("hello,"+args(0)+" welocme to scala world")

var i=0
while(i< args.length){
	println(args(i))
	i+=1
}
println("length of args is:"+i)

i=0
while(i<args.length){
	if(i!=0)
	 print(" ")
	print(args(i))
	i+=1
}
println()

println("more function way do things")
args.foreach(arg=>println(arg))
