package org.bouncycastle.jcajce.provider.keystore.bcfks;

import a;
import idph;
import idpv;
import idqg;
import idqm;
import idqt;
import idry;
import idsc;
import idth;
import idti;
import idtj;
import idtl;
import idtm;
import idtn;
import idto;
import idtp;
import idtq;
import idtr;
import idts;
import idur;
import iduz;
import idva;
import idvb;
import idve;
import idvf;
import idvi;
import idvk;
import idyk;
import idyq;
import iebd;
import iecd;
import iecv;
import ieez;
import iefa;
import iekm;
import iekp;
import iepk;
import ierz;
import iesz;
import ietj;
import ietm;
import ietp;
import ietr;
import iets;
import ietu;
import ietw;
import ietx;
import iety;
import ietz;
import ieua;
import iewl;
import iewr;
import iftq;
import ifuf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore.LoadStoreParameter;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;

class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private Date creationDate;
    private final Map entries;
    private final iewl helper;
    private idyk hmacAlgorithm;
    private idvb hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private static final Map oidMap;
    private final Map privateKeyCache;
    private static final Map publicAlgMap;
    private idyk signatureAlgorithm;
    private idqg storeEncryptionAlgorithm;
    private ietw validator;
    private PublicKey verificationKey;

    static {
        HashMap hashMap0 = new HashMap();
        BcFKSKeyStoreSpi.oidMap = hashMap0;
        HashMap hashMap1 = new HashMap();
        BcFKSKeyStoreSpi.publicAlgMap = hashMap1;
        hashMap0.put("DESEDE", ietu.e);
        hashMap0.put("TRIPLEDES", ietu.e);
        hashMap0.put("TDEA", ietu.e);
        hashMap0.put("HMACSHA1", idvi.M);
        hashMap0.put("HMACSHA224", idvi.N);
        hashMap0.put("HMACSHA256", idvi.O);
        hashMap0.put("HMACSHA384", idvi.P);
        hashMap0.put("HMACSHA512", idvi.Q);
        hashMap0.put("HMACSHA512/224", idvi.R);
        hashMap0.put("HMACSHA512/256", idvi.S);
        hashMap0.put("HMACSHA512(224)", idvi.R);
        hashMap0.put("HMACSHA512(256)", idvi.S);
        hashMap0.put("HMACSHA3-224", idur.o);
        hashMap0.put("HMACSHA3-256", idur.p);
        hashMap0.put("HMACSHA3-384", idur.q);
        hashMap0.put("HMACSHA3-512", idur.r);
        hashMap0.put("KMAC128", idur.w);
        hashMap0.put("KMAC256", idur.x);
        hashMap0.put("SEED", ietj.a);
        hashMap0.put("CAMELLIA.128", iets.a);
        hashMap0.put("CAMELLIA.192", iets.b);
        hashMap0.put("CAMELLIA.256", iets.c);
        hashMap0.put("ARIA.128", ietr.e);
        hashMap0.put("ARIA.192", ietr.i);
        hashMap0.put("ARIA.256", ietr.m);
        hashMap1.put(idvi.d, "RSA");
        hashMap1.put(iebd.l, "EC");
        hashMap1.put(ietu.i, "DH");
        hashMap1.put(idvi.t, "DH");
        hashMap1.put(iebd.R, "DSA");
        BcFKSKeyStoreSpi.CERTIFICATE = BigInteger.valueOf(0L);
        BcFKSKeyStoreSpi.PRIVATE_KEY = BigInteger.valueOf(1L);
        BcFKSKeyStoreSpi.SECRET_KEY = BigInteger.valueOf(2L);
        BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        BcFKSKeyStoreSpi.PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    public BcFKSKeyStoreSpi(iewl iewl0) {
        this.entries = new HashMap();
        this.privateKeyCache = new HashMap();
        this.storeEncryptionAlgorithm = idur.V;
        this.helper = iewl0;
    }

    private byte[] calculateMac(byte[] arr_b, idyk idyk0, idvb idvb0, char[] arr_c) {
        String s = idyk0.a.b();
        Mac mac0 = this.helper.f(s);
        try {
            if(arr_c == null) {
                arr_c = new char[0];
            }
            mac0.init(new SecretKeySpec(this.generateKey(idvb0, "INTEGRITY_CHECK", arr_c, -1), s));
            return mac0.doFinal(arr_b);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new IOException("Cannot set up MAC calculation: " + invalidKeyException0.getMessage());
        }
    }

    private Cipher createCipher(String s, byte[] arr_b) {
        Cipher cipher0 = this.helper.e(s);
        cipher0.init(1, new SecretKeySpec(arr_b, "AES"));
        return cipher0;
    }

    private idti createPrivateKeySequence(iduz iduz0, Certificate[] arr_certificate) {
        idyq[] arr_idyq = new idyq[arr_certificate.length];
        for(int v = 0; v != arr_certificate.length; ++v) {
            arr_idyq[v] = idyq.c(arr_certificate[v].getEncoded());
        }
        return new idti(iduz0, arr_idyq);
    }

    private Certificate decodeCertificate(Object object0) {
        iewl iewl0 = this.helper;
        if(iewl0 != null) {
            try {
                return iewl0.d("X.509").generateCertificate(new ByteArrayInputStream(idyq.c(object0).u()));
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(idyq.c(object0).u()));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private byte[] decryptData(String s, idyk idyk0, char[] arr_c, byte[] arr_b) {
        AlgorithmParameters algorithmParameters0;
        Cipher cipher0;
        if(idyk0.a.y(idvi.C)) {
            idve idve0 = idve.a(idyk0.b);
            idva idva0 = idve0.b;
            try {
                if(idva0.b().y(idur.V)) {
                    cipher0 = this.helper.e("AES/CCM/NoPadding");
                    algorithmParameters0 = this.helper.a("CCM");
                    algorithmParameters0.init(iesz.a(idva0.a()).u());
                }
                else {
                    if(!idva0.b().y(idur.W)) {
                        throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                    }
                    cipher0 = this.helper.e("AESKWP");
                    algorithmParameters0 = null;
                }
                idvb idvb0 = idve0.a;
                if(arr_c == null) {
                    arr_c = new char[0];
                }
                cipher0.init(2, new SecretKeySpec(this.generateKey(idvb0, s, arr_c, 0x20), "AES"), algorithmParameters0);
                return cipher0.doFinal(arr_b);
            }
            catch(IOException iOException0) {
                throw iOException0;
            }
            catch(Exception exception0) {
                throw new IOException(exception0.toString());
            }
        }
        throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
    }

    @Override
    public Enumeration engineAliases() {
        return new BcFKSKeyStoreSpi.1(this, new HashSet(this.entries.keySet()).iterator());
    }

    @Override
    public boolean engineContainsAlias(String s) {
        if(s != null) {
            return this.entries.containsKey(s);
        }
        throw new NullPointerException("alias value is null");
    }

    @Override
    public void engineDeleteEntry(String s) {
        if(((idtl)this.entries.get(s)) == null) {
            return;
        }
        this.privateKeyCache.remove(s);
        this.entries.remove(s);
        this.lastModifiedDate = new Date();
    }

    @Override
    public Certificate engineGetCertificate(String s) {
        idtl idtl0 = (idtl)this.entries.get(s);
        if(idtl0 != null) {
            BigInteger bigInteger0 = idtl0.a;
            if(!bigInteger0.equals(BcFKSKeyStoreSpi.PRIVATE_KEY) && !bigInteger0.equals(BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY)) {
                return bigInteger0.equals(BcFKSKeyStoreSpi.CERTIFICATE) ? this.decodeCertificate(idtl0.b()) : null;
            }
            return this.decodeCertificate(idti.a(idtl0.b()).b()[0]);
        }
        return null;
    }

    @Override
    public String engineGetCertificateAlias(Certificate certificate0) {
        if(certificate0 == null) {
            return null;
        }
        try {
            byte[] arr_b = certificate0.getEncoded();
        }
        catch(CertificateEncodingException unused_ex) {
            return null;
        }
        for(Object object0: this.entries.keySet()) {
            String s = (String)object0;
            idtl idtl0 = (idtl)this.entries.get(s);
            BigInteger bigInteger0 = idtl0.a;
            if(bigInteger0.equals(BcFKSKeyStoreSpi.CERTIFICATE)) {
                if(!Arrays.equals(idtl0.b(), arr_b)) {
                    continue;
                }
                return s;
            }
            else if(bigInteger0.equals(BcFKSKeyStoreSpi.PRIVATE_KEY) || bigInteger0.equals(BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY)) {
                goto label_13;
            }
            else {
                continue;
                try {
                label_13:
                    if(Arrays.equals(idti.a(idtl0.b()).b()[0].a.u(), arr_b)) {
                        return s;
                    }
                }
                catch(IOException unused_ex) {
                }
                continue;
            }
            break;
        }
        return null;
    }

    @Override
    public Certificate[] engineGetCertificateChain(String s) {
        idtl idtl0 = (idtl)this.entries.get(s);
        if(idtl0 != null && (idtl0.a.equals(BcFKSKeyStoreSpi.PRIVATE_KEY) || idtl0.a.equals(BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY))) {
            idyq[] arr_idyq = idti.a(idtl0.b()).b();
            Certificate[] arr_certificate = new X509Certificate[arr_idyq.length];
            for(int v = 0; v != arr_idyq.length; ++v) {
                arr_certificate[v] = (X509Certificate)this.decodeCertificate(arr_idyq[v]);
            }
            return arr_certificate;
        }
        return null;
    }

    @Override
    public Date engineGetCreationDate(String s) {
        idtl idtl0 = (idtl)this.entries.get(s);
        if(idtl0 != null) {
            try {
                return idtl0.d.f();
            }
            catch(ParseException unused_ex) {
                return new Date();
            }
        }
        return null;
    }

    @Override
    public Key engineGetKey(String s, char[] arr_c) {
        idtj idtj0;
        idtl idtl0 = (idtl)this.entries.get(s);
        idtr idtr0 = null;
        if(idtl0 != null) {
            BigInteger bigInteger0 = idtl0.a;
            if(!bigInteger0.equals(BcFKSKeyStoreSpi.PRIVATE_KEY) && !bigInteger0.equals(BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY)) {
                if(!bigInteger0.equals(BcFKSKeyStoreSpi.SECRET_KEY) && !bigInteger0.equals(BcFKSKeyStoreSpi.PROTECTED_SECRET_KEY)) {
                    throw new UnrecoverableKeyException(a.a(s, "BCFKS KeyStore unable to recover secret key (", "): type not recognized"));
                }
                byte[] arr_b = idtl0.b();
                if((arr_b instanceof idtj)) {
                    idtj0 = (idtj)arr_b;
                }
                else {
                    idtj0 = arr_b == null ? null : new idtj(idqt.m(arr_b));
                }
                try {
                    byte[] arr_b1 = iftq.j(idtj0.b.b);
                    byte[] arr_b2 = this.decryptData("SECRET_KEY_ENCRYPTION", idtj0.a, arr_c, arr_b1);
                    if((arr_b2 instanceof idtr)) {
                        idtr0 = (idtr)arr_b2;
                    }
                    else if(arr_b2 != null) {
                        idtr0 = new idtr(idqt.m(arr_b2));
                    }
                    String s1 = idtr0.a.b();
                    return this.helper.g(s1).generateSecret(new SecretKeySpec(iftq.j(idtr0.b.b), idtr0.a.b()));
                }
                catch(Exception exception0) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + s + "): " + exception0.getMessage());
                }
            }
            Key key0 = (PrivateKey)this.privateKeyCache.get(s);
            if(key0 != null) {
                return key0;
            }
            iduz iduz0 = iduz.a(idti.a(idtl0.b()).a);
            try {
                byte[] arr_b3 = iduz0.b();
                idvk idvk0 = idvk.d(this.decryptData("PRIVATE_KEY_ENCRYPTION", iduz0.a, arr_c, arr_b3));
                String s2 = BcFKSKeyStoreSpi.getPublicKeyAlg(idvk0.b.a);
                Key key1 = this.helper.b(s2).generatePrivate(new PKCS8EncodedKeySpec(idvk0.u()));
                this.privateKeyCache.put(s, key1);
                return key1;
            }
            catch(Exception exception1) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + s + "): " + exception1.getMessage());
            }
        }
        return null;
    }

    @Override
    public boolean engineIsCertificateEntry(String s) {
        idtl idtl0 = (idtl)this.entries.get(s);
        return idtl0 == null ? false : idtl0.a.equals(BcFKSKeyStoreSpi.CERTIFICATE);
    }

    @Override
    public boolean engineIsKeyEntry(String s) {
        idtl idtl0 = (idtl)this.entries.get(s);
        return idtl0 == null ? false : idtl0.a.equals(BcFKSKeyStoreSpi.PRIVATE_KEY) || idtl0.a.equals(BcFKSKeyStoreSpi.SECRET_KEY) || idtl0.a.equals(BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY) || idtl0.a.equals(BcFKSKeyStoreSpi.PROTECTED_SECRET_KEY);
    }

    @Override
    public void engineLoad(InputStream inputStream0, char[] arr_c) {
        idyk idyk0;
        idtn idtn0;
        this.entries.clear();
        this.privateKeyCache.clear();
        idyq[] arr_idyq = null;
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if(inputStream0 == null) {
            Date date0 = new Date();
            this.creationDate = date0;
            this.lastModifiedDate = date0;
            this.verificationKey = null;
            this.validator = null;
            this.hmacAlgorithm = new idyk(idvi.Q, idsc.b);
            this.hmacPkbdAlgorithm = this.generatePkbdAlgorithmIdentifier(idvi.B, 0x40);
            return;
        }
        idpv idpv0 = new idpv(inputStream0);
        try {
            idqm idqm0 = idpv0.b();
            idtn0 = idqm0 == null ? null : new idtn(idqt.m(idqm0));
        }
        catch(Exception exception0) {
            throw new IOException(exception0.getMessage());
        }
        idtp idtp0 = idtn0.b;
        if(idtp0.a == 0) {
            idtq idtq0 = idtq.a(idtp0.b);
            this.hmacAlgorithm = idtq0.a;
            this.hmacPkbdAlgorithm = idtq0.b;
            idyk0 = this.hmacAlgorithm;
            try {
                this.verifyMac(idtn0.a.p().u(), idtq0, arr_c);
            }
            catch(NoSuchProviderException noSuchProviderException0) {
                throw new IOException(noSuchProviderException0.getMessage());
            }
        }
        else {
            idts idts0 = idts.a(idtp0.b);
            idyk idyk1 = idts0.a;
            try {
                idqt idqt0 = idts0.b;
                if(idqt0 != null) {
                    int v = idqt0.b();
                    idyq[] arr_idyq1 = new idyq[v];
                    for(int v1 = 0; v1 != v; ++v1) {
                        arr_idyq1[v1] = idyq.c(idqt0.h(v1));
                    }
                    arr_idyq = arr_idyq1;
                }
                if(this.validator == null) {
                    this.verifySig(idtn0.a, idts0, this.verificationKey);
                }
                else {
                    if(arr_idyq == null) {
                        throw new IOException("validator specified but no certifcates in store");
                    }
                    CertificateFactory certificateFactory0 = this.helper.d("X.509");
                    X509Certificate[] arr_x509Certificate = new X509Certificate[arr_idyq.length];
                    for(int v2 = 0; v2 != arr_idyq.length; ++v2) {
                        arr_x509Certificate[v2] = (X509Certificate)certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_idyq[v2].u()));
                    }
                    if(!this.validator.a()) {
                        throw new IOException("certificate chain in key store signature not valid");
                    }
                    PublicKey publicKey0 = arr_x509Certificate[0].getPublicKey();
                    this.verifySig(idtn0.a, idts0, publicKey0);
                }
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new IOException("error verifying signature: " + generalSecurityException0.getMessage(), generalSecurityException0);
            }
            idyk0 = idyk1;
        }
        idto idto0 = (idtn0.a instanceof idth) ? idto.a(this.decryptData("STORE_ENCRYPTION", ((idth)idtn0.a).a, arr_c, ((idth)idtn0.a).b.b)) : idto.a(idtn0.a);
        try {
            this.creationDate = idto0.b.f();
            this.lastModifiedDate = idto0.c.f();
        }
        catch(ParseException unused_ex) {
            throw new IOException("BCFKS KeyStore unable to parse store data information.");
        }
        if(!idto0.a.equals(idyk0)) {
            throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
        }
        for(Object object0: idto0.d) {
            idtl idtl0 = idtl.a(object0);
            this.entries.put(idtl0.b, idtl0);
        }
    }

    @Override
    public void engineLoad(KeyStore.LoadStoreParameter keyStore$LoadStoreParameter0) {
        if(keyStore$LoadStoreParameter0 == null) {
            this.engineLoad(null, null);
            return;
        }
        if(!(keyStore$LoadStoreParameter0 instanceof iety)) {
            if(!(keyStore$LoadStoreParameter0 instanceof ieua)) {
                throw new IllegalArgumentException("no support for \'parameter\' of type " + keyStore$LoadStoreParameter0.getClass().getName());
            }
            ieua ieua0 = (ieua)keyStore$LoadStoreParameter0;
            throw null;
        }
        ParameterUtil.extractPassword(((iety)keyStore$LoadStoreParameter0));
        throw null;
    }

    @Override
    public void engineSetCertificateEntry(String s, Certificate certificate0) {
        Date date1;
        idtl idtl0 = (idtl)this.entries.get(s);
        Date date0 = new Date();
        if(idtl0 == null) {
            date1 = date0;
        }
        else {
            if(!idtl0.a.equals(BcFKSKeyStoreSpi.CERTIFICATE)) {
                throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + s);
            }
            date1 = this.extractCreationDate(idtl0, date0);
        }
        try {
            byte[] arr_b = certificate0.getEncoded();
            idtl idtl1 = new idtl(BcFKSKeyStoreSpi.CERTIFICATE, s, date1, date0, arr_b);
            this.entries.put(s, idtl1);
            this.lastModifiedDate = date0;
        }
        catch(CertificateEncodingException certificateEncodingException0) {
            throw new BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + certificateEncodingException0.getMessage(), certificateEncodingException0);
        }
    }

    @Override
    public void engineSetKeyEntry(String s, Key key0, char[] arr_c, Certificate[] arr_certificate) {
        idtj idtj0;
        idtr idtr0;
        iduz iduz0;
        Date date0 = new Date();
        idtl idtl0 = (idtl)this.entries.get(s);
        Date date1 = idtl0 == null ? date0 : this.extractCreationDate(idtl0, date0);
        this.privateKeyCache.remove(s);
        if((key0 instanceof PrivateKey)) {
            if(arr_certificate != null) {
                try {
                    byte[] arr_b = key0.getEncoded();
                    idvb idvb0 = this.generatePkbdAlgorithmIdentifier(idvi.B, 0x20);
                    if(arr_c == null) {
                        arr_c = new char[0];
                    }
                    byte[] arr_b1 = this.generateKey(idvb0, "PRIVATE_KEY_ENCRYPTION", arr_c, 0x20);
                    idqg idqg0 = idur.V;
                    if(this.storeEncryptionAlgorithm.y(idqg0)) {
                        Cipher cipher0 = this.createCipher("AES/CCM/NoPadding", arr_b1);
                        byte[] arr_b2 = cipher0.doFinal(arr_b);
                        idve idve0 = new idve(idvb0, new idva(idqg0, iesz.a(cipher0.getParameters().getEncoded())));
                        iduz0 = new iduz(new idyk(idvi.C, idve0), arr_b2);
                    }
                    else {
                        byte[] arr_b3 = this.createCipher("AESKWP", arr_b1).doFinal(arr_b);
                        idve idve1 = new idve(idvb0, new idva(idur.W));
                        iduz0 = new iduz(new idyk(idvi.C, idve1), arr_b3);
                    }
                    byte[] arr_b4 = this.createPrivateKeySequence(iduz0, arr_certificate).u();
                    idtl idtl1 = new idtl(BcFKSKeyStoreSpi.PRIVATE_KEY, s, date1, date0, arr_b4);
                    this.entries.put(s, idtl1);
                    this.lastModifiedDate = date0;
                    return;
                }
                catch(Exception exception0) {
                    throw new BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + exception0.toString(), exception0);
                }
            }
            throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
        }
        if(!(key0 instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        }
        if(arr_certificate != null) {
            throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
        }
        try {
            byte[] arr_b5 = key0.getEncoded();
            idvb idvb1 = this.generatePkbdAlgorithmIdentifier(idvi.B, 0x20);
            if(arr_c == null) {
                arr_c = new char[0];
            }
            byte[] arr_b6 = this.generateKey(idvb1, "SECRET_KEY_ENCRYPTION", arr_c, 0x20);
            String s1 = ifuf.c(key0.getAlgorithm());
            if(s1.indexOf("AES") < 0) {
                Map map0 = BcFKSKeyStoreSpi.oidMap;
                idqg idqg1 = (idqg)map0.get(s1);
                if(idqg1 == null) {
                    idqg idqg2 = (idqg)map0.get(s1 + "." + arr_b5.length * 8);
                    if(idqg2 == null) {
                        throw new KeyStoreException(a.a(s1, "BCFKS KeyStore cannot recognize secret key (", ") for storage."));
                    }
                    idtr0 = new idtr(idqg2, arr_b5);
                }
                else {
                    idtr0 = new idtr(idqg1, arr_b5);
                }
            }
            else {
                idtr0 = new idtr(idur.y, arr_b5);
            }
            idqg idqg3 = idur.V;
            if(this.storeEncryptionAlgorithm.y(idqg3)) {
                Cipher cipher1 = this.createCipher("AES/CCM/NoPadding", arr_b6);
                byte[] arr_b7 = cipher1.doFinal(idtr0.u());
                idve idve2 = new idve(idvb1, new idva(idqg3, iesz.a(cipher1.getParameters().getEncoded())));
                idtj0 = new idtj(new idyk(idvi.C, idve2), arr_b7);
            }
            else {
                byte[] arr_b8 = this.createCipher("AESKWP", arr_b6).doFinal(idtr0.u());
                idve idve3 = new idve(idvb1, new idva(idur.W));
                idtj0 = new idtj(new idyk(idvi.C, idve3), arr_b8);
            }
            byte[] arr_b9 = idtj0.u();
            idtl idtl2 = new idtl(BcFKSKeyStoreSpi.SECRET_KEY, s, date1, date0, arr_b9);
            this.entries.put(s, idtl2);
        }
        catch(Exception exception1) {
            throw new BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + exception1.toString(), exception1);
        }
        this.lastModifiedDate = date0;
    }

    @Override
    public void engineSetKeyEntry(String s, byte[] arr_b, Certificate[] arr_certificate) {
        iduz iduz0;
        Date date0 = new Date();
        idtl idtl0 = (idtl)this.entries.get(s);
        Date date1 = idtl0 == null ? date0 : this.extractCreationDate(idtl0, date0);
        if(arr_certificate == null) {
            try {
                idtl idtl2 = new idtl(BcFKSKeyStoreSpi.PROTECTED_SECRET_KEY, s, date1, date0, arr_b);
                this.entries.put(s, idtl2);
            }
            catch(Exception exception2) {
                throw new BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + exception2.toString(), exception2);
            }
        }
        else {
            try {
                iduz0 = iduz.a(arr_b);
            }
            catch(Exception exception0) {
                throw new BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", exception0);
            }
            try {
                this.privateKeyCache.remove(s);
                byte[] arr_b1 = this.createPrivateKeySequence(iduz0, arr_certificate).u();
                idtl idtl1 = new idtl(BcFKSKeyStoreSpi.PROTECTED_PRIVATE_KEY, s, date1, date0, arr_b1);
                this.entries.put(s, idtl1);
            }
            catch(Exception exception1) {
                throw new BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + exception1.toString(), exception1);
            }
        }
        this.lastModifiedDate = date0;
    }

    @Override
    public int engineSize() {
        return this.entries.size();
    }

    @Override
    public void engineStore(OutputStream outputStream0, char[] arr_c) {
        byte[] arr_b;
        if(this.creationDate == null) {
            throw new IOException("KeyStore not initialized");
        }
        idth idth0 = this.getEncryptedObjectStoreData(this.hmacAlgorithm, arr_c);
        if(ietm.A.y(this.hmacPkbdAlgorithm.b())) {
            ietp ietp0 = ietp.a(this.hmacPkbdAlgorithm.a());
            this.hmacPkbdAlgorithm = this.generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, ietp0.d.intValue());
        }
        else {
            idvf idvf0 = idvf.c(this.hmacPkbdAlgorithm.a());
            this.hmacPkbdAlgorithm = this.generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, idvf0.b().intValue());
        }
        try {
            arr_b = this.calculateMac(idth0.u(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, arr_c);
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            throw new IOException("cannot calculate mac: " + noSuchProviderException0.getMessage());
        }
        outputStream0.write(new idtn(idth0, new idtp(new idtq(this.hmacAlgorithm, this.hmacPkbdAlgorithm, arr_b))).u());
        outputStream0.flush();
    }

    @Override
    public void engineStore(KeyStore.LoadStoreParameter keyStore$LoadStoreParameter0) {
        if(keyStore$LoadStoreParameter0 == null) {
            throw new IllegalArgumentException("\'parameter\' arg cannot be null");
        }
        if(!(keyStore$LoadStoreParameter0 instanceof ietz)) {
            if(!(keyStore$LoadStoreParameter0 instanceof iety)) {
                if(!(keyStore$LoadStoreParameter0 instanceof ieua)) {
                    throw new IllegalArgumentException("no support for \'parameter\' of type " + keyStore$LoadStoreParameter0.getClass().getName());
                }
                ieua ieua0 = (ieua)keyStore$LoadStoreParameter0;
                throw null;
            }
            iety iety0 = (iety)keyStore$LoadStoreParameter0;
            throw null;
        }
        ietz ietz0 = (ietz)keyStore$LoadStoreParameter0;
        ParameterUtil.extractPassword(keyStore$LoadStoreParameter0);
        throw null;
    }

    private Date extractCreationDate(idtl idtl0, Date date0) {
        try {
            return idtl0.c.f();
        }
        catch(ParseException unused_ex) {
            return date0;
        }
    }

    private byte[] generateKey(idvb idvb0, String s, char[] arr_c, int v) {
        byte[] arr_b = iecv.e(arr_c);
        byte[] arr_b1 = iecv.e(s.toCharArray());
        if(ietm.A.y(idvb0.b())) {
            ietp ietp0 = ietp.a(idvb0.a());
            BigInteger bigInteger0 = ietp0.d;
            if(bigInteger0 != null) {
                v = bigInteger0.intValue();
                return iekp.a(iftq.m(arr_b, arr_b1), ietp0.b(), ietp0.a.intValue(), ietp0.b.intValue(), ietp0.b.intValue(), v);
            }
            if(v != -1) {
                return iekp.a(iftq.m(arr_b, arr_b1), ietp0.b(), ietp0.a.intValue(), ietp0.b.intValue(), ietp0.b.intValue(), v);
            }
            throw new IOException("no keyLength found in ScryptParams");
        }
        if(!idvb0.b().y(idvi.B)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        idvf idvf0 = idvf.c(idvb0.a());
        if(idvf0.b() != null) {
            v = idvf0.b().intValue();
        }
        else if(v == -1) {
            throw new IOException("no keyLength found in PBKDF2Params");
        }
        if(idvf0.d().a.y(idvi.Q)) {
            iekm iekm0 = new iekm(new iefa());
            iekm0.d(iftq.m(arr_b, arr_b1), idvf0.e(), idvf0.a().intValue());
            return ((iepk)iekm0.b(v * 8)).b;
        }
        if(!idvf0.d().a.y(idur.r)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + idvf0.d().a);
        }
        iekm iekm1 = new iekm(new ieez(0x200));
        iekm1.d(iftq.m(arr_b, arr_b1), idvf0.e(), idvf0.a().intValue());
        return ((iepk)iekm1.b(v * 8)).b;
    }

    private idvb generatePkbdAlgorithmIdentifier(idqg idqg0, int v) {
        byte[] arr_b = new byte[0x40];
        this.getDefaultSecureRandom().nextBytes(arr_b);
        idqg idqg1 = idvi.B;
        if(idqg1.y(idqg0)) {
            return new idvb(idqg1, new idvf(arr_b, 0xC800, v, new idyk(idvi.Q, idsc.b)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + idqg0);
    }

    private idvb generatePkbdAlgorithmIdentifier(idvb idvb0, int v) {
        idqg idqg0 = ietm.A;
        if(idqg0.y(idvb0.b())) {
            ietp ietp0 = ietp.a(idvb0.a());
            byte[] arr_b = new byte[ietp0.b().length];
            this.getDefaultSecureRandom().nextBytes(arr_b);
            BigInteger bigInteger0 = BigInteger.valueOf(v);
            return new idvb(idqg0, new ietp(arr_b, ietp0.a, ietp0.b, ietp0.c, bigInteger0));
        }
        idvf idvf0 = idvf.c(idvb0.a());
        byte[] arr_b1 = new byte[idvf0.e().length];
        this.getDefaultSecureRandom().nextBytes(arr_b1);
        idvf idvf1 = new idvf(arr_b1, idvf0.a().intValue(), v, idvf0.d());
        return new idvb(idvi.B, idvf1);
    }

    private idvb generatePkbdAlgorithmIdentifier(ierz ierz0, int v) {
        throw null;
    }

    private idyk generateSignatureAlgId(Key key0, ietx ietx0) {
        if(key0 == null) {
            return null;
        }
        if((key0 instanceof iewr)) {
            if(ietx0 == ietx.c) {
                return new idyk(iebd.q);
            }
            if(ietx0 == ietx.d) {
                return new idyk(idur.aj);
            }
        }
        if((key0 instanceof DSAKey)) {
            if(ietx0 == ietx.a) {
                return new idyk(idur.ab);
            }
            if(ietx0 == ietx.b) {
                return new idyk(idur.af);
            }
        }
        if((key0 instanceof RSAKey)) {
            if(ietx0 == ietx.e) {
                return new idyk(idvi.o, idsc.b);
            }
            if(ietx0 == ietx.f) {
                return new idyk(idur.an, idsc.b);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private SecureRandom getDefaultSecureRandom() {
        return iecd.b();
    }

    private idth getEncryptedObjectStoreData(idyk idyk0, char[] arr_c) {
        idtl[] arr_idtl = (idtl[])this.entries.values().toArray(new idtl[this.entries.size()]);
        idvb idvb0 = this.generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 0x20);
        if(arr_c == null) {
            arr_c = new char[0];
        }
        byte[] arr_b = this.generateKey(idvb0, "STORE_ENCRYPTION", arr_c, 0x20);
        idto idto0 = new idto(idyk0, this.creationDate, this.lastModifiedDate, new idtm(arr_idtl));
        try {
            idqg idqg0 = idur.V;
            if(this.storeEncryptionAlgorithm.y(idqg0)) {
                Cipher cipher0 = this.createCipher("AES/CCM/NoPadding", arr_b);
                byte[] arr_b1 = cipher0.doFinal(idto0.u());
                idve idve0 = new idve(idvb0, new idva(idqg0, iesz.a(cipher0.getParameters().getEncoded())));
                return new idth(new idyk(idvi.C, idve0), arr_b1);
            }
            byte[] arr_b2 = this.createCipher("AESKWP", arr_b).doFinal(idto0.u());
            idve idve1 = new idve(idvb0, new idva(idur.W));
            return new idth(new idyk(idvi.C, idve1), arr_b2);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new NoSuchAlgorithmException(noSuchPaddingException0.toString());
        }
        catch(BadPaddingException badPaddingException0) {
            throw new IOException(badPaddingException0.toString());
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new IOException(illegalBlockSizeException0.toString());
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new IOException(invalidKeyException0.toString());
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            throw new IOException(noSuchProviderException0.toString());
        }
    }

    private static String getPublicKeyAlg(idqg idqg0) {
        String s = (String)BcFKSKeyStoreSpi.publicAlgMap.get(idqg0);
        return s == null ? idqg0.b() : s;
    }

    private boolean isSimilarHmacPbkd(ierz ierz0, idvb idvb0) {
        throw null;
    }

    private void verifyMac(byte[] arr_b, idtq idtq0, char[] arr_c) {
        if(iftq.f(this.calculateMac(arr_b, idtq0.a, idtq0.b, arr_c), iftq.j(idtq0.c.b))) {
            return;
        }
        throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
    }

    private void verifySig(idph idph0, idts idts0, PublicKey publicKey0) {
        String s = idts0.a.a.b();
        Signature signature0 = this.helper.c(s);
        signature0.initVerify(publicKey0);
        signature0.update(idph0.p().v("DER"));
        if(signature0.verify(new idry(idts0.c.m(), idts0.c.f()).n())) {
            return;
        }
        throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
    }
}

