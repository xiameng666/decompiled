package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fahd;

public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final int b;

    static {
        ElCapitanOptions.CREATOR = new fahd();
    }

    public ElCapitanOptions(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

