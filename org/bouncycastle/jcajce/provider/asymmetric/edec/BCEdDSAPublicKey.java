package org.bouncycastle.jcajce.provider.asymmetric.edec;

import idzh;
import ienr;
import ieos;
import ieou;
import iete;
import ieum;
import iftq;
import ifud;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

public class BCEdDSAPublicKey implements ieum {
    transient ienr eddsaPublicKey;
    static final long serialVersionUID = 1L;

    public BCEdDSAPublicKey(idzh idzh0) {
        this.populateFromPubKeyInfo(idzh0);
    }

    public BCEdDSAPublicKey(ienr ienr0) {
        this.eddsaPublicKey = ienr0;
    }

    public BCEdDSAPublicKey(byte[] arr_b, byte[] arr_b1) {
        if(!Utils.isValidPrefix(arr_b, arr_b1)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        int v = arr_b1.length - arr_b.length;
        if(v == 57) {
            this.eddsaPublicKey = new ieou(arr_b1, arr_b.length);
            return;
        }
        if(v != 0x20) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        this.eddsaPublicKey = new ieos(arr_b1, arr_b.length);
    }

    public ienr engineGetKeyParameters() {
        return this.eddsaPublicKey;
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
            return "EdDSA";
        }
        return (this.eddsaPublicKey instanceof ieou) ? "Ed448" : "Ed25519";
    }

    @Override
    public byte[] getEncoded() {
        if((this.eddsaPublicKey instanceof ieou)) {
            byte[] arr_b = new byte[KeyFactorySpi.Ed448Prefix.length + 57];
            System.arraycopy(KeyFactorySpi.Ed448Prefix, 0, arr_b, 0, KeyFactorySpi.Ed448Prefix.length);
            ((ieou)this.eddsaPublicKey).a(arr_b, KeyFactorySpi.Ed448Prefix.length);
            return arr_b;
        }
        byte[] arr_b1 = new byte[KeyFactorySpi.Ed25519Prefix.length + 0x20];
        System.arraycopy(KeyFactorySpi.Ed25519Prefix, 0, arr_b1, 0, KeyFactorySpi.Ed25519Prefix.length);
        ((ieos)this.eddsaPublicKey).a(arr_b1, KeyFactorySpi.Ed25519Prefix.length);
        return arr_b1;
    }

    @Override
    public String getFormat() {
        return "X.509";
    }

    @Override  // ieum
    public byte[] getPointEncoding() {
        ienr ienr0 = this.eddsaPublicKey;
        return (ienr0 instanceof ieou) ? ((ieou)ienr0).b() : ((ieos)ienr0).b();
    }

    @Override
    public int hashCode() {
        return iftq.a(this.getEncoded());
    }

    private void populateFromPubKeyInfo(idzh idzh0) {
        byte[] arr_b = idzh0.b.n();
        if(iete.e.y(idzh0.a.a)) {
            this.eddsaPublicKey = new ieou(arr_b);
            return;
        }
        this.eddsaPublicKey = new ieos(arr_b);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.populateFromPubKeyInfo(idzh.b(((byte[])objectInputStream0.readObject())));
    }

    @Override
    public String toString() {
        return Utils.keyToString("Public Key", this.getAlgorithm(), this.eddsaPublicKey);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

