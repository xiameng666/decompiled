package com.google.android.gms.auth.proximity;

import a;
import aktw;
import aktx;
import alls;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gged_interceptors;
import ggna;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

public class AttestationVerifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final byte[][] a;
    final int b;
    final aktw c;
    private int d;

    static {
        AttestationVerifier.CREATOR = new aktx();
    }

    public AttestationVerifier(byte[][] arr2_b, int v) {
        this.a = arr2_b;
        this.b = v;
        this.d = 1;
        if(aktw.a == null) {
            aktw.a = new aktw();
        }
        this.c = aktw.a;
    }

    public final boolean a() {
        int v = this.d;
        boolean z = false;
        if(v == 3) {
            Log.e("AttestationVerifier", "Certificate previously failed to verify");
            return false;
        }
        if(v == 2 && !this.b()) {
            Log.e("AttestationVerifier", "Certificate is now outside the validity period");
            this.d = 3;
            return false;
        }
        int v1 = this.b;
        if(v1 == alls.a(3)) {
            byte[][] arr2_b = this.a;
            if(arr2_b.length == 0) {
                Log.e("AttestationVerifier", "No certificates to verify");
                goto label_59;
            }
            else {
                ArrayList arrayList0 = new ArrayList(arr2_b.length);
                int v2 = 0;
                while(true) {
                    if(v2 < arr2_b.length) {
                        X509Certificate x509Certificate0 = this.c.a(arr2_b[v2]);
                        if(x509Certificate0 == null) {
                            Log.e("AttestationVerifier", "Could not convert the attestation data to a set of valid certificates");
                            break;
                        }
                        arrayList0.add(x509Certificate0);
                        gged_interceptors gged0 = gged_interceptors.k(x509Certificate0.getSubjectX500Principal().getName("CANONICAL").split(","));
                        int v3 = x509Certificate0.getBasicConstraints();
                        if(v2 == 1) {
                            if(((ggna)gged0).c == 2 && gged0.contains("o=chrome device soft bind") && gged0.contains("cn=local authority")) {
                                if(!AttestationVerifier.c(x509Certificate0.getKeyUsage(), 5)) {
                                    break;
                                }
                                if(v3 != 0) {
                                    Log.e("AttestationVerifier", "Penultimate cert PathLen constraint is incorrect");
                                    break;
                                }
                                v2 = 2;
                                continue;
                            }
                            Log.e("AttestationVerifier", "Penultimate cert subject is incorrect");
                            break;
                        }
                        else if(v2 == 0) {
                            if(((ggna)gged0).c == 2 && gged0.contains("o=chrome device soft bind") && gged0.contains("cn=cryptauth user key")) {
                                if(!AttestationVerifier.c(x509Certificate0.getKeyUsage(), 0)) {
                                    break;
                                }
                                if(v3 != -1) {
                                    Log.e("AttestationVerifier", "Leaf cert PathLen constraint is incorrect");
                                    break;
                                }
                                if(x509Certificate0.getNotAfter().getTime() - x509Certificate0.getNotBefore().getTime() > 259200000L) {
                                    Log.e("AttestationVerifier", "Leaf cert issued for longer than allowed period");
                                    break;
                                }
                                v2 = 1;
                                continue;
                            }
                            Log.e("AttestationVerifier", "Leaf cert subject is incorrect");
                            break;
                        }
                        else {
                            if(v3 == 0) {
                                Log.e("AttestationVerifier", "Multiple or misplaced terminal local ca cert(s)");
                                break;
                            }
                            ++v2;
                            continue;
                        }
                    }
                    TrustAnchor trustAnchor0 = this.c.b;
                    if(trustAnchor0 != null && this.c.b(arrayList0, trustAnchor0)) {
                        z = true;
                        break;
                    }
                    Log.e("AttestationVerifier", "Could not validate chain");
                    break;
                }
            label_59:
                if(z) {
                    Log.i("AttestationVerifier", "CROS_SOFT_BIND certificate verified");
                    this.d = 2;
                    return z;
                }
            }
            Log.e("AttestationVerifier", "CROS_SOFT_BIND certificate NOT verified");
            this.d = 3;
            return z;
        }
        Log.e("AttestationVerifier", "Not possible to perform verification for this type: " + v1);
        return false;
    }

    private final boolean b() {
        for(int v = 0; true; ++v) {
            byte[][] arr2_b = this.a;
            if(v >= arr2_b.length) {
                break;
            }
            X509Certificate x509Certificate0 = this.c.a(arr2_b[v]);
            if(x509Certificate0 == null) {
                Log.e("AttestationVerifier", "Could not convert the attestation data to a set of valid certificates");
                return false;
            }
            try {
                x509Certificate0.checkValidity();
            }
            catch(CertificateExpiredException | CertificateNotYetValidException exception0) {
                Log.e("AttestationVerifier", "Certificate is outside of the validity period", exception0);
                return false;
            }
        }
        return true;
    }

    private static final boolean c(boolean[] arr_z, int v) {
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            if(v1 == v) {
                if(!arr_z[v1]) {
                    Log.e("AttestationVerifier", a.f(v1, "Key usage index ", " should be set to true and was not"));
                    return false;
                }
            }
            else if(arr_z[v1]) {
                Log.e("AttestationVerifier", a.f(v1, "Key usage index ", " should be set to false and was not"));
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AttestationVerifier) ? Arrays.equals(this.a, ((AttestationVerifier)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.A(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

