package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import idpx;
import idqg;
import idsc;
import idur;
import idvi;
import idvp;
import idyk;
import iewm;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

public class AlgorithmParametersSpi.PSS extends AlgorithmParametersSpi {
    PSSParameterSpec currentSpec;

    @Override
    protected byte[] engineGetEncoded() {
        PSSParameterSpec pSSParameterSpec0 = this.currentSpec;
        idqg idqg0 = DigestFactory.getOID(pSSParameterSpec0.getDigestAlgorithm());
        idqg idqg1 = idur.m;
        idyk idyk0 = idqg1.y(idqg0) || idur.n.y(idqg0) ? new idyk(idqg0) : new idyk(idqg0, idsc.b);
        MGF1ParameterSpec mGF1ParameterSpec0 = (MGF1ParameterSpec)pSSParameterSpec0.getMGFParameters();
        if(mGF1ParameterSpec0 != null) {
            idyk idyk1 = new idyk(DigestFactory.getOID(mGF1ParameterSpec0.getDigestAlgorithm()), idsc.b);
            return new idvp(idyk0, new idyk(idvi.j, idyk1), new idpx(((long)pSSParameterSpec0.getSaltLength())), new idpx(((long)pSSParameterSpec0.getTrailerField()))).v("DER");
        }
        if(!pSSParameterSpec0.getMGFAlgorithm().equals("SHAKE128")) {
            idqg1 = idur.n;
        }
        return new idvp(idyk0, new idyk(idqg1), new idpx(((long)pSSParameterSpec0.getSaltLength())), new idpx(((long)pSSParameterSpec0.getTrailerField()))).v("DER");
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        return s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1") ? this.engineGetEncoded() : null;
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(!(algorithmParameterSpec0 instanceof PSSParameterSpec)) {
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        }
        this.currentSpec = (PSSParameterSpec)algorithmParameterSpec0;
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        try {
            idvp idvp0 = idvp.c(arr_b);
            idqg idqg0 = idvp0.f.a;
            if(idqg0.y(idvi.j)) {
                this.currentSpec = new PSSParameterSpec(iewm.a(idvp0.e.a), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(iewm.a(idyk.a(idvp0.f.b).a)), idvp0.a().intValue(), idvp0.b().intValue());
                return;
            }
            idqg idqg1 = idur.m;
            if(!idqg0.y(idqg1) && !idqg0.y(idur.n)) {
                throw new IOException("unknown mask generation function: " + idvp0.f.a);
            }
            this.currentSpec = new PSSParameterSpec(iewm.a(idvp0.e.a), (idqg0.y(idqg1) ? "SHAKE128" : "SHAKE256"), null, idvp0.a().intValue(), idvp0.b().intValue());
        }
        catch(ClassCastException unused_ex) {
            throw new IOException("Not a valid PSS Parameter encoding.");
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new IOException("Not a valid PSS Parameter encoding.");
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
        return "PSS Parameters";
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != PSSParameterSpec.class && class0 != AlgorithmParameterSpec.class) {
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }
        return this.currentSpec;
    }
}

