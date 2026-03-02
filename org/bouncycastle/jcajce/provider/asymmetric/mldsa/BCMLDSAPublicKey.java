package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import idzh;
import ieuo;
import ievq;
import ifkp;
import ifpl;
import ifpn;
import iftq;
import iftv;
import ifuf;
import iful;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class BCMLDSAPublicKey implements ieuo {
    private transient String algorithm;
    private transient ifkp params;
    private static final long serialVersionUID = 1L;

    public BCMLDSAPublicKey(idzh idzh0) {
        this.init(idzh0);
    }

    public BCMLDSAPublicKey(ifkp ifkp0) {
        this.params = ifkp0;
        this.algorithm = ifuf.c(ievq.a(ifkp0.b.g).g);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BCMLDSAPublicKey) ? Arrays.equals(this.params.a(), ((BCMLDSAPublicKey)object0).params.a()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override
    public byte[] getEncoded() {
        try {
            return ifpn.a(this.params).u();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "X.509";
    }

    public ifkp getKeyParams() {
        return this.params;
    }

    public ievq getParameterSpec() {
        return ievq.a(this.params.b.g);
    }

    @Override  // ieuo
    public byte[] getPublicData() {
        return this.params.a();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.params.a());
    }

    private void init(idzh idzh0) {
        ifkp ifkp0 = (ifkp)ifpl.a(idzh0);
        this.params = ifkp0;
        this.algorithm = ifuf.c(ievq.a(ifkp0.b.g).g);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.init(idzh.b(((byte[])objectInputStream0.readObject())));
    }

    @Override
    public String toString() {
        String s = ifuf.a;
        byte[] arr_b = this.params.a();
        return this.getAlgorithm() + " Public Key [" + new iftv(arr_b).toString() + "]" + s + "    public data: " + iful.a(arr_b) + s;
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

