class OuterClass{
  int   x = 5;

class InnerClass{
  int   y = 6;
}
}
 public class NestedClass{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
    }
}
