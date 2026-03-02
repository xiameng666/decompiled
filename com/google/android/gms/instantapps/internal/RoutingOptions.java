package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bzwk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RoutingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        RoutingOptions.CREATOR = new bzwk();
    }

    public RoutingOptions() {
    }

    public RoutingOptions(boolean z, String s, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = s;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

