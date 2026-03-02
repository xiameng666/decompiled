package org.bouncycastle.jcajce.provider.asymmetric.x509;

import idpc;
import idph;
import idyr;
import idyy;
import idzd;
import iewl;
import iftq;
import java.io.IOException;
import java.security.cert.CRLException;

class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    public X509CRLObject(iewl iewl0, idyr idyr0) {
        super(iewl0, idyr0, X509CRLObject.createSigAlgName(idyr0), X509CRLObject.createSigAlgParams(idyr0), X509CRLObject.isIndirectCRL(idyr0));
        this.cacheLock = new Object();
    }

    private static String createSigAlgName(idyr idyr0) {
        try {
            return X509SignatureUtil.getSignatureName(idyr0.b);
        }
        catch(Exception exception0) {
            throw new X509CRLObject.X509CRLException("CRL contents invalid: " + exception0.getMessage(), exception0);
        }
    }

    private static byte[] createSigAlgParams(idyr idyr0) {
        try {
            idph idph0 = idyr0.b.b;
            return idph0 == null ? null : idph0.p().v("DER");
        }
        catch(Exception exception0) {
            throw new CRLException("CRL contents invalid: " + exception0.toString());
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if((object0 instanceof X509CRLObject)) {
            if(this.hashValueSet && ((X509CRLObject)object0).hashValueSet) {
                return this.hashValue == ((X509CRLObject)object0).hashValue ? this.getInternalCRL().equals(((X509CRLObject)object0).getInternalCRL()) : false;
            }
            if(this.internalCRLValue == null || ((X509CRLObject)object0).internalCRLValue == null) {
                idpc idpc0 = this.c.c;
                return idpc0 == null || idpc0.y(((X509CRLObject)object0).c.c) ? this.getInternalCRL().equals(((X509CRLObject)object0).getInternalCRL()) : false;
            }
            return this.getInternalCRL().equals(((X509CRLObject)object0).getInternalCRL());
        }
        return this.getInternalCRL().equals(object0);
    }

    @Override
    public byte[] getEncoded() {
        return iftq.j(this.getInternalCRL().getEncoded());
    }

    private X509CRLInternal getInternalCRL() {
        X509CRLObject.X509CRLException x509CRLObject$X509CRLException0;
        byte[] arr_b;
        synchronized(this.cacheLock) {
            X509CRLInternal x509CRLInternal0 = this.internalCRLValue;
            if(x509CRLInternal0 != null) {
                return x509CRLInternal0;
            }
        }
        try {
            arr_b = this.c.v("DER");
            x509CRLObject$X509CRLException0 = null;
        }
        catch(IOException iOException0) {
            arr_b = null;
            x509CRLObject$X509CRLException0 = new X509CRLObject.X509CRLException(iOException0);
        }
        X509CRLInternal x509CRLInternal1 = new X509CRLInternal(this.bcHelper, this.c, this.sigAlgName, this.sigAlgParams, this.isIndirect, arr_b, x509CRLObject$X509CRLException0);
        synchronized(this.cacheLock) {
            if(this.internalCRLValue == null) {
                this.internalCRLValue = x509CRLInternal1;
            }
        }
        return this.internalCRLValue;
    }

    @Override
    public int hashCode() {
        if(!this.hashValueSet) {
            this.hashValue = this.getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    private static boolean isIndirectCRL(idyr idyr0) {
        try {
            byte[] arr_b = X509CRLObject.getExtensionOctets(idyr0, idyy.j);
            return arr_b == null ? false : idzd.a(arr_b).a;
        }
        catch(Exception exception0) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", exception0);
        }
    }
}

