package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import awkj;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ModuleItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final int h;
    public final boolean i;
    public final String j;

    static {
        ModuleItem.CREATOR = new awkj();
    }

    public ModuleItem(int v, String s, int v1, String s1, int v2, long v3, String s2, int v4, boolean z, String s3) {
        ibuq.f(s, "moduleId");
        ibuq.f(s1, "apkPath");
        ibuq.f(s2, "apkVersionName");
        ibuq.f(s3, "apkPackageName");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = v2;
        this.f = v3;
        this.g = s2;
        this.h = v4;
        this.i = z;
        this.j = s3;
    }

    @Override
    public final int compareTo(Object object0) {
        ModuleItem moduleItem0 = (ModuleItem)object0;
        ibuq.f(moduleItem0, "other");
        return this.b.compareTo(moduleItem0.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "out");
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.o(parcel0, 5, this.e);
        baub.q(parcel0, 6, this.f);
        baub.v(parcel0, 7, this.g, false);
        baub.o(parcel0, 8, this.h);
        baub.e(parcel0, 9, this.i);
        baub.v(parcel0, 10, this.j, false);
        baub.c(parcel0, v1);
    }
}

