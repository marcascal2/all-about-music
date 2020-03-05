package aiss.model.spotify;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"artists", "available_markets", "disc_number", "duration_ms", "explicit", "external_ids",
		"external_urls", "href", "id", "name", "popularity", "preview_url", "track_number", "type", "uri" })

public class Track {
	@JsonProperty("artists")
	private List<Artists> artists = null;
	@JsonProperty("available_markets")
	private List<String> availableMarkets = null;
	@JsonProperty("disc_number")
	private Integer discNumber;
	@JsonProperty("duration_ms")
	private Integer durationMs;
	@JsonProperty("explicit")
	private Boolean explicit;
	@JsonProperty("href")
	private String href;
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("popularity")
	private Integer popularity;
	@JsonProperty("preview_url")
	private String previewUrl;
	@JsonProperty("track_number")
	private Integer trackNumber;
	@JsonProperty("type")
	private String type;
	@JsonProperty("uri")
	private String uri;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("artists")
	public List<Artists> getArtists() {
		return artists;
	}

	@JsonProperty("artists")
	public void setArtists(List<Artists> artists) {
		this.artists = artists;
	}

	@JsonProperty("disc_number")
	public Integer getDiscNumber() {
		return discNumber;
	}

	@JsonProperty("disc_number")
	public void setDiscNumber(Integer discNumber) {
		this.discNumber = discNumber;
	}

	@JsonProperty("duration_ms")
	public Integer getDurationMs() {
		return durationMs;
	}

	@JsonProperty("duration_ms")
	public void setDurationMs(Integer durationMs) {
		this.durationMs = durationMs;
	}

	@JsonProperty("explicit")
	public Boolean getExplicit() {
		return explicit;
	}

	@JsonProperty("explicit")
	public void setExplicit(Boolean explicit) {
		this.explicit = explicit;
	}

	@JsonProperty("href")
	public String getHref() {
		return href;
	}

	@JsonProperty("href")
	public void setHref(String href) {
		this.href = href;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("popularity")
	public Integer getPopularity() {
		return popularity;
	}

	@JsonProperty("popularity")
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	@JsonProperty("preview_url")
	public String getPreviewUrl() {
		return previewUrl;
	}

	@JsonProperty("preview_url")
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	@JsonProperty("track_number")
	public Integer getTrackNumber() {
		return trackNumber;
	}

	@JsonProperty("track_number")
	public void setTrackNumber(Integer trackNumber) {
		this.trackNumber = trackNumber;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("uri")
	public String getUri() {
		return uri;
	}

	@JsonProperty("uri")
	public void setUri(String uri) {
		this.uri = uri;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}