package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import idqy;
import idvk;
import ieup;
import ieuq;
import ievt;
import ifli;
import iflj;
import ifoj;
import ifok;
import iftq;
import iftv;
import ifuf;
import iful;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class BCMLKEMPrivateKey implements ieup {
    private transient String algorithm;
    private transient idqy attributes;
    private transient ifli params;
    private transient byte[] priorEncoding;
    private static final long serialVersionUID = 1L;

    public BCMLKEMPrivateKey(idvk idvk0) {
        this.init(idvk0);
    }

    public BCMLKEMPrivateKey(ifli ifli0) {
        this.params = ifli0;
        this.algorithm = ifuf.c(ifli0.b.d);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BCMLKEMPrivateKey) ? Arrays.equals(this.params.b(), ((BCMLKEMPrivateKey)object0).params.b()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override
    public byte[] getEncoded() {
        try {
            byte[] arr_b = this.priorEncoding;
            return arr_b == null ? ifok.a(this.params, this.attributes).u() : arr_b;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    public ifli getKeyParams() {
        return this.params;
    }

    public ievt getParameterSpec() {
        return ievt.a(this.params.b.d);
    }

    public byte[] getPrivateData() {
        return this.params.b();
    }

    public ieup getPrivateKey(boolean z) {
        return !z || this.params.d() == null ? new BCMLKEMPrivateKey(this.params.a(2)) : new BCMLKEMPrivateKey(this.params.a(1));
    }

    public ieuq getPublicKey() {
        return new BCMLKEMPublicKey(new iflj(this.params.b, this.params.f, this.params.g));
    }

    public byte[] getSeed() {
        return this.params.d();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.params.b());
    }

    private void init(idvk idvk0) {
        this.attributes = idvk0.c;
        this.priorEncoding = idvk0.u();
        ifli ifli0 = (ifli)ifoj.a(idvk0);
        this.params = ifli0;
        this.algorithm = ifuf.c(ievt.a(ifli0.b.d).d);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.init(idvk.d(((byte[])objectInputStream0.readObject())));
    }

    @Override
    public String toString() {
        String s = ifuf.a;
        byte[] arr_b = this.params.c();
        return this.getAlgorithm() + " Private Key [" + new iftv(arr_b).toString() + "]" + s + "    public data: " + iful.a(arr_b) + s;
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

