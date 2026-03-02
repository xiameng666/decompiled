package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import idqy;
import idvk;
import ieun;
import ieuo;
import ievq;
import ifko;
import ifkp;
import ifoj;
import ifsq;
import iftq;
import iftv;
import ifuf;
import iful;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class BCMLDSAPrivateKey implements ieun {
    private transient String algorithm;
    private transient idqy attributes;
    private transient byte[] encoding;
    private transient ifko params;
    private static final long serialVersionUID = 1L;

    public BCMLDSAPrivateKey(idvk idvk0) {
        this.init(idvk0);
    }

    public BCMLDSAPrivateKey(ifko ifko0) {
        this.params = ifko0;
        this.algorithm = ifuf.c(ievq.a(ifko0.b.g).g);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BCMLDSAPrivateKey) ? Arrays.equals(this.params.b(), ((BCMLDSAPrivateKey)object0).params.b()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override
    public byte[] getEncoded() {
        if(this.encoding == null) {
            this.encoding = ifsq.a(this.params, this.attributes);
        }
        return iftq.j(this.encoding);
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    public ifko getKeyParams() {
        return this.params;
    }

    public ievq getParameterSpec() {
        return ievq.a(this.params.b.g);
    }

    public byte[] getPrivateData() {
        return this.params.b();
    }

    public ieun getPrivateKey(boolean z) {
        return !z || this.params.d() == null ? new BCMLDSAPrivateKey(this.params.a(2)) : new BCMLDSAPrivateKey(this.params.a(1));
    }

    public ieuo getPublicKey() {
        byte[] arr_b = this.params.i;
        ifkp ifkp0 = arr_b == null ? null : new ifkp(this.params.b, this.params.c, arr_b);
        return ifkp0 == null ? null : new BCMLDSAPublicKey(ifkp0);
    }

    public byte[] getSeed() {
        return this.params.d();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.params.b());
    }

    private void init(idvk idvk0) {
        this.encoding = idvk0.u();
        this.init(((ifko)ifoj.a(idvk0)), idvk0.c);
    }

    private void init(ifko ifko0, idqy idqy0) {
        this.attributes = idqy0;
        this.params = ifko0;
        this.algorithm = ifuf.c(ievq.a(ifko0.b.g).g);
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

