package org.bouncycastle.jcajce.provider.asymmetric.dh;

import idph;
import idpx;
import idqg;
import idqm;
import idqt;
import idux;
import idvi;
import idvk;
import idyk;
import idzu;
import idzw;
import iebd;
import ienx;
import ieny;
import ieoa;
import ieuz;
import ieva;
import iexe;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

public class BCDHPrivateKey implements iexe, DHPrivateKey {
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient ieny dhPrivateKey;
    private transient DHParameterSpec dhSpec;
    private transient idvk info;
    static final long serialVersionUID = 311058815616901812L;
    private BigInteger x;

    protected BCDHPrivateKey() {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDHPrivateKey(idvk idvk0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        idqt idqt0 = idqt.m(idvk0.b.b);
        idpx idpx0 = (idpx)idvk0.b();
        idqg idqg0 = idvk0.b.a;
        this.info = idvk0;
        this.x = idpx0.m();
        if(idqg0.y(idvi.t)) {
            idux idux0 = idux.d(idqt0);
            if(idux0.b() != null) {
                this.dhSpec = new DHParameterSpec(idux0.c(), idux0.a(), idux0.b().intValue());
                this.dhPrivateKey = new ieny(this.x, new ienx(idux0.c(), idux0.a(), idux0.b().intValue()));
                return;
            }
            this.dhSpec = new DHParameterSpec(idux0.c(), idux0.a());
            this.dhPrivateKey = new ieny(this.x, new ienx(idux0.c(), idux0.a()));
            return;
        }
        if(!idqg0.y(iebd.Y)) {
            throw new IllegalArgumentException("unknown algorithm type: " + idqg0);
        }
        idzu idzu0 = idzu.e(idqt0);
        this.dhSpec = new ieuz(idzu0.c(), idzu0.d(), idzu0.a(), idzu0.b(), 0, 0);
        this.dhPrivateKey = new ieny(this.x, new ienx(idzu0.c(), idzu0.a(), idzu0.d(), idzu0.b(), null));
    }

    public BCDHPrivateKey(ieny ieny0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = ieny0.c;
        this.dhSpec = new ieuz(ieny0.b);
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = dHPrivateKey0.getX();
        this.dhSpec = dHPrivateKey0.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec0) {
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.x = dHPrivateKeySpec0.getX();
        if(!(dHPrivateKeySpec0 instanceof ieva)) {
            this.dhSpec = new DHParameterSpec(dHPrivateKeySpec0.getP(), dHPrivateKeySpec0.getG());
            return;
        }
        ieva ieva0 = (ieva)dHPrivateKeySpec0;
        throw null;
    }

    public ieny engineGetKeyParameters() {
        ieny ieny0 = this.dhPrivateKey;
        if(ieny0 != null) {
            return ieny0;
        }
        DHParameterSpec dHParameterSpec0 = this.dhSpec;
        return (dHParameterSpec0 instanceof ieuz) ? new ieny(this.x, ((ieuz)dHParameterSpec0).a()) : new ieny(this.x, new ienx(dHParameterSpec0.getP(), this.dhSpec.getG(), this.dhSpec.getL()));
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof DHPrivateKey) ? this.getX().equals(((DHPrivateKey)object0).getX()) && this.getParams().getG().equals(((DHPrivateKey)object0).getParams().getG()) && this.getParams().getP().equals(((DHPrivateKey)object0).getParams().getP()) && this.getParams().getL() == ((DHPrivateKey)object0).getParams().getL() : false;
    }

    @Override
    public String getAlgorithm() {
        return "DH";
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
        idvk idvk1;
        try {
            idvk idvk0 = this.info;
            if(idvk0 != null) {
                return idvk0.v("DER");
            }
            DHParameterSpec dHParameterSpec0 = this.dhSpec;
            if((dHParameterSpec0 instanceof ieuz) && ((ieuz)dHParameterSpec0).a != null) {
                ienx ienx0 = ((ieuz)dHParameterSpec0).a();
                ieoa ieoa0 = ienx0.g;
                idzw idzw0 = ieoa0 == null ? null : new idzw(ieoa0.a(), ieoa0.a);
                idqm idqm0 = new idzu(ienx0.b, ienx0.a, ienx0.c, ienx0.d, idzw0).p();
                idvk1 = new idvk(new idyk(iebd.Y, idqm0), new idpx(this.getX()));
            }
            else {
                idqm idqm1 = new idux(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).p();
                idvk1 = new idvk(new idyk(idvi.t, idqm1), new idpx(this.getX()));
            }
            return idvk1.v("DER");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    @Override  // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override  // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    @Override  // iexe
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override
    public int hashCode() {
        int v = this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode();
        return this.getParams().getL() ^ v;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.dhSpec = new DHParameterSpec(((BigInteger)objectInputStream0.readObject()), ((BigInteger)objectInputStream0.readObject()), objectInputStream0.readInt());
        this.info = null;
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
        return DHUtil.privateKeyToString("DH", this.x, new ienx(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.dhSpec.getP());
        objectOutputStream0.writeObject(this.dhSpec.getG());
        objectOutputStream0.writeInt(this.dhSpec.getL());
    }
}

