package zhuangshi;

public class khd {
    public static void main(String[] args) {
        Person person1 = new Person("成功人士");
        Xizhuang xizhuang =new Xizhuang();
        Lingdai lingdai = new Lingdai();
        Laolishi laolishi = new Laolishi();
        Pixie pixie =new Pixie();
        xizhuang.decorate(person1);
        lingdai.decorate(xizhuang);
        laolishi.decorate(lingdai);
        pixie.decorate(laolishi);
        pixie.show();
        Person person2 =new Person("土豪");
        Dajinlianzi dajinlianzi =new Dajinlianzi();
        Pingguo11 pingguo11 =new Pingguo11();
        dajinlianzi.decorate(person2);
        pingguo11.decorate(dajinlianzi);
        pingguo11.show();
        Person person3= new Person("精神小伙");
        Jinshenyi jinshenyi =new Jinshenyi();
        Jinshenku jinshenku =new Jinshenku();
        Doudouxie doudouxie =new Doudouxie();
        jinshenyi.decorate(person3);
        jinshenku.decorate(jinshenyi);
        doudouxie.decorate(jinshenku);
        doudouxie.show();
    }
}
