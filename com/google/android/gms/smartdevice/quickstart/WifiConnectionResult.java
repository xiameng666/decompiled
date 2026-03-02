package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eqzs;

public class WifiConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        WifiConnectionResult.CREATOR = new eqzs();
    }

    public WifiConnectionResult(int v) {
        this.a = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

