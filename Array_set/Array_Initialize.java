class Student{
    public String name;
    
    Student(String name){
          this.name=name;
    }

    public String ToString(){
         return name;
    }
}

public class Array_Initialize {
    
    public static void main(String[] args) {
         Student[] MyStudents=new Student[]{new Student("Akash"),new Student("Rohan"),new Student("Ravi")};
   
         for(int i=0;i<MyStudents.length;i++){
            System.out.println(MyStudents[i]);
         }
    }

}
