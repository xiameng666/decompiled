package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdkp;

public class NodeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    static {
        NodeParcelable.CREATOR = new fdkp();
    }

    public NodeParcelable(String s, String s1, int v, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof NodeParcelable) ? ((NodeParcelable)object0).a.equals(this.a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Node{" + this.b + ", id=" + this.a + ", hops=" + this.c + ", isNearby=" + this.d + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.e(parcel0, 5, this.d);
        baub.c(parcel0, v1);
    }
}

