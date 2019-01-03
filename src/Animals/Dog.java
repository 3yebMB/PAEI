package Animals;

public class Dog extends Animals {

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
        if (a > (500 + rand*100)) return false;
        else return true;

    }

    public boolean jump(float b){
        if (b > (0.5 + rand)) return false;
        else return true;
    }

    public boolean swim(float c){
        if (c > (10 + rand*10)) return false;
        else return true;
    }
}
