package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.AlgorithmParameterSpec;

public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    @Override
    protected AlgorithmParameterSpec engineGetParameterSpec(Class class0) {
        if(class0 != null) {
            return this.localEngineGetParameterSpec(class0);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    protected boolean isASN1FormatString(String s) {
        return s == null || s.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class arg1);
}

