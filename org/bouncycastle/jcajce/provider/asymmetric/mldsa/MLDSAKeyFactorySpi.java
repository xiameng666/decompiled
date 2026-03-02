package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import a;
import dlbc;
import idqg;
import idur;
import idvk;
import idzh;
import ievr;
import ievs;
import ifkn;
import ifko;
import ifkp;
import ifsp;
import iftq;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;

public class MLDSAKeyFactorySpi extends ifsp {
    private static final Set hashKeyOids;
    private final boolean isHashOnly;
    private static final Set pureKeyOids;

    static Set -$$Nest$sfgethashKeyOids() {
        return MLDSAKeyFactorySpi.hashKeyOids;
    }

    static Set -$$Nest$sfgetpureKeyOids() {
        return MLDSAKeyFactorySpi.pureKeyOids;
    }

    static {
        HashSet hashSet0 = new HashSet();
        MLDSAKeyFactorySpi.pureKeyOids = hashSet0;
        HashSet hashSet1 = new HashSet();
        MLDSAKeyFactorySpi.hashKeyOids = hashSet1;
        hashSet0.add(idur.ao);
        hashSet0.add(idur.ap);
        hashSet0.add(idur.aq);
        hashSet1.add(idur.ao);
        hashSet1.add(idur.ap);
        hashSet1.add(idur.aq);
        hashSet1.add(idur.ar);
        hashSet1.add(idur.as);
        hashSet1.add(idur.at);
    }

    public MLDSAKeyFactorySpi(idqg idqg0) {
        super(idqg0);
        this.isHashOnly = idqg0.y(idur.ar) || idqg0.y(idur.as) || idqg0.y(idur.at);
    }

    public MLDSAKeyFactorySpi(Set set0) {
        super(set0);
        this.isHashOnly = false;
    }

    @Override  // ifsp
    public PrivateKey engineGeneratePrivate(KeySpec keySpec0) {
        if((keySpec0 instanceof ievr)) {
            ifkn ifkn0 = Utils.getParameters(((ievr)keySpec0).c.g);
            if(((ievr)keySpec0).d) {
                return new BCMLDSAPrivateKey(new ifko(ifkn0, iftq.j(((ievr)keySpec0).a), null));
            }
            ifko ifko0 = new ifko(ifkn0, iftq.j(((ievr)keySpec0).a), null);
            byte[] arr_b = iftq.j(((ievr)keySpec0).b);
            if(arr_b != null && !iftq.f(arr_b, ifko0.c())) {
                throw new InvalidKeySpecException("public key data does not match private key data");
            }
            return new BCMLDSAPrivateKey(ifko0);
        }
        return super.engineGeneratePrivate(keySpec0);
    }

    @Override  // ifsp
    public PublicKey engineGeneratePublic(KeySpec keySpec0) {
        return (keySpec0 instanceof ievs) ? new BCMLDSAPublicKey(new ifkp(Utils.getParameters(((ievs)keySpec0).a.g), iftq.j(((ievs)keySpec0).b))) : super.engineGeneratePublic(keySpec0);
    }

    @Override
    public final KeySpec engineGetKeySpec(Key key0, Class class0) {
        if((key0 instanceof BCMLDSAPrivateKey)) {
            if(PKCS8EncodedKeySpec.class.isAssignableFrom(class0)) {
                return new PKCS8EncodedKeySpec(key0.getEncoded());
            }
            if(ievr.class.isAssignableFrom(class0)) {
                byte[] arr_b = ((BCMLDSAPrivateKey)key0).getSeed();
                return arr_b == null ? new ievr(((BCMLDSAPrivateKey)key0).getParameterSpec(), ((BCMLDSAPrivateKey)key0).getPrivateData(), ((BCMLDSAPrivateKey)key0).getPublicKey().getPublicData()) : new ievr(((BCMLDSAPrivateKey)key0).getParameterSpec(), arr_b);
            }
            if(!ievs.class.isAssignableFrom(class0)) {
                throw new InvalidKeySpecException(a.O(class0, "unknown key specification: ", "."));
            }
            return new ievs(((BCMLDSAPrivateKey)key0).getParameterSpec(), ((BCMLDSAPrivateKey)key0).getPublicKey().getPublicData());
        }
        if(!(key0 instanceof BCMLDSAPublicKey)) {
            throw new InvalidKeySpecException(dlbc.h(key0, "unsupported key type: "));
        }
        if(X509EncodedKeySpec.class.isAssignableFrom(class0)) {
            return new X509EncodedKeySpec(key0.getEncoded());
        }
        if(ievs.class.isAssignableFrom(class0)) {
            return new ievs(((BCMLDSAPublicKey)key0).getParameterSpec(), ((BCMLDSAPublicKey)key0).getPublicData());
        }
        throw new InvalidKeySpecException(a.O(class0, "unknown key specification: ", "."));
    }

    @Override
    public final Key engineTranslateKey(Key key0) {
        if(!(key0 instanceof BCMLDSAPrivateKey) && !(key0 instanceof BCMLDSAPublicKey)) {
            throw new InvalidKeyException("unsupported key type");
        }
        return key0;
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(idvk idvk0) {
        PrivateKey privateKey0 = new BCMLDSAPrivateKey(idvk0);
        if(this.isHashOnly && ((BCMLDSAPrivateKey)privateKey0).getAlgorithm().indexOf("WITH") <= 0) {
            ifko ifko0 = ((BCMLDSAPrivateKey)privateKey0).getKeyParams();
            ifkn ifkn0 = ifko0.b;
            if(ifkn0.equals(ifkn.a)) {
                return new BCMLDSAPrivateKey(new ifko(ifkn.d, iftq.j(ifko0.c), iftq.j(ifko0.d), iftq.j(ifko0.e), iftq.j(ifko0.f), iftq.j(ifko0.g), iftq.j(ifko0.h), iftq.j(ifko0.i), ifko0.d()));
            }
            if(ifkn0.equals(ifkn.b)) {
                return new BCMLDSAPrivateKey(new ifko(ifkn.e, iftq.j(ifko0.c), iftq.j(ifko0.d), iftq.j(ifko0.e), iftq.j(ifko0.f), iftq.j(ifko0.g), iftq.j(ifko0.h), iftq.j(ifko0.i), ifko0.d()));
            }
            if(ifkn0.equals(ifkn.c)) {
                return new BCMLDSAPrivateKey(new ifko(ifkn.f, iftq.j(ifko0.c), iftq.j(ifko0.d), iftq.j(ifko0.e), iftq.j(ifko0.f), iftq.j(ifko0.g), iftq.j(ifko0.h), iftq.j(ifko0.i), ifko0.d()));
            }
            throw new IllegalStateException("unknown ML-DSA parameters");
        }
        return privateKey0;
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(idzh idzh0) {
        return new BCMLDSAPublicKey(idzh0);
    }
}

