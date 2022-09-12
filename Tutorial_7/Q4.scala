object Q4{

	def main(args: Array[String]){
		
		var a = new Account(1001,15000.0)
		var b = new Account(1002,25000.0)
		var c = new Account(1010,-15000.0)
		var d = new Account(1015,65000.0)
		var e = new Account(1018,-38000.0)
		var f = new Account(1022,100000.0)
		
		
		var list:Array[Account] = Array(a,b,c,d,e,f)
		
		var admin =new Account(0,0.0)
		admin.neg(list)
		admin.sum(list)
		admin.intrest(list)
		

	}


	class Account(accNo:Int,bal:Double){
	
		var accountNo =accNo
		var balance = bal

		
		def neg(list:Array[Account])={
		
			var i = list(0)
			
			for(i <- list) {
				if(i.balance<0)
					println(i)
			} 
		
			
		}
		
		def sum(list:Array[Account])={
			
			var i = list(0)
			var total:Double=0;
			
			for(i <- list) {
				total=total+i.balance
			} 
			
			println("\nTotal -->  "+total)
		}
		
		
		def intrest(list:Array[Account])={
			
			var i = list(0)
			
			println("\n Intrest")
			for(i <- list) {
				var temp=i.balance
				var intr:Double=0
				if(temp<0)
					
					intr=temp*(0.05/100)
				else
					intr=temp*(0.1/100)
				
				i.balance=i.balance+intr	
				println(i)
			} 
			
		
		}
		
		
		override def toString = accountNo+"->  "+balance+" LKR"
		
		

	}




}
