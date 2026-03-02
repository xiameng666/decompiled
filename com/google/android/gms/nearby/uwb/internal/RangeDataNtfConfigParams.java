package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djeu;
import java.util.Arrays;

public final class RangeDataNtfConfigParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;

    static {
        RangeDataNtfConfigParams.CREATOR = new djeu();
    }

    public RangeDataNtfConfigParams() {
    }

    public RangeDataNtfConfigParams(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RangeDataNtfConfigParams) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((RangeDataNtfConfigParams)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((RangeDataNtfConfigParams)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((RangeDataNtfConfigParams)object0).c));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

