import scala.io.Source

if(args.length>0){
 for(line<- Source.fromFile(args(0)).getLines)
  print(line.length+" "+ line)
}
else
 Console.err.println("enter fileName")
