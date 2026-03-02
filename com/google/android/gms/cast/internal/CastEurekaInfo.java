package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import aure;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class CastEurekaInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    static {
        CastEurekaInfo.CREATOR = new aure();
    }

    public CastEurekaInfo(int v, boolean z, boolean z1, String s, String s1, String s2, String s3, String s4, boolean z2, boolean z3) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        this.h = s4;
        this.i = z2;
        this.j = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof CastEurekaInfo) ? this.a == ((CastEurekaInfo)object0).a && this.b == ((CastEurekaInfo)object0).b && this.c == ((CastEurekaInfo)object0).c && TextUtils.equals(this.d, ((CastEurekaInfo)object0).d) && TextUtils.equals(this.e, ((CastEurekaInfo)object0).e) && TextUtils.equals(this.f, ((CastEurekaInfo)object0).f) && TextUtils.equals(this.g, ((CastEurekaInfo)object0).g) && TextUtils.equals(this.h, ((CastEurekaInfo)object0).h) && this.i == ((CastEurekaInfo)object0).i && this.j == ((CastEurekaInfo)object0).j : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.v(parcel0, 8, this.g, false);
        baub.v(parcel0, 9, this.h, false);
        baub.e(parcel0, 10, this.i);
        baub.e(parcel0, 11, this.j);
        baub.c(parcel0, v1);
    }
}

