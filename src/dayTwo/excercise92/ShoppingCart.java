package dayTwo.excercise92;

public class ShoppingCart {
    
    public static void main(String[] args) {
        
        Customer c = new Customer("Aksorncharoensuk", "Manop");
        //c.setSsn("SetSSN");
        System.out.println("First name= "+c.getFristName() +"\nSsn= "+c.getSsn());
        
        
        //  swithc excercise 10
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("Default");
        }
        
    }
    
}
