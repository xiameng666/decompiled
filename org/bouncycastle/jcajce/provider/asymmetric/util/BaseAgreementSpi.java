package org.bouncycastle.jcajce.provider.asymmetric.util;

import idqg;
import idtu;
import idur;
import idvi;
import iecj;
import ieds;
import iedt;
import iekg;
import iens;
import iepg;
import iepj;
import ietf;
import ietj;
import ietm;
import iets;
import ietu;
import ievj;
import iftq;
import ifuf;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map defaultOids;
    private static final Hashtable des;
    private ievj hybridSpec;
    protected final String kaAlgorithm;
    protected final iecj kdf;
    private static final Map keySizes;
    private static final Map nameTable;
    private static final Hashtable oids;
    protected byte[] ukmParameters;
    protected byte[] ukmParametersSalt;

    static {
        HashMap hashMap0 = new HashMap();
        BaseAgreementSpi.defaultOids = hashMap0;
        HashMap hashMap1 = new HashMap();
        BaseAgreementSpi.keySizes = hashMap1;
        HashMap hashMap2 = new HashMap();
        BaseAgreementSpi.nameTable = hashMap2;
        Hashtable hashtable0 = new Hashtable();
        BaseAgreementSpi.oids = hashtable0;
        Hashtable hashtable1 = new Hashtable();
        BaseAgreementSpi.des = hashtable1;
        Integer integer0 = (int)0x40;
        Integer integer1 = (int)0x80;
        Integer integer2 = (int)0xC0;
        Integer integer3 = (int)0x100;
        hashMap1.put("DES", integer0);
        hashMap1.put("DESEDE", integer2);
        hashMap1.put("BLOWFISH", integer1);
        hashMap1.put("AES", integer3);
        hashMap1.put(idur.z.b(), integer1);
        hashMap1.put(idur.H.b(), integer2);
        hashMap1.put(idur.P.b(), integer3);
        hashMap1.put(idur.A.b(), integer1);
        hashMap1.put(idur.I.b(), integer2);
        hashMap1.put(idur.Q.b(), integer3);
        hashMap1.put(idur.C.b(), integer1);
        hashMap1.put(idur.K.b(), integer2);
        hashMap1.put(idur.S.b(), integer3);
        hashMap1.put(idur.B.b(), integer1);
        hashMap1.put(idur.J.b(), integer2);
        hashMap1.put(idur.R.b(), integer3);
        hashMap1.put(idur.D.b(), integer1);
        hashMap1.put(idur.L.b(), integer2);
        hashMap1.put(idur.T.b(), integer3);
        hashMap1.put(idur.F.b(), integer1);
        hashMap1.put(idur.N.b(), integer2);
        hashMap1.put(idur.V.b(), integer3);
        hashMap1.put(idur.E.b(), integer1);
        hashMap1.put(idur.M.b(), integer2);
        hashMap1.put(idur.U.b(), integer3);
        hashMap1.put(iets.d.b(), integer1);
        hashMap1.put(iets.e.b(), integer2);
        hashMap1.put(iets.f.b(), integer3);
        hashMap1.put(ietj.c.b(), integer1);
        hashMap1.put(idvi.aj.b(), integer2);
        hashMap1.put(idvi.F.b(), integer2);
        hashMap1.put(ietu.b.b(), integer0);
        hashMap1.put(idtu.f.b(), integer3);
        hashMap1.put(idtu.d.b(), integer3);
        hashMap1.put(idtu.e.b(), integer3);
        hashMap1.put(idvi.M.b(), Integer.valueOf(0xA0));
        hashMap1.put(idvi.O.b(), integer3);
        hashMap1.put(idvi.P.b(), Integer.valueOf(0x180));
        hashMap1.put(idvi.Q.b(), Integer.valueOf(0x200));
        hashMap0.put("DESEDE", idvi.F);
        hashMap0.put("AES", idur.Q);
        hashMap0.put("CAMELLIA", iets.c);
        hashMap0.put("SEED", ietj.a);
        hashMap0.put("DES", ietu.b);
        hashMap2.put(ietm.h.b(), "CAST5");
        hashMap2.put(ietm.i.b(), "IDEA");
        hashMap2.put(ietm.l.b(), "Blowfish");
        hashMap2.put(ietm.m.b(), "Blowfish");
        hashMap2.put(ietm.n.b(), "Blowfish");
        hashMap2.put(ietm.o.b(), "Blowfish");
        hashMap2.put(ietu.a.b(), "DES");
        hashMap2.put(ietu.b.b(), "DES");
        hashMap2.put(ietu.d.b(), "DES");
        hashMap2.put(ietu.c.b(), "DES");
        hashMap2.put(ietu.e.b(), "DESede");
        hashMap2.put(idvi.F.b(), "DESede");
        hashMap2.put(idvi.aj.b(), "DESede");
        hashMap2.put(idvi.ak.b(), "RC2");
        hashMap2.put(idvi.M.b(), "HmacSHA1");
        hashMap2.put(idvi.N.b(), "HmacSHA224");
        hashMap2.put(idvi.O.b(), "HmacSHA256");
        hashMap2.put(idvi.P.b(), "HmacSHA384");
        hashMap2.put(idvi.Q.b(), "HmacSHA512");
        hashMap2.put(iets.a.b(), "Camellia");
        hashMap2.put(iets.b.b(), "Camellia");
        hashMap2.put(iets.c.b(), "Camellia");
        hashMap2.put(iets.d.b(), "Camellia");
        hashMap2.put(iets.e.b(), "Camellia");
        hashMap2.put(iets.f.b(), "Camellia");
        hashMap2.put(ietj.c.b(), "SEED");
        hashMap2.put(ietj.a.b(), "SEED");
        hashMap2.put(ietj.b.b(), "SEED");
        hashMap2.put(idtu.f.b(), "GOST28147");
        hashMap2.put(idur.D.b(), "AES");
        hashMap2.put(idur.F.b(), "AES");
        hashMap2.put(idur.F.b(), "AES");
        hashtable0.put("DESEDE", idvi.F);
        hashtable0.put("AES", idur.Q);
        hashtable0.put("DES", ietu.b);
        hashtable1.put("DES", "DES");
        hashtable1.put("DESEDE", "DES");
        hashtable1.put(ietu.b.b(), "DES");
        hashtable1.put(idvi.F.b(), "DES");
        hashtable1.put(idvi.aj.b(), "DES");
    }

    public BaseAgreementSpi(String s, iecj iecj0) {
        this.kaAlgorithm = s;
        this.kdf = iecj0;
    }

    private byte[] calcSecret() {
        if(this.hybridSpec == null) {
            return this.doCalcSecret();
        }
        this.doCalcSecret();
        throw null;
    }

    protected abstract byte[] doCalcSecret();

    protected abstract void doInitFromKey(Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3);

    @Override  // javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] arr_b, int v) {
        byte[] arr_b1 = this.engineGenerateSecret();
        if(arr_b.length - v < arr_b1.length) {
            throw new ShortBufferException(this.kaAlgorithm + " key agreement: need " + arr_b1.length + " bytes");
        }
        System.arraycopy(arr_b1, 0, arr_b, v, arr_b1.length);
        return arr_b1.length;
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String s) {
        String s1 = ifuf.c(s);
        String s2 = BaseAgreementSpi.oids.containsKey(s1) ? ((idqg)BaseAgreementSpi.oids.get(s1)).b() : s;
        int v = BaseAgreementSpi.getKeySize(s2);
        byte[] arr_b = this.getSharedSecretBytes(this.calcSecret(), s2, v);
        String s3 = BaseAgreementSpi.getAlgorithm(s);
        if(BaseAgreementSpi.des.containsKey(s3)) {
            iens.b(arr_b);
        }
        return new SecretKeySpec(arr_b, s3);
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        if(this.kdf != null) {
            byte[] arr_b = this.calcSecret();
            try {
                return this.getSharedSecretBytes(arr_b, null, arr_b.length * 8);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new IllegalStateException(noSuchAlgorithmException0.getMessage());
            }
        }
        return this.calcSecret();
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key0, SecureRandom secureRandom0) {
        try {
            this.doInitFromKey(key0, null, secureRandom0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new InvalidKeyException(invalidAlgorithmParameterException0.getMessage());
        }
    }

    @Override  // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key0, AlgorithmParameterSpec algorithmParameterSpec0, SecureRandom secureRandom0) {
        if(!(algorithmParameterSpec0 instanceof ievj)) {
            this.hybridSpec = null;
            this.doInitFromKey(key0, algorithmParameterSpec0, secureRandom0);
            return;
        }
        this.hybridSpec = (ievj)algorithmParameterSpec0;
        throw null;
    }

    protected static String getAlgorithm(String s) {
        if(s.indexOf(91) > 0) {
            return s.substring(0, s.indexOf(91));
        }
        if(s.startsWith(idur.y.b())) {
            return "AES";
        }
        if(s.startsWith(ietf.b.b())) {
            return "Serpent";
        }
        String s1 = ifuf.c(s);
        String s2 = (String)BaseAgreementSpi.nameTable.get(s1);
        return s2 == null ? s : s2;
    }

    protected static int getKeySize(String s) {
        if(s.indexOf(91) > 0) {
            return Integer.parseInt(s.substring(s.indexOf(91) + 1, s.indexOf(93)));
        }
        String s1 = ifuf.c(s);
        return BaseAgreementSpi.keySizes.containsKey(s1) ? ((int)(((Integer)BaseAgreementSpi.keySizes.get(s1)))) : -1;
    }

    private byte[] getSharedSecretBytes(byte[] arr_b, String s, int v) {
        idqg idqg0;
        iecj iecj0 = this.kdf;
        if(iecj0 != null) {
            if(v < 0) {
                throw new NoSuchAlgorithmException("unknown algorithm encountered: " + s);
            }
            byte[] arr_b1 = new byte[v >> 3];
            if((iecj0 instanceof iedt)) {
                if(s == null) {
                    throw new NoSuchAlgorithmException("algorithm OID is null");
                }
                try {
                    idqg0 = new idqg(s);
                }
                catch(IllegalArgumentException unused_ex) {
                    throw new NoSuchAlgorithmException("no OID for algorithm: " + s);
                }
                ieds ieds0 = new ieds(idqg0, v, arr_b, this.ukmParameters);
                this.kdf.a(ieds0);
                this.kdf.b(arr_b1, v >> 3);
                iftq.c(arr_b);
                return arr_b1;
            }
            else if((iecj0 instanceof iekg)) {
                iecj0.a(new iepg(arr_b, this.ukmParametersSalt, this.ukmParameters));
            }
            else {
                iecj0.a(new iepj(arr_b, this.ukmParameters));
            }
            this.kdf.b(arr_b1, v >> 3);
            iftq.c(arr_b);
            return arr_b1;
        }
        if(v > 0) {
            byte[] arr_b2 = new byte[v >> 3];
            System.arraycopy(arr_b, 0, arr_b2, 0, v >> 3);
            iftq.c(arr_b);
            return arr_b2;
        }
        return arr_b;
    }

    protected static byte[] trimZeroes(byte[] arr_b) {
        if(arr_b[0] == 0) {
            int v;
            for(v = 0; v < arr_b.length && arr_b[v] == 0; ++v) {
            }
            int v1 = arr_b.length - v;
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
            return arr_b1;
        }
        return arr_b;
    }
}

