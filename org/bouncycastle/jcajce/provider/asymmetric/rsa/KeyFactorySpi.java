package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import a;
import idqg;
import idvk;
import idvn;
import idzh;
import ienr;
import iepy;
import iepz;
import ierx;
import iery;
import ievx;
import ievy;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec0) {
        if((keySpec0 instanceof PKCS8EncodedKeySpec)) {
            try {
                return this.generatePrivate(idvk.d(((PKCS8EncodedKeySpec)keySpec0).getEncoded()));
            }
            catch(Exception exception0) {
                try {
                    return new BCRSAPrivateCrtKey(idvn.a(((PKCS8EncodedKeySpec)keySpec0).getEncoded()));
                }
                catch(Exception unused_ex) {
                    throw new ExtendedInvalidKeySpecException("unable to process key spec: " + exception0.toString(), exception0);
                }
            }
        }
        if((keySpec0 instanceof RSAPrivateCrtKeySpec)) {
            return new BCRSAPrivateCrtKey(((RSAPrivateCrtKeySpec)keySpec0));
        }
        if((keySpec0 instanceof RSAPrivateKeySpec)) {
            return new BCRSAPrivateKey(((RSAPrivateKeySpec)keySpec0));
        }
        if(!(keySpec0 instanceof ievx)) {
            throw new InvalidKeySpecException("unknown KeySpec type: " + keySpec0.getClass().getName());
        }
        ienr ienr0 = ierx.a(((ievx)keySpec0).getEncoded());
        if((ienr0 instanceof iepz)) {
            return new BCRSAPrivateCrtKey(((iepz)ienr0));
        }
        throw new InvalidKeySpecException("open SSH public key is not RSA private key");
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec0) {
        if((keySpec0 instanceof RSAPublicKeySpec)) {
            return new BCRSAPublicKey(((RSAPublicKeySpec)keySpec0));
        }
        if((keySpec0 instanceof ievy)) {
            ienr ienr0 = iery.a(((ievy)keySpec0).getEncoded());
            if((ienr0 instanceof iepy)) {
                return new BCRSAPublicKey(((iepy)ienr0));
            }
            throw new InvalidKeySpecException("Open SSH public key is not RSA public key");
        }
        return super.engineGeneratePublic(keySpec0);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key0, Class class0) {
        if(!class0.isAssignableFrom(KeySpec.class) && !class0.isAssignableFrom(RSAPublicKeySpec.class) || !(key0 instanceof RSAPublicKey)) {
            if(!class0.isAssignableFrom(KeySpec.class) && !class0.isAssignableFrom(RSAPrivateCrtKeySpec.class) || !(key0 instanceof RSAPrivateCrtKey)) {
                if(!class0.isAssignableFrom(KeySpec.class) && !class0.isAssignableFrom(RSAPrivateKeySpec.class) || !(key0 instanceof RSAPrivateKey)) {
                    if(class0.isAssignableFrom(ievy.class) && (key0 instanceof RSAPublicKey)) {
                        try {
                            return new ievy(iery.b(new iepy(false, ((RSAPublicKey)key0).getModulus(), ((RSAPublicKey)key0).getPublicExponent())));
                        }
                        catch(IOException iOException0) {
                            throw new IllegalArgumentException("unable to produce encoding: " + iOException0.getMessage());
                        }
                    }
                    if(class0.isAssignableFrom(ievx.class) && (key0 instanceof RSAPrivateCrtKey)) {
                        try {
                            return new ievx(ierx.b(new iepz(((RSAPrivateCrtKey)key0).getModulus(), ((RSAPrivateCrtKey)key0).getPublicExponent(), ((RSAPrivateCrtKey)key0).getPrivateExponent(), ((RSAPrivateCrtKey)key0).getPrimeP(), ((RSAPrivateCrtKey)key0).getPrimeQ(), ((RSAPrivateCrtKey)key0).getPrimeExponentP(), ((RSAPrivateCrtKey)key0).getPrimeExponentQ(), ((RSAPrivateCrtKey)key0).getCrtCoefficient())));
                        }
                        catch(IOException iOException1) {
                            throw new IllegalArgumentException("unable to produce encoding: " + iOException1.getMessage());
                        }
                    }
                    return super.engineGetKeySpec(key0, class0);
                }
                return new RSAPrivateKeySpec(((RSAPrivateKey)key0).getModulus(), ((RSAPrivateKey)key0).getPrivateExponent());
            }
            return new RSAPrivateCrtKeySpec(((RSAPrivateCrtKey)key0).getModulus(), ((RSAPrivateCrtKey)key0).getPublicExponent(), ((RSAPrivateCrtKey)key0).getPrivateExponent(), ((RSAPrivateCrtKey)key0).getPrimeP(), ((RSAPrivateCrtKey)key0).getPrimeQ(), ((RSAPrivateCrtKey)key0).getPrimeExponentP(), ((RSAPrivateCrtKey)key0).getPrimeExponentQ(), ((RSAPrivateCrtKey)key0).getCrtCoefficient());
        }
        return new RSAPublicKeySpec(((RSAPublicKey)key0).getModulus(), ((RSAPublicKey)key0).getPublicExponent());
    }

    @Override
    protected Key engineTranslateKey(Key key0) {
        if((key0 instanceof RSAPublicKey)) {
            return new BCRSAPublicKey(((RSAPublicKey)key0));
        }
        if((key0 instanceof RSAPrivateCrtKey)) {
            return new BCRSAPrivateCrtKey(((RSAPrivateCrtKey)key0));
        }
        if((key0 instanceof RSAPrivateKey)) {
            return new BCRSAPrivateKey(((RSAPrivateKey)key0));
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(idvk idvk0) {
        idqg idqg0 = idvk0.b.a;
        if(!RSAUtil.isRsaOid(idqg0)) {
            throw new IOException(a.O(idqg0, "algorithm identifier ", " in key not recognised"));
        }
        idvn idvn0 = idvn.a(idvk0.b());
        return idvn0.h.intValue() == 0 ? new BCRSAPrivateKey(idvk0.b, idvn0) : new BCRSAPrivateCrtKey(idvk0);
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(idzh idzh0) {
        idqg idqg0 = idzh0.a.a;
        if(RSAUtil.isRsaOid(idqg0)) {
            return new BCRSAPublicKey(idzh0);
        }
        throw new IOException(a.O(idqg0, "algorithm identifier ", " in key not recognised"));
    }
}

