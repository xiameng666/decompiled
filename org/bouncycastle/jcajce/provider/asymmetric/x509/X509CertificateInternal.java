package org.bouncycastle.jcajce.provider.asymmetric.x509;

import idym;
import idyq;
import iewl;
import java.security.cert.CertificateEncodingException;

class X509CertificateInternal extends X509CertificateImpl {
    private final byte[] encoding;
    private final CertificateEncodingException exception;

    public X509CertificateInternal(iewl iewl0, idyq idyq0, idym idym0, boolean[] arr_z, String s, byte[] arr_b, byte[] arr_b1, CertificateEncodingException certificateEncodingException0) {
        super(iewl0, idyq0, idym0, arr_z, s, arr_b);
        this.encoding = arr_b1;
        this.exception = certificateEncodingException0;
    }

    @Override
    public byte[] getEncoded() {
        CertificateEncodingException certificateEncodingException0 = this.exception;
        if(certificateEncodingException0 != null) {
            throw certificateEncodingException0;
        }
        byte[] arr_b = this.encoding;
        if(arr_b != null) {
            return arr_b;
        }
        throw new CertificateEncodingException();
    }
}

