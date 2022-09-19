import scala.math._

object Q1{

	def main(args: Array[String]){
		val p1=Point(2,3)
		val p2=Point(5,6)
		
		println(p1)
		println (p2)

		//println(p1+p2)
		
		//println(p1.move(2,4))
												//println(distance(p1,p2))
		//println(p1.distance(p2))
		
		println(p1.invert())
	
	}
	
	case class Point(a:Int,b:Int){
	
		def x:Int = a
		def y:Int = b
		


		def +(p:Point) = Point(this.x+p.x,this.y+p.y)
		
		def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)
		
		//def distance(p1:Point,p2:Point) = sqrt(math.pow((p1.x-p2.x),2).toInt+math.pow((p1.y-p2.y),2).toInt)
		

		def distance(p1:Point) = sqrt(math.pow((p1.x-this.x),2).toInt+math.pow((p1.y-this.y),2).toInt)
		


		def invert() = Point(this.y,this.x)
		
		
	}
	


}
