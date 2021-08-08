import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad mood.");
        try{
            Assert.assertEquals("SAD", moodAnalyser.analyseMood());
        }catch(MoodAnalysisException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a Happy mood.");
        try{
            Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
        }catch(MoodAnalysisException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_whenNull_shouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
           moodAnalyser.analyseMood();
        }catch(MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenMessage_whenEmpty_shouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try{
            moodAnalyser.analyseMood();
        }catch(MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY, e.type);
        }
    }
}
