package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import iebu;
import ifmy;
import ifnp;
import ifnq;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;

public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    private final ifmy signer;

    protected HashSignatureSpi(ifmy ifmy0) {
        super("HASH-SLH-DSA");
        this.signer = ifmy0;
    }

    @Override
    protected byte[] engineSign() {
        if((this.keyParams instanceof ifnp)) {
            try {
                try {
                    byte[] arr_b = this.signer.e();
                    this.isInitState = true;
                    return arr_b;
                }
                catch(Exception exception0) {
                    throw new SignatureException(exception0.toString());
                }
            }
            catch(Throwable throwable0) {
                this.isInitState = true;
                throw throwable0;
            }
        }
        throw new SignatureException("engine initialized for verification");
    }

    @Override
    protected boolean engineVerify(byte[] arr_b) {
        if((this.keyParams instanceof ifnq)) {
            try {
                boolean z = this.signer.d(arr_b);
                this.isInitState = true;
                return z;
            }
            catch(Throwable throwable0) {
                this.isInitState = true;
                throw throwable0;
            }
        }
        throw new SignatureException("engine initialized for signing");
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void reInitialize(boolean z, iebu iebu0) {
        this.signer.a(z, iebu0);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void signInit(PrivateKey privateKey0, SecureRandom secureRandom0) {
        this.appRandom = secureRandom0;
        if(!(privateKey0 instanceof BCSLHDSAPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to SLH-DSA");
        }
        this.keyParams = ((BCSLHDSAPrivateKey)privateKey0).getKeyParams();
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
        if(!(publicKey0 instanceof BCSLHDSAPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to SLH-DSA");
        }
        this.keyParams = ((BCSLHDSAPublicKey)publicKey0).getKeyParams();
    }
}

