package com.google.android.gms.play.integrity.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eiwh;
import java.util.Arrays;

public final class DisplayListenerData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int[] a;
    public long b;

    static {
        DisplayListenerData.CREATOR = new eiwh();
    }

    public DisplayListenerData() {
    }

    public DisplayListenerData(int[] arr_v, long v) {
        this.a = arr_v;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DisplayListenerData) && Arrays.equals(this.a, ((DisplayListenerData)object0).a) && bata.b(Long.valueOf(this.b), Long.valueOf(((DisplayListenerData)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), ((long)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.p(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

