object Q2 extends App{

	var x=new Rational(3,4)
	var y=new Rational(5,8)
	var z=new Rational(2,7)
	
	println(x)
/*	def sub(var x,var y):Rational={
		
	}*/
	
	class Rational(n:Int,d:Int){
		def numer = n
		def denom = d
		
		override def toString = numer+"/"+denom
		
	}

}
