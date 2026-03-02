package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import epxm;

public class BootstrapProgressResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final Bundle b;

    static {
        BootstrapProgressResult.CREATOR = new epxm();
    }

    public BootstrapProgressResult(int v, Bundle bundle0) {
        this.a = v;
        this.b = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.g(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

