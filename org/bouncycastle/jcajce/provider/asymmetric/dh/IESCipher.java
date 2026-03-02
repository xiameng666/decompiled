package org.bouncycastle.jcajce.provider.asymmetric.dh;

import a;
import iebs;
import iecn;
import iehx;
import iejs;
import iekd;
import iele;
import ienr;
import ient;
import ienu;
import ienx;
import ieph;
import iepq;
import ieqj;
import iewl;
import iewn;
import iexb;
import ieyc;
import ifuf;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;

public class IESCipher extends BaseCipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private iehx engine;
    private AlgorithmParameters engineParam;
    private ieyc engineSpec;
    private final iewl helper;
    private final int ivLength;
    private ienr key;
    private ienr otherKeyParameter;
    private SecureRandom random;
    private int state;

    public IESCipher(iehx iehx0) {
        this.helper = new iewn();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = iehx0;
        this.ivLength = 0;
    }

    public IESCipher(iehx iehx0, int v) {
        this.helper = new iewn();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = iehx0;
        this.ivLength = v;
    }

    @Override  // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        byte[] arr_b2 = this.engineDoFinal(arr_b, v, v1);
        System.arraycopy(arr_b2, 0, arr_b1, v2, arr_b2.length);
        return arr_b2.length;
    }

    @Override  // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] arr_b, int v, int v1) {
        if(v1 != 0) {
            this.buffer.write(arr_b, v, v1);
        }
        byte[] arr_b1 = this.buffer.toByteArray();
        this.buffer.reset();
        ieph ieph0 = new ieph(this.engineSpec.a(), this.engineSpec.b(), this.engineSpec.a, this.engineSpec.b);
        byte[] arr_b2 = this.engineSpec.c();
        if(arr_b2 != null) {
            ieph0 = new iepq(ieph0, arr_b2);
        }
        ienr ienr0 = this.key;
        ienx ienx0 = ((ienu)ienr0).b;
        ienr ienr1 = this.otherKeyParameter;
        if(ienr1 != null) {
            try {
                if(this.state != 1 && this.state != 3) {
                    this.engine.c(false, ienr0, ienr1, ieph0);
                }
                else {
                    this.engine.c(true, ienr1, ienr0, ieph0);
                }
                return this.engine.e(arr_b1, arr_b1.length);
            }
            catch(Exception exception0) {
                throw new BadBlockException("unable to process block", exception0);
            }
        }
        int v2 = this.state;
        if(v2 != 1 && v2 != 3) {
            if(v2 != 2 && v2 != 4) {
                throw new IllegalStateException("IESCipher not initialised");
            }
            try {
                this.engine.a(ienr0, ieph0, new ieqj(ienx0));
                return this.engine.e(arr_b1, arr_b1.length);
            }
            catch(iecn iecn0) {
                throw new BadBlockException("unable to process block", iecn0);
            }
        }
        iejs iejs0 = new iejs();
        iejs0.b(new ient(this.random, ienx0));
        iekd iekd0 = new iekd(iejs0, new IESCipher.1(this));
        try {
            this.engine.b(this.key, ieph0, iekd0);
            return this.engine.e(arr_b1, arr_b1.length);
        }
        catch(Exception exception1) {
            throw new BadBlockException("unable to process block", exception1);
        }
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetBlockSize() {
        iebs iebs0 = this.engine.d;
        return iebs0 == null ? 0 : iebs0.b();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public byte[] engineGetIV() {
        return this.engineSpec == null ? null : this.engineSpec.c();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetKeySize(Key key0) {
        if((key0 instanceof DHKey)) {
            return ((DHKey)key0).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetOutputSize(int v) {
        int v3;
        ienr ienr0 = this.key;
        if(ienr0 == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        int v1 = ((iele)this.engine.c).a;
        if(this.otherKeyParameter == null) {
            int v2 = ((ienu)ienr0).b.b.bitLength() + 7;
            v3 = (v2 + v2) / 8 + 1;
        }
        else {
            v3 = 0;
        }
        iebs iebs0 = this.engine.d;
        if(iebs0 != null) {
            int v4 = this.state;
            if(v4 != 1 && v4 != 3) {
                if(v4 != 2 && v4 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                v = iebs0.c(v - v1 - v3);
            }
            else {
                v = iebs0.c(v);
            }
        }
        int v5 = this.state;
        if(v5 != 1 && v5 != 3) {
            if(v5 != 2 && v5 != 4) {
                throw new IllegalStateException("IESCipher not initialised");
            }
            return this.buffer.size() - v1 - v3 + v;
        }
        return this.buffer.size() + v1 + v3 + v;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public AlgorithmParameters engineGetParameters() {
        if(this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters algorithmParameters0 = this.helper.a("IES");
                this.engineParam = algorithmParameters0;
                algorithmParameters0.init(this.engineSpec);
                return this.engineParam;
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0.toString());
            }
        }
        return this.engineParam;
    }

    @Override  // javax.crypto.CipherSpi
    public void engineInit(int v, Key key0, AlgorithmParameters algorithmParameters0, SecureRandom secureRandom0) {
        AlgorithmParameterSpec algorithmParameterSpec0;
        if(algorithmParameters0 == null) {
            algorithmParameterSpec0 = null;
        }
        else {
            try {
                algorithmParameterSpec0 = algorithmParameters0.getParameterSpec(ieyc.class);
            }
            catch(Exception exception0) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + exception0.toString());
            }
        }
        this.engineParam = algorithmParameters0;
        this.engineInit(v, key0, algorithmParameterSpec0, secureRandom0);
    }

    @Override  // javax.crypto.CipherSpi
    public void engineInit(int v, Key key0, SecureRandom secureRandom0) {
        try {
            this.engineInit(v, key0, null, secureRandom0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + invalidAlgorithmParameterException0.getMessage());
        }
    }

    @Override  // javax.crypto.CipherSpi
    public void engineInit(int v, Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        if(algorithmParameterSpec0 == null && this.ivLength == 0) {
            this.engineSpec = IESUtil.guessParameterSpec(this.engine.d, null);
        }
        else {
            if(!(algorithmParameterSpec0 instanceof ieyc)) {
                throw new InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            this.engineSpec = (ieyc)algorithmParameterSpec0;
        }
        byte[] arr_b = this.engineSpec.c();
        int v1 = this.ivLength;
        if(v1 != 0 && (arr_b == null || arr_b.length != v1)) {
            throw new InvalidAlgorithmParameterException(a.f(v1, "NONCE in IES Parameters needs to be ", " bytes long"));
        }
        switch(v) {
            case 1: 
            case 3: {
                if((key0 instanceof DHPublicKey)) {
                    this.key = DHUtil.generatePublicKeyParameter(((PublicKey)key0));
                    this.random = secureRandom0;
                    this.state = v;
                    this.buffer.reset();
                    return;
                }
                if(!(key0 instanceof iexb)) {
                    throw new InvalidKeyException("must be passed recipient\'s public DH key for encryption");
                }
                this.key = DHUtil.generatePublicKeyParameter(((iexb)key0).b());
                this.otherKeyParameter = DHUtil.generatePrivateKeyParameter(((iexb)key0).a());
                this.random = secureRandom0;
                this.state = v;
                this.buffer.reset();
                return;
            }
            case 2: 
            case 4: {
                if((key0 instanceof DHPrivateKey)) {
                    this.key = DHUtil.generatePrivateKeyParameter(((PrivateKey)key0));
                    this.random = secureRandom0;
                    this.state = v;
                    this.buffer.reset();
                    return;
                }
                break;
            }
            default: {
                throw new InvalidKeyException("must be passed EC key");
            }
        }
        if(!(key0 instanceof iexb)) {
            throw new InvalidKeyException("must be passed recipient\'s private DH key for decryption");
        }
        this.otherKeyParameter = DHUtil.generatePublicKeyParameter(((iexb)key0).b());
        this.key = DHUtil.generatePrivateKeyParameter(((iexb)key0).a());
        this.random = secureRandom0;
        this.state = v;
        this.buffer.reset();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public void engineSetMode(String s) {
        boolean z;
        String s1 = ifuf.c(s);
        if(s1.equals("NONE")) {
            z = false;
            this.dhaesMode = z;
            return;
        }
        if(!s1.equals("DHAES")) {
            throw new IllegalArgumentException("can\'t support mode " + s);
        }
        z = true;
        this.dhaesMode = z;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public void engineSetPadding(String s) {
        String s1 = ifuf.c(s);
        if(!s1.equals("NOPADDING") && !s1.equals("PKCS5PADDING") && !s1.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override  // javax.crypto.CipherSpi
    public int engineUpdate(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        this.buffer.write(arr_b, v, v1);
        return 0;
    }

    @Override  // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] arr_b, int v, int v1) {
        this.buffer.write(arr_b, v, v1);
        return null;
    }
}

