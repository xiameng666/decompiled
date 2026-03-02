package com.google.android.gms.appdatasearch;

import abwm;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RegisteredPackageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;

    static {
        RegisteredPackageInfo.CREATOR = new abwm();
    }

    public RegisteredPackageInfo(String s, long v, boolean z, long v1) {
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

