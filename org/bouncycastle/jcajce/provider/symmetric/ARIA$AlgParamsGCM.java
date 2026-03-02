package org.bouncycastle.jcajce.provider.symmetric;

import ietb;
import ieux;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;

public class ARIA.AlgParamsGCM extends BaseAlgorithmParameters {
    private ietb gcmParams;

    @Override
    protected byte[] engineGetEncoded() {
        return this.gcmParams.u();
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        if(this.isASN1FormatString(s)) {
            return this.gcmParams.u();
        }
        throw new IOException("unknown format specified");
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(GcmSpecUtil.isGcmSpec(algorithmParameterSpec0)) {
            this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec0);
            return;
        }
        if(!(algorithmParameterSpec0 instanceof ieux)) {
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec0.getClass().getName());
        }
        this.gcmParams = new ietb(((ieux)algorithmParameterSpec0).getIV(), ((ieux)algorithmParameterSpec0).a / 8);
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        this.gcmParams = ietb.a(arr_b);
    }

    @Override
    protected void engineInit(byte[] arr_b, String s) {
        if(!this.isASN1FormatString(s)) {
            throw new IOException("unknown format specified");
        }
        this.gcmParams = ietb.a(arr_b);
    }

    @Override
    protected String engineToString() {
        return "GCM";
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != AlgorithmParameterSpec.class && !GcmSpecUtil.isGcmSpec(class0)) {
            if(class0 == ieux.class) {
                return new ieux(this.gcmParams.b(), this.gcmParams.a * 8);
            }
            if(class0 == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.b());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + class0.getName());
        }
        return new ieux(this.gcmParams.b(), this.gcmParams.a * 8);
    }
}

