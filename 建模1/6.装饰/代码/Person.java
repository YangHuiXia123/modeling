package zhuangshi;

public class Person {
    private String Name;
    public Person(){

    }
    public Person(String Name){
        this.Name=Name;
    }
    public void show(){
        System.out.println(Name+"的穿搭");
    }
}
