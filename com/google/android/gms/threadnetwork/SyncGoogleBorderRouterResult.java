package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evwc;
import ghjc;
import java.util.Arrays;
import java.util.Locale;

public final class SyncGoogleBorderRouterResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    private final byte[] b;

    static {
        SyncGoogleBorderRouterResult.CREATOR = new evwc();
    }

    public SyncGoogleBorderRouterResult(String s, byte[] arr_b) {
        this.a = s;
        this.b = (byte[])arr_b.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SyncGoogleBorderRouterResult) ? this.a.equals(((SyncGoogleBorderRouterResult)object0).a) && Arrays.equals(this.b, ((SyncGoogleBorderRouterResult)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        String s = ghjc.f.o(this.b);
        return String.format(locale0, "{NetworkName: %s, ExtendedPanId: %s}", this.a, s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, ((byte[])this.b.clone()), false);
        baub.c(parcel0, v1);
    }
}

