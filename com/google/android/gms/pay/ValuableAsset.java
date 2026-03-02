package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlkx;
import java.util.Arrays;

public final class ValuableAsset extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public byte[] b;

    static {
        ValuableAsset.CREATOR = new dlkx();
    }

    public ValuableAsset() {
    }

    public ValuableAsset(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ValuableAsset) && bata.b(this.a, ((ValuableAsset)object0).a) && Arrays.equals(this.b, ((ValuableAsset)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

