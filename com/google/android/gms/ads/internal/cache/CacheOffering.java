package com.google.android.gms.ads.internal.cache;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CacheOffering extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Bundle f;
    public final boolean g;
    public long h;
    public String i;
    public int j;

    static {
        CacheOffering.CREATOR = new e();
    }

    public CacheOffering(String s, long v, String s1, String s2, String s3, Bundle bundle0, boolean z, long v1, String s4, int v2) {
        this.a = s;
        this.b = v;
        if(s1 == null) {
            s1 = "";
        }
        this.c = s1;
        if(s2 == null) {
            s2 = "";
        }
        this.d = s2;
        if(s3 == null) {
            s3 = "";
        }
        this.e = s3;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.f = bundle0;
        this.g = z;
        this.h = v1;
        this.i = s4;
        this.j = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.q(parcel0, 3, this.b);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.g(parcel0, 7, this.f, false);
        baub.e(parcel0, 8, this.g);
        baub.q(parcel0, 9, this.h);
        baub.v(parcel0, 10, this.i, false);
        baub.o(parcel0, 11, this.j);
        baub.c(parcel0, v1);
    }
}

