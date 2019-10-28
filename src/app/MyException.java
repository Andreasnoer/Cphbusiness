
package app;

public class MyException extends Exception{
    
    public MyException(String msg){
        super(msg);
    }
    
    @Override
    public String getMessage(){
        String retVal;
        retVal = "Pizza too rare";
        return retVal;
    }
    
    
}
