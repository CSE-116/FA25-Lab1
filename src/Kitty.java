import java.util.ArrayList;

public class Kitty {
    /**These are the instance variables for the kitty!**/
    private String name;
    private int age;
    private double weight;

    /**This is the constructor for the kitty class. This means that whenever a new kitty object
     * is created, they will have a name, age, and weight.**/
    public Kitty(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**These are the getters and setters for the instance variables. This is how we will
     * be able to access the data stored in the object!*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**This method takes the average age of weight of two cats, one from the parameter and one from
     * the cat object the method is being called on (also known as the calling object)**/

    //PS - Tom and Pepper are the names of my cats! :D
    public double averageWeight(Kitty Pepper){
        //the way we get the weight of the calling object is by doing this.weight
        double TomWeight = this.weight;
        //the way we get the weight of the parameter is by doing (parameter).getWeight
        double PepperWeight = Pepper.getWeight();
        return (TomWeight + PepperWeight) / 2;
    }

    /**This method will return an ArrayList of all the kittens in the catList. For our purposes,
     * a kitten is a cat this has an age of under 3.
     */
    public ArrayList<Kitty> kittenSorter(ArrayList<Kitty> catList) {
        ArrayList<Kitty> kittenList = new ArrayList<>();
        for (Kitty cat : catList) {
            if (cat.getAge() < 3) {
                kittenList.add(cat);
            }
        }
        return kittenList;
    }
}
