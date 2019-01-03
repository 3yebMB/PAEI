public class Cat extends Animals {

    public Cat() {

    }

    public boolean run(float a){
        if (a > 200) return false;
        else return true;

    }

    public boolean jump(float b){
        if (b > 2) return false;
        else return true;
    }

    public boolean swim(float c){
        return false;
    }
}
