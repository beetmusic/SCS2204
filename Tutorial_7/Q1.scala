object Q1 extends App{

	var x=new Rational(3,4)
	var y = x.neg()
	
	println(y)
	
	class Rational(n:Int,d:Int){
		def numer = n
		def denom = d
		
		def neg() = new Rational(-this.numer,this.denom)
		
		
		override def toString = numer+"/"+denom
		
	}

}
