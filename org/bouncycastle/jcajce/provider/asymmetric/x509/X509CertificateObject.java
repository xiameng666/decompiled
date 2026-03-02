package org.bouncycastle.jcajce.provider.asymmetric.x509;

import idpc;
import idph;
import idqg;
import idym;
import idyq;
import idyy;
import iewl;
import iexe;
import iftq;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

class X509CertificateObject extends X509CertificateImpl implements iexe {
    private iexe attrCarrier;
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CertificateInternal internalCertificateValue;
    private X500Principal issuerValue;
    private PublicKey publicKeyValue;
    private X500Principal subjectValue;
    private long[] validityValues;

    public X509CertificateObject(iewl iewl0, idyq idyq0) {
        super(iewl0, idyq0, X509CertificateObject.createBasicConstraints(idyq0), X509CertificateObject.createKeyUsage(idyq0), X509CertificateObject.createSigAlgName(idyq0), X509CertificateObject.createSigAlgParams(idyq0));
        this.cacheLock = new Object();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl
    public void checkValidity(Date date0) {
        long v = date0.getTime();
        long[] arr_v = this.getValidityValues();
        if(v > arr_v[1]) {
            throw new CertificateExpiredException("certificate expired on " + this.c.e().a());
        }
        if(v >= arr_v[0]) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + this.c.f().a());
    }

    private static idym createBasicConstraints(idyq idyq0) {
        try {
            byte[] arr_b = X509CertificateObject.getExtensionOctets(idyq0, idyy.f);
            return arr_b == null ? null : idym.a(arr_b);
        }
        catch(Exception exception0) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + exception0.toString());
        }
    }

    private static boolean[] createKeyUsage(idyq idyq0) {
        try {
            byte[] arr_b = X509CertificateObject.getExtensionOctets(idyq0, idyy.c);
            if(arr_b == null) {
                return null;
            }
            idpc idpc0 = idpc.i(arr_b);
            byte[] arr_b1 = idpc0.m();
            int v = idpc0.f();
            int v1 = arr_b1.length * 8 - v;
            boolean[] arr_z = new boolean[(v1 < 9 ? 9 : v1)];
            for(int v2 = 0; v2 != v1; ++v2) {
                arr_z[v2] = (arr_b1[v2 / 8] & 0x80 >>> v2 % 8) != 0;
            }
            return arr_z;
        }
        catch(Exception exception0) {
            throw new CertificateParsingException("cannot construct KeyUsage: " + exception0.toString());
        }
    }

    private static String createSigAlgName(idyq idyq0) {
        try {
            return X509SignatureUtil.getSignatureName(idyq0.c);
        }
        catch(Exception exception0) {
            throw new CertificateParsingException("cannot construct SigAlgName: " + exception0.toString());
        }
    }

    private static byte[] createSigAlgParams(idyq idyq0) {
        try {
            idph idph0 = idyq0.c.b;
            return idph0 == null ? null : idph0.p().v("DER");
        }
        catch(Exception exception0) {
            throw new CertificateParsingException("cannot construct SigAlgParams: " + exception0.toString());
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof X509CertificateObject)) {
            if(this.hashValueSet && ((X509CertificateObject)object0).hashValueSet) {
                return this.hashValue == ((X509CertificateObject)object0).hashValue ? this.getInternalCertificate().equals(((X509CertificateObject)object0).getInternalCertificate()) : false;
            }
            if(this.internalCertificateValue == null || ((X509CertificateObject)object0).internalCertificateValue == null) {
                idpc idpc0 = this.c.d;
                return idpc0 == null || idpc0.y(((X509CertificateObject)object0).c.d) ? this.getInternalCertificate().equals(((X509CertificateObject)object0).getInternalCertificate()) : false;
            }
            return this.getInternalCertificate().equals(((X509CertificateObject)object0).getInternalCertificate());
        }
        return this.getInternalCertificate().equals(object0);
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
        return iftq.j(this.getInternalCertificate().getEncoded());
    }

    private X509CertificateInternal getInternalCertificate() {
        X509CertificateObject.X509CertificateEncodingException x509CertificateObject$X509CertificateEncodingException0;
        byte[] arr_b;
        synchronized(this.cacheLock) {
            X509CertificateInternal x509CertificateInternal0 = this.internalCertificateValue;
            if(x509CertificateInternal0 != null) {
                return x509CertificateInternal0;
            }
        }
        try {
            arr_b = this.c.v("DER");
            x509CertificateObject$X509CertificateEncodingException0 = null;
        }
        catch(IOException iOException0) {
            arr_b = null;
            x509CertificateObject$X509CertificateEncodingException0 = new X509CertificateObject.X509CertificateEncodingException(iOException0);
        }
        X509CertificateInternal x509CertificateInternal1 = new X509CertificateInternal(this.bcHelper, this.c, this.basicConstraints, this.keyUsage, this.sigAlgName, this.sigAlgParams, arr_b, x509CertificateObject$X509CertificateEncodingException0);
        synchronized(this.cacheLock) {
            if(this.internalCertificateValue == null) {
                this.internalCertificateValue = x509CertificateInternal1;
            }
        }
        return this.internalCertificateValue;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl
    public X500Principal getIssuerX500Principal() {
        synchronized(this.cacheLock) {
            X500Principal x500Principal0 = this.issuerValue;
            if(x500Principal0 != null) {
                return x500Principal0;
            }
        }
        X500Principal x500Principal1 = super.getIssuerX500Principal();
        synchronized(this.cacheLock) {
            if(this.issuerValue == null) {
                this.issuerValue = x500Principal1;
            }
        }
        return this.issuerValue;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl
    public PublicKey getPublicKey() {
        synchronized(this.cacheLock) {
            PublicKey publicKey0 = this.publicKeyValue;
            if(publicKey0 != null) {
                return publicKey0;
            }
        }
        PublicKey publicKey1 = super.getPublicKey();
        if(publicKey1 == null) {
            return null;
        }
        synchronized(this.cacheLock) {
            if(this.publicKeyValue == null) {
                this.publicKeyValue = publicKey1;
            }
        }
        return this.publicKeyValue;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl
    public X500Principal getSubjectX500Principal() {
        synchronized(this.cacheLock) {
            X500Principal x500Principal0 = this.subjectValue;
            if(x500Principal0 != null) {
                return x500Principal0;
            }
        }
        X500Principal x500Principal1 = super.getSubjectX500Principal();
        synchronized(this.cacheLock) {
            if(this.subjectValue == null) {
                this.subjectValue = x500Principal1;
            }
        }
        return this.subjectValue;
    }

    public long[] getValidityValues() {
        synchronized(this.cacheLock) {
            long[] arr_v = this.validityValues;
            if(arr_v != null) {
                return arr_v;
            }
        }
        long[] arr_v1 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
        synchronized(this.cacheLock) {
            if(this.validityValues == null) {
                this.validityValues = arr_v1;
            }
        }
        return this.validityValues;
    }

    @Override  // iexe
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override
    public int hashCode() {
        if(!this.hashValueSet) {
            this.hashValue = this.getInternalCertificate().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] arr_b = this.getInternalCertificate().getEncoded();
            int v1 = 0;
            for(int v = 1; v < arr_b.length; ++v) {
                v1 += arr_b[v] * v;
            }
            return v1;
        }
        catch(CertificateEncodingException unused_ex) {
            return 0;
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
}

