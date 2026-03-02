import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public final class gqpb {
    public static final X509Certificate a;

    static {
        gqpb.a = gqpb.a();
    }

    private static X509Certificate a() {
        try {
            byte[] arr_b = ghjc.d.q("MIIFDzCCAvegAwIBAgIQbNdueU2o0vM9gGq4N6bhjzANBgkqhkiG9w0BAQsFADAxMS8wLQYDVQQDEyZHb29nbGUgQ2xvdWQgS2V5IFZhdWx0IFNlcnZpY2UgUm9vdCBDQTAeFw0xODA1MDcxODI0MDJaFw0zODA1MDgxOTI0MDJaMDExLzAtBgNVBAMTJkdvb2dsZSBDbG91ZCBLZXkgVmF1bHQgU2VydmljZSBSb290IENBMIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEArUgzu+4o9yl22eql1BiGBq3gWXooh2ql3J+vVuzf/ThjzdIg0xkkkw/NAFxYFi49Eo1fa/hf8wCIoAqCEs1lD6tE3cCD3T3+EQPquh6CB2KmZDJ6mPnXvVUlUuFr0O2MwZkwylqBETzK0x5NCHgL/p47vkjhHx6LqVaobigKlHxszvVi4fkt/qq7KW3YTVxhwdLGEab+OqSfwMxdBLhMfE0K0dvFt8bs8yJAF04DJsMbRChFFBpT17Z0u53iIAAu5qVQhKrQXiIAwgboZqd+JkHLXU1fJeVT5WJOJgoJFWHkdWkHta4mSYlS72J1Q927JD1JdET1kFtH+EDtYAtx7x7F9xAAbb2tMITws/wwd2rAzZTX/kxRbDlXVLToU05LFYPr+dFV1wvXmi0jlkIxnhdaVBqWC93p528UiUcLpib+HVzMWGdYI3G1NOa/lTp0c8LcbJjapiiVneRQJ3cIqDPOSEnEq40hyZd1jx3JnOxJMwHs8v4s9GIlb3BcOmDvA/Mu09xEMKwpHBm4TFDKXeGHOWha7ccWEECbyO5ncu6XuN2iyz9S+TuMyjZBE552p6Pu5gEC2xk+qab0NGDTHdLKLbyWn3IxdmBHyTr7iPCqmpyHngkC/pbGfvGusc5BpBugsBtlz67m4RWLJ72yAeVPO/ly/8w4orNsGWjn3s0CAwEAAaMjMCEwDgYDVR0PAQH/BAQDAgGGMA8GA1UdEwEB/wQFMAMBAf8wDQYJKoZIhvcNAQELBQADggIBAGiWlu+4qyxgPb6RsA0mwR7V21UJ9rEpYhSN+ARpTWGiI22RCJSGK0ZrPGeFQzE2BpnVRdmLTV5jf9JUStjHoPvNYFnwLTJ0E2e9Olj8MrHrAucAUFLhl4woWz0kU/X0EB1j6Y2SXrAaZPiMMpq8BKj3mH1MbV4stZ0kiHUpZu6PEmrojYG7FKKN30na2xXfiOfl2JusVsyHDqmUn/HjTh6zASKqE6hxE+FJRl2VQ4dcr4SviHtdbimMy2LghLnZ4FE4XhJgRnw9TeRV5C9Sn7pmnAA5X0C8ZXhXvfvrdx4fL3UKlk1Lqlb5skxoK1R9wwr+aNIO+cuR8JA5DmEDWFw5Budh/uWWZlBTyVW2ybbTB6tkmOc8c08XOgxBaKrsXALmJcluabjmN1jp81ae1epeN31jJ4N5IE5aq7XbTFmKkwpgTTvJmqCR2XzWujlvdbdjfiABliWsnLzLQCP8eZwcM4LA5UK3f1ktHolr1OI9etSOkebE2py8LPYBJWlX36tRAagZhU/NoyOtvhRzq9rb3rbf96APEHKUFsXG9nBEd2BUKZghLKPf+JNCU/2pOGx0jdMcf+K+a1DeG0YzGYMRkFvpN3hvHYrJdByL3kSP3UtD0H2g8Ps7gRLELG2HODxbSn8PV3XtuSvxVanA6uyaaS3AZ6SxeVLvmw507aYI");
            return (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(arr_b));
        }
        catch(CertificateException certificateException0) {
            throw new IllegalArgumentException(certificateException0);
        }
    }
}

