package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import ddsm;
import java.util.Arrays;

public final class OnShareTargetLostParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ShareTarget a;

    static {
        OnShareTargetLostParams.CREATOR = new ddsm();
    }

    public OnShareTargetLostParams() {
    }

    public OnShareTargetLostParams(ShareTarget shareTarget0) {
        this.a = shareTarget0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof OnShareTargetLostParams) ? bata.b(this.a, ((OnShareTargetLostParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

