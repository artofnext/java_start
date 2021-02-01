// Class Declaration
public class Dog {
    DogData data = new DogData();


	// method 1
    public String getInfo() {
        return ("Breed is: "+data.getBreed()+" Size is:"+data.getSize()+" Age is:"+data.getAge()+" color is: "+data.getColor());
    }
}


