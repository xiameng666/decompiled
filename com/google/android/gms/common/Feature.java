package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azpf;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    @Deprecated
    public final int b;
    private final long c;

    static {
        Feature.CREATOR = new azpf();
    }

    public Feature(String s, int v, long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    public Feature(String s, long v) {
        this.a = s;
        this.c = v;
        this.b = -1;
    }

    public final long a() {
        return this.c == -1L ? ((long)this.b) : this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof Feature) && ((this.a != null && this.a.equals(((Feature)object0).a) || this.a == null && ((Feature)object0).a == null) && this.a() == ((Feature)object0).a());
    }

    @Override
    public final int hashCode() {
        Long long0 = this.a();
        return Arrays.hashCode(new Object[]{this.a, long0});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("name", this.a, arrayList0);
        basz.b("version", Long.valueOf(this.a()), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.a());
        baub.c(parcel0, v1);
    }
}

