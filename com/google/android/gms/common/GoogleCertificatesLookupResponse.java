package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azpg;
import azqb;
import azqh;
import azqq;
import basd;
import batl;
import baub;
import bbms;
import bboy;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gged_interceptors;
import ggna;
import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    static {
        GoogleCertificatesLookupResponse.CREATOR = new azqb();
    }

    public GoogleCertificatesLookupResponse(boolean z, String s, int v, int v1, long v2) {
        this.a = z;
        this.b = s;
        this.c = azqh.a(v) - 1;
        this.d = azpg.b(v1).d;
        this.e = v2;
    }

    public GoogleCertificatesLookupResponse(boolean z, String s, int v, azpg azpg0) {
        this(z, s, v, azpg0, -1L);
    }

    public GoogleCertificatesLookupResponse(boolean z, String s, int v, azpg azpg0, long v1) {
        this.a = z;
        this.b = s;
        this.c = v - 1;
        this.d = azpg0.d;
        this.e = v1;
    }

    public final azpg a() {
        return azpg.b(this.d);
    }

    public static GoogleCertificatesLookupResponse b(String s, String s1, gged_interceptors gged0, boolean z, boolean z1) {
        return new GoogleCertificatesLookupResponse(false, GoogleCertificatesLookupResponse.c(s, s1, gged0, z, z1), 5, azpg.a);
    }

    public static String c(String s, String s1, gged_interceptors gged0, boolean z, boolean z1) {
        if(s1 == null) {
            return s;
        }
        ArrayList arrayList0 = new ArrayList();
        if(!z1 && gged0 != null) {
            for(int v = 0; v < ((ggna)gged0).c; ++v) {
                arrayList0.add(((basd)gged0.get(v)).c());
            }
        }
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", s, s1, arrayList0, Boolean.valueOf(z), "253434029.true");
    }

    public final int d() {
        return azqh.a(this.c);
    }

    public static String e(String s, azqq azqq0, boolean z) {
        if(azqq0 == null) {
            return String.format("%s: pkg=%s", "source stamp could not be verified", s);
        }
        gged_interceptors gged0 = azqq0.b;
        if(!gged0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            if(!z) {
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    X509Certificate x509Certificate0 = (X509Certificate)gged0.get(v1);
                    try {
                        byte[] arr_b = x509Certificate0.getEncoded();
                        MessageDigest messageDigest0 = bbms.g("SHA-256");
                        batl.s(messageDigest0);
                        arrayList0.add(bboy.c(messageDigest0.digest(arr_b)));
                    }
                    catch(CertificateEncodingException unused_ex) {
                        arrayList0.add("<failed to encode>");
                    }
                }
            }
            return String.format("%s: pkg=%s error=\"%s\" stamp=%s", "source stamp could not be verified", s, azqq0.c(), arrayList0);
        }
        return String.format("%s: pkg=%s error=\"%s\"", "source stamp could not be verified", s, azqq0.c());
    }

    public static GoogleCertificatesLookupResponse f(String s, gged_interceptors gged0, boolean z) {
        return new GoogleCertificatesLookupResponse(false, GoogleCertificatesLookupResponse.c("debug cert rejected", s, gged0, false, z), 3, azpg.a);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

