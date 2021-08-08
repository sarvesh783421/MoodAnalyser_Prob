
public class MoodAnaylizer {
	
	public static String MoodAnaylizer() {
		String msg = null;
		try {
			if(msg.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
			
		}catch(NullPointerException e) {
			return "HAPPY";
		}
		
	}

	public static String MoodAnaylizer(String msg) {
		try {
			if(msg.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
			
		}catch(NullPointerException e) {
			return "HAPPY";
		}
	}

}
