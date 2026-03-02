package org.bouncycastle.jcajce.provider.asymmetric.ec;

import iecd;
import iein;
import ienr;
import iepr;
import iewl;
import iewn;
import iewr;
import ifuf;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;

public class GMCipherSpi extends CipherSpi {
    private GMCipherSpi.ErasableOutputStream buffer;
    private iein engine;
    private final iewl helper;
    private ienr key;
    private SecureRandom random;
    private int state;

    public GMCipherSpi(iein iein0) {
        this.helper = new iewn();
        this.state = -1;
        this.buffer = new GMCipherSpi.ErasableOutputStream();
        this.engine = iein0;
    }

    @Override  // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        byte[] arr_b2 = this.engineDoFinal(arr_b, v, v1);
        System.arraycopy(arr_b2, 0, arr_b1, v2, arr_b2.length);
        return arr_b2.length;
    }

    @Override  // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] arr_b, int v, int v1) {
        byte[] arr_b1;
        if(v1 != 0) {
            this.buffer.write(arr_b, v, v1);
        }
        try {
            switch(this.state) {
                case 1: 
                case 3: {
                    try {
                        this.engine.b(true, new iepr(this.key, this.random));
                        arr_b1 = this.engine.c(this.buffer.getBuf(), this.buffer.size());
                        break;
                    }
                    catch(Exception exception0) {
                        throw new BadBlockException("unable to process block", exception0);
                    }
                }
                case 2: 
                case 4: {
                    try {
                        this.engine.b(false, this.key);
                        arr_b1 = this.engine.c(this.buffer.getBuf(), this.buffer.size());
                        break;
                    }
                    catch(Exception exception1) {
                        throw new BadBlockException("unable to process block", exception1);
                    }
                }
                default: {
                    throw new IllegalStateException("cipher not initialised");
                }
            }
        }
        finally {
            this.buffer.erase();
        }
        return arr_b1;
    }

    @Override  // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override  // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override  // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key0) {
        if((key0 instanceof iewr)) {
            return ((iewr)key0).getParameters().b.h();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override  // javax.crypto.CipherSpi
    public int engineGetOutputSize(int v) {
        switch(this.state) {
            case 1: 
            case 3: {
                return this.engine.a(v);
            }
            case 2: 
            case 4: {
                return this.engine.a(v);
            }
            default: {
                throw new IllegalStateException("cipher not initialised");
            }
        }
    }

    @Override  // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override  // javax.crypto.CipherSpi
    public void engineInit(int v, Key key0, AlgorithmParameters algorithmParameters0, SecureRandom secureRandom0) {
        if(algorithmParameters0 != null) {
            throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + algorithmParameters0.getClass().getName());
        }
        this.engineInit(v, key0, null, secureRandom0);
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
        switch(v) {
            case 1: 
            case 3: {
                goto label_2;
            }
            case 2: 
            case 4: {
                goto label_6;
            }
        }
        throw new InvalidKeyException("must be passed EC key");
    label_2:
        if(!(key0 instanceof PublicKey)) {
            throw new InvalidKeyException("must be passed public EC key for encryption");
        }
        this.key = ECUtils.generatePublicKeyParameter(((PublicKey)key0));
        this.random = secureRandom0 == null ? iecd.b() : secureRandom0;
        this.state = v;
        this.buffer.reset();
        return;
    label_6:
        if(!(key0 instanceof PrivateKey)) {
            throw new InvalidKeyException("must be passed private EC key for decryption");
        }
        this.key = ECUtil.generatePrivateKeyParameter(((PrivateKey)key0));
        this.random = secureRandom0 == null ? iecd.b() : secureRandom0;
        this.state = v;
        this.buffer.reset();
    }

    @Override  // javax.crypto.CipherSpi
    public void engineSetMode(String s) {
        if(ifuf.c(s).equals("NONE")) {
            return;
        }
        throw new IllegalArgumentException("can\'t support mode " + s);
    }

    @Override  // javax.crypto.CipherSpi
    public void engineSetPadding(String s) {
        if(ifuf.c(s).equals("NOPADDING")) {
            return;
        }
        throw new NoSuchPaddingException("padding not available with IESCipher");
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

