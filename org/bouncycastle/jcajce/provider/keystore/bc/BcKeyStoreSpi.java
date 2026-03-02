package org.bouncycastle.jcajce.provider.keystore.bc;

import a;
import idvk;
import idzh;
import iebu;
import iecd;
import iecv;
import ieev;
import iekk;
import iekw;
import iekx;
import iele;
import iewl;
import iewn;
import iexi;
import iftq;
import ifup;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BcKeyStoreSpi extends KeyStoreSpi {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    private static final String KEY_CIPHER = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    private static final int KEY_SALT_SIZE = 20;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 0x400;
    static final int NULL = 0;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final String STORE_CIPHER = "PBEWithSHAAndTwofish-CBC";
    private static final int STORE_SALT_SIZE = 20;
    private static final int STORE_VERSION = 2;
    private final iewl helper;
    protected SecureRandom random;
    protected Hashtable table;
    protected int version;

    static Key -$$Nest$mdecodeKey(BcKeyStoreSpi bcKeyStoreSpi0, DataInputStream dataInputStream0) {
        return bcKeyStoreSpi0.decodeKey(dataInputStream0);
    }

    static void -$$Nest$mencodeKey(BcKeyStoreSpi bcKeyStoreSpi0, Key key0, DataOutputStream dataOutputStream0) {
        bcKeyStoreSpi0.encodeKey(key0, dataOutputStream0);
    }

    public BcKeyStoreSpi(int v) {
        this.table = new Hashtable();
        this.random = iecd.b();
        this.helper = new iewn();
        this.version = v;
    }

    private Certificate decodeCertificate(DataInputStream dataInputStream0) {
        String s = dataInputStream0.readUTF();
        byte[] arr_b = new byte[dataInputStream0.readInt()];
        dataInputStream0.readFully(arr_b);
        try {
            return this.helper.d(s).generateCertificate(new ByteArrayInputStream(arr_b));
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            throw new IOException(noSuchProviderException0.toString());
        }
        catch(CertificateException certificateException0) {
            throw new IOException(certificateException0.toString());
        }
    }

    private Key decodeKey(DataInputStream dataInputStream0) {
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec0;
        int v = dataInputStream0.read();
        String s = dataInputStream0.readUTF();
        String s1 = dataInputStream0.readUTF();
        byte[] arr_b = new byte[dataInputStream0.readInt()];
        dataInputStream0.readFully(arr_b);
        if(!s.equals("PKCS#8") && !s.equals("PKCS8")) {
            if(!s.equals("X.509") && !s.equals("X509")) {
                if(s.equals("RAW")) {
                    return new SecretKeySpec(arr_b, s1);
                }
                throw new IOException(a.a(s, "Key format ", " not recognised!"));
            }
            pKCS8EncodedKeySpec0 = new X509EncodedKeySpec(arr_b);
        }
        else {
            pKCS8EncodedKeySpec0 = new PKCS8EncodedKeySpec(arr_b);
        }
        try {
            switch(v) {
                case 0: {
                    return iexi.a(idvk.d(arr_b));
                }
                case 1: {
                    return iexi.c(idzh.b(arr_b));
                }
                case 2: {
                    return this.helper.g(s1).generateSecret(pKCS8EncodedKeySpec0);
                }
                default: {
                    throw new IOException(a.f(v, "Key type ", " not recognised!"));
                }
            }
        }
        catch(Exception exception0) {
            throw new IOException("Exception creating key: " + exception0.toString());
        }
    }

    private void encodeCertificate(Certificate certificate0, DataOutputStream dataOutputStream0) {
        try {
            byte[] arr_b = certificate0.getEncoded();
            dataOutputStream0.writeUTF(certificate0.getType());
            dataOutputStream0.writeInt(arr_b.length);
            dataOutputStream0.write(arr_b);
        }
        catch(CertificateEncodingException certificateEncodingException0) {
            throw new IOException(certificateEncodingException0.toString());
        }
    }

    private void encodeKey(Key key0, DataOutputStream dataOutputStream0) {
        byte[] arr_b = key0.getEncoded();
        if(arr_b == null) {
            throw new IOException("unable to store encoding of protected key");
        }
        if((key0 instanceof PrivateKey)) {
            dataOutputStream0.write(0);
        }
        else if((key0 instanceof PublicKey)) {
            dataOutputStream0.write(1);
        }
        else {
            dataOutputStream0.write(2);
        }
        dataOutputStream0.writeUTF(key0.getFormat());
        dataOutputStream0.writeUTF(key0.getAlgorithm());
        dataOutputStream0.writeInt(arr_b.length);
        dataOutputStream0.write(arr_b);
    }

    @Override
    public Enumeration engineAliases() {
        return this.table.keys();
    }

    @Override
    public boolean engineContainsAlias(String s) {
        return this.table.get(s) != null;
    }

    @Override
    public void engineDeleteEntry(String s) {
        if(this.table.get(s) == null) {
            return;
        }
        this.table.remove(s);
    }

    @Override
    public Certificate engineGetCertificate(String s) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        if(bcKeyStoreSpi$StoreEntry0 != null) {
            if(bcKeyStoreSpi$StoreEntry0.getType() == 1) {
                return (Certificate)bcKeyStoreSpi$StoreEntry0.getObject();
            }
            Certificate[] arr_certificate = bcKeyStoreSpi$StoreEntry0.getCertificateChain();
            return arr_certificate == null ? null : arr_certificate[0];
        }
        return null;
    }

    @Override
    public String engineGetCertificateAlias(Certificate certificate0) {
        Enumeration enumeration0 = this.table.elements();
        while(enumeration0.hasMoreElements()) {
            BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)enumeration0.nextElement();
            if((bcKeyStoreSpi$StoreEntry0.getObject() instanceof Certificate)) {
                if(!((Certificate)bcKeyStoreSpi$StoreEntry0.getObject()).equals(certificate0)) {
                    continue;
                }
                return bcKeyStoreSpi$StoreEntry0.getAlias();
            }
            Certificate[] arr_certificate = bcKeyStoreSpi$StoreEntry0.getCertificateChain();
            if(arr_certificate != null && arr_certificate[0].equals(certificate0)) {
                return bcKeyStoreSpi$StoreEntry0.getAlias();
            }
        }
        return null;
    }

    @Override
    public Certificate[] engineGetCertificateChain(String s) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        return bcKeyStoreSpi$StoreEntry0 == null ? null : bcKeyStoreSpi$StoreEntry0.getCertificateChain();
    }

    @Override
    public Date engineGetCreationDate(String s) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        return bcKeyStoreSpi$StoreEntry0 == null ? null : bcKeyStoreSpi$StoreEntry0.getDate();
    }

    @Override
    public Key engineGetKey(String s, char[] arr_c) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        return bcKeyStoreSpi$StoreEntry0 == null || bcKeyStoreSpi$StoreEntry0.getType() == 1 ? null : ((Key)bcKeyStoreSpi$StoreEntry0.getObject(arr_c));
    }

    @Override
    public boolean engineIsCertificateEntry(String s) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        return bcKeyStoreSpi$StoreEntry0 != null && bcKeyStoreSpi$StoreEntry0.getType() == 1;
    }

    @Override
    public boolean engineIsKeyEntry(String s) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        return bcKeyStoreSpi$StoreEntry0 != null && bcKeyStoreSpi$StoreEntry0.getType() != 1;
    }

    @Override
    public void engineLoad(InputStream inputStream0, char[] arr_c) {
        this.table.clear();
        if(inputStream0 != null) {
            DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
            int v = dataInputStream0.readInt();
            if(v != 0 && v != 2 && v != 1) {
                throw new IOException("Wrong version of key store.");
            }
            int v1 = dataInputStream0.readInt();
            if(v1 <= 0) {
                throw new IOException("Invalid salt detected");
            }
            byte[] arr_b = new byte[v1];
            dataInputStream0.readFully(arr_b);
            int v2 = dataInputStream0.readInt();
            iele iele0 = new iele(new ieev());
            if(arr_c == null || arr_c.length == 0) {
                this.loadStore(dataInputStream0);
                dataInputStream0.readFully(new byte[iele0.a]);
                return;
            }
            byte[] arr_b1 = iecv.e(arr_c);
            iekk iekk0 = new iekk(new ieev());
            iekk0.d(arr_b1, arr_b, v2);
            iebu iebu0 = v == 2 ? iekk0.a(iele0.a * 8) : iekk0.a(iele0.a);
            Arrays.fill(arr_b1, 0);
            iele0.init(iebu0);
            this.loadStore(new iekw(dataInputStream0, iele0));
            byte[] arr_b2 = new byte[iele0.a];
            iele0.doFinal(arr_b2, 0);
            byte[] arr_b3 = new byte[iele0.a];
            dataInputStream0.readFully(arr_b3);
            if(!iftq.f(arr_b2, arr_b3)) {
                this.table.clear();
                throw new IOException("KeyStore integrity check failed.");
            }
        }
    }

    @Override
    public void engineSetCertificateEntry(String s, Certificate certificate0) {
        BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)this.table.get(s);
        if(bcKeyStoreSpi$StoreEntry0 != null && bcKeyStoreSpi$StoreEntry0.getType() != 1) {
            throw new KeyStoreException("key store already has a key entry with alias " + s);
        }
        this.table.put(s, new BcKeyStoreSpi.StoreEntry(this, s, certificate0));
    }

    @Override
    public void engineSetKeyEntry(String s, Key key0, char[] arr_c, Certificate[] arr_certificate) {
        if((key0 instanceof PrivateKey)) {
            if(arr_certificate == null) {
                throw new KeyStoreException("no certificate chain for private key");
            }
            if(key0.getEncoded() == null) {
                this.table.put(s, new BcKeyStoreSpi.StoreEntry(this, s, new Date(), 2, key0, arr_certificate));
                return;
            }
        }
        try {
            this.table.put(s, new BcKeyStoreSpi.StoreEntry(this, s, key0, arr_c, arr_certificate));
        }
        catch(Exception exception0) {
            throw new BcKeyStoreSpi.BCKeyStoreException(exception0.toString(), exception0);
        }
    }

    @Override
    public void engineSetKeyEntry(String s, byte[] arr_b, Certificate[] arr_certificate) {
        this.table.put(s, new BcKeyStoreSpi.StoreEntry(this, s, arr_b, arr_certificate));
    }

    @Override
    public int engineSize() {
        return this.table.size();
    }

    @Override
    public void engineStore(OutputStream outputStream0, char[] arr_c) {
        DataOutputStream dataOutputStream0 = new DataOutputStream(outputStream0);
        byte[] arr_b = new byte[20];
        int v = this.random.nextInt() & 0x3FF;
        this.random.nextBytes(arr_b);
        dataOutputStream0.writeInt(this.version);
        dataOutputStream0.writeInt(20);
        dataOutputStream0.write(arr_b);
        dataOutputStream0.writeInt(v + 0x400);
        iele iele0 = new iele(new ieev());
        iekx iekx0 = new iekx(iele0);
        iekk iekk0 = new iekk(new ieev());
        byte[] arr_b1 = iecv.e(arr_c);
        iekk0.d(arr_b1, arr_b, v + 0x400);
        if(this.version < 2) {
            iele0.init(iekk0.a(iele0.a));
        }
        else {
            iele0.init(iekk0.a(iele0.a * 8));
        }
        for(int v1 = 0; v1 != arr_b1.length; ++v1) {
            arr_b1[v1] = 0;
        }
        this.saveStore(new ifup(dataOutputStream0, iekx0));
        byte[] arr_b2 = new byte[iele0.a];
        iele0.doFinal(arr_b2, 0);
        dataOutputStream0.write(arr_b2);
        dataOutputStream0.close();
    }

    protected void loadStore(InputStream inputStream0) {
        BcKeyStoreSpi bcKeyStoreSpi0;
        Certificate[] arr_certificate;
        DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
        int v = dataInputStream0.read();
        while(v > 0) {
            String s = dataInputStream0.readUTF();
            Date date0 = new Date(dataInputStream0.readLong());
            int v1 = dataInputStream0.readInt();
            if(v1 == 0) {
                arr_certificate = null;
            }
            else {
                arr_certificate = new Certificate[v1];
                for(int v2 = 0; v2 != v1; ++v2) {
                    arr_certificate[v2] = this.decodeCertificate(dataInputStream0);
                }
            }
            switch(v) {
                case 1: {
                    bcKeyStoreSpi0 = this;
                    Certificate certificate0 = bcKeyStoreSpi0.decodeCertificate(dataInputStream0);
                    bcKeyStoreSpi0.table.put(s, new BcKeyStoreSpi.StoreEntry(bcKeyStoreSpi0, s, date0, 1, certificate0));
                    break;
                }
                case 2: {
                    bcKeyStoreSpi0 = this;
                    Key key0 = bcKeyStoreSpi0.decodeKey(dataInputStream0);
                    bcKeyStoreSpi0.table.put(s, new BcKeyStoreSpi.StoreEntry(bcKeyStoreSpi0, s, date0, 2, key0, arr_certificate));
                    break;
                }
                case 3: 
                case 4: {
                    byte[] arr_b = new byte[dataInputStream0.readInt()];
                    dataInputStream0.readFully(arr_b);
                    bcKeyStoreSpi0 = this;
                    this.table.put(s, new BcKeyStoreSpi.StoreEntry(this, s, date0, v, arr_b, arr_certificate));
                    break;
                }
                default: {
                    throw new IOException("Unknown object type in store.");
                }
            }
            v = dataInputStream0.read();
            this = bcKeyStoreSpi0;
        }
    }

    protected Cipher makePBECipher(String s, int v, char[] arr_c, byte[] arr_b, int v1) {
        try {
            PBEKeySpec pBEKeySpec0 = new PBEKeySpec(arr_c);
            SecretKeyFactory secretKeyFactory0 = this.helper.g(s);
            PBEParameterSpec pBEParameterSpec0 = new PBEParameterSpec(arr_b, v1);
            Cipher cipher0 = this.helper.e(s);
            cipher0.init(v, secretKeyFactory0.generateSecret(pBEKeySpec0), pBEParameterSpec0);
            return cipher0;
        }
        catch(Exception exception0) {
            throw new IOException("Error initialising store of key store: " + exception0.toString());
        }
    }

    protected void saveStore(OutputStream outputStream0) {
        Enumeration enumeration0 = this.table.elements();
        DataOutputStream dataOutputStream0 = new DataOutputStream(outputStream0);
        while(enumeration0.hasMoreElements()) {
            BcKeyStoreSpi.StoreEntry bcKeyStoreSpi$StoreEntry0 = (BcKeyStoreSpi.StoreEntry)enumeration0.nextElement();
            dataOutputStream0.write(bcKeyStoreSpi$StoreEntry0.getType());
            dataOutputStream0.writeUTF(bcKeyStoreSpi$StoreEntry0.getAlias());
            dataOutputStream0.writeLong(bcKeyStoreSpi$StoreEntry0.getDate().getTime());
            Certificate[] arr_certificate = bcKeyStoreSpi$StoreEntry0.getCertificateChain();
            if(arr_certificate == null) {
                dataOutputStream0.writeInt(0);
            }
            else {
                dataOutputStream0.writeInt(arr_certificate.length);
                for(int v = 0; v != arr_certificate.length; ++v) {
                    this.encodeCertificate(arr_certificate[v], dataOutputStream0);
                }
            }
            switch(bcKeyStoreSpi$StoreEntry0.getType()) {
                case 1: {
                    this.encodeCertificate(((Certificate)bcKeyStoreSpi$StoreEntry0.getObject()), dataOutputStream0);
                    break;
                }
                case 2: {
                    this.encodeKey(((Key)bcKeyStoreSpi$StoreEntry0.getObject()), dataOutputStream0);
                    break;
                }
                case 3: 
                case 4: {
                    byte[] arr_b = (byte[])bcKeyStoreSpi$StoreEntry0.getObject();
                    dataOutputStream0.writeInt(arr_b.length);
                    dataOutputStream0.write(arr_b);
                    break;
                }
                default: {
                    throw new IOException("Unknown object type in store.");
                }
            }
        }
        dataOutputStream0.write(0);
    }

    public void setRandom(SecureRandom secureRandom0) {
        this.random = secureRandom0;
    }
}

