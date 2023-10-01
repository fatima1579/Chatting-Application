
//Accessor and Mutator Methods
public class AandM {  
    private int Age;  
    public int getAge() {  
        return this.Age;  
    }  
    public void setAge(int Age) {  
        this.Age = Age;  
    }  

    public static void main(String[] args) {

		AandM m1 = new AandM();

		System.out.println(" Bio [ Before using Accessors & Mutators ]");

		// calling accessor methods
        m1.setAge(21);
		System.out.print("Age: " + m1.getAge());

}  
}