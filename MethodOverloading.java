public class MethodOverloading{
    static int printMethodInt(int x, int y){
        return x+y;
    }

    static double printMethodInt(double x, double y){
        return x+y;
    }

    public static void main(String args[]){
       int  w=printMethodInt(8,7);
        System.out.println(w);
        double z=printMethodInt(10.2,7.3);
         System.out.println(z);


    }
}