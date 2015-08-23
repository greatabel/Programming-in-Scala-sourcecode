var firstArg = if(args.length>0) args(0) else ""
firstArg match{
case "salt" => println("peper")
case "chips"=> println("salsa")
case _=> println("??")
}
