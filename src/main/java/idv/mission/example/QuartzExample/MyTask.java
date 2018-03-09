package idv.mission.example.QuartzExample;

public class MyTask {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void print() {
		System.out.println(message);
	}

}
