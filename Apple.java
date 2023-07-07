class Apple 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Everyone!");
		Apple obj=new Apple();
		obj.tag();
		finishing();
		obj.cpu();
	}
	public void tag()
	{
		String product="airtag";
		System.out.println(product+ " was introduced by the  TIMCOOK");
	}
	public static void finishing()
	{
		String product2="iphone12";
		System.out.println(product2+" with purple colur finishing launches soon");
	}
	public void cpu()
	{
		String chip="M1";
		System.out.println(chip+" was invented by TIM COOK,it was recently launched in ipad.");
	}
}
