package gft.dto.security;

public class TokenDTO {
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public TokenDTO() {
		super();
	}

	public TokenDTO(String token) {
		this.token = token;
	}


}
