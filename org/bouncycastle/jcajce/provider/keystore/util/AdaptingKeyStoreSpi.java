package org.bouncycastle.jcajce.provider.keystore.util;

import iewl;
import ifud;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore.LoadStoreParameter;
import java.security.KeyStoreSpi;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

public class AdaptingKeyStoreSpi extends KeyStoreSpi {
    public static final String COMPAT_OVERRIDE = "keystore.type.compat";
    private final JKSKeyStoreSpi jksStore;
    private KeyStoreSpi keyStoreSpi;
    private final KeyStoreSpi primaryStore;

    public AdaptingKeyStoreSpi(iewl iewl0, KeyStoreSpi keyStoreSpi0) {
        this.jksStore = new JKSKeyStoreSpi(iewl0);
        this.primaryStore = keyStoreSpi0;
        this.keyStoreSpi = keyStoreSpi0;
    }

    @Override
    public Enumeration engineAliases() {
        return this.keyStoreSpi.engineAliases();
    }

    @Override
    public boolean engineContainsAlias(String s) {
        return this.keyStoreSpi.engineContainsAlias(s);
    }

    @Override
    public void engineDeleteEntry(String s) {
        this.keyStoreSpi.engineDeleteEntry(s);
    }

    @Override
    public Certificate engineGetCertificate(String s) {
        return this.keyStoreSpi.engineGetCertificate(s);
    }

    @Override
    public String engineGetCertificateAlias(Certificate certificate0) {
        return this.keyStoreSpi.engineGetCertificateAlias(certificate0);
    }

    @Override
    public Certificate[] engineGetCertificateChain(String s) {
        return this.keyStoreSpi.engineGetCertificateChain(s);
    }

    @Override
    public Date engineGetCreationDate(String s) {
        return this.keyStoreSpi.engineGetCreationDate(s);
    }

    @Override
    public Key engineGetKey(String s, char[] arr_c) {
        return this.keyStoreSpi.engineGetKey(s, arr_c);
    }

    @Override
    public boolean engineIsCertificateEntry(String s) {
        return this.keyStoreSpi.engineIsCertificateEntry(s);
    }

    @Override
    public boolean engineIsKeyEntry(String s) {
        return this.keyStoreSpi.engineIsKeyEntry(s);
    }

    @Override
    public void engineLoad(InputStream inputStream0, char[] arr_c) {
        if(inputStream0 == null) {
            this.keyStoreSpi = this.primaryStore;
            this.primaryStore.engineLoad(null, arr_c);
            return;
        }
        if(ifud.c("keystore.type.compat")) {
        label_9:
            if(!inputStream0.markSupported()) {
                inputStream0 = new BufferedInputStream(inputStream0);
            }
            inputStream0.mark(8);
            this.keyStoreSpi = this.jksStore.engineProbe(inputStream0) ? this.jksStore : this.primaryStore;
            inputStream0.reset();
        }
        else {
            KeyStoreSpi keyStoreSpi0 = this.primaryStore;
            if((keyStoreSpi0 instanceof PKCS12KeyStoreSpi)) {
                this.keyStoreSpi = keyStoreSpi0;
                goto label_17;
            }
            goto label_9;
        }
    label_17:
        this.keyStoreSpi.engineLoad(inputStream0, arr_c);
    }

    @Override
    public void engineLoad(KeyStore.LoadStoreParameter keyStore$LoadStoreParameter0) {
        this.keyStoreSpi.engineLoad(keyStore$LoadStoreParameter0);
    }

    @Override
    public boolean engineProbe(InputStream inputStream0) {
        return (this.keyStoreSpi instanceof PKCS12KeyStoreSpi) ? ((PKCS12KeyStoreSpi)this.keyStoreSpi).engineProbe(inputStream0) : false;
    }

    @Override
    public void engineSetCertificateEntry(String s, Certificate certificate0) {
        this.keyStoreSpi.engineSetCertificateEntry(s, certificate0);
    }

    @Override
    public void engineSetKeyEntry(String s, Key key0, char[] arr_c, Certificate[] arr_certificate) {
        this.keyStoreSpi.engineSetKeyEntry(s, key0, arr_c, arr_certificate);
    }

    @Override
    public void engineSetKeyEntry(String s, byte[] arr_b, Certificate[] arr_certificate) {
        this.keyStoreSpi.engineSetKeyEntry(s, arr_b, arr_certificate);
    }

    @Override
    public int engineSize() {
        return this.keyStoreSpi.engineSize();
    }

    @Override
    public void engineStore(OutputStream outputStream0, char[] arr_c) {
        this.keyStoreSpi.engineStore(outputStream0, arr_c);
    }

    @Override
    public void engineStore(KeyStore.LoadStoreParameter keyStore$LoadStoreParameter0) {
        this.keyStoreSpi.engineStore(keyStore$LoadStoreParameter0);
    }
}

