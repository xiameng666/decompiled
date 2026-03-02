package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import iebo;
import iecd;
import ievt;
import iewn;
import ifle;
import iflf;
import iflh;
import ifli;
import iflj;
import ifss;
import ifuf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class MLKEMKeyPairGeneratorSpi extends KeyPairGenerator {
    iflf engine;
    boolean initialised;
    private iflh mlkemParameters;
    ifle param;
    SecureRandom random;

    public MLKEMKeyPairGeneratorSpi() {
        super("ML-KEM");
        this.engine = new iflf();
        this.random = iecd.b();
        this.initialised = false;
    }

    protected MLKEMKeyPairGeneratorSpi(ievt ievt0) {
        super(ifuf.c(ievt0.d));
        this.engine = new iflf();
        this.random = iecd.b();
        this.initialised = false;
        this.mlkemParameters = Utils.getParameters(ievt0.d);
        if(this.param == null) {
            this.param = new ifle(this.random, this.mlkemParameters);
        }
        this.engine.d(this.param);
        this.initialised = true;
    }

    @Override
    public KeyPair generateKeyPair() {
        if(!this.initialised) {
            ifle ifle0 = new ifle(this.random, iflh.b);
            this.param = ifle0;
            this.engine.d(ifle0);
            this.initialised = true;
        }
        iebo iebo0 = this.engine.c();
        return new KeyPair(new BCMLKEMPublicKey(((iflj)iebo0.a)), new BCMLKEMPrivateKey(((ifli)iebo0.b)));
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec0) {
        return (algorithmParameterSpec0 instanceof ievt) ? ((ievt)algorithmParameterSpec0).d : ifuf.c(ifss.a(algorithmParameterSpec0));
    }

    @Override
    public void initialize(int v, SecureRandom secureRandom0) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec0) {
        try {
            this.initialize(algorithmParameterSpec0, new iewn().h());
        }
        catch(NoSuchAlgorithmException unused_ex) {
            throw new IllegalStateException("unable to find DEFAULT DRBG");
        }
    }

    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        String s = MLKEMKeyPairGeneratorSpi.getNameFromParams(algorithmParameterSpec0);
        if(s == null) {
            throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + algorithmParameterSpec0);
        }
        iflh iflh0 = Utils.getParameters(s);
        if(iflh0 == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: " + s);
        }
        if(this.mlkemParameters != null && !iflh0.d.equals(this.mlkemParameters.d)) {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + this.getAlgorithm());
        }
        ifle ifle0 = new ifle(secureRandom0, iflh0);
        this.param = ifle0;
        this.engine.d(ifle0);
        this.initialised = true;
    }
}

