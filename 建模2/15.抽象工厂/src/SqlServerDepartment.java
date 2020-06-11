/*//SqlServerFactory类，实现IFactory接口，实例化SqlServerUser和SqlServerDepartment
public class SqlServerFactory implements IFactory
{
    public IUser createUser()
    {
        return new SqlServerUser();
    }

    public IDepartment createDepartment()
    {
        return new SqlServerDepartment();
    }
}*/
/*//SqlServerDepartment类，用于访问SQL Server的Department
public class SqlServerDepartment implements IDepartment
{
    public void insert(Department department)
    {
        System.out.println("在SQL Server中给Deaprtment表增加一条记录");
    }

    public Department getDepartment(int id)
    {
        System.out.println("在SQL Server中根据ID得到Deaprtment表一条记录");
        return null;
    }
}*/