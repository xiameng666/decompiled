package com.google.android.gms.nearby.fastpair;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cxxv;
import java.util.Arrays;

public final class SassDeviceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    final Bitmap b;

    static {
        SassDeviceInfo.CREATOR = new cxxv();
    }

    public SassDeviceInfo(String s, Bitmap bitmap0) {
        this.a = s;
        this.b = bitmap0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && bata.b(this.a, ((SassDeviceInfo)object0).a) && bata.b(this.b, ((SassDeviceInfo)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return "SassDeviceInfo {deviceName=" + this.a + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

