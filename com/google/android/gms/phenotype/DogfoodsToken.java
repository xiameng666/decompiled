package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eilz;

public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;

    static {
        DogfoodsToken.CREATOR = new eilz();
    }

    public DogfoodsToken(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}

