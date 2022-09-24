package SrackByLLExceptions;

public class DuplicateValueExceptions extends Exception{
    public DuplicateValueExceptions(String message) {
        super(message);
    }

    public DuplicateValueExceptions(){
        //super();
    }

    @Override
    public String toString() {
        return "DuplicateValueExceptions{}";
    }
}
