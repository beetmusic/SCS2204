object Q3{

	def main(args: Array[String]){
		
		var x = new Account(1001,15000)
		var y = new Account(1002,25000)
		
		x.transfer(y,5000)     //The money will sent from X  ----->  Y
	
		println(x)
		println(y)

	}


	class Account(accNo:Int,bal:Int){
	
		var accountNo =accNo
		var balance = bal

		def transfer(a:Account,amount:Int) = {
			this.balance=this.balance-amount
			deposit(a,amount)
		}
		
		def deposit(a:Account,amount:Int)={
			a.balance=a.balance+amount
		}
	
		override def toString = accountNo+"->"+balance+"LKR"
		
		

	}




}
