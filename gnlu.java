import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

public final class gnlu implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        gnln gnln0 = (gnln)gmni0;
        KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)gnqy.f.a("RSA");
        BigInteger bigInteger0 = new BigInteger(1, gnln0.c.toByteArray());
        keyPairGenerator0.initialize(new RSAKeyGenParameterSpec(gnln0.b, bigInteger0));
        KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
        RSAPublicKey rSAPublicKey0 = (RSAPublicKey)keyPair0.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyPair0.getPrivate();
        gnlr gnlr0 = gnlq.a(gnln0, rSAPublicKey0.getModulus(), integer0);
        gnlo gnlo0 = new gnlo();
        gnlo0.a = gnlr0;
        gnlo0.c(new gnsk(rSAPrivateCrtKey0.getPrimeP()), new gnsk(rSAPrivateCrtKey0.getPrimeQ()));
        gnlo0.b = new gnsk(rSAPrivateCrtKey0.getPrivateExponent());
        gnlo0.b(new gnsk(rSAPrivateCrtKey0.getPrimeExponentP()), new gnsk(rSAPrivateCrtKey0.getPrimeExponentQ()));
        gnlo0.c = new gnsk(rSAPrivateCrtKey0.getCrtCoefficient());
        return gnlo0.a();
    }
}

