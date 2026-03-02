package org.bouncycastle.jcajce.provider.asymmetric.ec;

import iebc;
import iebq;
import iecj;
import iedi;
import iedj;
import ienr;
import ieoj;
import ieok;
import ieon;
import ieop;
import ieoq;
import iepm;
import iepn;
import ievc;
import ievw;
import iewi;
import iews;
import iewt;
import iexc;
import iexd;
import iftq;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private Object agreement;
    private static final iebc converter;
    private ievc dheParameters;
    private String kaAlgorithm;
    private ievw mqvParameters;
    private ieok parameters;
    private byte[] result;

    static {
        KeyAgreementSpi.converter = new iebc();
    }

    protected KeyAgreementSpi(String s, iebq iebq0, iecj iecj0) {
        super(s, iecj0);
        this.kaAlgorithm = s;
        this.agreement = iebq0;
    }

    protected KeyAgreementSpi(String s, iedi iedi0, iecj iecj0) {
        super(s, iecj0);
        this.kaAlgorithm = s;
        this.agreement = iedi0;
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger0) {
        return iebc.a(bigInteger0, this.parameters.a.q());
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] doCalcSecret() {
        return iftq.j(this.result);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected void doInitFromKey(Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        if(algorithmParameterSpec0 != null && !(algorithmParameterSpec0 instanceof ievw) && !(algorithmParameterSpec0 instanceof iewi) && !(algorithmParameterSpec0 instanceof ievc)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        Object object0 = this.agreement;
        ienr ienr0 = null;
        if((object0 instanceof iedj)) {
            this.mqvParameters = null;
            if(!(key0 instanceof iexc)) {
                if(!(algorithmParameterSpec0 instanceof ievw)) {
                    throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement requires " + KeyAgreementSpi.getSimpleName(ievw.class) + " for initialisation");
                }
                ievw ievw0 = (ievw)algorithmParameterSpec0;
                ECUtils.generatePrivateKeyParameter(((PrivateKey)key0));
                throw null;
            }
            ienr ienr1 = ECUtils.generatePrivateKeyParameter(((iexc)key0).b());
            ienr ienr2 = ECUtils.generatePrivateKeyParameter(((iexc)key0).a());
            if(((iexc)key0).c() != null) {
                ienr0 = ECUtils.generatePublicKeyParameter(((iexc)key0).c());
            }
            iepm iepm0 = new iepm(((ieop)ienr1), ((ieop)ienr2), ((ieoq)ienr0));
            this.parameters = ((ieon)ienr1).b;
            ((iedj)this.agreement).c(iepm0);
            return;
        }
        if((algorithmParameterSpec0 instanceof ievc)) {
            if(!(object0 instanceof iedi)) {
                throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement cannot be used with " + KeyAgreementSpi.getSimpleName(ievc.class));
            }
            ievc ievc0 = (ievc)algorithmParameterSpec0;
            ECUtils.generatePrivateKeyParameter(((PrivateKey)key0));
            throw null;
        }
        if(!(key0 instanceof PrivateKey)) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + KeyAgreementSpi.getSimpleName(iews.class) + " for initialisation");
        }
        if(this.kdf == null && (algorithmParameterSpec0 instanceof iewi)) {
            throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
        }
        ienr ienr3 = ECUtils.generatePrivateKeyParameter(((PrivateKey)key0));
        this.parameters = ((ieon)ienr3).b;
        if(!(algorithmParameterSpec0 instanceof iewi)) {
            this.ukmParameters = null;
            ((iebq)this.agreement).c(ienr3);
            return;
        }
        iewi iewi0 = (iewi)algorithmParameterSpec0;
        throw null;
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key0, boolean z) {
        iepn iepn0;
        if(this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        }
        if(!z) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        Object object0 = this.agreement;
        if((object0 instanceof iedj)) {
            if((key0 instanceof iexd)) {
                iepn0 = new iepn(((ieoq)ECUtils.generatePublicKeyParameter(((iexd)key0).b())), ((ieoq)ECUtils.generatePublicKeyParameter(((iexd)key0).a())));
                goto label_12;
            }
            ECUtils.generatePublicKeyParameter(((PublicKey)key0));
            throw null;
        }
        if(!(object0 instanceof iedi)) {
            if((key0 instanceof PublicKey)) {
                iepn0 = ECUtils.generatePublicKeyParameter(((PublicKey)key0));
                try {
                label_12:
                    Object object1 = this.agreement;
                    if((object1 instanceof iebq)) {
                        this.result = this.bigIntToBytes(((iebq)object1).b(iepn0));
                        return null;
                    }
                    iedi iedi0 = (iedi)object1;
                    ieoj ieoj0 = (ieoj)iepn0;
                    throw null;
                }
                catch(Exception exception0) {
                    throw new KeyAgreementSpi.1(this, "calculation failed: " + exception0.getMessage(), exception0);
                }
            }
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + KeyAgreementSpi.getSimpleName(iewt.class) + " for doPhase");
        }
        ECUtils.generatePublicKeyParameter(((PublicKey)key0));
        throw null;
    }

    private static String getSimpleName(Class class0) {
        String s = class0.getName();
        return s.substring(s.lastIndexOf(46) + 1);
    }
}

