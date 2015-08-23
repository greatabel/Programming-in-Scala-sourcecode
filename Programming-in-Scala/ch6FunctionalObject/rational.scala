class Rational(n:Int,d:Int){
require(d!=0)
private val g=gcd(n.abs,d.abs)

//println("Created"+n+"/"+d)


var numer:Int=n/g
var denom:Int=d/g
def this(n:Int)=this(n,1)
override def toString = n+"/"+d
println("Created:"+numer+"/"+denom)

def add(that:Rational):Rational=
 new Rational(
 numer*that.denom+that.numer*denom, denom*that.denom
 )

def add(i:Int):Rational=
 new Rational(
 numer+i*denom, denom
 )
def +(that:Rational):Rational=
 new Rational(
 numer*that.denom+that.numer*denom, denom*that.denom
 )
def *(that:Rational):Rational=
 new Rational(
 numer*that.numer, denom*that.denom
 )
def *(i:Int):Rational=
new Rational(numer*i,denom)
private def gcd(a:Int,b:Int):Int =
 if(b==0) a else gcd(b,a%b) 

}

var x=new Rational(1,2)
var y=new Rational(1,3)
var z=x add y
var i=new Rational(3)

var a=new Rational(10,100)
println("a="+a)
var b=new Rational(20,200)
var c=a.add(b)
print("c="+c)
print("x="+x)
c=c+x
print("c+x="+c)
c=c*(new Rational(2,7))
c=c.add(1)
c=c*2
println("c*2="+c)
implicit def intToRational(x:Int)=new Rational(x)
2*c

