package org.bouncycastle.jcajce.provider.symmetric;

import iesz;
import ieux;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;

public class AES.AlgParamsCCM extends BaseAlgorithmParameters {
    private iesz ccmParams;

    @Override
    protected byte[] engineGetEncoded() {
        return this.ccmParams.u();
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        if(this.isASN1FormatString(s)) {
            return this.ccmParams.u();
        }
        throw new IOException("unknown format specified");
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(GcmSpecUtil.isGcmSpec(algorithmParameterSpec0)) {
            this.ccmParams = iesz.a(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec0));
            return;
        }
        if(!(algorithmParameterSpec0 instanceof ieux)) {
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec0.getClass().getName());
        }
        this.ccmParams = new iesz(((ieux)algorithmParameterSpec0).getIV(), ((ieux)algorithmParameterSpec0).a / 8);
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        this.ccmParams = iesz.a(arr_b);
    }

    @Override
    protected void engineInit(byte[] arr_b, String s) {
        if(!this.isASN1FormatString(s)) {
            throw new IOException("unknown format specified");
        }
        this.ccmParams = iesz.a(arr_b);
    }

    @Override
    protected String engineToString() {
        return "CCM";
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != AlgorithmParameterSpec.class && !GcmSpecUtil.isGcmSpec(class0)) {
            if(class0 == ieux.class) {
                return new ieux(this.ccmParams.b(), this.ccmParams.a * 8);
            }
            if(class0 == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.b());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + class0.getName());
        }
        return new ieux(this.ccmParams.b(), this.ccmParams.a * 8);
    }
}

