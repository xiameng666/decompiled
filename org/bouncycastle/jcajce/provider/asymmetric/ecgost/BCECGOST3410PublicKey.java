package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import idph;
import idqg;
import idqi;
import idqm;
import idsd;
import idtu;
import iduc;
import idug;
import idyk;
import idzh;
import ieav;
import ieax;
import ieaz;
import ieok;
import ieol;
import ieoq;
import iewo;
import iewt;
import iexi;
import iexp;
import iexq;
import iexr;
import iext;
import ieyp;
import iezc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

public class BCECGOST3410PublicKey implements iewt, ECPublicKey {
    private String algorithm;
    private transient ieoq ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient idph gostParams;
    static final long serialVersionUID = 0x61823879C4D16022L;
    private boolean withCompression;

    public BCECGOST3410PublicKey(idzh idzh0) {
        this.algorithm = "ECGOST3410";
        this.populateFromPubKeyInfo(idzh0);
    }

    public BCECGOST3410PublicKey(iext iext0, ProviderConfiguration providerConfiguration0) {
        this.algorithm = "ECGOST3410";
        iexr iexr0 = iext0.a;
        if(iexr0 != null) {
            EllipticCurve ellipticCurve0 = EC5Util.convertCurve(iexr0.b, iexr0.c);
            ieok ieok0 = ECUtil.getDomainParameters(providerConfiguration0, iext0.a);
            this.ecPublicKey = new ieoq(iext0.b, ieok0);
            this.ecSpec = EC5Util.convertSpec(ellipticCurve0, iext0.a);
            return;
        }
        this.ecPublicKey = new ieoq(providerConfiguration0.getEcImplicitlyCa().b.c(iext0.b.u().f(), iext0.b.v().f()), EC5Util.getDomainParameters(providerConfiguration0, null));
        this.ecSpec = null;
    }

    public BCECGOST3410PublicKey(String s, ieoq ieoq0) {
        this.algorithm = s;
        this.ecPublicKey = ieoq0;
        this.ecSpec = null;
    }

    public BCECGOST3410PublicKey(String s, ieoq ieoq0, iexr iexr0) {
        this.algorithm = "ECGOST3410";
        ieok ieok0 = ieoq0.b;
        this.algorithm = s;
        this.ecPublicKey = ieoq0;
        if(iexr0 == null) {
            this.ecSpec = this.createSpec(EC5Util.convertCurve(ieok0.a, ieok0.c()), ieok0);
            return;
        }
        this.ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(iexr0.b, iexr0.c), iexr0);
    }

    public BCECGOST3410PublicKey(String s, ieoq ieoq0, ECParameterSpec eCParameterSpec0) {
        this.algorithm = "ECGOST3410";
        ieok ieok0 = ieoq0.b;
        if((ieok0 instanceof ieol)) {
            this.gostParams = new idug(((ieol)ieok0).e, ((ieol)ieok0).f, ((ieol)ieok0).g);
        }
        this.algorithm = s;
        this.ecPublicKey = ieoq0;
        if(eCParameterSpec0 == null) {
            this.ecSpec = this.createSpec(EC5Util.convertCurve(ieok0.a, ieok0.c()), ieok0);
            return;
        }
        this.ecSpec = eCParameterSpec0;
    }

    public BCECGOST3410PublicKey(ECPublicKey eCPublicKey0) {
        this.algorithm = "ECGOST3410";
        this.algorithm = eCPublicKey0.getAlgorithm();
        this.ecSpec = eCPublicKey0.getParams();
        this.ecPublicKey = new ieoq(EC5Util.convertPoint(this.ecSpec, eCPublicKey0.getW()), EC5Util.getDomainParameters(null, eCPublicKey0.getParams()));
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec0) {
        this.algorithm = "ECGOST3410";
        this.ecSpec = eCPublicKeySpec0.getParams();
        this.ecPublicKey = new ieoq(EC5Util.convertPoint(this.ecSpec, eCPublicKeySpec0.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec0.getParams()));
    }

    public BCECGOST3410PublicKey(BCECGOST3410PublicKey bCECGOST3410PublicKey0) {
        this.algorithm = "ECGOST3410";
        this.ecPublicKey = bCECGOST3410PublicKey0.ecPublicKey;
        this.ecSpec = bCECGOST3410PublicKey0.ecSpec;
        this.withCompression = bCECGOST3410PublicKey0.withCompression;
        this.gostParams = bCECGOST3410PublicKey0.gostParams;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve0, ieok ieok0) {
        return new ECParameterSpec(ellipticCurve0, EC5Util.convertPoint(ieok0.b), ieok0.c, ieok0.d.intValue());
    }

    public ieoq engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public iexr engineGetSpec() {
        ECParameterSpec eCParameterSpec0 = this.ecSpec;
        return eCParameterSpec0 == null ? iexi.b.getEcImplicitlyCa() : EC5Util.convertSpec(eCParameterSpec0);
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof BCECGOST3410PublicKey) ? this.ecPublicKey.c.C(((BCECGOST3410PublicKey)object0).ecPublicKey.c) && this.engineGetSpec().equals(((BCECGOST3410PublicKey)object0).engineGetSpec()) : false;
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

    @Override
    public byte[] getEncoded() {
        idph idph0 = this.getGostParams();
        if(idph0 == null) {
            ECParameterSpec eCParameterSpec0 = this.ecSpec;
            if((eCParameterSpec0 instanceof iexq)) {
                idph0 = new idug(iduc.c(((iexq)eCParameterSpec0).a), idtu.p);
            }
            else {
                ieyp ieyp0 = EC5Util.convertCurve(eCParameterSpec0.getCurve());
                idph0 = new ieav(new ieax(ieyp0, new ieaz(EC5Util.convertPoint(ieyp0, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        BigInteger bigInteger0 = this.ecPublicKey.c.u().f();
        BigInteger bigInteger1 = this.ecPublicKey.c.v().f();
        byte[] arr_b = new byte[0x40];
        this.extractBytes(arr_b, 0, bigInteger0);
        this.extractBytes(arr_b, 0x20, bigInteger1);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new idzh(new idyk(idtu.m, idph0), new idsd(arr_b)));
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return "X.509";
    }

    public idph getGostParams() {
        if(this.gostParams == null) {
            ECParameterSpec eCParameterSpec0 = this.ecSpec;
            if((eCParameterSpec0 instanceof iexq)) {
                this.gostParams = new idug(iduc.c(((iexq)eCParameterSpec0).a), idtu.p);
            }
        }
        return this.gostParams;
    }

    @Override  // iewr
    public iexr getParameters() {
        return this.ecSpec == null ? null : EC5Util.convertSpec(this.ecSpec);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override  // iewt
    public iezc getQ() {
        iezc iezc0 = this.ecPublicKey.c;
        return this.ecSpec == null ? iezc0.x() : iezc0;
    }

    @Override
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.c);
    }

    @Override
    public int hashCode() {
        int v = this.ecPublicKey.c.hashCode();
        return this.engineGetSpec().hashCode() ^ v;
    }

    private void populateFromPubKeyInfo(idzh idzh0) {
        idqg idqg0;
        byte[] arr_b1;
        byte[] arr_b;
        try {
            this.algorithm = "ECGOST3410";
            arr_b = ((idqi)idqm.w(idzh0.b.m())).b;
            arr_b1 = new byte[65];
            arr_b1[0] = 4;
        }
        catch(IOException unused_ex) {
            throw new IllegalArgumentException("error recovering public key");
        }
        for(int v = 1; v <= 0x20; ++v) {
            arr_b1[v] = arr_b[0x20 - v];
            arr_b1[v + 0x20] = arr_b[0x40 - v];
        }
        idph idph0 = idzh0.a.b;
        if((idph0 instanceof idqg)) {
            idqg0 = idqg.h(idph0);
            this.gostParams = idqg0;
        }
        else {
            idug idug0 = idug.a(idph0);
            this.gostParams = idug0;
            idqg0 = idug0.a;
        }
        iexp iexp0 = iewo.a(iduc.a(idqg0));
        EllipticCurve ellipticCurve0 = EC5Util.convertCurve(iexp0.b, iexp0.c);
        this.ecPublicKey = new ieoq(iexp0.b.s(arr_b1), ECUtil.getDomainParameters(null, iexp0));
        this.ecSpec = new iexq(iduc.a(idqg0), ellipticCurve0, EC5Util.convertPoint(iexp0.d), iexp0.e, iexp0.f);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.populateFromPubKeyInfo(idzh.b(idqm.w(((byte[])objectInputStream0.readObject()))));
    }

    public void setPointFormat(String s) {
        this.withCompression = "UNCOMPRESSED".equalsIgnoreCase(s) ^ 1;
    }

    @Override
    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.c, this.engineGetSpec());
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

