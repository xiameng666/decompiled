package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fcdr;

public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public String b;
    public final double c;
    public String d;
    public long e;
    public final int f;

    static {
        LoyaltyPointsBalance.CREATOR = new fcdr();
    }

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0;
    }

    public LoyaltyPointsBalance(int v, String s, double f, String s1, long v1, int v2) {
        this.a = v;
        this.b = s;
        this.c = f;
        this.d = s1;
        this.e = v1;
        this.f = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.j(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.q(parcel0, 6, this.e);
        baub.o(parcel0, 7, this.f);
        baub.c(parcel0, v1);
    }
}

