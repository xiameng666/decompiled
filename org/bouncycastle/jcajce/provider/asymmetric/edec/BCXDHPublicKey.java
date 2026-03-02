package org.bouncycastle.jcajce.provider.asymmetric.edec;

import idzh;
import ienr;
import ieqe;
import ieqg;
import iete;
import ieut;
import iftq;
import ifud;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

public class BCXDHPublicKey implements ieut {
    static final long serialVersionUID = 1L;
    transient ienr xdhPublicKey;

    public BCXDHPublicKey(idzh idzh0) {
        this.populateFromPubKeyInfo(idzh0);
    }

    public BCXDHPublicKey(ienr ienr0) {
        this.xdhPublicKey = ienr0;
    }

    public BCXDHPublicKey(byte[] arr_b, byte[] arr_b1) {
        if(!Utils.isValidPrefix(arr_b, arr_b1)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        int v = arr_b1.length - arr_b.length;
        if(v == 56) {
            this.xdhPublicKey = new ieqg(arr_b1, arr_b.length);
            return;
        }
        if(v != 0x20) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        this.xdhPublicKey = new ieqe(arr_b1, arr_b.length);
    }

    public ienr engineGetKeyParameters() {
        return this.xdhPublicKey;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof PublicKey) ? Arrays.equals(((PublicKey)object0).getEncoded(), this.getEncoded()) : false;
    }

    @Override
    public String getAlgorithm() {
        if(ifud.c("org.bouncycastle.emulate.oracle")) {
            return "XDH";
        }
        return (this.xdhPublicKey instanceof ieqg) ? "X448" : "X25519";
    }

    @Override
    public byte[] getEncoded() {
        if((this.xdhPublicKey instanceof ieqg)) {
            byte[] arr_b = new byte[KeyFactorySpi.x448Prefix.length + 56];
            System.arraycopy(KeyFactorySpi.x448Prefix, 0, arr_b, 0, KeyFactorySpi.x448Prefix.length);
            ((ieqg)this.xdhPublicKey).a(arr_b, KeyFactorySpi.x448Prefix.length);
            return arr_b;
        }
        byte[] arr_b1 = new byte[KeyFactorySpi.x25519Prefix.length + 0x20];
        System.arraycopy(KeyFactorySpi.x25519Prefix, 0, arr_b1, 0, KeyFactorySpi.x25519Prefix.length);
        ((ieqe)this.xdhPublicKey).a(arr_b1, KeyFactorySpi.x25519Prefix.length);
        return arr_b1;
    }

    @Override
    public String getFormat() {
        return "X.509";
    }

    public BigInteger getU() {
        byte[] arr_b = this.getUEncoding();
        iftq.s(arr_b);
        return new BigInteger(1, arr_b);
    }

    @Override  // ieut
    public byte[] getUEncoding() {
        ienr ienr0 = this.xdhPublicKey;
        return (ienr0 instanceof ieqg) ? ((ieqg)ienr0).b() : ((ieqe)ienr0).b();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.getEncoded());
    }

    private void populateFromPubKeyInfo(idzh idzh0) {
        byte[] arr_b = idzh0.b.n();
        if(iete.c.y(idzh0.a.a)) {
            this.xdhPublicKey = new ieqg(arr_b);
            return;
        }
        this.xdhPublicKey = new ieqe(arr_b);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.populateFromPubKeyInfo(idzh.b(((byte[])objectInputStream0.readObject())));
    }

    @Override
    public String toString() {
        return Utils.keyToString("Public Key", this.getAlgorithm(), this.xdhPublicKey);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

