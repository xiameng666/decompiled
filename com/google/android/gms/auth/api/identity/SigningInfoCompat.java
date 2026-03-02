package com.google.android.gms.auth.api.identity;

import ahqw;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;
import java.util.Arrays;

public class SigningInfoCompat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final SigningInfoCompat a;
    public final boolean b;
    public final boolean c;
    public final Signature[] d;
    public final Signature[] e;

    static {
        SigningInfoCompat.a = new SigningInfoCompat(false, false, null, null);
        SigningInfoCompat.CREATOR = new ahqw();
    }

    public SigningInfoCompat(boolean z, boolean z1, Signature[] arr_signature, Signature[] arr_signature1) {
        this.b = z;
        this.c = z1;
        this.d = arr_signature;
        this.e = arr_signature1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SigningInfoCompat) ? this.b == ((SigningInfoCompat)object0).b && this.c == ((SigningInfoCompat)object0).c && Arrays.equals(this.d, ((SigningInfoCompat)object0).d) && Arrays.equals(this.e, ((SigningInfoCompat)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.d);
        int v1 = Arrays.hashCode(this.e);
        return (Objects.hash(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)}) * 0x1F + v) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SigningInfoCompat{hasMultipleSigners=" + this.b + ", hasPastSigningCertificates=" + this.c + ", signingCertificateHistory=" + Arrays.toString(this.d) + ", apkContentsSigners=" + Arrays.toString(this.e) + '}';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.b);
        baub.e(parcel0, 2, this.c);
        baub.J(parcel0, 3, this.d, v);
        baub.J(parcel0, 4, this.e, v);
        baub.c(parcel0, v1);
    }
}

