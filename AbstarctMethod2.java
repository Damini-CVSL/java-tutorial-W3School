class AbstarctMethod2{
    public static void main(String[] args){
        Student myObj = new Student();
        System.out.println("Fullname = "+ myObj.fname);
        System.out.println("Age = "+myObj.age);
        System.out.println("Address = "+ myObj.Hometown);
        System.out.println("Graduaion Year = "+myObj.GraduationYear);
        myObj.study();

    }
}