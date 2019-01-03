//бежать, плыть, перепрыгивать препятствие.
public abstract class Animals {
    protected float length = 0.0f;
    protected float high = 0.0f;

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
            this.high = length;
        }
        catch (Exception e){
            System.out.println("Вы ввели не верное значение");
        }
        finally {
            this.high = 0;
        }
    }

    abstract boolean run(float a);
    abstract boolean jump(float b);
    abstract boolean swim(float c);
}
