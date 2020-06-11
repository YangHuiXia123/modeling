package lishi;

public class Dog extends Animal {
    @Override
    public String getChi() {
        System.out.println("狗吃骨头");
        return super.getChi();
    }

    @Override
    public String getHe() {
        System.out.println("狗喝水");
        return super.getHe();
    }

    @Override
    public String getPao() {
        System.out.println("狗四条腿跑");
        return super.getPao();
    }

    @Override
    public String getJiao() {
        System.out.println("狗汪汪叫");
        return super.getJiao();
    }

    void setChi(String chi){
        System.out.println("狗吃骨头");
    }
   void setHe(String he){
       System.out.println("狗喝水");
    }
    void setPao(String pao){
        System.out.println("狗四条腿跑");
    }
    void setJiao(String jiao){
        System.out.println("狗汪汪叫");
    }
}
