package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elwl;
import java.util.ArrayList;

public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    static {
        SemanticLocationEventRequest.CREATOR = new elwl();
    }

    public SemanticLocationEventRequest(float f, int v, int v1, float f1, long v2) {
        this.a = f;
        this.b = v;
        this.c = v1;
        this.d = f1;
        this.e = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof SemanticLocationEventRequest;
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    @Override
    public final String toString() {
        return basz.a(new ArrayList(), this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.l(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.l(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

