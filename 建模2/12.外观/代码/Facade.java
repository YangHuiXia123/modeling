/*
1.
public class Main
{
	public static void main(String[] args)
	{
		Stock1 gu1 = new Stock1();
		Stock2 gu2 = new Stock2();
		Stock3 gu3 = new Stock3();
		NationalDebt1 nd1 = new NationalDebt1();
		Realty1 rt1 = new Realty1();

		gu1.buy();
		gu2.buy();
		gu3.buy();
		nd1.buy();
		rt1.buy();

		gu1.sell();
		gu2.sell();
		gu3.sell();
		nd1.sell();
		rt1.sell();
	}
}
2.
public class Main
{
    public static void main(String[] args)
    {
        Fund jijin = new Fund();
        jijin.buyFund();
        jijin.sellFund();
    }
}
*/



public class Facade
{
    SubSystemOne	one;
    SubSystemTwo	two;
    SubSystemThree	three;
    SubSystemFour	four;

    public Facade()
    {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA()
    {
        System.out.println("方法组A");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB()
    {
        System.out.println("方法组B");
        two.methodTwo();
        three.methodThree();
    }
}
