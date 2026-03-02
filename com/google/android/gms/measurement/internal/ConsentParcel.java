package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crda;

public final class ConsentParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        ConsentParcel.CREATOR = new crda();
    }

    public ConsentParcel(Bundle bundle0) {
        this.a = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.g(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

