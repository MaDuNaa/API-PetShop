package gft.exception;

public class PetException  extends RuntimeException{

	private static final long serialVersionUID = -8731788004226715295L;
	
	private String message;

	public PetException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
