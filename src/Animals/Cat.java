package Animals;

public class Cat extends Animals {
    protected float length;
    protected float high;
    private float rand = (float) Math.random();

    public void setLength(float length) {
        try {
            this.length = length;
        }
        catch (Exception e){
            System.out.println("Вы ввели не верное значение");
        }
        finally {
            this.length = 0;
        }
    }

    public void setHigh(float high) {
        try {
            this.high = high;
        }
        catch (Exception e){
            System.out.println("Вы ввели не верное значение");
        }
        finally {
            this.high = 0;
        }
    }

    public boolean run(float a){
        if (a > (200 + rand*100)) return false;
        else return true;
    }

    public boolean jump(float b){
        if (b > (2 + rand)) return false;
        else return true;
    }

    public boolean swim(float c){
        return false;
    }
}
