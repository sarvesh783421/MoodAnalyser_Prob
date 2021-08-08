
public class MoodAnalyserTest{
    @Test
       	public void givenMessage_whenSad_shouldReturnSad(){
       	MoodAnalyser moodAnalyser = new MoodAnalyser();
       	Assert.assertEquals("SAD", moodAnalyser.analyseMood("I am in a sad mood."));
    }

    @Test
    	public void givenMessage_whenHappy_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assert.assertEquals("HAPPY", moodAnalyser.analyseMood("I am not in the mood."));
    }

   @Test
    	public void givenMessage_whenNull_shouldReturnHappy() {
        String mood = MoodAnalyser.MoodAnalyser(null);
        System.out.println(mood);
        mood = MoodAnalyser.MoodAnalyser();
        System.out.println(mood);
        Assert.assertEquals("HAPPY", mood);
    }
}
