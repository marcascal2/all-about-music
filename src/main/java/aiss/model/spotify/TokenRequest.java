package aiss.model.spotify;

public class TokenRequest {
	private String grant_type;

	public TokenRequest(String grant_type) {
		super();
		this.grant_type = grant_type;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	
}