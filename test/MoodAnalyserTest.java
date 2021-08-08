public class MoodAnalyserTest{  

    @Test
    public void givenMessage_whenNull_shouldReturnHappy() {
        String mood = MoodAnalyser.MoodAnalyser(null);
        System.out.println(mood);
        mood = MoodAnalyser.MoodAnalyser();
        System.out.println(mood);
        Assert.assertEquals("HAPPY", mood);
    }
}
