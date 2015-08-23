val oneTwoThree=List(1,2,3)
val fourFive=List(4,5)
val oneToFive=oneTwoThree:::fourFive

print(oneTwoThree+" and "+fourFive)
println("oneToFive->"+oneToFive)

val oneToThree=1::2::3::Nil
println(oneToThree)
println(0::oneToThree)
