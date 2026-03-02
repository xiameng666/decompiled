package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import idqg;
import idsc;
import idyk;
import idyu;
import iebn;
import iecl;
import iepy;
import iftq;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class DigestSignatureSpi extends SignatureSpi {
    private idyk algId;
    private iebn cipher;
    private iecl digest;

    protected DigestSignatureSpi(idqg idqg0, iecl iecl0, iebn iebn0) {
        this.digest = iecl0;
        this.cipher = iebn0;
        this.algId = new idyk(idqg0, idsc.b);
    }

    protected DigestSignatureSpi(iecl iecl0, iebn iebn0) {
        this.digest = iecl0;
        this.cipher = iebn0;
        this.algId = null;
    }

    private byte[] derEncode(byte[] arr_b) {
        return this.algId == null ? arr_b : new idyu(this.algId, arr_b).v("DER");
    }

    @Override
    protected Object engineGetParameter(String s) {
        return null;
    }

    @Override
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    protected void engineInitSign(PrivateKey privateKey0) {
        if(!(privateKey0 instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key (" + this.getType(privateKey0) + ") is not a RSAPrivateKey instance");
        }
        iepy iepy0 = RSAUtil.generatePrivateKeyParameter(((RSAPrivateKey)privateKey0));
        this.digest.reset();
        this.cipher.init(true, iepy0);
    }

    @Override
    protected void engineInitVerify(PublicKey publicKey0) {
        if(!(publicKey0 instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key (" + this.getType(publicKey0) + ") is not a RSAPublicKey instance");
        }
        iepy iepy0 = RSAUtil.generatePublicKeyParameter(((RSAPublicKey)publicKey0));
        this.digest.reset();
        this.cipher.init(false, iepy0);
    }

    @Override
    protected void engineSetParameter(String s, Object object0) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec0) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override
    protected byte[] engineSign() {
        byte[] arr_b = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(arr_b, 0);
        try {
            byte[] arr_b1 = this.derEncode(arr_b);
            return this.cipher.processBlock(arr_b1, 0, arr_b1.length);
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new SignatureException("key too small for signature type");
        }
        catch(Exception exception0) {
            throw new SignatureException(exception0.toString());
        }
    }

    @Override
    protected void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override
    protected void engineUpdate(byte[] arr_b, int v, int v1) {
        this.digest.update(arr_b, v, v1);
    }

    @Override
    protected boolean engineVerify(byte[] arr_b) {
        byte[] arr_b3;
        byte[] arr_b2;
        byte[] arr_b1 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(arr_b1, 0);
        try {
            arr_b2 = this.cipher.processBlock(arr_b, 0, arr_b.length);
            arr_b3 = this.derEncode(arr_b1);
            if(arr_b2.length == arr_b3.length) {
                return iftq.f(arr_b2, arr_b3);
            }
        }
        catch(Exception unused_ex) {
            return false;
        }
        if(arr_b2.length == arr_b3.length - 2) {
            arr_b3[1] = (byte)(arr_b3[1] - 2);
            byte b = (byte)(arr_b3[3] - 2);
            arr_b3[3] = b;
            int v1 = 0;
            for(int v = 0; v < arr_b3.length - (b + 6); ++v) {
                v1 |= arr_b2[b + 4 + v] ^ arr_b3[b + 6 + v];
            }
            for(int v2 = 0; v2 < b + 4; ++v2) {
                v1 |= arr_b2[v2] ^ arr_b3[v2];
            }
            return v1 == 0;
        }
        return false;
    }

    private String getType(Object object0) {
        return object0 == null ? null : object0.getClass().getName();
    }
}

