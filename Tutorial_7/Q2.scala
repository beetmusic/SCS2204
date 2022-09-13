object Q2 extends App{

	var x=new Rational(3,4)
	var y=new Rational(5,8)
	var z=new Rational(2,7)
	
	var a = x-y-z         // (x.sub(y)).sub(z)
	
	println(a)
	
	class Rational(n:Int,d:Int){
		def numer = n
		def denom = d
		
		def -(r:Rational) = new Rational(this.numer*r.denom-r.numer*this.denom,this.denom*r.denom)
		
		
		override def toString = numer+"/"+denom
		
	}

}
