package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfo;
import java.util.Arrays;

public final class GridConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public boolean b;

    static {
        GridConfig.CREATOR = new dlfo();
    }

    public GridConfig() {
    }

    public GridConfig(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GridConfig) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((GridConfig)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((GridConfig)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), Boolean.valueOf(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

