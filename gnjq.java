import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

public final class gnjq implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        gnjj gnjj0 = (gnjj)gmni0;
        KeyPair keyPair0 = gnqs.c(gnjj0.b.e);
        ECPublicKey eCPublicKey0 = (ECPublicKey)keyPair0.getPublic();
        ECPrivateKey eCPrivateKey0 = (ECPrivateKey)keyPair0.getPrivate();
        return gnjk.a(gnjm.a(gnjj0, eCPublicKey0.getW(), integer0), new gnsk(eCPrivateKey0.getS()));
    }
}

