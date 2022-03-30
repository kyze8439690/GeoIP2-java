package com.maxmind.geoip2;

import com.google.common.base.Optional;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.*;

import java.io.IOException;
import java.net.InetAddress;

public interface DatabaseProvider extends GeoIp2Provider {

    /**
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return A Country model for the requested IP address or empty if the IP address is not in the DB.
     * @throws GeoIp2Exception if there is an error looking up the IP
     * @throws IOException     if there is an IO error
     */
    Optional<CountryResponse> tryCountry(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return A City model for the requested IP address or empty if the IP address is not in the DB.
     * @throws GeoIp2Exception if there is an error looking up the IP
     * @throws IOException     if there is an IO error
     */
    Optional<CityResponse> tryCity(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Anonymous IP.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return a AnonymousIpResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    AnonymousIpResponse anonymousIp(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Anonymous IP.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return a AnonymousIpResponse for the requested IP address or empty if the IP address is not in the DB.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    Optional<AnonymousIpResponse> tryAnonymousIp(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoLite2 ASN database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return an IspResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    AsnResponse asn(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoLite2 ASN database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return an IspResponse for the requested IP address or empty if the IP address is not in the DB.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    Optional<AsnResponse> tryAsn(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Connection Type database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return a ConnectTypeResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    ConnectionTypeResponse connectionType(InetAddress ipAddress)
            throws IOException, GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Connection Type database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return a ConnectTypeResponse for the requested IP address or empty if the IP address is not in the DB.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    Optional<ConnectionTypeResponse> tryConnectionType(InetAddress ipAddress)
            throws IOException, GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Domain database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return a DomainResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    DomainResponse domain(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Domain database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return a DomainResponse for the requested IP address or empty if the IP address is not in the DB.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    Optional<DomainResponse> tryDomain(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Enterprise database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return an EnterpriseResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    EnterpriseResponse enterprise(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 Enterprise database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return an EnterpriseResponse for the requested IP address or empty if the IP address is not in the DB.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    Optional<EnterpriseResponse> tryEnterprise(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 ISP database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup.
     * @return an IspResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    IspResponse isp(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;

    /**
     * Look up an IP address in a GeoIP2 ISP database.
     *
     * @param ipAddress IPv4 or IPv6 address to lookup or empty if the IP address is not in the DB.
     * @return an IspResponse for the requested IP address.
     * @throws com.maxmind.geoip2.exception.GeoIp2Exception if there is an error looking up the IP
     * @throws java.io.IOException                          if there is an IO error
     */
    Optional<IspResponse> tryIsp(InetAddress ipAddress) throws IOException,
            GeoIp2Exception;
}
