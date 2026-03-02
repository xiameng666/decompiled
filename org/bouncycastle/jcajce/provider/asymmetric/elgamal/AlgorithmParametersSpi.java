package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import idqm;
import iett;
import iexv;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

public class AlgorithmParametersSpi extends BaseAlgorithmParameters {
    iexv currentSpec;

    @Override
    protected byte[] engineGetEncoded() {
        iett iett0 = new iett(this.currentSpec.a, this.currentSpec.b);
        try {
            return iett0.v("DER");
        }
        catch(IOException unused_ex) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        return this.isASN1FormatString(s) || s.equalsIgnoreCase("X.509") ? this.engineGetEncoded() : null;
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(!(algorithmParameterSpec0 instanceof iexv)) {
            if(!(algorithmParameterSpec0 instanceof DHParameterSpec)) {
                throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
            }
            this.currentSpec = new iexv(((DHParameterSpec)algorithmParameterSpec0).getP(), ((DHParameterSpec)algorithmParameterSpec0).getG());
            return;
        }
        this.currentSpec = (iexv)algorithmParameterSpec0;
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        try {
            iett iett0 = iett.c(idqm.w(arr_b));
            this.currentSpec = new iexv(iett0.b(), iett0.a());
        }
        catch(ClassCastException unused_ex) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
    }

    @Override
    protected void engineInit(byte[] arr_b, String s) {
        if(!this.isASN1FormatString(s) && !s.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format " + s);
        }
        this.engineInit(arr_b);
    }

    @Override
    protected String engineToString() {
        return "ElGamal Parameters";
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != iexv.class && class0 != AlgorithmParameterSpec.class) {
            if(class0 == DHParameterSpec.class) {
                return new DHParameterSpec(this.currentSpec.a, this.currentSpec.b);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
        return this.currentSpec;
    }
}

