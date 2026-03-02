package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import idph;
import idpx;
import idqg;
import idqm;
import idvk;
import idyk;
import idys;
import iebd;
import ieof;
import iexe;
import ifuf;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

public class BCDSAPrivateKey implements iexe, DSAPrivateKey {
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient DSAParams dsaSpec;
    private static final long serialVersionUID = 0xBF170939253DADBAL;
    private BigInteger x;

    protected BCDSAPrivateKey() {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSAPrivateKey(idvk idvk0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        idys idys0 = idys.d(idvk0.b.b);
        this.x = ((idpx)idvk0.b()).m();
        this.dsaSpec = new DSAParameterSpec(idys0.b(), idys0.c(), idys0.a());
    }

    public BCDSAPrivateKey(ieof ieof0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = ieof0.c;
        this.dsaSpec = new DSAParameterSpec(ieof0.b.c, ieof0.b.b, ieof0.b.a);
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = dSAPrivateKey0.getX();
        this.dsaSpec = dSAPrivateKey0.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = dSAPrivateKeySpec0.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec0.getP(), dSAPrivateKeySpec0.getQ(), dSAPrivateKeySpec0.getG());
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof DSAPrivateKey) ? this.getX().equals(((DSAPrivateKey)object0).getX()) && this.getParams().getG().equals(((DSAPrivateKey)object0).getParams().getG()) && this.getParams().getP().equals(((DSAPrivateKey)object0).getParams().getP()) && this.getParams().getQ().equals(((DSAPrivateKey)object0).getParams().getQ()) : false;
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
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
        idqm idqm0 = new idys(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).p();
        return KeyUtil.getEncodedPrivateKeyInfo(new idyk(iebd.R, idqm0), new idpx(this.getX()));
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    @Override
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override
    public BigInteger getX() {
        return this.x;
    }

    @Override  // iexe
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override
    public int hashCode() {
        return this.getParams().getQ().hashCode() ^ (this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode());
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec(((BigInteger)objectInputStream0.readObject()), ((BigInteger)objectInputStream0.readObject()), ((BigInteger)objectInputStream0.readObject()));
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
        String s = ifuf.a;
        BigInteger bigInteger0 = this.x;
        BigInteger bigInteger1 = this.getParams().getG().modPow(bigInteger0, this.getParams().getP());
        return "DSA Private Key [" + DSAUtil.generateKeyFingerprint(bigInteger1, this.getParams()) + "]" + s + "            Y: " + bigInteger1.toString(16) + s;
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.dsaSpec.getP());
        objectOutputStream0.writeObject(this.dsaSpec.getQ());
        objectOutputStream0.writeObject(this.dsaSpec.getG());
    }
}

