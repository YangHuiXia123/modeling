//客户端的代码
public class Main
{
    public static void main(String[] args)
    {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();

        oper.setNumberA(1);
        oper.setNumberB(2);

        try
        {
            double result = oper.getResult();
            System.out.println("结果是:" + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

