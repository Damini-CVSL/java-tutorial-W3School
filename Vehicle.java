class Vehicle{
    protected String brand = "Volvo";
    public void honk(){
    System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args){
            Car myObj = new Car();
            myObj.honk();
            System.out.println(myObj.brand+ " " + myObj.modelName);
    }

}