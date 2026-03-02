package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import iebo;
import iecb;
import iecd;
import ieex;
import iejv;
import iejw;
import ieob;
import ieod;
import ieoe;
import ieof;
import ieog;
import ifud;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    iejv engine;
    boolean initialised;
    private static Object lock;
    ieob param;
    private static Hashtable params;
    SecureRandom random;
    int strength;

    static {
        KeyPairGeneratorSpi.params = new Hashtable();
        KeyPairGeneratorSpi.lock = new Object();
    }

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.engine = new iejv();
        this.strength = 0x800;
        this.random = iecd.b();
        this.initialised = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        iejw iejw0;
        if(!this.initialised) {
            Integer integer0 = (int)this.strength;
            if(KeyPairGeneratorSpi.params.containsKey(integer0)) {
                this.param = (ieob)KeyPairGeneratorSpi.params.get(integer0);
            }
            else {
                synchronized(KeyPairGeneratorSpi.lock) {
                    if(KeyPairGeneratorSpi.params.containsKey(integer0)) {
                        this.param = (ieob)KeyPairGeneratorSpi.params.get(integer0);
                    }
                    else {
                        int v1 = this.strength;
                        int v2 = PrimeCertaintyCalculator.getDefaultCertainty(v1);
                        if(v1 == 0x400) {
                            iejw0 = new iejw();
                            if(ifud.c("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                iejw0.c(this.strength, v2, this.random);
                            }
                            else {
                                iejw0.b(new ieod(0x400, 0xA0, v2, this.random));
                            }
                        }
                        else if(v1 > 0x400) {
                            ieod ieod0 = new ieod(v1, 0x100, v2, this.random);
                            iejw0 = new iejw(new ieex());
                            iejw0.b(ieod0);
                        }
                        else {
                            iejw0 = new iejw();
                            iejw0.c(this.strength, v2, this.random);
                        }
                        ieob ieob0 = new ieob(this.random, iejw0.a());
                        this.param = ieob0;
                        KeyPairGeneratorSpi.params.put(integer0, ieob0);
                    }
                }
            }
            this.engine.b(this.param);
            this.initialised = true;
        }
        iebo iebo0 = this.engine.a();
        return new KeyPair(new BCDSAPublicKey(((ieog)iebo0.a)), new BCDSAPrivateKey(((ieof)iebo0.b)));
    }

    @Override
    public void initialize(int v, SecureRandom secureRandom0) {
        boolean z;
        if(v < 0x200 || v > 0x1000 || v < 0x400 && (v & 0x3F) != 0 || v >= 0x400 && (v & 0x3FF) != 0) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        ieoe ieoe0 = (ieoe)iecd.a(iecb.b, v);
        DSAParameterSpec dSAParameterSpec0 = ieoe0 == null ? null : new DSAParameterSpec(ieoe0.c, ieoe0.b, ieoe0.a);
        if(dSAParameterSpec0 == null) {
            this.strength = v;
            this.random = secureRandom0;
            z = false;
        }
        else {
            ieob ieob0 = new ieob(secureRandom0, new ieoe(dSAParameterSpec0.getP(), dSAParameterSpec0.getQ(), dSAParameterSpec0.getG()));
            this.param = ieob0;
            this.engine.b(ieob0);
            z = true;
        }
        this.initialised = z;
    }

    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        if(!(algorithmParameterSpec0 instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        ieob ieob0 = new ieob(secureRandom0, new ieoe(((DSAParameterSpec)algorithmParameterSpec0).getP(), ((DSAParameterSpec)algorithmParameterSpec0).getQ(), ((DSAParameterSpec)algorithmParameterSpec0).getG()));
        this.param = ieob0;
        this.engine.b(ieob0);
        this.initialised = true;
    }
}

