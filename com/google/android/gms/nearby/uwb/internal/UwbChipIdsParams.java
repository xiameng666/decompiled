package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djfj;
import java.util.Arrays;

public final class UwbChipIdsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String[] a;
    public int b;

    static {
        UwbChipIdsParams.CREATOR = new djfj();
    }

    public UwbChipIdsParams() {
    }

    public UwbChipIdsParams(String[] arr_s, int v) {
        this.a = arr_s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UwbChipIdsParams) && Arrays.equals(this.a, ((UwbChipIdsParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((UwbChipIdsParams)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.w(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

