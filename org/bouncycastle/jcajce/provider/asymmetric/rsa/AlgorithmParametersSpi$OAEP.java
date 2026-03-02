package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import idqi;
import idqt;
import idsc;
import idsd;
import idvi;
import idvm;
import idyk;
import iewm;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource.PSpecified;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

public class AlgorithmParametersSpi.OAEP extends AlgorithmParametersSpi {
    OAEPParameterSpec currentSpec;

    @Override
    protected byte[] engineGetEncoded() {
        idyk idyk0 = new idyk(DigestFactory.getOID(this.currentSpec.getDigestAlgorithm()), idsc.b);
        idyk idyk1 = new idyk(DigestFactory.getOID(((MGF1ParameterSpec)this.currentSpec.getMGFParameters()).getDigestAlgorithm()), idsc.b);
        idyk idyk2 = new idyk(idvi.j, idyk1);
        idsd idsd0 = new idsd(((PSource.PSpecified)this.currentSpec.getPSource()).getValue());
        idvm idvm0 = new idvm(idyk0, idyk2, new idyk(idvi.k, idsd0));
        try {
            return idvm0.v("DER");
        }
        catch(IOException unused_ex) {
            throw new RuntimeException("Error encoding OAEPParameters");
        }
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        return this.isASN1FormatString(s) || s.equalsIgnoreCase("X.509") ? this.engineGetEncoded() : null;
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(!(algorithmParameterSpec0 instanceof OAEPParameterSpec)) {
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        }
        this.currentSpec = (OAEPParameterSpec)algorithmParameterSpec0;
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        idvm idvm0;
        try {
            if((arr_b instanceof idvm)) {
                idvm0 = (idvm)arr_b;
            }
            else {
                idvm0 = arr_b == null ? null : new idvm(idqt.m(arr_b));
            }
            if(!idvm0.e.a.y(idvi.j)) {
                throw new IOException("unknown mask generation function: " + idvm0.e.a);
            }
            this.currentSpec = new OAEPParameterSpec(iewm.a(idvm0.d.a), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(iewm.a(idyk.a(idvm0.e.b).a)), new PSource.PSpecified(idqi.g(idvm0.f.b).b));
        }
        catch(ClassCastException unused_ex) {
            throw new IOException("Not a valid OAEP Parameter encoding.");
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new IOException("Not a valid OAEP Parameter encoding.");
        }
    }

    @Override
    protected void engineInit(byte[] arr_b, String s) {
        if(!s.equalsIgnoreCase("X.509") && !s.equalsIgnoreCase("ASN.1")) {
            throw new IOException("Unknown parameter format " + s);
        }
        this.engineInit(arr_b);
    }

    @Override
    protected String engineToString() {
        return "OAEP Parameters";
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != OAEPParameterSpec.class && class0 != AlgorithmParameterSpec.class) {
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }
        return this.currentSpec;
    }
}

