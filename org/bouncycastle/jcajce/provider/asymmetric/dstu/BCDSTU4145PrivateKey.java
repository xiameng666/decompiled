package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import idpc;
import idph;
import idpx;
import idqg;
import idqm;
import idqt;
import idsc;
import idvk;
import idvt;
import idxu;
import idxv;
import idxw;
import idxx;
import idxy;
import idyk;
import idzh;
import ieav;
import ieax;
import ieaz;
import iebd;
import ieok;
import ieop;
import iews;
import iexe;
import iexi;
import iexp;
import iexq;
import iexr;
import iexs;
import ieyn;
import ieyp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

public class BCDSTU4145PrivateKey implements iews, iexe, ECPrivateKey {
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient idpc publicKey;
    static final long serialVersionUID = 0x648EE5F4B1B13042L;
    private boolean withCompression;

    protected BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSTU4145PrivateKey(idvk idvk0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.populateFromPrivKeyInfo(idvk0);
    }

    public BCDSTU4145PrivateKey(iexs iexs0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = iexs0.b;
        this.ecSpec = iexs0.a == null ? null : EC5Util.convertSpec(EC5Util.convertCurve(iexs0.a.b, iexs0.a.c), iexs0.a);
    }

    public BCDSTU4145PrivateKey(String s, ieop ieop0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey(String s, ieop ieop0, BCDSTU4145PublicKey bCDSTU4145PublicKey0, iexr iexr0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ieok ieok0 = ieop0.b;
        this.algorithm = s;
        this.d = ieop0.c;
        if(iexr0 == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(ieok0.a, ieok0.c()), EC5Util.convertPoint(ieok0.b), ieok0.c, ieok0.d.intValue());
        }
        else {
            EllipticCurve ellipticCurve0 = EC5Util.convertCurve(iexr0.b, iexr0.c);
            ECPoint eCPoint0 = EC5Util.convertPoint(iexr0.d);
            int v = iexr0.f.intValue();
            this.ecSpec = new ECParameterSpec(ellipticCurve0, eCPoint0, iexr0.e, v);
        }
        this.publicKey = this.getPublicKeyDetails(bCDSTU4145PublicKey0);
    }

    public BCDSTU4145PrivateKey(String s, ieop ieop0, BCDSTU4145PublicKey bCDSTU4145PublicKey0, ECParameterSpec eCParameterSpec0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ieok ieok0 = ieop0.b;
        this.algorithm = s;
        this.d = ieop0.c;
        this.ecSpec = eCParameterSpec0 == null ? new ECParameterSpec(EC5Util.convertCurve(ieok0.a, ieok0.c()), EC5Util.convertPoint(ieok0.b), ieok0.c, ieok0.d.intValue()) : eCParameterSpec0;
        this.publicKey = this.getPublicKeyDetails(bCDSTU4145PublicKey0);
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey0.getS();
        this.algorithm = eCPrivateKey0.getAlgorithm();
        this.ecSpec = eCPrivateKey0.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec0.getS();
        this.ecSpec = eCPrivateKeySpec0.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey0) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCDSTU4145PrivateKey0.d;
        this.ecSpec = bCDSTU4145PrivateKey0.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey0.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey0.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey0.publicKey;
    }

    public iexr engineGetSpec() {
        ECParameterSpec eCParameterSpec0 = this.ecSpec;
        return eCParameterSpec0 == null ? iexi.b.getEcImplicitlyCa() : EC5Util.convertSpec(eCParameterSpec0);
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof BCDSTU4145PrivateKey) ? this.getD().equals(((BCDSTU4145PrivateKey)object0).getD()) && this.engineGetSpec().equals(((BCDSTU4145PrivateKey)object0).engineGetSpec()) : false;
    }

    @Override
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override  // iexe
    public idph getBagAttribute(idqg idqg0) {
        return this.attrCarrier.getBagAttribute(idqg0);
    }

    @Override  // iexe
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override  // iews
    public BigInteger getD() {
        return this.d;
    }

    @Override
    public byte[] getEncoded() {
        int v;
        ieav ieav0;
        ECParameterSpec eCParameterSpec0 = this.ecSpec;
        if((eCParameterSpec0 instanceof iexq)) {
            idqg idqg0 = ECUtil.getNamedCurveOid(((iexq)eCParameterSpec0).a);
            if(idqg0 == null) {
                idqg0 = new idqg(((iexq)this.ecSpec).a);
            }
            ieav0 = new ieav(idqg0);
            BigInteger bigInteger0 = this.ecSpec.getOrder();
            v = ECUtil.getOrderBitLength(iexi.b, bigInteger0, this.getS());
        }
        else if(eCParameterSpec0 == null) {
            ieav0 = new ieav(idsc.b);
            v = ECUtil.getOrderBitLength(iexi.b, null, this.getS());
        }
        else {
            ieyp ieyp0 = EC5Util.convertCurve(eCParameterSpec0.getCurve());
            ieav0 = new ieav(new ieax(ieyp0, new ieaz(EC5Util.convertPoint(ieyp0, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            BigInteger bigInteger1 = this.ecSpec.getOrder();
            v = ECUtil.getOrderBitLength(iexi.b, bigInteger1, this.getS());
        }
        idvt idvt0 = this.publicKey == null ? new idvt(v, this.getS(), ieav0) : new idvt(v, this.getS(), this.publicKey, ieav0);
        try {
            return (this.algorithm.equals("DSTU4145") ? new idvk(new idyk(idxy.c, ieav0.a), idvt0.a) : new idvk(new idyk(iebd.l, ieav0.a), idvt0.a)).v("DER");
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    @Override  // iewr
    public iexr getParameters() {
        return this.ecSpec == null ? null : EC5Util.convertSpec(this.ecSpec);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    private idpc getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey0) {
        try {
            return idzh.b(idqm.w(bCDSTU4145PublicKey0.getEncoded())).b;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public BigInteger getS() {
        return this.d;
    }

    @Override  // iexe
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override
    public int hashCode() {
        int v = this.getD().hashCode();
        return this.engineGetSpec().hashCode() ^ v;
    }

    private void populateFromPrivKeyInfo(idvk idvk0) {
        iexr iexr0;
        ieav ieav0 = ieav.a(idvk0.b.b);
        if(ieav0.c()) {
            idqg idqg0 = idqg.h(ieav0.a);
            ieax ieax0 = ECUtil.getNamedCurveByOid(idqg0);
            if(ieax0 == null) {
                ieok ieok0 = idxv.a(idqg0);
                EllipticCurve ellipticCurve0 = EC5Util.convertCurve(ieok0.a, ieok0.c());
                this.ecSpec = new iexq(idqg0.b(), ellipticCurve0, EC5Util.convertPoint(ieok0.b), ieok0.c, ieok0.d);
            }
            else {
                String s = ECUtil.getCurveName(idqg0);
                ECPoint eCPoint0 = EC5Util.convertPoint(ieax0.c());
                BigInteger bigInteger0 = ieax0.a;
                BigInteger bigInteger1 = ieax0.b;
                this.ecSpec = new iexq(s, EC5Util.convertCurve(ieax0.b(), ieax0.d()), eCPoint0, bigInteger0, bigInteger1);
            }
        }
        else if(ieav0.b()) {
            this.ecSpec = null;
        }
        else {
            idqt idqt0 = idqt.m(ieav0.a);
            if((idqt0.h(0) instanceof idpx)) {
                ieax ieax1 = ieax.a(ieav0.a);
                ECPoint eCPoint1 = EC5Util.convertPoint(ieax1.c());
                BigInteger bigInteger2 = ieax1.a;
                int v = ieax1.b.intValue();
                this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(ieax1.b(), ieax1.d()), eCPoint1, bigInteger2, v);
            }
            else {
                idxw idxw0 = idxw.a(idqt0);
                if(idxw0.b()) {
                    idqg idqg1 = idxw0.a;
                    ieok ieok1 = idxv.a(idqg1);
                    iexr0 = new iexp(idqg1.b(), ieok1.a, ieok1.b, ieok1.c, ieok1.d, ieok1.c());
                }
                else {
                    idxu idxu0 = idxw0.b;
                    byte[] arr_b = idxu0.c();
                    idqg idqg2 = idxy.b;
                    if(idvk0.b.a.y(idqg2)) {
                        this.reverseBytes(arr_b);
                    }
                    ieyn ieyn0 = new ieyn(idxu0.b.a, idxu0.b.b, idxu0.b.c, idxu0.b.d, idxu0.a(), new BigInteger(1, arr_b), null, null);
                    byte[] arr_b1 = idxu0.d();
                    if(idvk0.b.a.y(idqg2)) {
                        this.reverseBytes(arr_b1);
                    }
                    iexr0 = new iexr(ieyn0, idxx.b(ieyn0, arr_b1), idxu0.b());
                }
                EllipticCurve ellipticCurve1 = EC5Util.convertCurve(iexr0.b, iexr0.c);
                ECPoint eCPoint2 = EC5Util.convertPoint(iexr0.d);
                int v1 = iexr0.f.intValue();
                this.ecSpec = new ECParameterSpec(ellipticCurve1, eCPoint2, iexr0.e, v1);
            }
        }
        idph idph0 = idvk0.b();
        if((idph0 instanceof idpx)) {
            this.d = idpx.n(idph0).m();
            return;
        }
        idvt idvt0 = idvt.d(idph0);
        this.d = idvt0.a();
        this.publicKey = idvt0.b();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.populateFromPrivKeyInfo(idvk.d(idqm.w(((byte[])objectInputStream0.readObject()))));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void reverseBytes(byte[] arr_b) {
        for(int v = 0; v < arr_b.length >> 1; ++v) {
            byte b = arr_b[v];
            int v1 = arr_b.length - 1 - v;
            arr_b[v] = arr_b[v1];
            arr_b[v1] = b;
        }
    }

    @Override  // iexe
    public void setBagAttribute(idqg idqg0, idph idph0) {
        this.attrCarrier.setBagAttribute(idqg0, idph0);
    }

    @Override  // iexe
    public void setFriendlyName(String s) {
        this.attrCarrier.setFriendlyName(s);
    }

    public void setPointFormat(String s) {
        this.withCompression = "UNCOMPRESSED".equalsIgnoreCase(s) ^ 1;
    }

    @Override
    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.d, this.engineGetSpec());
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

