package com.google.android.gms.tapandpay.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esnh;

public final class UnifiedTokenizationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final byte[] b;
    public final Integer c;
    public final PendingIntent d;

    static {
        UnifiedTokenizationResponse.CREATOR = new esnh();
    }

    public UnifiedTokenizationResponse(int v, byte[] arr_b, Integer integer0, PendingIntent pendingIntent0) {
        this.a = v;
        this.b = arr_b;
        this.c = integer0;
        this.d = pendingIntent0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.F(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

