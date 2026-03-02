package org.bouncycastle.jcajce.provider.symmetric.util;

import iebu;
import iecr;
import iele;
import ienq;
import iepk;
import iepq;
import iepu;
import ieqa;
import ieuj;
import ieux;
import iewf;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

public class BaseMac extends MacSpi implements PBE {
    private int keySize;
    private iecr macEngine;
    private int pbeHash;
    private int scheme;

    protected BaseMac(int v, iecr iecr0) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = v;
        this.macEngine = iecr0;
    }

    protected BaseMac(iecr iecr0) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 0xA0;
        this.macEngine = iecr0;
    }

    protected BaseMac(iecr iecr0, int v, int v1, int v2) {
        this.macEngine = iecr0;
        this.scheme = v;
        this.pbeHash = v1;
        this.keySize = v2;
    }

    private static Hashtable copyMap(Map map0) {
        Hashtable hashtable0 = new Hashtable();
        for(Object object0: map0.keySet()) {
            hashtable0.put(object0, map0.get(object0));
        }
        return hashtable0;
    }

    @Override  // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] arr_b = new byte[this.engineGetMacLength()];
        this.macEngine.doFinal(arr_b, 0);
        return arr_b;
    }

    @Override  // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override  // javax.crypto.MacSpi
    protected void engineInit(Key key0, AlgorithmParameterSpec algorithmParameterSpec0) {
        iebu iebu0;
        int v1;
        PBEParameterSpec pBEParameterSpec0;
        SecretKey secretKey0;
        if(key0 == null) {
            throw new InvalidKeyException("key is null");
        }
        if((key0 instanceof ieuj)) {
            try {
                secretKey0 = (SecretKey)key0;
            }
            catch(Exception unused_ex) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
            try {
                pBEParameterSpec0 = (PBEParameterSpec)algorithmParameterSpec0;
            }
            catch(Exception unused_ex) {
                throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
            }
            if((secretKey0 instanceof PBEKey) && pBEParameterSpec0 == null) {
                pBEParameterSpec0 = new PBEParameterSpec(((PBEKey)secretKey0).getSalt(), ((PBEKey)secretKey0).getIterationCount());
            }
            int v = 0x100;
            if(this.macEngine.getAlgorithmName().startsWith("GOST")) {
                v1 = 6;
            }
            else if(!(this.macEngine instanceof iele) || this.macEngine.getAlgorithmName().startsWith("SHA-1")) {
                v1 = 1;
                v = 0xA0;
            }
            else if(this.macEngine.getAlgorithmName().startsWith("SHA-224")) {
                v = 0xE0;
                v1 = 7;
            }
            else if(this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                v1 = 4;
            }
            else if(this.macEngine.getAlgorithmName().startsWith("SHA-384")) {
                v = 0x180;
                v1 = 8;
            }
            else if(this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                v = 0x200;
                v1 = 9;
            }
            else {
                if(!this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                    throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                }
                v1 = 2;
                v = 0xA0;
                iebu0 = PBE.Util.makePBEMacParameters(secretKey0, 2, v1, v, pBEParameterSpec0);
                goto label_49;
            }
            iebu0 = PBE.Util.makePBEMacParameters(secretKey0, 2, v1, v, pBEParameterSpec0);
        }
        else {
            if((key0 instanceof BCPBEKey)) {
                if(((BCPBEKey)key0).getParam() != null) {
                    iebu0 = ((BCPBEKey)key0).getParam();
                    goto label_49;
                }
                if(!(algorithmParameterSpec0 instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                iebu0 = PBE.Util.makePBEMacParameters(((BCPBEKey)key0), algorithmParameterSpec0);
                goto label_49;
            }
            if((algorithmParameterSpec0 instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec0.getClass().getName());
            }
            iebu0 = new iepk(key0.getEncoded());
        }
    label_49:
        iepk iepk0 = (iebu0 instanceof iepq) ? ((iepk)((iepq)iebu0).b) : ((iepk)iebu0);
        if((algorithmParameterSpec0 instanceof ieux)) {
            byte[] arr_b = ((ieux)algorithmParameterSpec0).getIV();
            iebu0 = new ienq(iepk0, ((ieux)algorithmParameterSpec0).a, arr_b, null);
            goto label_78;
        }
        if((algorithmParameterSpec0 instanceof IvParameterSpec)) {
            iebu0 = new iepq(iepk0, ((IvParameterSpec)algorithmParameterSpec0).getIV());
            goto label_78;
        }
        if((algorithmParameterSpec0 instanceof RC2ParameterSpec)) {
            iebu0 = new iepq(new iepu(iepk0.a(), ((RC2ParameterSpec)algorithmParameterSpec0).getEffectiveKeyBits()), ((RC2ParameterSpec)algorithmParameterSpec0).getIV());
            goto label_78;
        }
        if((algorithmParameterSpec0 instanceof iewf)) {
            Hashtable hashtable0 = BaseMac.copyMap(((iewf)algorithmParameterSpec0).a);
            Hashtable hashtable1 = new Hashtable();
            Enumeration enumeration0 = hashtable0.keys();
            while(enumeration0.hasMoreElements()) {
                Integer integer0 = (Integer)enumeration0.nextElement();
                hashtable1.put(integer0, hashtable0.get(integer0));
            }
            ieqa.b(iepk0.a(), hashtable1);
            iebu0 = ieqa.a(hashtable1);
            goto label_78;
        }
        if(algorithmParameterSpec0 == null) {
            iebu0 = new iepk(key0.getEncoded());
            goto label_78;
        }
        if(GcmSpecUtil.isGcmSpec(algorithmParameterSpec0)) {
            iebu0 = GcmSpecUtil.extractAeadParameters(iepk0, algorithmParameterSpec0);
            goto label_78;
        }
        if((algorithmParameterSpec0 instanceof PBEParameterSpec)) {
            try {
            label_78:
                this.macEngine.init(iebu0);
                return;
            }
            catch(Exception exception0) {
                throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + exception0.getMessage());
            }
        }
        throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec0.getClass().getName());
    }

    @Override  // javax.crypto.MacSpi
    protected void engineReset() {
        this.macEngine.reset();
    }

    @Override  // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        this.macEngine.update(b);
    }

    @Override  // javax.crypto.MacSpi
    protected void engineUpdate(byte[] arr_b, int v, int v1) {
        this.macEngine.update(arr_b, v, v1);
    }
}

