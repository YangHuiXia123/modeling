package celue;

public class Context {
    Shoufei shoufei;
    public Context(Shoufei shoufei){
        this.shoufei=shoufei;
    }
    public double shoufei(double money){
        return shoufei.shoufei(money);
    };

}
