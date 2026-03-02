package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import idzh;
import ieur;
import iewc;
import ifnq;
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

public class BCSLHDSAPublicKey implements ieur {
    private transient ifnq params;
    private static final long serialVersionUID = 1L;

    public BCSLHDSAPublicKey(idzh idzh0) {
        this.init(idzh0);
    }

    public BCSLHDSAPublicKey(ifnq ifnq0) {
        this.params = ifnq0;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BCSLHDSAPublicKey) ? Arrays.equals(this.params.a(), ((BCSLHDSAPublicKey)object0).params.a()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return "SLH-DSA-" + ifuf.c(this.params.b.y);
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

    public ifnq getKeyParams() {
        return this.params;
    }

    public iewc getParameterSpec() {
        return iewc.a(this.params.b.y);
    }

    public byte[] getPublicData() {
        return this.params.a();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.params.a());
    }

    private void init(idzh idzh0) {
        this.params = (ifnq)ifpl.a(idzh0);
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

