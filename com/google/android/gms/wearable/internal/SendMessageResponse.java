package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdle;

public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;

    static {
        SendMessageResponse.CREATOR = new fdle();
    }

    public SendMessageResponse(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

