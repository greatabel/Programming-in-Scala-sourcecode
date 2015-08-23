class Sum{
 var sum=0
 def add(b:Byte):Unit={
sum+=b
}
 def checksum():Int={
return ~(sum&0xFF)+1
}
}


val acc=new Sum
val csa=new Sum
print( acc.sum)
acc.sum=5
acc.add(100)
println(acc.sum+"\n")
print(csa.sum) 
