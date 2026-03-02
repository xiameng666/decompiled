package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;
import ddsl;
import java.util.Arrays;

public final class OnShareTargetDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ShareTarget a;
    public int b;
    public RangingData c;

    static {
        OnShareTargetDistanceChangedParams.CREATOR = new ddsl();
    }

    public OnShareTargetDistanceChangedParams() {
    }

    public OnShareTargetDistanceChangedParams(ShareTarget shareTarget0, int v, RangingData rangingData0) {
        this.a = shareTarget0;
        this.b = v;
        this.c = rangingData0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnShareTargetDistanceChangedParams) && bata.b(this.a, ((OnShareTargetDistanceChangedParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((OnShareTargetDistanceChangedParams)object0).b)) && bata.b(this.c, ((OnShareTargetDistanceChangedParams)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

