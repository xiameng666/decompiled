package org.bouncycastle.jcajce.provider.asymmetric.x509;

import a;
import idph;
import idpi;
import idpv;
import idpx;
import idqm;
import idqt;
import idsg;
import idsh;
import iduw;
import idvi;
import idvr;
import iewl;
import iewn;
import ifug;
import ifuh;
import ifuj;
import ifuk;
import ifuq;
import ifur;
import ifus;
import j..util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final iewl helper;

    static {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add("PkiPath");
        arrayList0.add("PEM");
        arrayList0.add("PKCS7");
        PKIXCertPath.certPathEncodings = DesugarCollections.unmodifiableList(arrayList0);
    }

    public PKIXCertPath(InputStream inputStream0, String s) {
        super("X.509");
        iewn iewn0 = new iewn();
        this.helper = iewn0;
        try {
            if(s.equalsIgnoreCase("PkiPath")) {
                idqm idqm0 = new idpv(inputStream0).b();
                if(!(idqm0 instanceof idqt)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumeration0 = ((idqt)idqm0).f();
                this.certificates = new ArrayList();
                CertificateFactory certificateFactory0 = iewn0.d("X.509");
                while(enumeration0.hasMoreElements()) {
                    byte[] arr_b = ((idph)enumeration0.nextElement()).p().v("DER");
                    this.certificates.add(0, certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b)));
                }
            }
            else {
                if(!s.equalsIgnoreCase("PKCS7") && !s.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: " + s);
                }
                BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0);
                this.certificates = new ArrayList();
                CertificateFactory certificateFactory1 = iewn0.d("X.509");
                Certificate certificate0;
                while((certificate0 = certificateFactory1.generateCertificate(bufferedInputStream0)) != null) {
                    this.certificates.add(certificate0);
                }
            }
        }
        catch(IOException iOException0) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + iOException0.toString());
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + noSuchProviderException0.toString());
        }
        this.certificates = this.sortCerts(this.certificates);
    }

    public PKIXCertPath(List list0) {
        super("X.509");
        this.helper = new iewn();
        this.certificates = this.sortCerts(new ArrayList(list0));
    }

    @Override
    public List getCertificates() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override
    public byte[] getEncoded() {
        Iterator iterator0 = this.getEncodings();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return (object0 instanceof String) ? this.getEncoded(((String)object0)) : null;
        }
        return null;
    }

    @Override
    public byte[] getEncoded(String s) {
        char[] arr_c;
        PKIXCertPath pKIXCertPath0 = this;
        if(s.equalsIgnoreCase("PkiPath")) {
            idpi idpi0 = new idpi();
            ListIterator listIterator0 = pKIXCertPath0.certificates.listIterator(pKIXCertPath0.certificates.size());
            while(listIterator0.hasPrevious()) {
                idpi0.b(pKIXCertPath0.toASN1Object(((X509Certificate)listIterator0.previous())));
            }
            return pKIXCertPath0.toDEREncoded(new idsg(idpi0));
        }
        if(s.equalsIgnoreCase("PKCS7")) {
            iduw iduw0 = new iduw(idvi.T, null);
            idpi idpi1 = new idpi();
            for(int v = 0; v != pKIXCertPath0.certificates.size(); ++v) {
                idpi1.b(pKIXCertPath0.toASN1Object(((X509Certificate)pKIXCertPath0.certificates.get(v))));
            }
            idvr idvr0 = new idvr(new idpx(1L), new idsh(), iduw0, new idsh(idpi1), new idsh());
            return pKIXCertPath0.toDEREncoded(new iduw(idvi.U, idvr0));
        }
        if(s.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            ifus ifus0 = new ifus(new OutputStreamWriter(byteArrayOutputStream0));
            int v1 = 0;
            try {
                while(true) {
                    if(v1 == pKIXCertPath0.certificates.size()) {
                        ifus0.close();
                        return byteArrayOutputStream0.toByteArray();
                    }
                    byte[] arr_b = ((X509Certificate)pKIXCertPath0.certificates.get(v1)).getEncoded();
                    List list0 = DesugarCollections.unmodifiableList(ifur.a);
                    ifus0.write(a.a("CERTIFICATE", "-----BEGIN ", "-----"));
                    ifus0.newLine();
                    if(!list0.isEmpty()) {
                        Iterator iterator0 = list0.iterator();
                        if(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            ifuq ifuq0 = (ifuq)object0;
                            throw null;
                        }
                        ifus0.newLine();
                    }
                    int v2 = arr_b.length;
                    ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream((v2 + 2) / 3 * 4);
                    try {
                        ifuj ifuj0 = ifug.a;
                        byte[] arr_b1 = new byte[72];
                        for(int v3 = 0; v2 > 0; v3 = v5) {
                            int v4 = Math.min(54, v2);
                            int v5 = v3 + v4;
                            int v6 = v3;
                            int v7 = 0;
                            while(v6 < v5 - 2) {
                                int v8 = arr_b[v6];
                                int v9 = v6 + 2;
                                int v10 = arr_b[v6 + 1] & 0xFF;
                                v6 += 3;
                                int v11 = arr_b[v9];
                                arr_b1[v7] = ((ifuh)ifuj0).a[v8 >>> 2 & 0x3F];
                                arr_b1[v7 + 1] = ((ifuh)ifuj0).a[(v8 << 4 | v10 >>> 4) & 0x3F];
                                int v12 = v7 + 3;
                                arr_b1[v7 + 2] = ((ifuh)ifuj0).a[((v11 & 0xFF) >>> 6 | v10 << 2) & 0x3F];
                                v7 += 4;
                                arr_b1[v12] = ((ifuh)ifuj0).a[v11 & 0x3F];
                                byteArrayOutputStream0 = byteArrayOutputStream0;
                            }
                            switch(v4 - (v6 - v3)) {
                                case 1: {
                                    int v13 = arr_b[v6] & 0xFF;
                                    arr_b1[v7] = ((ifuh)ifuj0).a[v13 >>> 2];
                                    arr_b1[v7 + 1] = ((ifuh)ifuj0).a[v13 << 4 & 0x3F];
                                    int v14 = v7 + 3;
                                    byte b = ((ifuh)ifuj0).b;
                                    arr_b1[v7 + 2] = b;
                                    v7 += 4;
                                    arr_b1[v14] = b;
                                    break;
                                }
                                case 2: {
                                    int v15 = arr_b[v6] & 0xFF;
                                    int v16 = arr_b[v6 + 1] & 0xFF;
                                    arr_b1[v7] = ((ifuh)ifuj0).a[v15 >>> 2];
                                    arr_b1[v7 + 1] = ((ifuh)ifuj0).a[(v15 << 4 | v16 >>> 4) & 0x3F];
                                    int v17 = v7 + 3;
                                    arr_b1[v7 + 2] = ((ifuh)ifuj0).a[v16 << 2 & 0x3F];
                                    v7 += 4;
                                    arr_b1[v17] = ((ifuh)ifuj0).b;
                                }
                            }
                            byteArrayOutputStream1.write(arr_b1, 0, v7);
                            v2 -= v4;
                            byteArrayOutputStream0 = byteArrayOutputStream0;
                        }
                    }
                    catch(Exception exception0) {
                        throw new ifuk("exception encoding base64 string: " + exception0.getMessage(), exception0);
                    }
                    byte[] arr_b2 = byteArrayOutputStream1.toByteArray();
                    for(int v18 = 0; v18 < arr_b2.length; v18 += 0x40) {
                        int v19;
                        for(v19 = 0; true; ++v19) {
                            arr_c = ifus0.a;
                            if(v19 == 0x40) {
                                break;
                            }
                            int v20 = v18 + v19;
                            if(v20 >= arr_b2.length) {
                                break;
                            }
                            arr_c[v19] = (char)arr_b2[v20];
                        }
                        ifus0.write(arr_c, 0, v19);
                        ifus0.newLine();
                    }
                    ifus0.write(a.a("CERTIFICATE", "-----END ", "-----"));
                    ifus0.newLine();
                    ++v1;
                    pKIXCertPath0 = this;
                    byteArrayOutputStream0 = byteArrayOutputStream0;
                }
            }
            catch(Exception unused_ex) {
                throw new CertificateEncodingException("can\'t encode certificate for PEM encoded path");
            }
        }
        throw new CertificateEncodingException("unsupported encoding: " + s);
    }

    @Override
    public Iterator getEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }

    private List sortCerts(List list0) {
        if(list0.size() >= 2) {
            X500Principal x500Principal0 = ((X509Certificate)list0.get(0)).getIssuerX500Principal();
            int v = 1;
            while(v != list0.size()) {
                if(x500Principal0.equals(((X509Certificate)list0.get(v)).getSubjectX500Principal())) {
                    x500Principal0 = ((X509Certificate)list0.get(v)).getIssuerX500Principal();
                    ++v;
                    continue;
                }
                List list1 = new ArrayList(list0.size());
                List list2 = new ArrayList(list0);
                int v1 = 0;
                while(v1 < list0.size()) {
                    X509Certificate x509Certificate0 = (X509Certificate)list0.get(v1);
                    X500Principal x500Principal1 = x509Certificate0.getSubjectX500Principal();
                    int v2 = 0;
                    while(true) {
                        if(v2 != list0.size()) {
                            if(((X509Certificate)list0.get(v2)).getIssuerX500Principal().equals(x500Principal1)) {
                                break;
                            }
                            else {
                                ++v2;
                                continue;
                            }
                        }
                        list1.add(x509Certificate0);
                        list0.remove(v1);
                        break;
                    }
                    ++v1;
                }
                if(list1.size() <= 1) {
                    for(int v3 = 0; v3 != list1.size(); ++v3) {
                        X500Principal x500Principal2 = ((X509Certificate)list1.get(v3)).getIssuerX500Principal();
                        for(int v4 = 0; v4 < list0.size(); ++v4) {
                            X509Certificate x509Certificate1 = (X509Certificate)list0.get(v4);
                            if(x500Principal2.equals(x509Certificate1.getSubjectX500Principal())) {
                                list1.add(x509Certificate1);
                                list0.remove(v4);
                                break;
                            }
                        }
                    }
                    return list0.size() > 0 ? list2 : list1;
                }
                return list2;
            }
        }
        return list0;
    }

    private idqm toASN1Object(X509Certificate x509Certificate0) {
        try {
            return new idpv(x509Certificate0.getEncoded()).b();
        }
        catch(Exception exception0) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + exception0.toString());
        }
    }

    private byte[] toDEREncoded(idph idph0) {
        try {
            return idph0.p().v("DER");
        }
        catch(IOException iOException0) {
            throw new CertificateEncodingException("Exception thrown: " + iOException0.toString());
        }
    }
}

