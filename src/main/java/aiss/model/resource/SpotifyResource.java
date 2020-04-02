package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.spotify.Artist;
import aiss.model.spotify.SpotifyResponse;
import aiss.model.spotify.Tracks;

public class SpotifyResource {
	private static final Logger log = Logger.getLogger(SpotifyResource.class.getName());
	private final String token = "BQBHGZIFd9_yqLx45iWa2BGbNevPyZ8ieoRmBe1UdJ9YfggFnH5p1NEb_TZPx6Pc3sZ9k2P2bEXK4_4FNu5MBTyWx_zEzyr_Inrvx0LNkRCCwtWuI8nxJIK1fBqANcszFna-Mn-v4mAt5gg_nTkuj6Y";
	private final String baseURL = "https://api.spotify.com/v1/";

	public String getIDArtist(String name) {
		if (name.contains(" ")) {
			String[] array = name.split(" ");
			name = array[0].trim() + "%20" + array[1].trim();
		}
		String URL = baseURL + "search?q=" + name + "&type=artist";
		ClientResource cr = new ClientResource(URL);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(token);
		cr.setChallengeResponse(chr);
		try {
			SpotifyResponse artists = cr.get(SpotifyResponse.class);
			return artists.getArtists().getItems().get(0).getId();
		} catch (ResourceException re) {
			log.warning("Error when retrieving Spotify artist's id: " + cr.getResponse().getStatus());
			log.warning(URL);
			return null;
		}
	}

	public Tracks getTopTracks(String artistId) {
		String URL = baseURL + "artists/" + artistId + "/top-tracks?country=US";
		ClientResource cr = new ClientResource(URL);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(token);
		cr.setChallengeResponse(chr);
		try {
			return cr.get(Tracks.class);
		} catch (ResourceException re) {
			log.warning("Error when retrieving artist's top tracks: " + cr.getResponse().getStatus());
			log.warning(URL);
			return null;
		}
	}

	public Artist getArtist(String artistId) {
		String URL = baseURL + "artists/" + artistId;
		ClientResource cr = new ClientResource(URL);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(token);
		cr.setChallengeResponse(chr);
		try {
			return cr.get(Artist.class);
		} catch (ResourceException re) {
			log.warning("Error when retrieving artist's information: " + cr.getResponse().getStatus());
			log.warning(URL);
			return null;
		}
	}
}
