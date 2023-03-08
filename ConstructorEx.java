class ConstructorEx{
    String name;
    int age, rollno;
    
    ConstructorEx(){
        name = "Damini";
        age = 19;
        rollno = 111;
    }

    ConstructorEx(String str , int i){
        name = "str";
        rollno = i;
    }

    ConstructorEx(String st , int i, int j){
        name = st;
        rolln = i;
        age = j;
    }
    void display(){
        System.out.println(name+ " " +rollno+ " " +age);
    }
        public static void main(String[] args){
            ConstructorEx c1 = new ConstructorEx();
            ConstructorEx c2 = new ConstructorEx("DEF" , 456);
            ConstructorEx c3 = new ConstructorEx("DEF" , 456 , 80);

            c1.display();
            c2.display();
            c3.display(); 
        }
    }
