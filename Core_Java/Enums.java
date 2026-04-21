enum Status {
    Failed, Pending, Running, Success;
}

enum Laptops {
    Macbook(2000), XPS(1500), AlienWare, Zenbook(1000);

    private Laptops() {
        price = 3000;
    }

    private Laptops(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class Enums {
    public static void main(String[] args) {
        Status s = Status.Running;
        switch (s) {
            case Running:
                System.out.println("Running Program");
                break;
            case Pending:
                System.out.println("Program Pending");
                break;
            case Failed:
                System.out.println("Failed to Execute");
                break;                        
            default:
                System.out.println("Successful Execution");
                break;
        }

        for(Laptops lap : Laptops.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
