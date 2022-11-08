public class Engine {
    private enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; // Diesel oder Benzin


    // amount should be between 0 and 100
    public void drive(int amount){
        System.out.println("The motor is running with " + amount);
    }

    public int getHorsePower(){
        return horsePower;
    }

    public TYPE getType(){
        return type;
    }
}
