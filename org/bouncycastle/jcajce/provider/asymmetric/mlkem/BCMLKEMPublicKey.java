package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import idzh;
import ieuq;
import ievt;
import iflj;
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

public class BCMLKEMPublicKey implements ieuq {
    private transient String algorithm;
    private transient iflj params;
    private static final long serialVersionUID = 1L;

    public BCMLKEMPublicKey(idzh idzh0) {
        this.init(idzh0);
    }

    public BCMLKEMPublicKey(iflj iflj0) {
        this.init(iflj0);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BCMLKEMPublicKey) ? Arrays.equals(this.getEncoded(), ((BCMLKEMPublicKey)object0).getEncoded()) : false;
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

    public iflj getKeyParams() {
        return this.params;
    }

    public ievt getParameterSpec() {
        return ievt.a(this.params.b.d);
    }

    @Override  // ieuq
    public byte[] getPublicData() {
        return this.params.a();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.getEncoded());
    }

    private void init(idzh idzh0) {
        iflj iflj0 = (iflj)ifpl.a(idzh0);
        this.params = iflj0;
        this.algorithm = ifuf.c(ievt.a(iflj0.b.d).d);
    }

    private void init(iflj iflj0) {
        this.params = iflj0;
        this.algorithm = ifuf.c(ievt.a(iflj0.b.d).d);
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

