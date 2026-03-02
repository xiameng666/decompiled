package org.bouncycastle.jcajce.provider.symmetric;

import idqg;
import idqi;
import idqm;
import idqt;
import idtu;
import idud;
import ievg;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

public class GOST28147.AlgParams extends GOST28147.BaseAlgParams {
    private byte[] iv;
    private idqg sBox;

    public GOST28147.AlgParams() {
        this.sBox = idtu.h;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if((algorithmParameterSpec0 instanceof IvParameterSpec)) {
            this.iv = ((IvParameterSpec)algorithmParameterSpec0).getIV();
            return;
        }
        if((algorithmParameterSpec0 instanceof ievg)) {
            ievg ievg0 = (ievg)algorithmParameterSpec0;
            this.iv = ievg0.a();
            try {
                this.sBox = GOST28147.AlgParams.getSBoxOID(ievg0.b());
                return;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new InvalidParameterSpecException(illegalArgumentException0.getMessage());
            }
        }
        throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
    }

    @Override
    protected String engineToString() {
        return "GOST 28147 IV Parameters";
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 == IvParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        if(class0 != ievg.class && class0 != AlgorithmParameterSpec.class) {
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + class0.getName());
        }
        return new ievg(this.sBox, this.iv);
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams
    protected byte[] localGetEncoded() {
        return new idud(this.iv, this.sBox).u();
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams
    public void localInit(byte[] arr_b) {
        idqm idqm0 = idqm.w(arr_b);
        if((idqm0 instanceof idqi)) {
            this.iv = idqi.g(idqm0).b;
            return;
        }
        if(!(idqm0 instanceof idqt)) {
            throw new IOException("Unable to recognize parameters");
        }
        idud idud0 = idud.a(idqm0);
        this.sBox = idud0.a;
        this.iv = idud0.b();
    }
}

