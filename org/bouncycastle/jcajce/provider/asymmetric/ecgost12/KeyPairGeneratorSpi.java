package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import idqg;
import iduc;
import ieax;
import iebo;
import iejy;
import ieok;
import ieol;
import ieom;
import ieoo;
import ieop;
import ieoq;
import ietv;
import ievi;
import iexi;
import iexo;
import iexq;
import iexr;
import ieyp;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    iejy engine;
    boolean initialised;
    ieom param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
        this.ecParams = null;
        this.engine = new iejy();
        this.algorithm = "ECGOST3410-2012";
        this.strength = 0xEF;
        this.random = null;
        this.initialised = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        if(!this.initialised) {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
        iebo iebo0 = this.engine.a();
        ieoq ieoq0 = (ieoq)iebo0.a;
        ieop ieop0 = (ieop)iebo0.b;
        Object object0 = this.ecParams;
        if((object0 instanceof iexr)) {
            BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey0 = new BCECGOST3410_2012PublicKey(this.algorithm, ieoq0, ((iexr)object0));
            return new KeyPair(bCECGOST3410_2012PublicKey0, new BCECGOST3410_2012PrivateKey(this.algorithm, ieop0, bCECGOST3410_2012PublicKey0, ((iexr)object0)));
        }
        if(object0 == null) {
            return new KeyPair(new BCECGOST3410_2012PublicKey(this.algorithm, ieoq0), new BCECGOST3410_2012PrivateKey(this.algorithm, ieop0));
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey1 = new BCECGOST3410_2012PublicKey(this.algorithm, ieoq0, ((ECParameterSpec)object0));
        return new KeyPair(bCECGOST3410_2012PublicKey1, new BCECGOST3410_2012PrivateKey(this.algorithm, ieop0, bCECGOST3410_2012PublicKey1, ((ECParameterSpec)object0)));
    }

    private void init(ievi ievi0, SecureRandom secureRandom0) {
        idqg idqg0 = ievi0.a;
        ieax ieax0 = iduc.e(idqg0);
        if(ieax0 == null) {
            throw new InvalidAlgorithmParameterException("unknown curve: " + idqg0);
        }
        this.ecParams = new iexq(iduc.a(idqg0), ieax0.b(), ieax0.c(), ieax0.a, ieax0.b, ieax0.d());
        ieom ieom0 = new ieom(new ieol(new ieoo(idqg0, ieax0), idqg0, ievi0.b, null), secureRandom0);
        this.param = ieom0;
        this.engine.b(ieom0);
        this.initialised = true;
    }

    @Override
    public void initialize(int v, SecureRandom secureRandom0) {
        this.strength = v;
        this.random = secureRandom0;
        Object object0 = this.ecParams;
        if(object0 != null) {
            try {
                this.initialize(((ECGenParameterSpec)object0), secureRandom0);
                return;
            }
            catch(InvalidAlgorithmParameterException unused_ex) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }
        throw new InvalidParameterException("unknown key size.");
    }

    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        String s;
        if((algorithmParameterSpec0 instanceof ievi)) {
            this.init(((ievi)algorithmParameterSpec0), secureRandom0);
            return;
        }
        if((algorithmParameterSpec0 instanceof iexr)) {
            this.ecParams = algorithmParameterSpec0;
            ieom ieom0 = new ieom(new ieok(((iexr)algorithmParameterSpec0).b, ((iexr)algorithmParameterSpec0).d, ((iexr)algorithmParameterSpec0).e, ((iexr)algorithmParameterSpec0).f), secureRandom0);
            this.param = ieom0;
            this.engine.b(ieom0);
            this.initialised = true;
            return;
        }
        if((algorithmParameterSpec0 instanceof ECParameterSpec)) {
            this.ecParams = algorithmParameterSpec0;
            ieyp ieyp0 = EC5Util.convertCurve(((ECParameterSpec)algorithmParameterSpec0).getCurve());
            ieom ieom1 = new ieom(new ieok(ieyp0, EC5Util.convertPoint(ieyp0, ((ECParameterSpec)algorithmParameterSpec0).getGenerator()), ((ECParameterSpec)algorithmParameterSpec0).getOrder(), BigInteger.valueOf(((ECParameterSpec)algorithmParameterSpec0).getCofactor())), secureRandom0);
            this.param = ieom1;
            this.engine.b(ieom1);
            this.initialised = true;
            return;
        }
        if((algorithmParameterSpec0 instanceof ECGenParameterSpec)) {
            s = ((ECGenParameterSpec)algorithmParameterSpec0).getName();
        }
        else {
            if((algorithmParameterSpec0 instanceof iexo)) {
                s = ((iexo)algorithmParameterSpec0).a;
                goto label_34;
            }
            if(algorithmParameterSpec0 == null) {
                ProviderConfiguration providerConfiguration0 = iexi.b;
                if(providerConfiguration0.getEcImplicitlyCa() != null) {
                    iexr iexr0 = providerConfiguration0.getEcImplicitlyCa();
                    this.ecParams = null;
                    ieom ieom2 = new ieom(new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f), secureRandom0);
                    this.param = ieom2;
                    this.engine.b(ieom2);
                    this.initialised = true;
                    return;
                }
            }
            throw algorithmParameterSpec0 != null || iexi.b.getEcImplicitlyCa() != null ? new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec0.getClass().getName()) : new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        }
    label_34:
        idqg idqg0 = iduc.c(s);
        if(!idqg0.y(ietv.p) && !idqg0.y(ietv.q) && !idqg0.y(ietv.r)) {
            this.init(new ievi(s), secureRandom0);
            return;
        }
        this.init(new ievi(iduc.c(s), null), secureRandom0);
    }
}

