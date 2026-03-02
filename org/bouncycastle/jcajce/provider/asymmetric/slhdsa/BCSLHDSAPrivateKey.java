package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import idqy;
import idvk;
import ieur;
import iewc;
import ifnp;
import ifnq;
import ifoj;
import ifok;
import iftq;
import iftv;
import ifuf;
import iful;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public class BCSLHDSAPrivateKey implements Key, PrivateKey {
    private transient idqy attributes;
    private transient ifnp params;
    private static final long serialVersionUID = 1L;

    public BCSLHDSAPrivateKey(idvk idvk0) {
        this.init(idvk0);
    }

    public BCSLHDSAPrivateKey(ifnp ifnp0) {
        this.params = ifnp0;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BCSLHDSAPrivateKey) ? Arrays.equals(this.params.a(), ((BCSLHDSAPrivateKey)object0).params.a()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return "SLH-DSA-" + ifuf.c(this.params.b.y);
    }

    @Override
    public byte[] getEncoded() {
        try {
            return ifok.a(this.params, this.attributes).u();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    public ifnp getKeyParams() {
        return this.params;
    }

    public iewc getParameterSpec() {
        return iewc.a(this.params.b.y);
    }

    public ieur getPublicKey() {
        return new BCSLHDSAPublicKey(new ifnq(this.params.b, this.params.b()));
    }

    @Override
    public int hashCode() {
        return iftq.a(this.params.a());
    }

    private void init(idvk idvk0) {
        this.attributes = idvk0.c;
        this.params = (ifnp)ifoj.a(idvk0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.init(idvk.d(((byte[])objectInputStream0.readObject())));
    }

    @Override
    public String toString() {
        String s = ifuf.a;
        byte[] arr_b = this.params.b();
        return this.getAlgorithm() + " Private Key [" + new iftv(arr_b).toString() + "]" + s + "    public data: " + iful.a(arr_b) + s;
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

