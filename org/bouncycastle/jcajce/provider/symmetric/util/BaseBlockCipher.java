package org.bouncycastle.jcajce.provider.symmetric.util;

import a;
import idsd;
import idvi;
import iebr;
import iebs;
import iebu;
import iecd;
import iecg;
import iech;
import iecu;
import iehm;
import iejl;
import iejm;
import iels;
import ielt;
import ielu;
import ielw;
import iely;
import ielz;
import iemb;
import iemg;
import iemh;
import iemk;
import ieml;
import iemo;
import iemp;
import iemr;
import iemt;
import iemu;
import iemv;
import iemw;
import iemx;
import ienj;
import ienk;
import ienn;
import ieno;
import ienp;
import ienq;
import iepk;
import iepq;
import iepr;
import ieps;
import iepu;
import iepv;
import ietb;
import ieuf;
import ieug;
import ieuh;
import ieui;
import ieuj;
import ieuk;
import ieux;
import ievf;
import ievg;
import iewb;
import ifuf;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 0x200;
    private ienq aeadParams;
    private static final Class[] availableSpecs;
    private iebr baseEngine;
    private BaseBlockCipher.GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private iepq ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    static {
        BaseBlockCipher.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, GcmSpecUtil.gcmSpecClass, ievg.class, IvParameterSpec.class, PBEParameterSpec.class};
    }

    protected BaseBlockCipher(int v, iebr iebr0, int v1) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = v;
        this.baseEngine = iebr0;
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(iebr0);
        this.ivLength = v1 / 8;
    }

    protected BaseBlockCipher(int v, iebs iebs0, int v1) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = v;
        this.baseEngine = iebs0.g();
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(iebs0);
        this.fixedIv = true;
        this.ivLength = v1 / 8;
    }

    protected BaseBlockCipher(int v, iels iels0) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = v;
        this.baseEngine = iels0.a();
        this.ivLength = iels0.g().indexOf("GCM") >= 0 ? 12 : this.baseEngine.a();
        this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(iels0);
    }

    protected BaseBlockCipher(int v, iels iels0, boolean z, int v1) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = v;
        this.baseEngine = iels0.a();
        this.fixedIv = z;
        this.ivLength = v1;
        this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(iels0);
    }

    protected BaseBlockCipher(int v, BlockCipherProvider blockCipherProvider0) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider0.get();
        this.engineProvider = blockCipherProvider0;
        this.keySizeInBits = v;
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(blockCipherProvider0.get());
    }

    protected BaseBlockCipher(iebr iebr0) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = iebr0;
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(iebr0);
    }

    protected BaseBlockCipher(iebr iebr0, int v) {
        this(iebr0, true, v);
    }

    protected BaseBlockCipher(iebr iebr0, int v, int v1, int v2, int v3) {
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = iebr0;
        this.scheme = v;
        this.digest = v1;
        this.keySizeInBits = v2;
        this.ivLength = v3;
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(iebr0);
    }

    protected BaseBlockCipher(iebr iebr0, boolean z, int v) {
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = iebr0;
        this.fixedIv = z;
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(iebr0);
        this.ivLength = v / 8;
    }

    protected BaseBlockCipher(iebs iebs0, int v) {
        this(iebs0, true, v);
    }

    protected BaseBlockCipher(iebs iebs0, boolean z, int v) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = iebs0.g();
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(iebs0);
        this.fixedIv = z;
        this.ivLength = v / 8;
    }

    protected BaseBlockCipher(iels iels0) {
        this(0, iels0);
    }

    protected BaseBlockCipher(iels iels0, boolean z, int v) {
        this(0, iels0, z, v);
    }

    protected BaseBlockCipher(ielt ielt0, boolean z, int v) {
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = v;
        this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(ielt0);
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider0) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider0.get();
        this.engineProvider = blockCipherProvider0;
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(blockCipherProvider0.get());
    }

    private iebu adjustParameters(AlgorithmParameterSpec algorithmParameterSpec0, iebu iebu0) {
        if((iebu0 instanceof iepq)) {
            iebu iebu1 = ((iepq)iebu0).b;
            if((algorithmParameterSpec0 instanceof IvParameterSpec)) {
                iepq iepq0 = new iepq(iebu1, ((IvParameterSpec)algorithmParameterSpec0).getIV());
                this.ivParam = iepq0;
                return iepq0;
            }
            if((algorithmParameterSpec0 instanceof ievg)) {
                iebu iebu2 = new ieps(iebu0, ((ievg)algorithmParameterSpec0).b());
                if(((ievg)algorithmParameterSpec0).a() != null && this.ivLength != 0) {
                    iepq iepq1 = new iepq(iebu1, ((ievg)algorithmParameterSpec0).a());
                    this.ivParam = iepq1;
                    return iepq1;
                }
                return iebu2;
            }
        }
        else {
            if((algorithmParameterSpec0 instanceof IvParameterSpec)) {
                iepq iepq2 = new iepq(iebu0, ((IvParameterSpec)algorithmParameterSpec0).getIV());
                this.ivParam = iepq2;
                return iepq2;
            }
            if((algorithmParameterSpec0 instanceof ievg)) {
                iebu iebu3 = new ieps(iebu0, ((ievg)algorithmParameterSpec0).b());
                return ((ievg)algorithmParameterSpec0).a() != null && this.ivLength != 0 ? new iepq(iebu3, ((ievg)algorithmParameterSpec0).a()) : iebu3;
            }
        }
        return iebu0;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected int engineDoFinal(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        int v4;
        int v3;
        byte[] arr_b2;
        if(this.engineGetOutputSize(v1) + v2 <= arr_b1.length) {
            try {
                if(v1 == 0) {
                    arr_b2 = arr_b1;
                    v3 = v2;
                    v4 = 0;
                }
                else {
                    arr_b2 = arr_b1;
                    v3 = v2;
                    v4 = this.cipher.processBytes(arr_b, v, v1, arr_b2, v3);
                }
                return v4 + this.cipher.doFinal(arr_b2, v3 + v4);
            }
            catch(iecu iecu0) {
                throw new IllegalBlockSizeException(iecu0.getMessage());
            }
            catch(iecg iecg0) {
                throw new IllegalBlockSizeException(iecg0.getMessage());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected byte[] engineDoFinal(byte[] arr_b, int v, int v1) {
        int v4;
        int v2 = this.engineGetOutputSize(v1);
        byte[] arr_b1 = new byte[v2];
        int v3 = v1 == 0 ? 0 : this.cipher.processBytes(arr_b, v, v1, arr_b1, 0);
        try {
            v4 = v3 + this.cipher.doFinal(arr_b1, v3);
        }
        catch(iecg iecg0) {
            throw new IllegalBlockSizeException(iecg0.getMessage());
        }
        if(v4 == v2) {
            return arr_b1;
        }
        if(v4 > v2) {
            throw new IllegalBlockSizeException("internal buffer overflow");
        }
        byte[] arr_b2 = new byte[v4];
        System.arraycopy(arr_b1, 0, arr_b2, 0, v4);
        return arr_b2;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected int engineGetBlockSize() {
        return this.baseEngine == null ? -1 : this.baseEngine.a();
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected byte[] engineGetIV() {
        ienq ienq0 = this.aeadParams;
        if(ienq0 != null) {
            return ienq0.b();
        }
        return this.ivParam == null ? null : this.ivParam.a;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected int engineGetKeySize(Key key0) {
        return key0.getEncoded().length * 8;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected int engineGetOutputSize(int v) {
        return this.cipher.getOutputSize(v);
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected AlgorithmParameters engineGetParameters() {
        if(this.engineParams == null) {
            if(this.pbeSpec != null) {
                try {
                    this.engineParams = this.createParametersInstance(this.pbeAlgorithm);
                    this.engineParams.init(this.pbeSpec);
                    return this.engineParams;
                }
                catch(Exception unused_ex) {
                    return null;
                }
            }
            if(this.aeadParams != null) {
                if(this.baseEngine == null) {
                    try {
                        this.engineParams = this.createParametersInstance(idvi.an.b());
                        this.engineParams.init(new idsd(this.aeadParams.b()).u());
                        return this.engineParams;
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException(exception0.toString());
                    }
                }
                try {
                    this.engineParams = this.createParametersInstance("GCM");
                    this.engineParams.init(new ietb(this.aeadParams.b(), this.aeadParams.b / 8).u());
                    return this.engineParams;
                }
                catch(Exception exception1) {
                    throw new RuntimeException(exception1.toString());
                }
            }
            if(this.ivParam != null) {
                String s = this.cipher.getUnderlyingCipher().c();
                if(s.indexOf(0x2F) >= 0) {
                    s = s.substring(0, s.indexOf(0x2F));
                }
                try {
                    this.engineParams = this.createParametersInstance(s);
                    this.engineParams.init(new IvParameterSpec(this.ivParam.a));
                    return this.engineParams;
                }
                catch(Exception exception2) {
                    throw new RuntimeException(exception2.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected void engineInit(int v, Key key0, AlgorithmParameters algorithmParameters0, SecureRandom secureRandom0) {
        AlgorithmParameterSpec algorithmParameterSpec0;
        if(algorithmParameters0 == null) {
            algorithmParameterSpec0 = null;
        }
        else {
            algorithmParameterSpec0 = SpecUtil.extractSpec(algorithmParameters0, BaseBlockCipher.availableSpecs);
            if(algorithmParameterSpec0 == null) {
                throw new InvalidAlgorithmParameterException("can\'t handle parameter " + algorithmParameters0.toString());
            }
        }
        this.engineInit(v, key0, algorithmParameterSpec0, secureRandom0);
        this.engineParams = algorithmParameters0;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected void engineInit(int v, Key key0, SecureRandom secureRandom0) {
        try {
            this.engineInit(v, key0, null, secureRandom0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new InvalidKeyException(invalidAlgorithmParameterException0.getMessage());
        }
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected void engineInit(int v, Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        iepq iepq0;
        iebu iebu0;
        SecretKey secretKey0;
        AlgorithmParameterSpec algorithmParameterSpec1 = algorithmParameterSpec0;
        String s = null;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if(!(key0 instanceof SecretKey)) {
            if(key0 != null) {
                s = key0.getAlgorithm();
            }
            throw new InvalidKeyException(a.a(s, "Key for algorithm ", " not suitable for symmetric enryption."));
        }
        if(algorithmParameterSpec1 == null && (this.baseEngine != null && this.baseEngine.c().startsWith("RC5-64"))) {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        int v1 = this.scheme;
        if(v1 == 2 || (key0 instanceof ieuj)) {
            try {
                secretKey0 = (SecretKey)key0;
            }
            catch(Exception unused_ex) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
            if((algorithmParameterSpec1 instanceof PBEParameterSpec)) {
                this.pbeSpec = (PBEParameterSpec)algorithmParameterSpec1;
            }
            if((secretKey0 instanceof PBEKey) && this.pbeSpec == null) {
                if(((PBEKey)secretKey0).getSalt() == null) {
                    throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                }
                this.pbeSpec = new PBEParameterSpec(((PBEKey)secretKey0).getSalt(), ((PBEKey)secretKey0).getIterationCount());
            }
            if(this.pbeSpec == null && !(secretKey0 instanceof PBEKey)) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            if((key0 instanceof BCPBEKey)) {
                iebu iebu1 = ((BCPBEKey)key0).getParam();
                if((iebu1 instanceof iepq)) {
                    iebu0 = iebu1;
                }
                else {
                    if(iebu1 != null) {
                        throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                    }
                    iebu0 = PBE.Util.makePBEParameters(secretKey0.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                }
            }
            else {
                iebu0 = PBE.Util.makePBEParameters(secretKey0.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            }
            if((iebu0 instanceof iepq)) {
                this.ivParam = (iepq)iebu0;
            }
        }
        else if((key0 instanceof ieuf)) {
            if((algorithmParameterSpec1 instanceof PBEParameterSpec)) {
                this.pbeSpec = (PBEParameterSpec)algorithmParameterSpec1;
            }
            if((((ieuf)key0) instanceof ieug) && this.pbeSpec == null) {
                ieug ieug0 = (ieug)(((ieuf)key0));
                throw null;
            }
            iebu0 = PBE.Util.makePBEParameters(((ieuf)key0).getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            if((iebu0 instanceof iepq)) {
                this.ivParam = (iepq)iebu0;
            }
        }
        else if((key0 instanceof ieuh)) {
            if((algorithmParameterSpec1 instanceof PBEParameterSpec)) {
                this.pbeSpec = (PBEParameterSpec)algorithmParameterSpec1;
            }
            if((((ieuh)key0) instanceof ieui) && this.pbeSpec == null) {
                ieui ieui0 = (ieui)(((ieuh)key0));
                throw null;
            }
            iebu0 = PBE.Util.makePBEParameters(((ieuh)key0).getEncoded(), 1, 9, this.keySizeInBits, 0, this.pbeSpec, this.cipher.getAlgorithmName());
            if((iebu0 instanceof iepq)) {
                this.ivParam = (iepq)iebu0;
            }
        }
        else if((key0 instanceof BCPBEKey)) {
            this.pbeAlgorithm = ((BCPBEKey)key0).getOID() == null ? ((BCPBEKey)key0).getAlgorithm() : ((BCPBEKey)key0).getOID().b();
            if(((BCPBEKey)key0).getParam() == null) {
                if(!(algorithmParameterSpec1 instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                this.pbeSpec = (PBEParameterSpec)algorithmParameterSpec1;
                iebu0 = PBE.Util.makePBEParameters(((BCPBEKey)key0), algorithmParameterSpec1, this.cipher.getUnderlyingCipher().c());
            }
            else {
                iebu0 = this.adjustParameters(algorithmParameterSpec1, ((BCPBEKey)key0).getParam());
            }
            if((iebu0 instanceof iepq)) {
                this.ivParam = (iepq)iebu0;
            }
        }
        else if((key0 instanceof PBEKey)) {
            this.pbeSpec = (PBEParameterSpec)algorithmParameterSpec1;
            if((((PBEKey)key0) instanceof ieuk) && ((PBEParameterSpec)algorithmParameterSpec1) == null) {
                this.pbeSpec = new PBEParameterSpec(((PBEKey)key0).getSalt(), ((PBEKey)key0).getIterationCount());
            }
            iebu0 = PBE.Util.makePBEParameters(((PBEKey)key0).getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            if((iebu0 instanceof iepq)) {
                this.ivParam = (iepq)iebu0;
            }
        }
        else if((key0 instanceof iewb)) {
            iebu0 = null;
        }
        else {
            if(v1 == 0 || v1 == 1 || v1 == 4 || v1 == 5) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            iebu0 = new iepk(key0.getEncoded());
        }
        if((algorithmParameterSpec1 instanceof PBEParameterSpec)) {
            AlgorithmParameterSpec algorithmParameterSpec2 = ((PBEParameterSpec)algorithmParameterSpec1).getParameterSpec();
            if(!(algorithmParameterSpec2 instanceof IvParameterSpec) || ((IvParameterSpec)algorithmParameterSpec2).getIV().length != 0) {
                algorithmParameterSpec1 = algorithmParameterSpec2;
            }
        }
        if((algorithmParameterSpec1 instanceof ieux)) {
            if(!this.isAEADModeName(this.modeName) && !(this.cipher instanceof BaseBlockCipher.AEADGenericBlockCipher)) {
                throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
            }
            iepk iepk0 = (iebu0 instanceof iepq) ? ((iepk)((iepq)iebu0).b) : ((iepk)iebu0);
            byte[] arr_b = ((ieux)algorithmParameterSpec1).getIV();
            iebu0 = new ienq(iepk0, ((ieux)algorithmParameterSpec1).a, arr_b, null);
            this.aeadParams = iebu0;
            goto label_144;
        }
        if((algorithmParameterSpec1 instanceof IvParameterSpec)) {
            if(this.ivLength != 0) {
                if(((IvParameterSpec)algorithmParameterSpec1).getIV().length != this.ivLength && !(this.cipher instanceof BaseBlockCipher.AEADGenericBlockCipher) && this.fixedIv) {
                    throw new InvalidAlgorithmParameterException("IV must be " + this.ivLength + " bytes long.");
                }
                iebu0 = (iebu0 instanceof iepq) ? new iepq(((iepq)iebu0).b, ((IvParameterSpec)algorithmParameterSpec1).getIV()) : new iepq(iebu0, ((IvParameterSpec)algorithmParameterSpec1).getIV());
                this.ivParam = iebu0;
                goto label_144;
            }
            if(this.modeName == null || !this.modeName.equals("ECB")) {
                goto label_144;
            }
            throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
        }
        if((algorithmParameterSpec1 instanceof ievg)) {
            iebu0 = new ieps(new iepk(key0.getEncoded()), ((ievg)algorithmParameterSpec1).b());
            if(((ievg)algorithmParameterSpec1).a() == null || this.ivLength == 0) {
                goto label_144;
            }
            iepq0 = new iepq(iebu0, ((ievg)algorithmParameterSpec1).a());
            this.ivParam = iepq0;
            iebu0 = iepq0;
            goto label_144;
        }
        if((algorithmParameterSpec1 instanceof RC2ParameterSpec)) {
            iebu0 = new iepu(key0.getEncoded(), ((RC2ParameterSpec)algorithmParameterSpec1).getEffectiveKeyBits());
            if(((RC2ParameterSpec)algorithmParameterSpec1).getIV() == null || this.ivLength == 0) {
                goto label_144;
            }
            iepq0 = new iepq(iebu0, ((RC2ParameterSpec)algorithmParameterSpec1).getIV());
            this.ivParam = iepq0;
            iebu0 = iepq0;
            goto label_144;
        }
        if((algorithmParameterSpec1 instanceof RC5ParameterSpec)) {
            iebu0 = new iepv(key0.getEncoded(), ((RC5ParameterSpec)algorithmParameterSpec1).getRounds());
            if(!this.baseEngine.c().startsWith("RC5")) {
                throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
            }
            if(this.baseEngine.c().equals("RC5-32")) {
                if(((RC5ParameterSpec)algorithmParameterSpec1).getWordSize() != 0x20) {
                    throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + ((RC5ParameterSpec)algorithmParameterSpec1).getWordSize() + ".");
                }
            }
            else if(this.baseEngine.c().equals("RC5-64") && ((RC5ParameterSpec)algorithmParameterSpec1).getWordSize() != 0x40) {
                throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + ((RC5ParameterSpec)algorithmParameterSpec1).getWordSize() + ".");
            }
            if(((RC5ParameterSpec)algorithmParameterSpec1).getIV() == null || this.ivLength == 0) {
                goto label_144;
            }
            iepq0 = new iepq(iebu0, ((RC5ParameterSpec)algorithmParameterSpec1).getIV());
            this.ivParam = iepq0;
            iebu0 = iepq0;
            goto label_144;
        }
        if(!(algorithmParameterSpec1 instanceof ievf)) {
            if(GcmSpecUtil.isGcmSpec(algorithmParameterSpec1)) {
                if(!this.isAEADModeName(this.modeName) && !(this.cipher instanceof BaseBlockCipher.AEADGenericBlockCipher)) {
                    throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                }
                iebu0 = GcmSpecUtil.extractAeadParameters(((iebu0 instanceof iepq) ? ((iepk)((iepq)iebu0).b) : ((iepk)iebu0)), algorithmParameterSpec1);
                this.aeadParams = iebu0;
            }
            else if(algorithmParameterSpec1 != null && !(algorithmParameterSpec1 instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            }
        label_144:
            if(this.ivLength != 0 && !(iebu0 instanceof iepq) && !(iebu0 instanceof ienq)) {
                SecureRandom secureRandom1 = secureRandom0 == null ? iecd.b() : secureRandom0;
                if(v == 1 || v == 3) {
                    byte[] arr_b1 = new byte[this.ivLength];
                    secureRandom1.nextBytes(arr_b1);
                    iepq iepq1 = new iepq(iebu0, arr_b1);
                    this.ivParam = iepq1;
                    iebu0 = iepq1;
                }
                else if(this.cipher.getUnderlyingCipher().c().indexOf("PGPCFB") < 0) {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
            }
            if(secureRandom0 != null && this.padded) {
                iebu0 = new iepr(iebu0, secureRandom0);
            }
            try {
                switch(v) {
                    case 1: 
                    case 3: {
                        this.cipher.init(true, iebu0);
                        break;
                    }
                    case 2: 
                    case 4: {
                        this.cipher.init(false, iebu0);
                        break;
                    }
                    default: {
                        throw new InvalidParameterException(a.f(v, "unknown opmode ", " passed"));
                    }
                }
                BaseBlockCipher.GenericBlockCipher baseBlockCipher$GenericBlockCipher0 = this.cipher;
                if((baseBlockCipher$GenericBlockCipher0 instanceof BaseBlockCipher.AEADGenericBlockCipher) && this.aeadParams == null) {
                    ielt ielt0 = ((BaseBlockCipher.AEADGenericBlockCipher)baseBlockCipher$GenericBlockCipher0).cipher;
                    this.aeadParams = new ienq(((iepk)this.ivParam.b), ielt0.l().length * 8, this.ivParam.a);
                }
                return;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new InvalidAlgorithmParameterException(illegalArgumentException0.getMessage(), illegalArgumentException0);
            }
            catch(Exception exception0) {
                throw new BaseWrapCipher.InvalidKeyOrParametersException(exception0.getMessage(), exception0);
            }
        }
        ievf ievf0 = (ievf)algorithmParameterSpec1;
        iepk iepk1 = (iepk)iebu0;
        throw null;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected void engineSetMode(String s) {
        if(this.baseEngine == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String s1 = ifuf.c(s);
        this.modeName = s1;
        if(s1.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.baseEngine);
            return;
        }
        if(this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.a();
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new ielu(this.baseEngine));
            return;
        }
        if(this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.a();
            if(this.modeName.length() != 3) {
                int v = Integer.parseInt(this.modeName.substring(3));
                this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iemu(this.baseEngine, v));
                return;
            }
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iemu(this.baseEngine, this.baseEngine.a() * 8));
            return;
        }
        if(this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.a();
            if(this.modeName.length() != 3) {
                int v1 = Integer.parseInt(this.modeName.substring(3));
                this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iely(this.baseEngine, v1));
                return;
            }
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iely(this.baseEngine, this.baseEngine.a() * 8));
            return;
        }
        if(this.modeName.startsWith("PGPCFB")) {
            boolean z = this.modeName.equals("PGPCFBWITHIV");
            if(!z && this.modeName.length() != 6) {
                throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
            }
            this.ivLength = this.baseEngine.a();
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iemw(this.baseEngine, z));
            return;
        }
        if(this.modeName.equals("OPENPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iemv(this.baseEngine));
            return;
        }
        if(this.modeName.equals("FF1")) {
            this.ivLength = 0;
            this.cipher = new BaseBlockCipher.BufferedFPEBlockCipher(new iejl(this.baseEngine));
            return;
        }
        if(this.modeName.equals("FF3-1")) {
            this.ivLength = 0;
            this.cipher = new BaseBlockCipher.BufferedFPEBlockCipher(new iejm(this.baseEngine));
            return;
        }
        if(this.modeName.equals("SIC")) {
            int v2 = this.baseEngine.a();
            this.ivLength = v2;
            if(v2 < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.fixedIv = false;
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iech(new iemx(this.baseEngine)));
            return;
        }
        if(this.modeName.equals("CTR")) {
            this.ivLength = this.baseEngine.a();
            this.fixedIv = false;
            iebr iebr0 = this.baseEngine;
            if((iebr0 instanceof iehm)) {
                this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iech(new iemp(iebr0)));
                return;
            }
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iech(new iemx(iebr0)));
            return;
        }
        if(this.modeName.equals("GOFB")) {
            this.ivLength = this.baseEngine.a();
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iech(new ieml(this.baseEngine)));
            return;
        }
        if(this.modeName.equals("GCFB")) {
            this.ivLength = this.baseEngine.a();
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iech(new iemg(this.baseEngine)));
            return;
        }
        if(this.modeName.equals("CTS")) {
            this.ivLength = this.baseEngine.a();
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new ielz(new ielu(this.baseEngine)));
            return;
        }
        if(this.modeName.equals("CCM")) {
            this.ivLength = 12;
            if((this.baseEngine instanceof iehm)) {
                this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new iemo(this.baseEngine));
                return;
            }
            this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new ielw(this.baseEngine));
            return;
        }
        if(this.modeName.equals("OCB")) {
            if(this.engineProvider == null) {
                throw new NoSuchAlgorithmException("can\'t support mode " + s);
            }
            this.ivLength = 15;
            this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new iemt(this.baseEngine, this.engineProvider.get()));
            return;
        }
        if(this.modeName.equals("EAX")) {
            this.ivLength = this.baseEngine.a();
            this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new iemb(this.baseEngine));
            return;
        }
        if(this.modeName.equals("GCM-SIV")) {
            this.ivLength = 12;
            this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new iemk(this.baseEngine));
            return;
        }
        if(!this.modeName.equals("GCM")) {
            throw new NoSuchAlgorithmException("can\'t support mode " + s);
        }
        iebr iebr1 = this.baseEngine;
        if((iebr1 instanceof iehm)) {
            this.ivLength = iebr1.a();
            this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new iemr(this.baseEngine));
            return;
        }
        this.ivLength = 12;
        this.cipher = new BaseBlockCipher.AEADGenericBlockCipher(new iemh(this.baseEngine));
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected void engineSetPadding(String s) {
        if(this.baseEngine == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String s1 = ifuf.c(s);
        if(s1.equals("NOPADDING")) {
            if(this.cipher.wrapOnNoPadding()) {
                this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new iech(this.cipher.getUnderlyingCipher()));
            }
            return;
        }
        if(!s1.equals("WITHCTS") && !s1.equals("CTSPADDING") && !s1.equals("CS3PADDING")) {
            this.padded = true;
            if(this.isAEADModeName(this.modeName)) {
                throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            }
            if(!s1.equals("PKCS5PADDING") && !s1.equals("PKCS7PADDING")) {
                if(s1.equals("ZEROBYTEPADDING")) {
                    this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ienp());
                    return;
                }
                if(!s1.equals("ISO10126PADDING") && !s1.equals("ISO10126-2PADDING")) {
                    if(!s1.equals("X9.23PADDING") && !s1.equals("X923PADDING")) {
                        if(!s1.equals("ISO7816-4PADDING") && !s1.equals("ISO9797-1PADDING")) {
                            if(!s1.equals("TBCPADDING")) {
                                throw new NoSuchPaddingException(a.a(s, "Padding ", " unknown."));
                            }
                            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ienn());
                            return;
                        }
                        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ienk());
                        return;
                    }
                    this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ieno());
                    return;
                }
                this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ienj());
                return;
            }
            this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        this.cipher = new BaseBlockCipher.BufferedGenericBlockCipher(new ielz(this.cipher.getUnderlyingCipher()));
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected int engineUpdate(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        if(this.cipher.getUpdateOutputSize(v1) + v2 <= arr_b1.length) {
            try {
                return this.cipher.processBytes(arr_b, v, v1, arr_b1, v2);
            }
            catch(iecg iecg0) {
                throw new IllegalStateException(iecg0.toString());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher
    protected byte[] engineUpdate(byte[] arr_b, int v, int v1) {
        int v2 = this.cipher.getUpdateOutputSize(v1);
        if(v2 > 0) {
            byte[] arr_b1 = new byte[v2];
            int v3 = this.cipher.processBytes(arr_b, v, v1, arr_b1, 0);
            if(v3 == 0) {
                return null;
            }
            if(v3 != v2) {
                byte[] arr_b2 = new byte[v3];
                System.arraycopy(arr_b1, 0, arr_b2, 0, v3);
                return arr_b2;
            }
            return arr_b1;
        }
        this.cipher.processBytes(arr_b, v, v1, null, 0);
        return null;
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        if(v <= 0) {
            return;
        }
        if(byteBuffer0.hasArray()) {
            this.engineUpdateAAD(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), v);
            ByteBuffer byteBuffer1 = (ByteBuffer)byteBuffer0.position(byteBuffer0.limit());
            return;
        }
        if(v <= 0x200) {
            byte[] arr_b = new byte[v];
            byteBuffer0.get(arr_b);
            this.engineUpdateAAD(arr_b, 0, v);
            Arrays.fill(arr_b, 0);
            return;
        }
        byte[] arr_b1 = new byte[0x200];
        do {
            int v1 = Math.min(0x200, v);
            byteBuffer0.get(arr_b1, 0, v1);
            this.engineUpdateAAD(arr_b1, 0, v1);
            v -= v1;
        }
        while(v > 0);
        Arrays.fill(arr_b1, 0);
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] arr_b, int v, int v1) {
        this.cipher.updateAAD(arr_b, v, v1);
    }

    private boolean isAEADModeName(String s) {
        return "CCM".equals(s) || "EAX".equals(s) || "GCM".equals(s) || "GCM-SIV".equals(s) || "OCB".equals(s);
    }
}

