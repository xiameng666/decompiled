import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

public final class gnli implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        gnlb gnlb0 = (gnlb)gmni0;
        KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)gnqy.f.a("RSA");
        BigInteger bigInteger0 = new BigInteger(1, gnlb0.c.toByteArray());
        keyPairGenerator0.initialize(new RSAKeyGenParameterSpec(gnlb0.b, bigInteger0));
        KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
        RSAPublicKey rSAPublicKey0 = (RSAPublicKey)keyPair0.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyPair0.getPrivate();
        gnlf gnlf0 = gnle.a(gnlb0, rSAPublicKey0.getModulus(), integer0);
        gnlc gnlc0 = new gnlc();
        gnlc0.a = gnlf0;
        gnlc0.c(new gnsk(rSAPrivateCrtKey0.getPrimeP()), new gnsk(rSAPrivateCrtKey0.getPrimeQ()));
        gnlc0.b = new gnsk(rSAPrivateCrtKey0.getPrivateExponent());
        gnlc0.b(new gnsk(rSAPrivateCrtKey0.getPrimeExponentP()), new gnsk(rSAPrivateCrtKey0.getPrimeExponentQ()));
        gnlc0.c = new gnsk(rSAPrivateCrtKey0.getCrtCoefficient());
        return gnlc0.a();
    }
}

