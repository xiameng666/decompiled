package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import iebo;
import iecd;
import ievq;
import iewn;
import ifkk;
import ifkl;
import ifkn;
import ifko;
import ifkp;
import ifss;
import ifuf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class MLDSAKeyPairGeneratorSpi extends KeyPairGenerator {
    ifkl engine;
    boolean initialised;
    private final ifkn mldsaParameters;
    ifkk param;
    SecureRandom random;

    protected MLDSAKeyPairGeneratorSpi(ievq ievq0) {
        super(ifuf.c(ievq0.g));
        this.engine = new ifkl();
        this.random = iecd.b();
        this.initialised = false;
        ifkn ifkn0 = Utils.getParameters(ievq0.g);
        this.mldsaParameters = ifkn0;
        if(this.param == null) {
            this.param = new ifkk(this.random, ifkn0);
        }
        this.engine.b(this.param);
        this.initialised = true;
    }

    public MLDSAKeyPairGeneratorSpi(String s) {
        super(s);
        this.engine = new ifkl();
        this.random = iecd.b();
        this.initialised = false;
        this.mldsaParameters = null;
    }

    @Override
    public KeyPair generateKeyPair() {
        if(!this.initialised) {
            this.param = this.getAlgorithm().startsWith("HASH") ? new ifkk(this.random, ifkn.f) : new ifkk(this.random, ifkn.c);
            this.engine.b(this.param);
            this.initialised = true;
        }
        iebo iebo0 = this.engine.a();
        return new KeyPair(new BCMLDSAPublicKey(((ifkp)iebo0.a)), new BCMLDSAPrivateKey(((ifko)iebo0.b)));
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec0) {
        return (algorithmParameterSpec0 instanceof ievq) ? ((ievq)algorithmParameterSpec0).g : ifuf.c(ifss.a(algorithmParameterSpec0));
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
        String s = MLDSAKeyPairGeneratorSpi.getNameFromParams(algorithmParameterSpec0);
        if(s == null) {
            throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + algorithmParameterSpec0);
        }
        ifkn ifkn0 = Utils.getParameters(s);
        if(ifkn0 == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: " + s);
        }
        this.param = new ifkk(secureRandom0, ifkn0);
        if(this.mldsaParameters != null && !ifkn0.g.equals(this.mldsaParameters.g)) {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + ievq.a(this.mldsaParameters.g).g);
        }
        this.engine.b(this.param);
        this.initialised = true;
    }
}

