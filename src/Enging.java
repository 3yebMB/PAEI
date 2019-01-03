public class Enging {
    public static String endBack(int n){
        String result = "";

        String str = Integer.toString(n);
        str = str.substring(str.length()-1);

        if ((Integer.parseInt(str) == 1) && !(n >= 11 && n <= 14))
            result = " год";
        else if ((Integer.parseInt(str) > 1) && (Integer.parseInt(str) < 5))
            result = " года";
        else
            result = " лет";

        return result;
    }
}
