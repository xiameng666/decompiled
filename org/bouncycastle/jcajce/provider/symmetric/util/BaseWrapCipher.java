package org.bouncycastle.jcajce.provider.symmetric.util;

import a;
import idvk;
import iebu;
import iecn;
import iedc;
import iepk;
import iepq;
import iepr;
import ievh;
import iewl;
import iewn;
import iexi;
import iftq;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import jeb.synthetic.FIN;

public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final iewl helper;
    private byte[] iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected iedc wrapEngine;
    private BaseWrapCipher.ErasableOutputStream wrapStream;

    protected BaseWrapCipher() {
        this.availableSpecs = new Class[]{ievh.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new iewn();
    }

    protected BaseWrapCipher(int v, iedc iedc0) {
        this(v, iedc0, 0);
    }

    protected BaseWrapCipher(int v, iedc iedc0, int v1) {
        this.availableSpecs = new Class[]{ievh.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new iewn();
        this.pbeKeySize = v;
        this.wrapEngine = iedc0;
        this.ivSize = v1;
    }

    protected BaseWrapCipher(iedc iedc0) {
        this(iedc0, 0);
    }

    protected BaseWrapCipher(iedc iedc0, int v) {
        this.availableSpecs = new Class[]{ievh.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new iewn();
        this.wrapEngine = iedc0;
        this.ivSize = v;
    }

    protected final AlgorithmParameters createParametersInstance(String s) {
        return this.helper.a(s);
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        byte[] arr_b2;
        BaseWrapCipher.ErasableOutputStream baseWrapCipher$ErasableOutputStream0 = this.wrapStream;
        if(baseWrapCipher$ErasableOutputStream0 != null) {
            baseWrapCipher$ErasableOutputStream0.write(arr_b, v, v1);
            int v3 = FIN.finallyOpen$NT();
            if(this.forWrapping) {
                try {
                    arr_b2 = this.wrapEngine.d(this.wrapStream.getBuf(), this.wrapStream.size());
                }
                catch(Exception exception0) {
                    throw new IllegalBlockSizeException(exception0.getMessage());
                }
            }
            else {
                try {
                    arr_b2 = this.wrapEngine.c(this.wrapStream.getBuf(), this.wrapStream.size());
                }
                catch(iecn iecn0) {
                    throw new BadPaddingException(iecn0.getMessage());
                }
            }
            if(v2 + arr_b2.length <= arr_b1.length) {
                System.arraycopy(arr_b2, 0, arr_b1, v2, arr_b2.length);
                FIN.finallyCodeBegin$NT(v3);
                return arr_b2.length;
            }
            throw new ShortBufferException("output buffer too short for input.");
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override  // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] arr_b, int v, int v1) {
        byte[] arr_b1;
        BaseWrapCipher.ErasableOutputStream baseWrapCipher$ErasableOutputStream0 = this.wrapStream;
        if(baseWrapCipher$ErasableOutputStream0 == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        if(arr_b != null) {
            baseWrapCipher$ErasableOutputStream0.write(arr_b, v, v1);
        }
        try {
            if(this.forWrapping) {
                try {
                    arr_b1 = this.wrapEngine.d(this.wrapStream.getBuf(), this.wrapStream.size());
                }
                catch(Exception exception0) {
                    throw new IllegalBlockSizeException(exception0.getMessage());
                }
            }
            else {
                try {
                    arr_b1 = this.wrapEngine.c(this.wrapStream.getBuf(), this.wrapStream.size());
                }
                catch(iecn iecn0) {
                    throw new BadPaddingException(iecn0.getMessage());
                }
            }
        }
        finally {
            this.wrapStream.erase();
        }
        return arr_b1;
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override  // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return iftq.j(this.iv);
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key0) {
        return key0.getEncoded().length * 8;
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int v) {
        return -1;
    }

    @Override  // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if(this.engineParams == null && this.iv != null) {
            String s = this.wrapEngine.a();
            if(s.indexOf(0x2F) >= 0) {
                s = s.substring(0, s.indexOf(0x2F));
            }
            try {
                AlgorithmParameters algorithmParameters0 = this.createParametersInstance(s);
                this.engineParams = algorithmParameters0;
                algorithmParameters0.init(new IvParameterSpec(this.iv));
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
            algorithmParameterSpec0 = SpecUtil.extractSpec(algorithmParameters0, this.availableSpecs);
            if(algorithmParameterSpec0 == null) {
                throw new InvalidAlgorithmParameterException("can\'t handle parameter " + algorithmParameters0.toString());
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
            throw new BaseWrapCipher.InvalidKeyOrParametersException(invalidAlgorithmParameterException0.getMessage(), invalidAlgorithmParameterException0);
        }
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineInit(int v, Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        iebu iebu0;
        if(!(key0 instanceof BCPBEKey)) {
            iebu0 = new iepk(key0.getEncoded());
        }
        else if((algorithmParameterSpec0 instanceof PBEParameterSpec)) {
            iebu0 = PBE.Util.makePBEParameters(((BCPBEKey)key0), algorithmParameterSpec0, this.wrapEngine.a());
        }
        else {
            if(((BCPBEKey)key0).getParam() == null) {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
            iebu0 = ((BCPBEKey)key0).getParam();
        }
        if((algorithmParameterSpec0 instanceof IvParameterSpec)) {
            this.iv = ((IvParameterSpec)algorithmParameterSpec0).getIV();
            iebu0 = new iepq(iebu0, this.iv);
        }
        if(!(algorithmParameterSpec0 instanceof ievh)) {
            if((iebu0 instanceof iepk)) {
                int v1 = this.ivSize;
                if(v1 != 0) {
                    switch(v) {
                        case 1: {
                            v = 1;
                            goto label_19;
                        }
                        case 3: {
                        label_19:
                            byte[] arr_b = new byte[v1];
                            this.iv = arr_b;
                            secureRandom0.nextBytes(arr_b);
                            iebu0 = new iepq(iebu0, this.iv);
                        }
                    }
                }
            }
            if(secureRandom0 != null) {
                iebu0 = new iepr(iebu0, secureRandom0);
            }
            if(v != 1) {
                try {
                    switch(v) {
                        case 2: {
                            this.wrapEngine.b(false, iebu0);
                            this.wrapStream = new BaseWrapCipher.ErasableOutputStream();
                            this.forWrapping = false;
                            return;
                        }
                        case 3: {
                            this.wrapEngine.b(true, iebu0);
                            this.wrapStream = null;
                            this.forWrapping = true;
                            return;
                        }
                        default: {
                            if(v != 4) {
                                throw new InvalidParameterException("Unknown mode parameter passed to init.");
                            }
                            this.wrapEngine.b(false, iebu0);
                            this.wrapStream = null;
                            this.forWrapping = false;
                            return;
                        }
                    }
                label_41:
                    this.wrapEngine.b(true, iebu0);
                    this.wrapStream = new BaseWrapCipher.ErasableOutputStream();
                    this.forWrapping = true;
                    return;
                }
                catch(Exception exception0) {
                    throw new BaseWrapCipher.InvalidKeyOrParametersException(exception0.getMessage(), exception0);
                }
            }
            goto label_41;
        }
        ievh ievh0 = (ievh)algorithmParameterSpec0;
        throw null;
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineSetMode(String s) {
        throw new NoSuchAlgorithmException("can\'t support mode " + s);
    }

    @Override  // javax.crypto.CipherSpi
    protected void engineSetPadding(String s) {
        throw new NoSuchPaddingException(a.a(s, "Padding ", " unknown."));
    }

    @Override  // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] arr_b, String s, int v) {
        byte[] arr_b1;
        try {
            arr_b1 = this.wrapEngine == null ? this.engineDoFinal(arr_b, 0, arr_b.length) : this.wrapEngine.c(arr_b, arr_b.length);
        }
        catch(iecn iecn0) {
            throw new InvalidKeyException(iecn0.getMessage());
        }
        catch(BadPaddingException badPaddingException0) {
            throw new InvalidKeyException(badPaddingException0.getMessage());
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new InvalidKeyException(illegalBlockSizeException0.getMessage());
        }
        if(v == 3) {
            return new SecretKeySpec(arr_b1, s);
        }
        if(s.equals("") && v == 2) {
            try {
                idvk idvk0 = idvk.d(arr_b1);
                Key key0 = iexi.a(idvk0);
                if(key0 != null) {
                    return key0;
                }
                throw new InvalidKeyException(a.O(idvk0.b.a, "algorithm ", " not supported"));
            }
            catch(Exception unused_ex) {
                throw new InvalidKeyException("Invalid key encoding.");
            }
        }
        try {
            KeyFactory keyFactory0 = this.helper.b(s);
            if(v == 1) {
                return keyFactory0.generatePublic(new X509EncodedKeySpec(arr_b1));
            }
            if(v == 2) {
                return keyFactory0.generatePrivate(new PKCS8EncodedKeySpec(arr_b1));
            }
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            throw new InvalidKeyException("Unknown key type " + noSuchProviderException0.getMessage());
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            throw new InvalidKeyException("Unknown key type " + invalidKeySpecException0.getMessage());
        }
        throw new InvalidKeyException("Unknown key type " + v);
    }

    @Override  // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        BaseWrapCipher.ErasableOutputStream baseWrapCipher$ErasableOutputStream0 = this.wrapStream;
        if(baseWrapCipher$ErasableOutputStream0 == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        baseWrapCipher$ErasableOutputStream0.write(arr_b, v, v1);
        return 0;
    }

    @Override  // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] arr_b, int v, int v1) {
        BaseWrapCipher.ErasableOutputStream baseWrapCipher$ErasableOutputStream0 = this.wrapStream;
        if(baseWrapCipher$ErasableOutputStream0 == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        baseWrapCipher$ErasableOutputStream0.write(arr_b, v, v1);
        return null;
    }

    @Override  // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key0) {
        byte[] arr_b = key0.getEncoded();
        if(arr_b != null) {
            try {
                return this.wrapEngine == null ? this.engineDoFinal(arr_b, 0, arr_b.length) : this.wrapEngine.d(arr_b, arr_b.length);
            }
            catch(BadPaddingException badPaddingException0) {
                throw new IllegalBlockSizeException(badPaddingException0.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }
}

