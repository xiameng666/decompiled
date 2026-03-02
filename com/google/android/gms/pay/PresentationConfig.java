package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhi;
import java.util.Arrays;

public final class PresentationConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public GridConfig b;

    static {
        PresentationConfig.CREATOR = new dlhi();
    }

    public PresentationConfig() {
    }

    public PresentationConfig(int v, GridConfig gridConfig0) {
        this.a = v;
        this.b = gridConfig0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof PresentationConfig) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((PresentationConfig)object0).a)) && bata.b(this.b, ((PresentationConfig)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

