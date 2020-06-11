package celue;

public class ShoufeiDazhe implements Shoufei {
    private double zhekou =1;
    public  ShoufeiDazhe(double zhekou){
        this.zhekou = zhekou;
    }
    @Override
    public double shoufei(double money) {
        return money=money*zhekou;
    }
}
