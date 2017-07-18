
package dayTwo.excercise91;


public class Customer {
    private String firstname;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    public Customer(String name){
        this.firstname = name;
    }
    
            
    public void setSsn(String ssn){
        this.ssn = ssn;
    }
    
    
    public String getFristName(){
        return firstname;
    }
    
    public String getSsn(){
        return ssn;
    }
}
