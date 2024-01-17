public class Hello {
    public static void main(String[] args) {
        try{
            int res = calcukate();
            System.out.println(res);
            System.out.println("Do you want to suck?");
        } catch (ArithmeticException exception){
            System.out.println(exception);
        }


    }

    private static int calcukate(){
        var a = 1;
        var b = 0;
        int result = devided(a, b);

        return result;
    }

    private static int devided(int x, int y){
        var z = x /  y;;
        return  z;
    }
}
