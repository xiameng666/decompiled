import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

public final class gmym implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        gnqp gnqp0;
        gnsl gnsl0;
        gmvx gmvx0 = ((gmvz)gmni0).a;
        if(gmvx0.equals(gmvx.f)) {
            byte[] arr_b = gnsd.b();
            gnsl0 = gnsl.c(arr_b);
            return gmwa.e(gmwi.c(((gmvz)gmni0), gnsj.b(gnsd.c(arr_b)), integer0), gnsl0);
        }
        gmvx gmvx1 = gmvx.a;
        if(!gmvx0.equals(gmvx1) && !gmvx0.equals(gmvx.b) && !gmvx0.equals(gmvx.c)) {
            throw new GeneralSecurityException("Unknown KEM ID");
        }
        if(gmvx0 == gmvx1) {
            gnqp0 = gnqp.a;
        }
        else {
            if(gmvx0 == gmvx.b) {
                gnqp0 = gnqp.b;
                goto label_16;
            }
            if(gmvx0 != gmvx.c) {
                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
            }
            gnqp0 = gnqp.c;
        }
    label_16:
        KeyPair keyPair0 = gnqs.b(gnqp0);
        ECPoint eCPoint0 = ((ECPublicKey)keyPair0.getPublic()).getW();
        gnsj gnsj0 = gnsj.b(gnqs.p(gnqp0, gnqr.a, eCPoint0));
        gnsl0 = gnsl.c(gmzg.b(((ECPrivateKey)keyPair0.getPrivate()).getS(), gmyo.a(gmvx0)));
        return gmwa.e(gmwi.c(((gmvz)gmni0), gnsj0, integer0), gnsl0);
    }
}

