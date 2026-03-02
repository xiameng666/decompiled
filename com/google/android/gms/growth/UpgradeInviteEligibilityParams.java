package com.google.android.gms.growth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bvmi;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class UpgradeInviteEligibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        UpgradeInviteEligibilityParams.CREATOR = new bvmi();
    }

    public UpgradeInviteEligibilityParams(int v) {
        this.a = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

