package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fcee;
import fdfr;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable extends AbstractSafeParcelable implements fcee {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final List b;
    private final Object c;
    private Set d;

    static {
        CapabilityInfoParcelable.CREATOR = new fdfr();
    }

    public CapabilityInfoParcelable(String s, List list0) {
        this.c = new Object();
        this.a = s;
        this.b = list0;
        this.d = null;
        batl.s(s);
        batl.s(list0);
    }

    @Override  // fcee
    public final String a() {
        return this.a;
    }

    @Override  // fcee
    public final Set b() {
        synchronized(this.c) {
            if(this.d == null) {
                this.d = new HashSet(this.b);
            }
        }
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            String s = this.a;
            if(s != null) {
                if(!s.equals(((CapabilityInfoParcelable)object0).a)) {
                    return false;
                }
                return this.b == null ? ((CapabilityInfoParcelable)object0).b == null : this.b.equals(((CapabilityInfoParcelable)object0).b);
            }
            if(((CapabilityInfoParcelable)object0).a != null) {
                return false;
            }
            return this.b == null ? ((CapabilityInfoParcelable)object0).b == null : this.b.equals(((CapabilityInfoParcelable)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        List list0 = this.b;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (v1 + 0x1F) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "CapabilityInfo{" + this.a + ", " + this.b + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.y(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

