//工作经历
public class WorkExperience implements Cloneable
{
    private String	workDate;
    private String	company;

    public String getWorkDate()
    {
        return workDate;
    }

    public void setWorkDate(String workDate)
    {
        this.workDate = workDate;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public WorkExperience clone()
    {
        try
        {
            return (WorkExperience) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}

/*//工作经历类
public class WorkExperience
{
    private String	workDate;
    private String	company;

    public String getWorkDate()
    {
        return workDate;
    }

    public void setWorkDate(String workDate)
    {
        this.workDate = workDate;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }
}
*/
