class Car{
    String Model;
    int Year;

    Car(String Model, int Year){
        this.Model = Model;
        this.Year = Year;
    }

    void display(){
        System.out.println("The Model is " + Model + " and the year is " + Year);
    }
}
class GFG{
    public static void main(String[] args){
        Car mycar = new Car("Lighting McQueen", 2006);
        mycar.display();
    }
}