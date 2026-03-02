package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import ccri;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ProgressColor extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        ProgressColor.CREATOR = new ccri();
    }

    public ProgressColor(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ProgressColor) ? this.a == ((ProgressColor)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "ProgressColor(value=" + this.a + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

