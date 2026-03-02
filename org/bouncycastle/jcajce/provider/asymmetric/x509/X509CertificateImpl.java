package org.bouncycastle.jcajce.provider.asymmetric.x509;

import idpc;
import idph;
import idpu;
import idpv;
import idqg;
import idqi;
import idqm;
import idqt;
import idra;
import idsd;
import idxz;
import idyc;
import idye;
import idyi;
import idyk;
import idym;
import idyq;
import idyy;
import idyz;
import idzb;
import idzf;
import idzm;
import ietm;
import ietn;
import ieto;
import ietq;
import ieuc;
import ieuw;
import iewl;
import iewq;
import iexi;
import iftq;
import ifuf;
import j..util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

abstract class X509CertificateImpl extends X509Certificate {
    protected idym basicConstraints;
    protected iewl bcHelper;
    protected idyq c;
    protected boolean[] keyUsage;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CertificateImpl(iewl iewl0, idyq idyq0, idym idym0, boolean[] arr_z, String s, byte[] arr_b) {
        this.bcHelper = iewl0;
        this.c = idyq0;
        this.basicConstraints = idym0;
        this.keyUsage = arr_z;
        this.sigAlgName = s;
        this.sigAlgParams = arr_b;
    }

    private void checkSignature(PublicKey publicKey0, Signature signature0, idph idph0, byte[] arr_b) {
        if(!X509SignatureUtil.areEquivalentAlgorithms(this.c.c, this.c.b.d)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature0, idph0);
        signature0.initVerify(publicKey0);
        try {
            BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(new ieuw(signature0), 0x200);
            this.c.b.t(bufferedOutputStream0, "DER");
            bufferedOutputStream0.close();
        }
        catch(IOException iOException0) {
            throw new CertificateEncodingException(iOException0.toString());
        }
        if(signature0.verify(arr_b)) {
            return;
        }
        throw new SignatureException("certificate does not verify with supplied key");
    }

    @Override
    public void checkValidity() {
        this.checkValidity(new Date());
    }

    @Override
    public void checkValidity(Date date0) {
        if(date0.getTime() > this.getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.c.e().a());
        }
        if(date0.getTime() >= this.getNotBefore().getTime()) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + this.c.f().a());
    }

    private void doVerify(PublicKey publicKey0, SignatureCreator signatureCreator0) {
        int v = 0;
        if((publicKey0 instanceof ieuc) && X509SignatureUtil.isCompositeAlgorithm(this.c.c)) {
            List list0 = ((ieuc)publicKey0).a;
            idqt idqt0 = idqt.m(this.c.c.b);
            idqt idqt1 = idqt.m(this.c.d.n());
            boolean z = false;
            while(v != list0.size()) {
                if(list0.get(v) != null) {
                    idyk idyk0 = idyk.a(idqt0.h(v));
                    Signature signature0 = signatureCreator0.createSignature(X509SignatureUtil.getSignatureName(idyk0));
                    try {
                        this.checkSignature(((PublicKey)list0.get(v)), signature0, idyk0.b, idpc.i(idqt1.h(v)).n());
                        signatureException0 = null;
                        z = true;
                    }
                    catch(SignatureException signatureException0) {
                    }
                    if(signatureException0 != null) {
                        throw signatureException0;
                    }
                }
                ++v;
            }
            if(z) {
                return;
            }
            throw new InvalidKeyException("no matching key found");
        }
        if(X509SignatureUtil.isCompositeAlgorithm(this.c.c)) {
            idqt idqt2 = idqt.m(this.c.c.b);
            idqt idqt3 = idqt.m(this.c.d.n());
            boolean z1 = false;
            while(v != idqt3.b()) {
                idyk idyk1 = idyk.a(idqt2.h(v));
                String s = X509SignatureUtil.getSignatureName(idyk1);
                try {
                    this.checkSignature(publicKey0, signatureCreator0.createSignature(s), idyk1.b, idpc.i(idqt3.h(v)).n());
                    signatureException1 = null;
                    z1 = true;
                }
                catch(InvalidKeyException | NoSuchAlgorithmException unused_ex) {
                    signatureException1 = null;
                }
                catch(SignatureException signatureException1) {
                }
                if(signatureException1 != null) {
                    throw signatureException1;
                }
                ++v;
                continue;
            }
            if(!z1) {
                throw new InvalidKeyException("no matching key found");
            }
            return;
        }
        Signature signature1 = signatureCreator0.createSignature(this.getSigAlgName());
        if((publicKey0 instanceof ieuc) && ietm.C.y(((ieuc)publicKey0).b)) {
            List list1 = ((ieuc)publicKey0).a;
            while(v != list1.size()) {
                try {
                    this.checkSignature(((PublicKey)list1.get(v)), signature1, this.c.c.b, this.getSignature());
                    return;
                }
                catch(InvalidKeyException unused_ex) {
                    ++v;
                }
            }
            throw new InvalidKeyException("no matching signature found");
        }
        this.checkSignature(publicKey0, signature1, this.c.c.b, this.getSignature());
    }

    private static Collection getAlternativeNames(idyq idyq0, idqg idqg0) {
        String s;
        idyc idyc0;
        byte[] arr_b = X509CertificateImpl.getExtensionOctets(idyq0, idqg0);
        if(arr_b == null) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            Enumeration enumeration0 = idqt.m(arr_b).f();
            while(true) {
                if(!enumeration0.hasMoreElements()) {
                    return arrayList0.size() == 0 ? null : DesugarCollections.unmodifiableCollection(arrayList0);
                }
                idzb idzb0 = idzb.a(enumeration0.nextElement());
                ArrayList arrayList1 = new ArrayList();
                int v = idzb0.b;
                arrayList1.add(Integer.valueOf(v));
                switch(v) {
                    case 4: {
                        idye idye0 = idyi.R;
                        idph idph0 = idzb0.a;
                        if((idph0 instanceof idyc)) {
                            idyc0 = new idyc(idye0, ((idyc)idph0));
                        }
                        else {
                            idyc0 = idph0 == null ? null : new idyc(idye0, idqt.m(idph0));
                        }
                        arrayList1.add(idyc0.toString());
                        break;
                    }
                    case 0: 
                    case 3: 
                    case 5: {
                        arrayList1.add(idzb0.u());
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 6: {
                        arrayList1.add(((idra)idzb0.a).b());
                        break;
                    }
                    case 7: {
                        byte[] arr_b1 = idsd.g(idzb0.a).b;
                        try {
                            s = InetAddress.getByAddress(arr_b1).getHostAddress();
                        }
                        catch(UnknownHostException unused_ex) {
                            continue;
                        }
                        arrayList1.add(s);
                        break;
                    }
                    case 8: {
                        arrayList1.add(idqg.h(idzb0.a).b());
                        break;
                    }
                    default: {
                        throw new IOException("Bad tag number: " + v);
                    }
                }
                arrayList0.add(DesugarCollections.unmodifiableList(arrayList1));
            }
        }
        catch(Exception exception0) {
            throw new CertificateParsingException(exception0.getMessage());
        }
    }

    @Override
    public int getBasicConstraints() {
        idym idym0 = this.basicConstraints;
        if(idym0 != null && idym0.b()) {
            return idym0.b == null ? 0x7FFFFFFF : idym0.b.b();
        }
        return -1;
    }

    @Override
    public Set getCriticalExtensionOIDs() {
        if(this.getVersion() == 3) {
            Set set0 = new HashSet();
            idyz idyz0 = this.c.d();
            if(idyz0 != null) {
                Enumeration enumeration0 = idyz0.a();
                while(enumeration0.hasMoreElements()) {
                    idqg idqg0 = (idqg)enumeration0.nextElement();
                    if(idyz0.c(idqg0).w) {
                        set0.add(idqg0.b());
                    }
                }
                return set0;
            }
        }
        return null;
    }

    @Override
    public List getExtendedKeyUsage() {
        byte[] arr_b = X509CertificateImpl.getExtensionOctets(this.c, idyy.r);
        if(arr_b != null) {
            try {
                idqt idqt0 = idqt.m(arr_b);
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v != idqt0.b(); ++v) {
                    arrayList0.add(((idqg)idqt0.h(v)).b());
                }
                return DesugarCollections.unmodifiableList(arrayList0);
            }
            catch(Exception unused_ex) {
                throw new CertificateParsingException("error processing extended key usage extension");
            }
        }
        return null;
    }

    static byte[] getExtensionOctets(idyq idyq0, idqg idqg0) {
        idqi idqi0 = idyz.b(idyq0.d(), idqg0);
        return idqi0 == null ? null : idqi0.b;
    }

    @Override
    public byte[] getExtensionValue(String s) {
        return X509SignatureUtil.getExtensionValue(this.c.d(), s);
    }

    @Override
    public Collection getIssuerAlternativeNames() {
        return X509CertificateImpl.getAlternativeNames(this.c, idyy.e);
    }

    @Override
    public Principal getIssuerDN() {
        return new iewq(this.c.a());
    }

    @Override
    public boolean[] getIssuerUniqueID() {
        idpc idpc0 = this.c.b.i;
        if(idpc0 != null) {
            byte[] arr_b = idpc0.m();
            int v = idpc0.f();
            int v1 = arr_b.length * 8 - v;
            boolean[] arr_z = new boolean[v1];
            for(int v2 = 0; v2 != v1; ++v2) {
                arr_z[v2] = (arr_b[v2 / 8] & 0x80 >>> v2 % 8) != 0;
            }
            return arr_z;
        }
        return null;
    }

    public idyc getIssuerX500Name() {
        return this.c.a();
    }

    @Override
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.a().v("DER"));
        }
        catch(IOException unused_ex) {
            throw new IllegalStateException("can\'t encode issuer DN");
        }
    }

    @Override
    public boolean[] getKeyUsage() {
        return this.keyUsage == null ? null : ((boolean[])this.keyUsage.clone());
    }

    @Override
    public Set getNonCriticalExtensionOIDs() {
        if(this.getVersion() == 3) {
            Set set0 = new HashSet();
            idyz idyz0 = this.c.d();
            if(idyz0 != null) {
                Enumeration enumeration0 = idyz0.a();
                while(enumeration0.hasMoreElements()) {
                    idqg idqg0 = (idqg)enumeration0.nextElement();
                    if(!idyz0.c(idqg0).w) {
                        set0.add(idqg0.b());
                    }
                }
                return set0;
            }
        }
        return null;
    }

    @Override
    public Date getNotAfter() {
        return this.c.e().b();
    }

    @Override
    public Date getNotBefore() {
        return this.c.f().b();
    }

    @Override
    public PublicKey getPublicKey() {
        try {
            return iexi.c(this.c.b.h);
        }
        catch(IOException iOException0) {
            throw new IllegalStateException("failed to recover public key: " + iOException0.getMessage(), iOException0);
        }
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.c.b.c.m();
    }

    @Override
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override
    public String getSigAlgOID() {
        return this.c.c.a.b();
    }

    @Override
    public byte[] getSigAlgParams() {
        return iftq.j(this.sigAlgParams);
    }

    @Override
    public byte[] getSignature() {
        return this.c.d.n();
    }

    @Override
    public Collection getSubjectAlternativeNames() {
        return X509CertificateImpl.getAlternativeNames(this.c, idyy.d);
    }

    @Override
    public Principal getSubjectDN() {
        return new iewq(this.c.b());
    }

    @Override
    public boolean[] getSubjectUniqueID() {
        idpc idpc0 = this.c.b.j;
        if(idpc0 != null) {
            byte[] arr_b = idpc0.m();
            int v = idpc0.f();
            int v1 = arr_b.length * 8 - v;
            boolean[] arr_z = new boolean[v1];
            for(int v2 = 0; v2 != v1; ++v2) {
                arr_z[v2] = (arr_b[v2 / 8] & 0x80 >>> v2 % 8) != 0;
            }
            return arr_z;
        }
        return null;
    }

    public idyc getSubjectX500Name() {
        return this.c.b();
    }

    @Override
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.b().v("DER"));
        }
        catch(IOException unused_ex) {
            throw new IllegalStateException("can\'t encode subject DN");
        }
    }

    @Override
    public byte[] getTBSCertificate() {
        try {
            return this.c.b.v("DER");
        }
        catch(IOException iOException0) {
            throw new CertificateEncodingException(iOException0.toString());
        }
    }

    public idzm getTBSCertificateNative() {
        return this.c.b;
    }

    @Override
    public int getVersion() {
        return this.c.b.b.g() + 1;
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        if(this.getVersion() == 3) {
            idyz idyz0 = this.c.d();
            if(idyz0 != null) {
                Enumeration enumeration0 = idyz0.a();
                while(enumeration0.hasMoreElements()) {
                    idqg idqg0 = (idqg)enumeration0.nextElement();
                    if(!idyy.c.y(idqg0) && !idyy.n.y(idqg0) && !idyy.o.y(idqg0) && !idyy.t.y(idqg0) && !idyy.m.y(idqg0) && !idyy.j.y(idqg0) && !idyy.i.y(idqg0) && !idyy.q.y(idqg0) && !idyy.f.y(idqg0) && !idyy.d.y(idqg0) && !idyy.l.y(idqg0) && idyz0.c(idqg0).w) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        String s = ifuf.a;
        stringBuffer0.append("  [0]         Version: ");
        stringBuffer0.append(this.getVersion());
        stringBuffer0.append(s);
        stringBuffer0.append("         SerialNumber: ");
        stringBuffer0.append(this.getSerialNumber());
        stringBuffer0.append(s);
        stringBuffer0.append("             IssuerDN: ");
        stringBuffer0.append(this.getIssuerDN());
        stringBuffer0.append(s);
        stringBuffer0.append("           Start Date: ");
        stringBuffer0.append(this.getNotBefore());
        stringBuffer0.append(s);
        stringBuffer0.append("           Final Date: ");
        stringBuffer0.append(this.getNotAfter());
        stringBuffer0.append(s);
        stringBuffer0.append("            SubjectDN: ");
        stringBuffer0.append(this.getSubjectDN());
        stringBuffer0.append(s);
        stringBuffer0.append("           Public Key: ");
        stringBuffer0.append(this.getPublicKey());
        stringBuffer0.append(s);
        stringBuffer0.append("  Signature Algorithm: ");
        stringBuffer0.append(this.getSigAlgName());
        stringBuffer0.append(s);
        X509SignatureUtil.prettyPrintSignature(this.getSignature(), stringBuffer0, s);
        idyz idyz0 = this.c.d();
        if(idyz0 != null) {
            Enumeration enumeration0 = idyz0.a();
            if(enumeration0.hasMoreElements()) {
                stringBuffer0.append("       Extensions: \n");
            }
            while(enumeration0.hasMoreElements()) {
                idqg idqg0 = (idqg)enumeration0.nextElement();
                idyy idyy0 = idyz0.c(idqg0);
                idqi idqi0 = idyy0.x;
                if(idqi0 == null) {
                    stringBuffer0.append(s);
                }
                else {
                    idpv idpv0 = new idpv(idqi0.b);
                    stringBuffer0.append("                       critical(");
                    stringBuffer0.append(idyy0.w);
                    stringBuffer0.append(") ");
                    try {
                        if(idqg0.y(idyy.f)) {
                            stringBuffer0.append(idym.a(idpv0.b()));
                        }
                        else if(idqg0.y(idyy.c)) {
                            idqm idqm0 = idpv0.b();
                            stringBuffer0.append((idqm0 == null ? null : new idzf(idpc.i(idqm0))));
                        }
                        else if(idqg0.y(ietm.b)) {
                            stringBuffer0.append(new ietn(idpc.i(idpv0.b())));
                        }
                        else if(idqg0.y(ietm.c)) {
                            stringBuffer0.append(new ieto(idpu.f(idpv0.b())));
                        }
                        else if(idqg0.y(ietm.e)) {
                            stringBuffer0.append(new ietq(idpu.f(idpv0.b())));
                        }
                        else {
                            stringBuffer0.append(idqg0.b());
                            stringBuffer0.append(" value = ");
                            stringBuffer0.append(idxz.a(idpv0.b()));
                        }
                        stringBuffer0.append(s);
                    }
                    catch(Exception unused_ex) {
                        stringBuffer0.append(idqg0.b());
                        stringBuffer0.append(" value = ");
                        stringBuffer0.append("*****");
                        stringBuffer0.append(s);
                    }
                }
            }
        }
        return stringBuffer0.toString();
    }

    @Override
    public final void verify(PublicKey publicKey0) {
        this.doVerify(publicKey0, new X509CertificateImpl.1(this));
    }

    @Override
    public final void verify(PublicKey publicKey0, String s) {
        this.doVerify(publicKey0, new X509CertificateImpl.2(this, s));
    }

    @Override
    public final void verify(PublicKey publicKey0, Provider provider0) {
        try {
            this.doVerify(publicKey0, new X509CertificateImpl.3(this, provider0));
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            throw new NoSuchAlgorithmException("provider issue: " + noSuchProviderException0.getMessage());
        }
    }
}

