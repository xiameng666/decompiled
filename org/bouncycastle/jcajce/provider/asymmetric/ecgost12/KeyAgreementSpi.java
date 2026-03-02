package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import iecj;
import iedk;
import ienr;
import ieok;
import ieon;
import iept;
import iewi;
import iews;
import iewt;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private iedk agreement;
    private String kaAlgorithm;
    private ieok parameters;
    private byte[] result;

    protected KeyAgreementSpi(String s, iedk iedk0, iecj iecj0) {
        super(s, iecj0);
        this.kaAlgorithm = s;
        this.agreement = iedk0;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] doCalcSecret() {
        return this.result;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected void doInitFromKey(Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        if(!(key0 instanceof PrivateKey)) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + KeyAgreementSpi.getSimpleName(iews.class) + " for initialisation");
        }
        if(algorithmParameterSpec0 != null && !(algorithmParameterSpec0 instanceof iewi)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        ienr ienr0 = ECUtil.generatePrivateKeyParameter(((PrivateKey)key0));
        this.parameters = ((ieon)ienr0).b;
        if(!(algorithmParameterSpec0 instanceof iewi)) {
            this.ukmParameters = null;
            this.agreement.a(new iept(ienr0, this.ukmParameters));
            return;
        }
        iewi iewi0 = (iewi)algorithmParameterSpec0;
        throw null;
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key0, boolean z) {
        if(this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        }
        if(!z) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        if((key0 instanceof PublicKey)) {
            ienr ienr0 = KeyAgreementSpi.generatePublicKeyParameter(((PublicKey)key0));
            try {
                this.result = this.agreement.b(ienr0);
                return null;
            }
            catch(Exception exception0) {
                throw new KeyAgreementSpi.1(this, "calculation failed: " + exception0.getMessage(), exception0);
            }
        }
        throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + KeyAgreementSpi.getSimpleName(iewt.class) + " for doPhase");
    }

    static ienr generatePublicKeyParameter(PublicKey publicKey0) {
        return (publicKey0 instanceof BCECGOST3410_2012PublicKey) ? ((BCECGOST3410_2012PublicKey)publicKey0).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey0);
    }

    private static String getSimpleName(Class class0) {
        String s = class0.getName();
        return s.substring(s.lastIndexOf(46) + 1);
    }
}

