package com.maxmind.geoip2.model;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxmind.db.MaxMindDbConstructor;
import com.maxmind.db.MaxMindDbParameter;
import com.maxmind.db.Network;
import com.maxmind.geoip2.record.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class provides a model for the data returned by the GeoIP2 Precision:
 * City end point and the GeoIP2 City database.
 * </p>
 * <p>
 * The only difference between the City and Insights model classes is which
 * fields in each record may be populated.
 * </p>
 * <p>
 *
 * @see <a href="https://dev.maxmind.com/geoip/docs/web-services?lang=en">GeoIP2 Web
 * Services</a>
 * </p>
 */
public final class CityResponse extends AbstractCityResponse {

    CityResponse() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @MaxMindDbConstructor
    public CityResponse(
            @JsonProperty("city") @MaxMindDbParameter(name="city") City city,
            @JsonProperty("continent") @MaxMindDbParameter(name="continent") Continent continent,
            @JsonProperty("country") @MaxMindDbParameter(name="country") Country country,
            @JsonProperty("location") @MaxMindDbParameter(name="location") Location location,
            @JsonProperty("maxmind") @MaxMindDbParameter(name="maxmind") MaxMind maxmind,
            @JsonProperty("postal") @MaxMindDbParameter(name="postal") Postal postal,
            @JsonProperty("registered_country") @MaxMindDbParameter(name="registered_country") Country registeredCountry,
            @JsonProperty("represented_country") @MaxMindDbParameter(name="represented_country") RepresentedCountry representedCountry,
            @JsonProperty("subdivisions") @MaxMindDbParameter(name="subdivisions") ArrayList<Subdivision> subdivisions,
            @JacksonInject("traits") @JsonProperty("traits") @MaxMindDbParameter(name="traits") Traits traits
    ) {
        super(city, continent, country, location, maxmind, postal, registeredCountry,
                representedCountry, subdivisions, traits);
    }

    public CityResponse(
            CityResponse response,
            String ipAddress,
            Network network,
            List<String> locales
    ) {
        super(response, ipAddress, network, locales);
    }
}
