package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cobd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class IneligibilityRationale extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        IneligibilityRationale.CREATOR = new cobd();
    }

    public IneligibilityRationale(String s, boolean z, String s1, boolean z1, boolean z2, boolean z3) {
        this.a = s;
        this.b = z;
        this.c = s1;
        this.d = z1;
        this.e = z2;
        this.f = z3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

