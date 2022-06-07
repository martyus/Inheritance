public class GoldFish extends Pet{
    public GoldFish(String name){
        super(name, "golden");
    }

    public String introduction(){
        String intro = "Bubble bubble" + super.introduction();
        return intro;
    }
}
