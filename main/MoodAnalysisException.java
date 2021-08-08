public class MoodAnalysisException extends Exception{
    ExceptionType type;

    enum ExceptionType{
        NULL, EMPTY
    }
    public MoodAnalysisException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
