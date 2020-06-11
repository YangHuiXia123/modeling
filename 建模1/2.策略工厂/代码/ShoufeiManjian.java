package celue;

public class ShoufeiManjian implements Shoufei {
    private double Manjian=0;
    private double Menkan =0;
    public ShoufeiManjian(double manjian,double menkan){
        this.Manjian =manjian;
        this.Menkan =menkan;
    }
    @Override
    public double shoufei(double money) {
        if (money<money){
        return money;
        }
        else{
            return money=money-Manjian;
        }
    }
}
