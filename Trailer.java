package peliculas2;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.Time;

public class Trailer {
	
	private URL Url;
	private Time duracion;
	
	public Trailer() throws IOException {
		Url = new URL(null);
		duracion = new Time(0);
		
	}

	public URL getUrl() {
		return Url;
	}

	public void setUrl(URL url) {
		Url = url;
	}

	public Time getDuracion() {
		return duracion;
	}

	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

}
