package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gpcd;

public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public Bundle e;
    public final Uri f;

    static {
        DynamicLinkData.CREATOR = new gpcd();
    }

    public DynamicLinkData(String s, String s1, int v, long v1, Bundle bundle0, Uri uri0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = bundle0;
        this.f = uri0;
    }

    public final Bundle a() {
        return this.e == null ? new Bundle() : this.e;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.g(parcel0, 5, this.a(), false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

