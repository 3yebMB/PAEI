public class StrongDog extends Dog {
    @Override
    public boolean run(float a) {
        if (a > 600) return false;
        else return true;
    }

    @Override
    public boolean jump(float b) {
        if (b > 0.8) return false;
        else return true;
    }

    @Override
    public boolean swim(float c) {
        if (c > 15) return false;
        else return true;
    }
}
