abstract class AbstarctMethod{
         public String fname = "Sravani";
    public int age = 19;
    public String Hometown = " miyapur";
    public abstract void study(); //abstract method

    //subclass
    class Student extends AbstarctMethod{
        public int GraduationYear = 2025;
            public void study(){
                System.out.println("Studying all day long");
            }
    }
}
   
