package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fcds;

public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public LoyaltyPointsBalance b;
    @Deprecated
    TimeInterval c;

    static {
        LoyaltyPoints.CREATOR = new fcds();
    }

    LoyaltyPoints() {
    }

    public LoyaltyPoints(String s, LoyaltyPointsBalance loyaltyPointsBalance0, TimeInterval timeInterval0) {
        this.a = s;
        this.b = loyaltyPointsBalance0;
        this.c = timeInterval0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.t(parcel0, 5, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

