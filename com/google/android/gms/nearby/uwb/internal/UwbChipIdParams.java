package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djfi;
import java.util.Arrays;

public final class UwbChipIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;

    static {
        UwbChipIdParams.CREATOR = new djfi();
    }

    private UwbChipIdParams() {
    }

    public UwbChipIdParams(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof UwbChipIdParams) ? bata.b(this.a, ((UwbChipIdParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

