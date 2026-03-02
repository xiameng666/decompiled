package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import idpc;
import idph;
import idpx;
import idqg;
import idqi;
import idqm;
import idqt;
import idsc;
import idsd;
import idtu;
import iduc;
import idug;
import idvk;
import idvt;
import idyk;
import idzh;
import ieav;
import ieax;
import ieaz;
import ieop;
import iewo;
import iews;
import iexe;
import iexi;
import iexp;
import iexq;
import iexr;
import iexs;
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

public class BCECGOST3410PrivateKey implements iews, iexe, ECPrivateKey {
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient idph gostParams;
    private transient idpc publicKey;
    static final long serialVersionUID = 0x648EE5F4B1B13042L;
    private boolean withCompression;

    protected BCECGOST3410PrivateKey() {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410PrivateKey(idvk idvk0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.populateFromPrivKeyInfo(idvk0);
    }

    public BCECGOST3410PrivateKey(iexs iexs0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = iexs0.b;
        this.ecSpec = iexs0.a == null ? null : EC5Util.convertSpec(EC5Util.convertCurve(iexs0.a.b, iexs0.a.c), iexs0.a);
    }

    public BCECGOST3410PrivateKey(String s, ieop ieop0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey(String s, ieop ieop0, BCECGOST3410PublicKey bCECGOST3410PublicKey0, iexr iexr0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        if(iexr0 == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(ieop0.b.a, ieop0.b.c()), EC5Util.convertPoint(ieop0.b.b), ieop0.b.c, ieop0.b.d.intValue());
        }
        else {
            EllipticCurve ellipticCurve0 = EC5Util.convertCurve(iexr0.b, iexr0.c);
            ECPoint eCPoint0 = EC5Util.convertPoint(iexr0.d);
            int v = iexr0.f.intValue();
            this.ecSpec = new ECParameterSpec(ellipticCurve0, eCPoint0, iexr0.e, v);
        }
        this.gostParams = bCECGOST3410PublicKey0.getGostParams();
        this.publicKey = this.getPublicKeyDetails(bCECGOST3410PublicKey0);
    }

    public BCECGOST3410PrivateKey(String s, ieop ieop0, BCECGOST3410PublicKey bCECGOST3410PublicKey0, ECParameterSpec eCParameterSpec0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        this.ecSpec = eCParameterSpec0 == null ? new ECParameterSpec(EC5Util.convertCurve(ieop0.b.a, ieop0.b.c()), EC5Util.convertPoint(ieop0.b.b), ieop0.b.c, ieop0.b.d.intValue()) : eCParameterSpec0;
        this.gostParams = bCECGOST3410PublicKey0.getGostParams();
        this.publicKey = this.getPublicKeyDetails(bCECGOST3410PublicKey0);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey0.getS();
        this.algorithm = eCPrivateKey0.getAlgorithm();
        this.ecSpec = eCPrivateKey0.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec0.getS();
        this.ecSpec = eCPrivateKeySpec0.getParams();
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey0) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCECGOST3410PrivateKey0.d;
        this.ecSpec = bCECGOST3410PrivateKey0.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey0.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey0.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey0.publicKey;
        this.gostParams = bCECGOST3410PrivateKey0.gostParams;
    }

    public iexr engineGetSpec() {
        ECParameterSpec eCParameterSpec0 = this.ecSpec;
        return eCParameterSpec0 == null ? iexi.b.getEcImplicitlyCa() : EC5Util.convertSpec(eCParameterSpec0);
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof BCECGOST3410PrivateKey) ? this.getD().equals(((BCECGOST3410PrivateKey)object0).getD()) && this.engineGetSpec().equals(((BCECGOST3410PrivateKey)object0).engineGetSpec()) : false;
    }

    private void extractBytes(byte[] arr_b, int v, BigInteger bigInteger0) {
        byte[] arr_b1 = bigInteger0.toByteArray();
        if(arr_b1.length < 0x20) {
            byte[] arr_b2 = new byte[0x20];
            System.arraycopy(arr_b1, 0, arr_b2, 0x20 - arr_b1.length, arr_b1.length);
            arr_b1 = arr_b2;
        }
        for(int v1 = 0; v1 != 0x20; ++v1) {
            arr_b[v + v1] = arr_b1[arr_b1.length - 1 - v1];
        }
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
        if(this.gostParams != null) {
            byte[] arr_b = new byte[0x20];
            this.extractBytes(arr_b, 0, this.getS());
            try {
                return new idvk(new idyk(idtu.m, this.gostParams), new idsd(arr_b)).v("DER");
            }
            catch(IOException unused_ex) {
                return null;
            }
        }
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
            ieav ieav1 = new ieav(new ieax(ieyp0, new ieaz(EC5Util.convertPoint(ieyp0, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            BigInteger bigInteger1 = this.ecSpec.getOrder();
            ieav0 = ieav1;
            v = ECUtil.getOrderBitLength(iexi.b, bigInteger1, this.getS());
        }
        idvt idvt0 = this.publicKey == null ? new idvt(v, this.getS(), ieav0) : new idvt(v, this.getS(), this.publicKey, ieav0);
        try {
            return new idvk(new idyk(idtu.m, ieav0.a), idvt0.a).v("DER");
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

    private idpc getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey0) {
        try {
            return idzh.b(idqm.w(bCECGOST3410PublicKey0.getEncoded())).b;
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
        return this.engineGetSpec().hashCode() ^ this.getD().hashCode();
    }

    private void populateFromPrivKeyInfo(idvk idvk0) {
        idph idph0 = idvk0.b.b;
        idqm idqm0 = idph0.p();
        if((idqm0 instanceof idqt)) {
            switch(idqt.m(idqm0).b()) {
                case 2: 
                case 3: {
                    idug idug0 = idug.a(idph0);
                    this.gostParams = idug0;
                    iexp iexp0 = iewo.a(iduc.a(idug0.a));
                    EllipticCurve ellipticCurve0 = EC5Util.convertCurve(iexp0.b, iexp0.c);
                    this.ecSpec = new iexq(iduc.a(idug0.a), ellipticCurve0, EC5Util.convertPoint(iexp0.d), iexp0.e, iexp0.f);
                    idph idph1 = idvk0.b();
                    if((idph1 instanceof idpx)) {
                        this.d = idpx.n(idph1).j();
                        return;
                    }
                    byte[] arr_b = idqi.g(idph1).b;
                    byte[] arr_b1 = new byte[arr_b.length];
                    for(int v = 0; v != arr_b.length; ++v) {
                        arr_b1[v] = arr_b[arr_b.length - 1 - v];
                    }
                    this.d = new BigInteger(1, arr_b1);
                    return;
                }
            }
        }
        ieav ieav0 = ieav.a(idph0);
        if(ieav0.c()) {
            idqg idqg0 = idqg.h(ieav0.a);
            ieax ieax0 = ECUtil.getNamedCurveByOid(idqg0);
            if(ieax0 == null) {
                throw new IllegalStateException();
            }
            this.ecSpec = new iexq(ECUtil.getCurveName(idqg0), EC5Util.convertCurve(ieax0.b(), ieax0.d()), EC5Util.convertPoint(ieax0.c()), ieax0.a, ieax0.b);
        }
        else if(ieav0.b()) {
            this.ecSpec = null;
        }
        else {
            ieax ieax1 = ieax.a(ieav0.a);
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(ieax1.b(), ieax1.d()), EC5Util.convertPoint(ieax1.c()), ieax1.a, ieax1.b.intValue());
        }
        idph idph2 = idvk0.b();
        if((idph2 instanceof idpx)) {
            this.d = idpx.n(idph2).m();
            return;
        }
        idvt idvt0 = idvt.d(idph2);
        this.d = idvt0.a();
        this.publicKey = idvt0.b();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.populateFromPrivKeyInfo(idvk.d(idqm.w(((byte[])objectInputStream0.readObject()))));
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

