object slip16
{
	def reverse(ch:Char):Char=
	{
		if(ch.isLower)
			ch.toUpper;
		else
			ch.toLower;
	}	
	def main(args:Array[String])
	{
		var str=" ";
		println("Enter String:");
		str=Console.readLine();
		var str2=str.map(reverse);		
		println(str2);
	}
}

