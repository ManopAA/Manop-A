package dayTwo.excercise8;

public class Item {

  char color;
    
    public boolean setColor(char colorCode){
        if (colorCode==' '){
            return false;            
        } else{
            this.color = colorCode;
            return true;
        }
        
    }    
}
