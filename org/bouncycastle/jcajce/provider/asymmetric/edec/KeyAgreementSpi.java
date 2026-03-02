package org.bouncycastle.jcajce.provider.asymmetric.edec;

import iecj;
import iecx;
import iedn;
import iedo;
import iedq;
import ienr;
import ieqd;
import ieqe;
import ieqf;
import ieqg;
import ievc;
import iewi;
import iftq;
import ifts;
import j..util.Optional;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.interfaces.XECPrivateKey;
import java.security.interfaces.XECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.NamedParameterSpec;
import jb..ExternalSyntheticApiModelOutline0;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import rl..ExternalSyntheticApiModelOutline0;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private iecx agreement;
    private ievc dhuSpec;
    private byte[] result;

    public KeyAgreementSpi(String s) {
        super(s, null);
    }

    public KeyAgreementSpi(String s, iecj iecj0) {
        super(s, iecj0);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] doCalcSecret() {
        return this.result;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected void doInitFromKey(Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        ienr ienr0 = KeyAgreementSpi.getLwXDHKeyPrivate(key0);
        if((ienr0 instanceof ieqd)) {
            this.agreement = this.getAgreement("X25519");
        }
        else {
            if(!(ienr0 instanceof ieqf)) {
                throw new InvalidKeyException("unsupported private key type");
            }
            this.agreement = this.getAgreement("X448");
        }
        this.ukmParameters = null;
        if((algorithmParameterSpec0 instanceof ievc)) {
            if(this.kaAlgorithm.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.dhuSpec = (ievc)algorithmParameterSpec0;
            throw null;
        }
        if(algorithmParameterSpec0 != null) {
            this.agreement.c(ienr0);
            if(!(algorithmParameterSpec0 instanceof iewi)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if(this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            iewi iewi0 = (iewi)algorithmParameterSpec0;
            throw null;
        }
        this.agreement.c(ienr0);
        if(this.kdf != null && this.ukmParameters == null) {
            this.ukmParameters = new byte[0];
        }
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key0, boolean z) {
        if(this.agreement == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        }
        if(!z) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        ienr ienr0 = this.getLwXDHKeyPublic(key0);
        byte[] arr_b = new byte[this.agreement.a()];
        this.result = arr_b;
        if(this.dhuSpec != null) {
            throw null;
        }
        this.agreement.b(ienr0, arr_b, 0);
        return null;
    }

    private iecx getAgreement(String s) {
        if(!this.kaAlgorithm.equals("XDH") && !this.kaAlgorithm.startsWith(s)) {
            throw new InvalidKeyException("inappropriate key for " + this.kaAlgorithm);
        }
        if(this.kaAlgorithm.indexOf(85) > 0) {
            return s.startsWith("X448") ? new iedq(new iedo()) : new iedq(new iedn());
        }
        return s.startsWith("X448") ? new iedo() : new iedn();
    }

    private static ienr getLwXDHKeyPrivate(Key key0) {
        if((key0 instanceof BCXDHPrivateKey)) {
            return ((BCXDHPrivateKey)key0).engineGetKeyParameters();
        }
        if(!rl..ExternalSyntheticApiModelOutline0.m$1(key0)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        Optional optional0 = KeyAgreementSpi..ExternalSyntheticAPIConversion0.m(((XECPrivateKey)key0));
        if(!optional0.isPresent()) {
            throw new InvalidKeyException("cannot use XEC private key without scalar");
        }
        String s = ((XECPrivateKey)key0).getAlgorithm();
        if("X25519".equalsIgnoreCase(s)) {
            return KeyAgreementSpi.getX25519PrivateKey(((byte[])optional0.get()));
        }
        if("X448".equalsIgnoreCase(s)) {
            return KeyAgreementSpi.getX448PrivateKey(((byte[])optional0.get()));
        }
        if("XDH".equalsIgnoreCase(s)) {
            AlgorithmParameterSpec algorithmParameterSpec0 = ((XECPrivateKey)key0).getParams();
            if(rl..ExternalSyntheticApiModelOutline0.m(algorithmParameterSpec0)) {
                String s1 = ((NamedParameterSpec)algorithmParameterSpec0).getName();
                if("X25519".equalsIgnoreCase(s1)) {
                    return KeyAgreementSpi.getX25519PrivateKey(((byte[])optional0.get()));
                }
                if("X448".equalsIgnoreCase(s1)) {
                    return KeyAgreementSpi.getX448PrivateKey(((byte[])optional0.get()));
                }
            }
        }
        throw new InvalidKeyException("cannot use XEC private key with unknown algorithm");
    }

    private ienr getLwXDHKeyPublic(Key key0) {
        if((key0 instanceof BCXDHPublicKey)) {
            return ((BCXDHPublicKey)key0).engineGetKeyParameters();
        }
        if(!jb..ExternalSyntheticApiModelOutline0.m$1(key0)) {
            throw new InvalidKeyException("cannot identify XDH public key");
        }
        BigInteger bigInteger0 = ((XECPublicKey)key0).getU();
        if(bigInteger0.signum() < 0) {
            throw new InvalidKeyException("cannot use XEC public key with negative U value");
        }
        String s = ((XECPublicKey)key0).getAlgorithm();
        if("X25519".equalsIgnoreCase(s)) {
            return KeyAgreementSpi.getX25519PublicKey(bigInteger0);
        }
        if("X448".equalsIgnoreCase(s)) {
            return KeyAgreementSpi.getX448PublicKey(bigInteger0);
        }
        if("XDH".equalsIgnoreCase(s)) {
            AlgorithmParameterSpec algorithmParameterSpec0 = ((XECPublicKey)key0).getParams();
            if(rl..ExternalSyntheticApiModelOutline0.m(algorithmParameterSpec0)) {
                String s1 = ((NamedParameterSpec)algorithmParameterSpec0).getName();
                if("X25519".equalsIgnoreCase(s1)) {
                    return KeyAgreementSpi.getX25519PublicKey(bigInteger0);
                }
                if("X448".equalsIgnoreCase(s1)) {
                    return KeyAgreementSpi.getX448PublicKey(bigInteger0);
                }
            }
        }
        throw new InvalidKeyException("cannot use XEC public key with unknown algorithm");
    }

    private static byte[] getPublicKeyData(int v, BigInteger bigInteger0) {
        try {
            return iftq.s(ifts.k(v, bigInteger0));
        }
        catch(RuntimeException unused_ex) {
            throw new InvalidKeyException("cannot use XEC public key with invalid U value");
        }
    }

    private static ieqd getX25519PrivateKey(byte[] arr_b) {
        if(arr_b.length == 0x20) {
            return new ieqd(arr_b, null);
        }
        throw new InvalidKeyException("cannot use XEC private key (X25519) with scalar of incorrect length");
    }

    private static ieqe getX25519PublicKey(BigInteger bigInteger0) {
        return new ieqe(KeyAgreementSpi.getPublicKeyData(0x20, bigInteger0), 0);
    }

    private static ieqf getX448PrivateKey(byte[] arr_b) {
        if(arr_b.length == 56) {
            return new ieqf(arr_b, null);
        }
        throw new InvalidKeyException("cannot use XEC private key (X448) with scalar of incorrect length");
    }

    private static ieqg getX448PublicKey(BigInteger bigInteger0) {
        return new ieqg(KeyAgreementSpi.getPublicKeyData(56, bigInteger0), 0);
    }
}

