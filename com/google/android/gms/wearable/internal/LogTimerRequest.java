package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdjl;

public class LogTimerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final byte[] c;

    static {
        LogTimerRequest.CREATOR = new fdjl();
    }

    public LogTimerRequest(String s, long v, byte[] arr_b) {
        this.a = s;
        this.b = v;
        this.c = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

