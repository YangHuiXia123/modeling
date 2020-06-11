package zhuangshi;

public class Chuanda extends Person {
    protected Person component;
    public void decorate(Person component)
    {
        this.component = component;
    }

    @Override
    public void show() {
        if (null != component)
        {
            component.show();
        }
    }
}
