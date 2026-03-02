package org.bouncycastle.jcajce.provider.asymmetric.ies;

import idpf;
import idpi;
import idpx;
import idqi;
import idqm;
import idqt;
import idrc;
import idsd;
import idsg;
import idsi;
import ieyc;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Enumeration;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    ieyc currentSpec;

    @Override
    protected byte[] engineGetEncoded() {
        try {
            idpi idpi0 = new idpi();
            if(this.currentSpec.a() != null) {
                idpi0.b(new idsi(false, 0, new idsd(this.currentSpec.a())));
            }
            if(this.currentSpec.b() != null) {
                idpi0.b(new idsi(false, 1, new idsd(this.currentSpec.b())));
            }
            idpi0.b(new idpx(((long)this.currentSpec.a)));
            byte[] arr_b = this.currentSpec.c();
            if(arr_b != null) {
                idpi idpi1 = new idpi();
                idpi1.b(new idpx(((long)this.currentSpec.b)));
                idpi1.b(new idsd(arr_b));
                idpi0.b(new idsg(idpi1));
            }
            idpi0.b((this.currentSpec.c ? idpf.b : idpf.a));
            return new idsg(idpi0).v("DER");
        }
        catch(IOException unused_ex) {
            throw new RuntimeException("Error encoding IESParameters");
        }
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        return this.isASN1FormatString(s) || s.equalsIgnoreCase("X.509") ? this.engineGetEncoded() : null;
    }

    @Override
    protected AlgorithmParameterSpec engineGetParameterSpec(Class class0) {
        if(class0 != null) {
            return this.localEngineGetParameterSpec(class0);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if(!(algorithmParameterSpec0 instanceof ieyc)) {
            throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
        this.currentSpec = (ieyc)algorithmParameterSpec0;
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        try {
            idqt idqt0 = (idqt)idqm.w(arr_b);
            if(idqt0.b() > 5) {
                throw new IOException("sequence too big");
            }
            Enumeration enumeration0 = idqt0.f();
            BigInteger bigInteger0 = null;
            boolean z = false;
            BigInteger bigInteger1 = null;
            byte[] arr_b1 = null;
            byte[] arr_b2 = null;
            byte[] arr_b3 = null;
            while(enumeration0.hasMoreElements()) {
                Object object0 = enumeration0.nextElement();
                if((object0 instanceof idrc)) {
                    idrc idrc0 = idrc.n(object0);
                    int v = idrc0.c;
                    if(v == 0) {
                        arr_b1 = idqi.h(idrc0, false).b;
                    }
                    else {
                        if(v != 1) {
                            continue;
                        }
                        arr_b2 = idqi.h(idrc0, false).b;
                    }
                }
                else if((object0 instanceof idpx)) {
                    bigInteger1 = idpx.n(object0).m();
                }
                else if((object0 instanceof idqt)) {
                    idqt idqt1 = idqt.m(object0);
                    BigInteger bigInteger2 = idpx.n(idqt1.h(0)).m();
                    arr_b3 = idqi.g(idqt1.h(1)).b;
                    bigInteger0 = bigInteger2;
                }
                else {
                    if(!(object0 instanceof idpf)) {
                        continue;
                    }
                    z = idpf.f(object0).h();
                }
            }
            if(bigInteger0 != null) {
                this.currentSpec = new ieyc(arr_b1, arr_b2, bigInteger1.intValue(), bigInteger0.intValue(), arr_b3, z);
                return;
            }
            this.currentSpec = new ieyc(arr_b1, arr_b2, bigInteger1.intValue(), -1, null, z);
        }
        catch(ClassCastException unused_ex) {
            throw new IOException("Not a valid IES Parameter encoding.");
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new IOException("Not a valid IES Parameter encoding.");
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
        return "IES Parameters";
    }

    protected boolean isASN1FormatString(String s) {
        return s == null || s.equals("ASN.1");
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 != ieyc.class && class0 != AlgorithmParameterSpec.class) {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
        return this.currentSpec;
    }
}

