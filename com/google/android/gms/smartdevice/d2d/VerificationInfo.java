package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eqfw;

public class VerificationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public final int b;
    public boolean c;

    static {
        VerificationInfo.CREATOR = new eqfw();
    }

    public VerificationInfo(String s, int v) {
        this(s, v, false);
    }

    public VerificationInfo(String s, int v, boolean z) {
        this.a = s;
        this.b = v;
        this.c = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

