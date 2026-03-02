package org.bouncycastle.jcajce.provider.asymmetric.gost;

import idph;
import idpx;
import idqg;
import idqi;
import idsd;
import idtu;
import idug;
import idvk;
import idyk;
import iepc;
import iepe;
import iewy;
import iewz;
import iexe;
import iexy;
import iexz;
import ieya;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

public class BCGOST3410PrivateKey implements iewz, iexe {
    private transient iexe attrCarrier;
    private transient iewy gost3410Spec;
    static final long serialVersionUID = 0x77182FB116C68338L;
    private BigInteger x;

    protected BCGOST3410PrivateKey() {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCGOST3410PrivateKey(idvk idvk0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        idug idug0 = idug.a(idvk0.b.b);
        idph idph0 = idvk0.b();
        if((idph0 instanceof idpx)) {
            this.x = idpx.n(idph0).j();
        }
        else {
            byte[] arr_b = idqi.g(idvk0.b()).b;
            byte[] arr_b1 = new byte[arr_b.length];
            for(int v = 0; v != arr_b.length; ++v) {
                arr_b1[v] = arr_b[arr_b.length - 1 - v];
            }
            this.x = new BigInteger(1, arr_b1);
        }
        this.gost3410Spec = iexy.e(idug0);
    }

    public BCGOST3410PrivateKey(iepe iepe0, iexy iexy0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = iepe0.c;
        this.gost3410Spec = iexy0;
        if(iexy0 != null) {
            return;
        }
        throw new IllegalArgumentException("spec is null");
    }

    public BCGOST3410PrivateKey(iewz iewz0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = iewz0.getX();
        this.gost3410Spec = iewz0.getParameters();
    }

    public BCGOST3410PrivateKey(iexz iexz0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = iexz0.a;
        this.gost3410Spec = new iexy(new ieya(iexz0.b, iexz0.c, iexz0.d));
    }

    private boolean compareObj(Object object0, Object object1) {
        if(object0 == object1) {
            return true;
        }
        return object0 == null ? false : object0.equals(object1);
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof iewz) ? this.getX().equals(((iewz)object0).getX()) && this.getParameters().d().equals(((iewz)object0).getParameters().d()) && this.compareObj(this.getParameters().a(), ((iewz)object0).getParameters().a()) && this.compareObj(this.getParameters().b(), ((iewz)object0).getParameters().b()) : false;
    }

    @Override
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override  // iexe
    public idph getBagAttribute(idqg idqg0) {
        return this.attrCarrier.getBagAttribute(idqg0);
    }

    @Override  // iexe
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override
    public byte[] getEncoded() {
        idvk idvk0;
        byte[] arr_b = this.getX().toByteArray();
        byte[] arr_b1 = arr_b[0] == 0 ? new byte[arr_b.length - 1] : new byte[arr_b.length];
        for(int v = 0; v != arr_b1.length; ++v) {
            arr_b1[v] = arr_b[arr_b.length - 1 - v];
        }
        try {
            if((this.gost3410Spec instanceof iexy)) {
                idug idug0 = new idug(new idqg(this.gost3410Spec.c()), new idqg(this.gost3410Spec.a()));
                idvk0 = new idvk(new idyk(idtu.l, idug0), new idsd(arr_b1));
            }
            else {
                idvk0 = new idvk(new idyk(idtu.l), new idsd(arr_b1));
            }
            return idvk0.v("DER");
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    @Override  // iewx
    public iewy getParameters() {
        return this.gost3410Spec;
    }

    @Override  // iewz
    public BigInteger getX() {
        return this.x;
    }

    @Override  // iexe
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override
    public int hashCode() {
        return this.gost3410Spec.hashCode() ^ this.getX().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        String s = (String)objectInputStream0.readObject();
        if(s == null) {
            this.gost3410Spec = new iexy(new ieya(((BigInteger)objectInputStream0.readObject()), ((BigInteger)objectInputStream0.readObject()), ((BigInteger)objectInputStream0.readObject())));
            objectInputStream0.readObject();
            objectInputStream0.readObject();
        }
        else {
            this.gost3410Spec = new iexy(s, ((String)objectInputStream0.readObject()), ((String)objectInputStream0.readObject()));
        }
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    @Override  // iexe
    public void setBagAttribute(idqg idqg0, idph idph0) {
        this.attrCarrier.setBagAttribute(idqg0, idph0);
    }

    @Override  // iexe
    public void setFriendlyName(String s) {
        this.attrCarrier.setFriendlyName(s);
    }

    @Override
    public String toString() {
        try {
            return GOSTUtil.privateKeyToString("GOST3410", this.x, ((iepc)GOST3410Util.generatePrivateKeyParameter(this)).b);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new IllegalStateException(invalidKeyException0.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        if(this.gost3410Spec.c() != null) {
            objectOutputStream0.writeObject(this.gost3410Spec.c());
            objectOutputStream0.writeObject(this.gost3410Spec.a());
            objectOutputStream0.writeObject(this.gost3410Spec.b());
            return;
        }
        objectOutputStream0.writeObject(null);
        objectOutputStream0.writeObject(this.gost3410Spec.d().a);
        objectOutputStream0.writeObject(this.gost3410Spec.d().b);
        objectOutputStream0.writeObject(this.gost3410Spec.d().c);
        objectOutputStream0.writeObject(this.gost3410Spec.a());
        objectOutputStream0.writeObject(this.gost3410Spec.b());
    }
}

