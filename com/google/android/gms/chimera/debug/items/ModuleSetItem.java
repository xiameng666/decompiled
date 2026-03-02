package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import awkk;
import awkl;
import awkm;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibrc;
import ibts;
import ibuq;
import java.util.List;

public final class ModuleSetItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final List g;

    static {
        ModuleSetItem.CREATOR = new awkm();
    }

    public ModuleSetItem(int v, String s, long v1, String s1, boolean z, boolean z1, List list0) {
        ibuq.f(s, "moduleSetId");
        ibuq.f(s1, "status");
        ibuq.f(list0, "enabledFeatures");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = z;
        this.f = z1;
        this.g = list0;
    }

    public ModuleSetItem(String s, long v, String s1, boolean z, boolean z1, List list0) {
        ibuq.f(s, "moduleSetId");
        ibuq.f(list0, "enabledFeatures");
        this(1, s, v, s1, z, z1, list0);
    }

    @Override
    public final int compareTo(Object object0) {
        ModuleSetItem moduleSetItem0 = (ModuleSetItem)object0;
        ibuq.f(moduleSetItem0, "other");
        return ibrc.b(this, moduleSetItem0, new ibts[]{new awkk(), new awkl()});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "out");
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.x(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}

