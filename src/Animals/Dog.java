public class Dog extends Animals {

    public boolean run(float a){
        if (a > 500) return false;
        else return true;

    }

    public boolean jump(float b){
        if (b > 0.5f) return false;
        else return true;
    }

    public boolean swim(float c){
        if (c > 10) return false;
        else return true;
    }
}
