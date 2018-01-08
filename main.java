public class main{
	public static void main(String[]args)	{
		calculator cal = new calculator();
		operator opr = new operator();
		opr.setX(9);
		opr.setY(2);
		System.out.println(cal.tambah(opr.getX(), opr.getY()));
		System.out.println(cal.kurang(opr.getX(), opr.getY()));
	}
}
