import j..util.Optional;
import java.security.SecureRandom;

public final class dlms extends dlmn {
    public final vnh b;
    public final voo c;
    private final vnf d;

    public dlms(dlmy dlmy0) {
        super(dlmy0);
        vnf vnf0 = new vnf(dlmy0.b.a(), dlmy0.c);
        this.d = vnf0;
        this.b = new vnh(vnf0, dlmy0.c);
        this.c = new voo(dlmy0.a);
    }

    @Override  // dlmn
    public final String a(byte[] arr_b) {
        int v2;
        ibuq.f(arr_b, "attestationChallenge");
        StringBuilder stringBuilder0 = new StringBuilder();
        SecureRandom secureRandom0 = new SecureRandom();
        int v = 0;
        while(v < 5) {
            int v1 = secureRandom0.nextInt(62);
            if(v1 < 0 || v1 >= 62) {
                throw new IllegalArgumentException(v1 + " out of range of allowed character size of 62");
            }
            if(v1 < 26) {
                v2 = (char)(v1 + 65);
            }
            else if(v1 < 52) {
                v2 = (char)(v1 + 71);
            }
            else {
                v2 = v1 - 4;
            }
            stringBuilder0.append(((char)v2));
            ++v;
            continue;
        }
        String s = stringBuilder0.toString();
        Optional optional0 = Optional.of(arr_b);
        String s1 = vnh.b("endpoint", s);
        if(vni.a(this.b.f(s, s1))) {
            dlmt.d(String.format("Keystore already has an endpoint with alias=%s.", s));
            return vni.a(1) ? s : null;
        }
        vnh.h(s1, optional0);
        return vni.a(1) ? s : null;
    }

    @Override  // dlmn
    public final void b(String s, String s1, dlna dlna0) {
        ibuq.f(s, "endpointId");
        ibuq.f(s1, "readerGroupIdBase64");
        String s2 = dlna0.a;
        if(dlmr.a(s2).length() != 130) {
            int v = dlmr.a(s2).length();
            vta.a(this.a.c, "Reader system issuer public key has incorrect length. Converting from base64 string to\n        a hex string resulted in a string of length " + v + "\n        but it should be 130 to result in an expected 65 byte public key.");
        }
        byte[] arr_b = dlmr.c(s2);
        String s3 = dlmr.a(s1);
        String s4 = vnh.b("endpoint", s);
        if(vni.a(this.b.g(s, s3, s4, vnh.b(s4, vnh.b("reader_system_issuer_ca", s3)), arr_b, "storeReaderSystemIssuerCaCertificate"))) {
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override  // dlmn
    public final void c(String s) {
        ibuq.f(s, "endpointId");
        vnh vnh0 = this.b;
        String s1 = vnh.b("endpoint", s);
        if(vni.a(vnh0.f(s, s1))) {
            for(Object object0: vnh0.e()) {
                String s2 = (String)object0;
                if(s2.contains(s1)) {
                    dlmt.d(String.format("deleteEndpointKey(): Will delete key with alias=%s", s2));
                    vnh0.a.d(s2);
                }
            }
        }
        else {
            dlmt.d(String.format("deleteEndpointKey(): Endpoint not found for endPointId=%s, endPointAlias=%s", s, s1));
        }
        if(vni.a(1)) {
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}

