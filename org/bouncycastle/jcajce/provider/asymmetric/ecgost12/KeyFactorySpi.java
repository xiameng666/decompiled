package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import a;
import idqg;
import idvk;
import idzh;
import ietv;
import iexi;
import iexr;
import iexs;
import iext;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec0) {
        if((keySpec0 instanceof iexs)) {
            return new BCECGOST3410_2012PrivateKey(((iexs)keySpec0));
        }
        return (keySpec0 instanceof ECPrivateKeySpec) ? new BCECGOST3410_2012PrivateKey(((ECPrivateKeySpec)keySpec0)) : super.engineGeneratePrivate(keySpec0);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec0) {
        if((keySpec0 instanceof iext)) {
            return new BCECGOST3410_2012PublicKey(((iext)keySpec0), iexi.b);
        }
        return (keySpec0 instanceof ECPublicKeySpec) ? new BCECGOST3410_2012PublicKey(((ECPublicKeySpec)keySpec0)) : super.engineGeneratePublic(keySpec0);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key0, Class class0) {
        if(class0.isAssignableFrom(ECPublicKeySpec.class) && (key0 instanceof ECPublicKey)) {
            if(((ECPublicKey)key0).getParams() != null) {
                return new ECPublicKeySpec(((ECPublicKey)key0).getW(), ((ECPublicKey)key0).getParams());
            }
            iexr iexr0 = iexi.b.getEcImplicitlyCa();
            return new ECPublicKeySpec(((ECPublicKey)key0).getW(), EC5Util.convertSpec(EC5Util.convertCurve(iexr0.b, iexr0.c), iexr0));
        }
        if(class0.isAssignableFrom(ECPrivateKeySpec.class) && (key0 instanceof ECPrivateKey)) {
            if(((ECPrivateKey)key0).getParams() != null) {
                return new ECPrivateKeySpec(((ECPrivateKey)key0).getS(), ((ECPrivateKey)key0).getParams());
            }
            iexr iexr1 = iexi.b.getEcImplicitlyCa();
            return new ECPrivateKeySpec(((ECPrivateKey)key0).getS(), EC5Util.convertSpec(EC5Util.convertCurve(iexr1.b, iexr1.c), iexr1));
        }
        if(class0.isAssignableFrom(iext.class) && (key0 instanceof ECPublicKey)) {
            if(((ECPublicKey)key0).getParams() != null) {
                return new iext(EC5Util.convertPoint(((ECPublicKey)key0).getParams(), ((ECPublicKey)key0).getW()), EC5Util.convertSpec(((ECPublicKey)key0).getParams()));
            }
            iexr iexr2 = iexi.b.getEcImplicitlyCa();
            return new iext(EC5Util.convertPoint(((ECPublicKey)key0).getParams(), ((ECPublicKey)key0).getW()), iexr2);
        }
        if(class0.isAssignableFrom(iexs.class) && (key0 instanceof ECPrivateKey)) {
            if(((ECPrivateKey)key0).getParams() != null) {
                return new iexs(((ECPrivateKey)key0).getS(), EC5Util.convertSpec(((ECPrivateKey)key0).getParams()));
            }
            iexr iexr3 = iexi.b.getEcImplicitlyCa();
            return new iexs(((ECPrivateKey)key0).getS(), iexr3);
        }
        return super.engineGetKeySpec(key0, class0);
    }

    @Override
    protected Key engineTranslateKey(Key key0) {
        throw new InvalidKeyException("key type unknown");
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(idvk idvk0) {
        idqg idqg0 = idvk0.b.a;
        if(this.isValid(idqg0)) {
            return new BCECGOST3410_2012PrivateKey(idvk0);
        }
        throw new IOException(a.O(idqg0, "algorithm identifier ", " in key not recognised"));
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(idzh idzh0) {
        idqg idqg0 = idzh0.a.a;
        if(this.isValid(idqg0)) {
            return new BCECGOST3410_2012PublicKey(idzh0);
        }
        throw new IOException(a.O(idqg0, "algorithm identifier ", " in key not recognised"));
    }

    private boolean isValid(idqg idqg0) {
        return idqg0.y(ietv.g) || idqg0.y(ietv.h) || idqg0.y(ietv.l) || idqg0.y(ietv.m);
    }
}

