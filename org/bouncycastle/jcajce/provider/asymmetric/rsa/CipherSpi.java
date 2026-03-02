package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import a;
import idvi;
import iebn;
import iebu;
import iecd;
import iecl;
import iecn;
import iegw;
import iegx;
import ieii;
import iepr;
import iepy;
import iewh;
import iewl;
import iewn;
import ifuf;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource.PSpecified;
import jeb.synthetic.FIN;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut;
    private iebn cipher;
    private AlgorithmParameters engineParams;
    private final iewl helper;
    private iebu param;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;
    private iewh tlsRsaSpec;

    public CipherSpi(iebn iebn0) {
        this.helper = new iewn();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        this.cipher = iebn0;
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec0) {
        this.helper = new iewn();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        try {
            this.initFromSpec(oAEPParameterSpec0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new IllegalArgumentException(noSuchPaddingException0.getMessage());
        }
    }

    public CipherSpi(boolean z, boolean z1, iebn iebn0) {
        this.helper = new iewn();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        this.publicKeyOnly = z;
        this.privateKeyOnly = z1;
        this.cipher = iebn0;
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        if(v2 > arr_b1.length - this.engineGetOutputSize((arr_b == null ? 0 : v1))) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        byte[] arr_b2 = this.engineDoFinal(arr_b, v, v1);
        System.arraycopy(arr_b2, 0, arr_b1, v2, arr_b2.length);
        return arr_b2.length;
    }

    @Override  // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] arr_b, int v, int v1) {
        if(arr_b != null) {
            this.engineUpdate(arr_b, v, v1);
        }
        return this.getOutput();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    protected int engineGetBlockSize() {
        try {
            return this.cipher.getInputBlockSize();
        }
        catch(NullPointerException unused_ex) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    protected int engineGetKeySize(Key key0) {
        if((key0 instanceof RSAPrivateKey)) {
            return ((RSAPrivateKey)key0).getModulus().bitLength();
        }
        if((key0 instanceof RSAPublicKey)) {
            return ((RSAPublicKey)key0).getModulus().bitLength();
        }
        throw new IllegalArgumentException("not an RSA key!");
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    protected int engineGetOutputSize(int v) {
        if(this.tlsRsaSpec != null) {
            return 0x30;
        }
        try {
            return this.cipher.getOutputBlockSize();
        }
        catch(NullPointerException unused_ex) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if(this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters algorithmParameters0 = this.helper.a("OAEP");
                this.engineParams = algorithmParameters0;
                algorithmParameters0.init(this.paramSpec);
                return this.engineParams;
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0.toString());
            }
        }
        return this.engineParams;
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineInit(int v, Key key0, AlgorithmParameters algorithmParameters0, SecureRandom secureRandom0) {
        AlgorithmParameterSpec algorithmParameterSpec0;
        if(algorithmParameters0 == null) {
            algorithmParameterSpec0 = null;
        }
        else {
            try {
                algorithmParameterSpec0 = algorithmParameters0.getParameterSpec(OAEPParameterSpec.class);
            }
            catch(InvalidParameterSpecException invalidParameterSpecException0) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + invalidParameterSpecException0.toString(), invalidParameterSpecException0);
            }
        }
        this.engineParams = algorithmParameters0;
        this.engineInit(v, key0, algorithmParameterSpec0, secureRandom0);
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineInit(int v, Key key0, SecureRandom secureRandom0) {
        try {
            this.engineInit(v, key0, null, secureRandom0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new InvalidKeyException("Eeeek! " + invalidAlgorithmParameterException0.toString(), invalidAlgorithmParameterException0);
        }
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineInit(int v, Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        this.tlsRsaSpec = null;
        if(algorithmParameterSpec0 != null && !(algorithmParameterSpec0 instanceof OAEPParameterSpec) && !(algorithmParameterSpec0 instanceof iewh)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec0.getClass().getName());
        }
        if((key0 instanceof RSAPublicKey)) {
            if(this.privateKeyOnly && v == 1) {
                throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
            }
            this.param = RSAUtil.generatePublicKeyParameter(((RSAPublicKey)key0));
            goto label_12;
        }
        if((key0 instanceof RSAPrivateKey)) {
            if(this.publicKeyOnly && v == 1) {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            this.param = RSAUtil.generatePrivateKeyParameter(((RSAPrivateKey)key0));
        label_12:
            if((algorithmParameterSpec0 instanceof OAEPParameterSpec)) {
                this.paramSpec = algorithmParameterSpec0;
                if(!((OAEPParameterSpec)algorithmParameterSpec0).getMGFAlgorithm().equalsIgnoreCase("MGF1") && !((OAEPParameterSpec)algorithmParameterSpec0).getMGFAlgorithm().equals(idvi.j.b())) {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                }
                if(!(((OAEPParameterSpec)algorithmParameterSpec0).getMGFParameters() instanceof MGF1ParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unkown MGF parameters");
                }
                iecl iecl0 = DigestFactory.getDigest(((OAEPParameterSpec)algorithmParameterSpec0).getDigestAlgorithm());
                if(iecl0 == null) {
                    throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + ((OAEPParameterSpec)algorithmParameterSpec0).getDigestAlgorithm());
                }
                MGF1ParameterSpec mGF1ParameterSpec0 = (MGF1ParameterSpec)((OAEPParameterSpec)algorithmParameterSpec0).getMGFParameters();
                iecl iecl1 = DigestFactory.getDigest(mGF1ParameterSpec0.getDigestAlgorithm());
                if(iecl1 == null) {
                    throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec0.getDigestAlgorithm());
                }
                this.cipher = new iegx(new ieii(), iecl0, iecl1, ((PSource.PSpecified)((OAEPParameterSpec)algorithmParameterSpec0).getPSource()).getValue());
            }
            else if((algorithmParameterSpec0 instanceof iewh)) {
                if(!(this.param instanceof iepy) || !((iepy)this.param).a) {
                    throw new InvalidKeyException("RSA private key required for TLS decryption");
                }
                this.tlsRsaSpec = (iewh)algorithmParameterSpec0;
            }
            this.param = secureRandom0 == null ? new iepr(this.param, iecd.b()) : new iepr(this.param, secureRandom0);
            this.bOut.reset();
            switch(v) {
                case 1: 
                case 3: {
                    this.cipher.init(true, this.param);
                    return;
                }
                case 2: 
                case 4: {
                    this.cipher.init(false, this.param);
                    return;
                }
                default: {
                    throw new InvalidParameterException(a.f(v, "unknown opmode ", " passed to RSA"));
                }
            }
        }
        throw new InvalidKeyException("unknown key type passed to RSA");
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    protected void engineSetMode(String s) {
        String s1 = ifuf.c(s);
        if(!s1.equals("NONE") && !s1.equals("ECB")) {
            boolean z = false;
            boolean z1 = true;
            if(s1.equals("1")) {
                z1 = false;
                z = true;
                this.privateKeyOnly = z;
                this.publicKeyOnly = z1;
                return;
            }
            if(!s1.equals("2")) {
                throw new NoSuchAlgorithmException("can\'t support mode " + s);
            }
            this.privateKeyOnly = z;
            this.publicKeyOnly = z1;
        }
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    protected void engineSetPadding(String s) {
        String s1 = ifuf.c(s);
        if(s1.equals("NOPADDING")) {
            this.cipher = new ieii();
            return;
        }
        if(s1.equals("PKCS1PADDING")) {
            this.cipher = new CustomPKCS1Encoding(new ieii());
            return;
        }
        if(s1.equals("ISO9796-1PADDING")) {
            this.cipher = new iegw(new ieii());
            return;
        }
        if(s1.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            this.initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if(s1.equals("OAEPPADDING")) {
            this.initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if(!s1.equals("OAEPWITHSHA1ANDMGF1PADDING") && !s1.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            if(!s1.equals("OAEPWITHSHA224ANDMGF1PADDING") && !s1.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
                if(!s1.equals("OAEPWITHSHA256ANDMGF1PADDING") && !s1.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
                    if(!s1.equals("OAEPWITHSHA384ANDMGF1PADDING") && !s1.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
                        if(!s1.equals("OAEPWITHSHA512ANDMGF1PADDING") && !s1.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
                            if(s1.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
                                this.initFromSpec(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
                                return;
                            }
                            if(s1.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
                                this.initFromSpec(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
                                return;
                            }
                            if(s1.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
                                this.initFromSpec(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
                                return;
                            }
                            if(!s1.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                                throw new NoSuchPaddingException(s + " unavailable with RSA.");
                            }
                            this.initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
                            return;
                        }
                        this.initFromSpec(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
                        return;
                    }
                    this.initFromSpec(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
                    return;
                }
                this.initFromSpec(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
                return;
            }
            this.initFromSpec(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        this.initFromSpec(OAEPParameterSpec.DEFAULT);
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        this.engineUpdate(arr_b, v, v1);
        return 0;
    }

    @Override  // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] arr_b, int v, int v1) {
        if(v1 > this.getInputLimit() - this.bOut.size()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        this.bOut.write(arr_b, v, v1);
        return null;
    }

    private int getInputLimit() {
        if(this.tlsRsaSpec != null) {
            return (((iepy)((iepr)this.param).b).b.bitLength() + 7) / 8;
        }
        iebn iebn0 = this.cipher;
        return (iebn0 instanceof ieii) ? iebn0.getInputBlockSize() + 1 : iebn0.getInputBlockSize();
    }

    private byte[] getOutput() {
        byte[] arr_b;
        int v = FIN.finallyOpen$NT();
        if(this.tlsRsaSpec == null) {
            try {
                arr_b = this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
            }
            catch(iecn iecn0) {
                throw new BadBlockException("unable to decrypt block", iecn0);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                throw new BadBlockException("unable to decrypt block", arrayIndexOutOfBoundsException0);
            }
            if(arr_b != null) {
                FIN.finallyCodeBegin$NT(v);
                return arr_b;
            }
            throw new BadBlockException("unable to decrypt block", null);
        }
        iepy iepy0 = (iepy)((iepr)this.param).b;
        throw null;
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec0) {
        MGF1ParameterSpec mGF1ParameterSpec0 = (MGF1ParameterSpec)oAEPParameterSpec0.getMGFParameters();
        iecl iecl0 = DigestFactory.getDigest(mGF1ParameterSpec0.getDigestAlgorithm());
        if(iecl0 == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec0.getDigestAlgorithm());
        }
        this.cipher = new iegx(new ieii(), iecl0, iecl0, ((PSource.PSpecified)oAEPParameterSpec0.getPSource()).getValue());
        this.paramSpec = oAEPParameterSpec0;
    }
}

