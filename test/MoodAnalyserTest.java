public class MoodAnalyserTest{

   public void givenMessage_whenSad_shouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
       Assert.assertEquals("SAD", moodAnalyser.analyseMood("I am in a sad mood."));
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assert.assertEquals("HAPPY", moodAnalyser.analyseMood("I am not in the mood."));
    }
}
