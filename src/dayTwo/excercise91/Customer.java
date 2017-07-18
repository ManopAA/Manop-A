
package dayTwo.excercise91;


public class Customer {
    String firstname;
    String ssn;
   
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
