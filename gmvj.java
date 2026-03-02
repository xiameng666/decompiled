import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

public final class gmvj implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        ECParameterSpec eCParameterSpec0;
        gmvn gmvn0 = ((gmvr)gmni0).b;
        if(gmvn0 == gmvn.a) {
            eCParameterSpec0 = gmzs.a;
        }
        else {
            if(gmvn0 == gmvn.b) {
                eCParameterSpec0 = gmzs.b;
                goto label_9;
            }
            if(gmvn0 != gmvn.c) {
                throw new GeneralSecurityException("Unsupported curve type: " + gmvn0);
            }
            eCParameterSpec0 = gmzs.c;
        }
    label_9:
        KeyPair keyPair0 = gnqs.c(eCParameterSpec0);
        ECPublicKey eCPublicKey0 = (ECPublicKey)keyPair0.getPublic();
        ECPrivateKey eCPrivateKey0 = (ECPrivateKey)keyPair0.getPrivate();
        return gmvs.e(gmvt.d(((gmvr)gmni0), eCPublicKey0.getW(), integer0), new gnsk(eCPrivateKey0.getS()));
    }
}

