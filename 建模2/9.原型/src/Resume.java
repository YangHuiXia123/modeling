//简历类
public class Resume implements Cloneable
{
    private String			name;
    private String			sex;
    private String			age;
    private WorkExperience	work	= new WorkExperience();

    public Resume(String name)
    {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company)
    {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display()
    {
        System.out.println(name + "		" + sex + "		" + age);
        System.out.println("工作经历：" + work.getWorkDate() + "	"
                + work.getCompany());
    }

    public Resume clone()
    {
        Resume obj = new Resume(name);
        obj.sex = this.sex;
        obj.age = this.age;
        obj.work = work.clone();

        return obj;
    }
}

/*//简历类
public class Resume implements Cloneable
{
    private String			name;
    private String			sex;
    private String			age;
    private WorkExperience	work	= new WorkExperience();

    public Resume(String name)
    {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company)
    {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display()
    {
        System.out.println(name + "		" + sex + "		" + age);
        System.out.println("工作经历：" + work.getWorkDate() + "	"
                + work.getCompany());
    }

    public Resume clone() throws CloneNotSupportedException
    {
        return (Resume) super.clone();
    }
}*/
/*//简历类
public class Resume implements Cloneable
{
    private String	name;
    private String	sex;
    private String	age;
    private String	timeArea;
    private String	company;

    public Resume(String name)
    {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company)
    {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display()
    {
        System.out.println(name + "		" + sex + "		" + age);
        System.out.println("工作经历：" + timeArea + "	" + company);
    }

    public Resume clone()
    {
        try
        {
            return (Resume) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}*/
/*//简历类
public class Resume
{
    private String	name;
    private String	sex;
    private String	age;
    private String	timeArea;
    private String	company;

    public Resume(String name)
    {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company)
    {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display()
    {
        System.out.println(name + "		" + sex + "		" + age);
        System.out.println("工作经历：" + timeArea + "	" + company);
    }
}*/
