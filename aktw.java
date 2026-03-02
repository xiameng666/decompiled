import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

public final class aktw {
    public static aktw a;
    public final TrustAnchor b;
    private final CertificateFactory c;
    private final CertPathValidator d;

    public aktw() {
        byte[] arr_b;
        this.c = aktw.d();
        this.d = aktw.c();
        TrustAnchor trustAnchor0 = null;
        try {
            arr_b = "-----BEGIN CERTIFICATE-----\nMIIECDCCAvCgAwIBAgIBATANBgkqhkiG9w0BAQUFADB9MRgwFgYDVQQDEw9Qcml2YWN5IENBIFJvb3QxEjAQBgNVBAsTCUNocm9tZSBPUzETMBEGA1UEChMKR29vZ2xlIEluYzEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzETMBEGA1UECBMKQ2FsaWZvcm5pYTELMAkGA1UEBhMCVVMwHhcNMTMwMjE4MTAxMzQyWhcNMzMwMjEzMTAxMzQyWjB9MRgwFgYDVQQDEw9Qcml2YWN5IENBIFJvb3QxEjAQBgNVBAsTCUNocm9tZSBPUzETMBEGA1UEChMKR29vZ2xlIEluYzEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzETMBEGA1UECBMKQ2FsaWZvcm5pYTELMAkGA1UEBhMCVVMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDhDqaBnT0Ga0Id12Et4+75WZ9dmiokv9CcqrVDURzyL2FeKfmJQlplc5a/M2A3R3Gc+wtCQM1oLHxVj+wBdrR5O+RAdSJGg2SPWxLQKoOKKo5VpLZF7QpKUrGSUqI9NL9koXrHEf6TqIkIbZQyEbF9Zw+WRCyfNn04AmAA2nlmTmAO6SWTSPT9dBCOlz1WHmJOn17ad6CFpusV+tssx3h8fzDvOxlvKkFqdvqesw1ldT9QOdl76nDoJDHSliOWo0hk8zt01gcH/qeUwDyC5UerwkB/p7rWe9Cc2rSbJuaHVJlNEqOEXb7O/+GN4NUfxvp4Z22J6h4Pz/kxWb+4CVGbAgMBAAGjgZIwgY8wKQYDVR0OBCIEIEsdFIqlOAk4gS7Wp2P13CwxhhDV+pYE1gnLLg2M7DKJMCsGA1UdIwQkMCKAIEsdFIqlOAk4gS7Wp2P13CwxhhDV+pYE1gnLLg2M7DKJMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMBAf8EBTADAQH/MBQGA1UdIAEB/wQKMAgwBgYEVR0gADANBgkqhkiG9w0BAQUFAAOCAQEAxA2EvI1gmxtos8qn6EECGDjX45JVfUDeurPgaF5ygFQQktyROwqmFQIo2P5asIzO77rFaVL6ALphQpTRuk+hcMhrJ/m/WGZsRpQPdAxL4nlVAbJeQLlwKvB8iEkmvYvu0DbFA+XkKiI/82JxQEykNgqT3skqAv2Nro91b8aKqmR+IVnwp6ldFEbpI2K9US9Z2uwCxdFSwwG5gH25mLpwxhY2R2KgpJeqqS632S82NRadP3TGQMc4lBdZqKtDZ3uAMp0BW9z4kit3moD4Xx5KZ3ZZxg3oAVLoxSan3kbKwUOnWvWPCAbegeFcl/YW4b/6HBxrDSQ4VDvfsqIb2bx65A==\n-----END CERTIFICATE-----".getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            Log.e("AttestationHelper", "Unable to decode root cert as utf-8");
            arr_b = null;
        }
        X509Certificate x509Certificate0 = arr_b == null ? null : this.a(arr_b);
        if(x509Certificate0 != null) {
            trustAnchor0 = new TrustAnchor(x509Certificate0, null);
        }
        this.b = trustAnchor0;
    }

    public final X509Certificate a(byte[] arr_b) {
        CertificateFactory certificateFactory0 = this.c;
        if(certificateFactory0 != null) {
            try {
                return (X509Certificate)certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b));
            }
            catch(CertificateException certificateException0) {
                Log.e("AttestationHelper", "Could not generate an X.509 certificate from: " + new String(arr_b, StandardCharsets.UTF_8), certificateException0);
                return null;
            }
        }
        Log.e("AttestationHelper", "No CertificateFactory available to generate an X.509 certificate");
        return null;
    }

    public final boolean b(List list0, TrustAnchor trustAnchor0) {
        CertificateFactory certificateFactory0 = this.c;
        if(certificateFactory0 == null) {
            Log.e("AttestationHelper", "No CertificateFactory available to validate cert chain");
            return false;
        }
        CertPathValidator certPathValidator0 = this.d;
        if(certPathValidator0 == null) {
            Log.e("AttestationHelper", "No CertPathValidator available to validate cert chain");
            return false;
        }
        try {
            PKIXParameters pKIXParameters0 = new PKIXParameters(Collections.singleton(trustAnchor0));
            pKIXParameters0.setRevocationEnabled(false);
            certPathValidator0.validate(certificateFactory0.generateCertPath(list0), pKIXParameters0);
            return true;
        }
        catch(CertificateException | CertPathValidatorException | InvalidAlgorithmParameterException exception0) {
            Log.e("AttestationHelper", "Could not validate cert chain", exception0);
            return false;
        }
    }

    private static final CertPathValidator c() {
        try {
            return CertPathValidator.getInstance("PKIX");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            Log.e("AttestationHelper", "Could not obtain the cert path validator", noSuchAlgorithmException0);
            return null;
        }
    }

    private static final CertificateFactory d() {
        try {
            return CertificateFactory.getInstance("X.509");
        }
        catch(CertificateException certificateException0) {
            Log.e("AttestationHelper", "Could not obtain the certificate factory", certificateException0);
            return null;
        }
    }
}

