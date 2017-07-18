package dayTwo;

public class ex3 {
    
    public static void main(String[] args){
        long vLong = 99_000_000_000L;
        float vFloat = 13.5234F;
        char vChar = 'A';
        
        System.out.println("Long values: "+vLong);
        
        int vInt = (int) vLong;
        System.out.println("Long to int: "+vInt);
        
        int vInt2 = (int) vFloat;
        System.out.println("Float to int: "+vInt2);
        
    }
    
}
