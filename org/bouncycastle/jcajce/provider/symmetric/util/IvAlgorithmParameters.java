package org.bouncycastle.jcajce.provider.symmetric.util;

import idqi;
import idqm;
import idsd;
import iftq;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private byte[] iv;

    @Override
    protected byte[] engineGetEncoded() {
        return this.engineGetEncoded("ASN.1");
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        if(this.isASN1FormatString(s)) {
            return new idsd(this.engineGetEncoded("RAW")).u();
        }
        return s.equals("RAW") ? iftq.j(this.iv) : null;
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(!(algorithmParameterSpec0 instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
        this.iv = ((IvParameterSpec)algorithmParameterSpec0).getIV();
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        if((arr_b.length & 7) != 0 && arr_b[0] == 4 && arr_b[1] == arr_b.length - 2) {
            arr_b = ((idqi)idqm.w(arr_b)).b;
        }
        this.iv = iftq.j(arr_b);
    }

    @Override
    protected void engineInit(byte[] arr_b, String s) {
        if(this.isASN1FormatString(s)) {
            try {
                this.engineInit(((idqi)idqm.w(arr_b)).b);
                return;
            }
            catch(Exception exception0) {
                throw new IOException("Exception decoding: " + exception0.toString());
            }
        }
        if(!s.equals("RAW")) {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
        this.engineInit(arr_b);
    }

    @Override
    protected String engineToString() {
        return "IV Parameters";
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != IvParameterSpec.class && class0 != AlgorithmParameterSpec.class) {
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }
        return new IvParameterSpec(this.iv);
    }
}

