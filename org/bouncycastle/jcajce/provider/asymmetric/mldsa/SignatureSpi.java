package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import iebu;
import ieue;
import ievq;
import ifkn;
import ifkq;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;

public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    protected ifkn parameters;
    protected ifkq signer;

    protected SignatureSpi(ifkq ifkq0) {
        super("MLDSA");
        this.signer = ifkq0;
        this.parameters = null;
    }

    protected SignatureSpi(ifkq ifkq0, ifkn ifkn0) {
        super(ievq.a(ifkn0.g).g);
        this.signer = ifkq0;
        this.parameters = ifkn0;
    }

    @Override
    protected byte[] engineSign() {
        try {
            return this.signer.e();
        }
        catch(Exception exception0) {
            throw new SignatureException(exception0.toString());
        }
    }

    @Override
    protected boolean engineVerify(byte[] arr_b) {
        return this.signer.d(arr_b);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void reInitialize(boolean z, iebu iebu0) {
        this.signer.a(z, iebu0);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void signInit(PrivateKey privateKey0, SecureRandom secureRandom0) {
        this.appRandom = secureRandom0;
        if((privateKey0 instanceof BCMLDSAPrivateKey)) {
            this.keyParams = ((BCMLDSAPrivateKey)privateKey0).getKeyParams();
            ifkn ifkn0 = this.parameters;
            if(ifkn0 != null) {
                String s = ievq.a(ifkn0.g).g;
                if(!s.equals(((BCMLDSAPrivateKey)privateKey0).getAlgorithm())) {
                    throw new InvalidKeyException("signature configured for " + s);
                }
            }
            return;
        }
        if(!(privateKey0 instanceof ieue) || !(this instanceof SignatureSpi.MLDSACalcMu)) {
            throw new InvalidKeyException("unknown private key passed to ML-DSA");
        }
        ieue ieue0 = (ieue)privateKey0;
        throw null;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void updateEngine(byte b) {
        this.signer.b(b);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void updateEngine(byte[] arr_b, int v, int v1) {
        this.signer.c(arr_b, v, v1);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void verifyInit(PublicKey publicKey0) {
        if(!(publicKey0 instanceof BCMLDSAPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to ML-DSA");
        }
        this.keyParams = ((BCMLDSAPublicKey)publicKey0).getKeyParams();
        ifkn ifkn0 = this.parameters;
        if(ifkn0 != null) {
            String s = ievq.a(ifkn0.g).g;
            if(!s.equals(((BCMLDSAPublicKey)publicKey0).getAlgorithm())) {
                throw new InvalidKeyException("signature configured for " + s);
            }
        }
    }
}

