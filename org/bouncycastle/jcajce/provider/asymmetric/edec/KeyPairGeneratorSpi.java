package org.bouncycastle.jcajce.provider.asymmetric.edec;

import iebo;
import iebp;
import iecd;
import iecp;
import iejz;
import ieka;
import iekq;
import iekr;
import iete;
import ieve;
import iewj;
import iexo;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.NamedParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import rl..ExternalSyntheticApiModelOutline0;

public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private iebp generator;
    private SecureRandom secureRandom;

    public KeyPairGeneratorSpi(int v) {
        this.algorithmDeclared = v;
        if(KeyPairGeneratorSpi.getAlgorithmFamily(v) != v) {
            this.algorithmInitialized = v;
        }
    }

    @Override
    public KeyPair generateKeyPair() {
        if(this.algorithmInitialized != 0) {
            if(this.generator == null) {
                this.generator = this.setupGenerator();
            }
            iebo iebo0 = this.generator.a();
            switch(this.algorithmInitialized) {
                case 1: 
                case 2: {
                    return new KeyPair(new BCEdDSAPublicKey(iebo0.a), new BCEdDSAPrivateKey(iebo0.b));
                }
                case 3: 
                case 4: {
                    return new KeyPair(new BC11XDHPublicKey(iebo0.a), new BC11XDHPrivateKey(iebo0.b));
                }
                default: {
                    throw new IllegalStateException("generator not correctly initialized");
                }
            }
        }
        throw new IllegalStateException("generator not correctly initialized");
    }

    private static int getAlgorithmFamily(int v) {
        switch(v) {
            case 1: 
            case 2: {
                return -1;
            }
            case 3: 
            case 4: {
                return -2;
            }
            default: {
                return v;
            }
        }
    }

    private static int getAlgorithmForName(String s) {
        if(!s.equalsIgnoreCase("X25519") && !s.equals(iete.b.b())) {
            if(!s.equalsIgnoreCase("Ed25519") && !s.equals(iete.d.b())) {
                if(!s.equalsIgnoreCase("X448") && !s.equals(iete.c.b())) {
                    if(!s.equalsIgnoreCase("Ed448") && !s.equals(iete.e.b())) {
                        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: " + s);
                    }
                    return 2;
                }
                return 4;
            }
            return 1;
        }
        return 3;
    }

    private int getAlgorithmForStrength(int v) {
        switch(v) {
            case 0xFF: 
            case 0x100: {
                int v1 = this.algorithmDeclared;
                if(v1 != -2) {
                    switch(v1) {
                        case -1: 
                        case 1: {
                            return 1;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            throw new InvalidParameterException("key size not configurable");
                        }
                    }
                }
                return 3;
            }
            case 0x1C0: {
                int v2 = this.algorithmDeclared;
                if(v2 != -2) {
                    switch(v2) {
                        case -1: 
                        case 2: {
                            return 2;
                        }
                        case 4: {
                            break;
                        }
                        default: {
                            throw new InvalidParameterException("key size not configurable");
                        }
                    }
                }
                return 4;
            }
            default: {
                throw new InvalidParameterException("unknown key size");
            }
        }
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec0) {
        if((algorithmParameterSpec0 instanceof ECGenParameterSpec)) {
            return ((ECGenParameterSpec)algorithmParameterSpec0).getName();
        }
        if((algorithmParameterSpec0 instanceof iexo)) {
            return ((iexo)algorithmParameterSpec0).a;
        }
        if(rl..ExternalSyntheticApiModelOutline0.m(algorithmParameterSpec0)) {
            return ((NamedParameterSpec)algorithmParameterSpec0).getName();
        }
        if(!(algorithmParameterSpec0 instanceof ieve)) {
            if(!(algorithmParameterSpec0 instanceof iewj)) {
                return ECUtil.getNameFrom(algorithmParameterSpec0);
            }
            iewj iewj0 = (iewj)algorithmParameterSpec0;
            throw null;
        }
        ieve ieve0 = (ieve)algorithmParameterSpec0;
        throw null;
    }

    @Override
    public void initialize(int v, SecureRandom secureRandom0) {
        this.algorithmInitialized = this.getAlgorithmForStrength(v);
        this.secureRandom = secureRandom0;
        this.generator = null;
    }

    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        String s = KeyPairGeneratorSpi.getNameFromParams(algorithmParameterSpec0);
        if(s == null) {
            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec0);
        }
        int v = KeyPairGeneratorSpi.getAlgorithmForName(s);
        if(this.algorithmDeclared != v && this.algorithmDeclared != KeyPairGeneratorSpi.getAlgorithmFamily(v)) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        }
        this.algorithmInitialized = v;
        this.secureRandom = secureRandom0;
        this.generator = null;
    }

    private iebp setupGenerator() {
        if(this.secureRandom == null) {
            this.secureRandom = iecd.b();
        }
        switch(this.algorithmInitialized) {
            case 1: {
                iebp iebp0 = new iejz();
                ((iejz)iebp0).b(new iecp(this.secureRandom, 0x100));
                return iebp0;
            }
            case 2: {
                iebp iebp1 = new ieka();
                ((ieka)iebp1).b(new iecp(this.secureRandom, 0x1C0));
                return iebp1;
            }
            case 3: {
                iebp iebp2 = new iekq();
                ((iekq)iebp2).b(new iecp(this.secureRandom, 0xFF));
                return iebp2;
            }
            case 4: {
                iebp iebp3 = new iekr();
                ((iekr)iebp3).b(new iecp(this.secureRandom, 0x1C0));
                return iebp3;
            }
            default: {
                throw new IllegalStateException("generator not correctly initialized");
            }
        }
    }
}

