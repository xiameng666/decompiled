package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bquv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    static {
        Device.CREATOR = new bquv();
    }

    public Device(String s, String s1, String s2, int v, int v1) {
        batl.s(s);
        this.a = s;
        batl.s(s1);
        this.b = s1;
        if(s2 == null) {
            throw new IllegalStateException("Device UID is null.");
        }
        this.c = s2;
        this.d = v;
        this.e = v1;
    }

    final String a() {
        return String.format("%s:%s:%s", this.a, this.b, this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof Device) ? bata.b(this.a, ((Device)object0).a) && bata.b(this.b, ((Device)object0).b) && bata.b(this.c, ((Device)object0).c) && this.d == ((Device)object0).d && this.e == ((Device)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, ((int)this.d)});
    }

    @Override
    public final String toString() {
        return String.format("Device{%s:%s:%s}", this.a(), ((int)this.d), ((int)this.e));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.o(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

