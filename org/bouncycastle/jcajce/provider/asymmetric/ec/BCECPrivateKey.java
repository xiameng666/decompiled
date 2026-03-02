package org.bouncycastle.jcajce.provider.asymmetric.ec;

import idpc;
import idph;
import idpx;
import idqg;
import idqm;
import idvk;
import idvt;
import idyk;
import idzh;
import idzv;
import ieav;
import iebd;
import ieok;
import ieoo;
import ieop;
import iews;
import iexe;
import iexi;
import iexp;
import iexr;
import iexs;
import iftq;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

public class BCECPrivateKey implements iews, iexe, ECPrivateKey {
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient ieop baseKey;
    private transient ProviderConfiguration configuration;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient byte[] encoding;
    private transient idvk privateKeyInfo;
    private transient idpc publicKey;
    static final long serialVersionUID = 0xDCD5CDD2909CED4L;
    private boolean withCompression;

    protected BCECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String s, idvk idvk0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.configuration = providerConfiguration0;
        this.populateFromPrivKeyInfo(idvk0);
    }

    public BCECPrivateKey(String s, ieop ieop0, BCECPublicKey bCECPublicKey0, iexr iexr0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        this.configuration = providerConfiguration0;
        this.baseKey = ieop0;
        this.ecSpec = iexr0 == null ? new ECParameterSpec(EC5Util.convertCurve(ieop0.b.a, ieop0.b.c()), EC5Util.convertPoint(ieop0.b.b), ieop0.b.c, ieop0.b.d.intValue()) : EC5Util.convertSpec(EC5Util.convertCurve(iexr0.b, iexr0.c), iexr0);
        try {
            this.publicKey = this.getPublicKeyDetails(bCECPublicKey0);
        }
        catch(Exception unused_ex) {
            this.publicKey = null;
        }
    }

    public BCECPrivateKey(String s, ieop ieop0, BCECPublicKey bCECPublicKey0, ECParameterSpec eCParameterSpec0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        this.configuration = providerConfiguration0;
        this.baseKey = ieop0;
        this.ecSpec = eCParameterSpec0 == null ? new ECParameterSpec(EC5Util.convertCurve(ieop0.b.a, ieop0.b.c()), EC5Util.convertPoint(ieop0.b.b), ieop0.b.c, ieop0.b.d.intValue()) : eCParameterSpec0;
        this.publicKey = this.getPublicKeyDetails(bCECPublicKey0);
    }

    public BCECPrivateKey(String s, ieop ieop0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = ieop0.c;
        this.ecSpec = null;
        this.configuration = providerConfiguration0;
        this.baseKey = ieop0;
    }

    public BCECPrivateKey(String s, iexs iexs0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = iexs0.b;
        iexr iexr0 = iexs0.a;
        this.ecSpec = iexr0 == null ? null : EC5Util.convertSpec(EC5Util.convertCurve(iexr0.b, iexr0.c), iexs0.a);
        this.configuration = providerConfiguration0;
        this.baseKey = BCECPrivateKey.convertToBaseKey(this);
    }

    public BCECPrivateKey(String s, ECPrivateKeySpec eCPrivateKeySpec0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = eCPrivateKeySpec0.getS();
        this.ecSpec = eCPrivateKeySpec0.getParams();
        this.configuration = providerConfiguration0;
        this.baseKey = BCECPrivateKey.convertToBaseKey(this);
    }

    public BCECPrivateKey(String s, BCECPrivateKey bCECPrivateKey0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = s;
        this.d = bCECPrivateKey0.d;
        this.ecSpec = bCECPrivateKey0.ecSpec;
        this.withCompression = bCECPrivateKey0.withCompression;
        this.attrCarrier = bCECPrivateKey0.attrCarrier;
        this.publicKey = bCECPrivateKey0.publicKey;
        this.configuration = bCECPrivateKey0.configuration;
        this.baseKey = bCECPrivateKey0.baseKey;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey0.getS();
        this.algorithm = eCPrivateKey0.getAlgorithm();
        this.ecSpec = eCPrivateKey0.getParams();
        this.configuration = providerConfiguration0;
        this.baseKey = BCECPrivateKey.convertToBaseKey(this);
    }

    private static ieop convertToBaseKey(BCECPrivateKey bCECPrivateKey0) {
        iexr iexr0 = bCECPrivateKey0.getParameters();
        if(iexr0 == null) {
            iexr0 = iexi.b.getEcImplicitlyCa();
        }
        if((bCECPrivateKey0.getParameters() instanceof iexp)) {
            String s = ((iexp)bCECPrivateKey0.getParameters()).a;
            return s == null ? new ieop(bCECPrivateKey0.getD(), new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c)) : new ieop(bCECPrivateKey0.getD(), new ieoo(idzv.b(s), iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c));
        }
        return new ieop(bCECPrivateKey0.getD(), new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c));
    }

    public ieop engineGetKeyParameters() {
        return this.baseKey;
    }

    public iexr engineGetSpec() {
        ECParameterSpec eCParameterSpec0 = this.ecSpec;
        return eCParameterSpec0 == null ? this.configuration.getEcImplicitlyCa() : EC5Util.convertSpec(eCParameterSpec0);
    }

    @Override
    public boolean equals(Object object0) {
        if((object0 instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey0 = (ECPrivateKey)object0;
            idvk idvk0 = this.getPrivateKeyInfo();
            idvk idvk1 = (eCPrivateKey0 instanceof BCECPrivateKey) ? ((BCECPrivateKey)eCPrivateKey0).getPrivateKeyInfo() : idvk.d(eCPrivateKey0.getEncoded());
            if(idvk0 != null && idvk1 != null) {
                try {
                    int v = iftq.f(idvk0.b.u(), idvk1.b.u());
                    byte[] arr_b = eCPrivateKey0.getS().toByteArray();
                    return iftq.f(this.getS().toByteArray(), arr_b) & v;
                }
                catch(IOException unused_ex) {
                }
            }
        }
        return false;
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
        if(this.encoding == null) {
            idvk idvk0 = this.getPrivateKeyInfo();
            if(idvk0 != null) {
                try {
                    this.encoding = idvk0.v("DER");
                }
                catch(IOException unused_ex) {
                    return null;
                }
                return iftq.j(this.encoding);
            }
            return null;
        }
        return iftq.j(this.encoding);
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

    private idvk getPrivateKeyInfo() {
        if(this.privateKeyInfo == null) {
            ieav ieav0 = ECUtils.getDomainParametersFromName(this.ecSpec, this.withCompression);
            int v = this.ecSpec == null ? ECUtil.getOrderBitLength(this.configuration, null, this.getS()) : ECUtil.getOrderBitLength(this.configuration, this.ecSpec.getOrder(), this.getS());
            idvt idvt0 = this.publicKey == null ? new idvt(v, this.getS(), ieav0) : new idvt(v, this.getS(), this.publicKey, ieav0);
            try {
                this.privateKeyInfo = new idvk(new idyk(iebd.l, ieav0), idvt0);
                return this.privateKeyInfo;
            }
            catch(IOException unused_ex) {
                return null;
            }
        }
        return this.privateKeyInfo;
    }

    private idpc getPublicKeyDetails(BCECPublicKey bCECPublicKey0) {
        try {
            return idzh.b(idqm.w(bCECPublicKey0.getEncoded())).b;
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
        ieav ieav0 = ieav.a(idvk0.b.b);
        this.ecSpec = EC5Util.convertToSpec(ieav0, EC5Util.getCurve(this.configuration, ieav0));
        idph idph0 = idvk0.b();
        if((idph0 instanceof idpx)) {
            this.d = idpx.n(idph0).m();
        }
        else {
            idvt idvt0 = idvt.d(idph0);
            this.d = idvt0.a();
            this.publicKey = idvt0.b();
        }
        this.baseKey = BCECPrivateKey.convertToBaseKey(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        byte[] arr_b = (byte[])objectInputStream0.readObject();
        this.configuration = iexi.b;
        this.populateFromPrivKeyInfo(idvk.d(idqm.w(arr_b)));
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
        return ECUtil.privateKeyToString("EC", this.d, this.engineGetSpec());
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

