val filesHere=(new java.io.File(".")).listFiles
for(file <- filesHere)
	println("file="+file)

for(i <- 1 to 4)
 println("iteration"+i)

for(i <- 1 until 4)
 println("iteration"+i)

for(i <- 0 to filesHere.length -1)
 println("file>"+filesHere(i))

def scalaFiles=
 for{
 file <- filesHere
 if file.getName.endsWith(".scala")
}yield file
for(i <- 0 to scalaFiles.length-1)
println(scalaFiles(i))
