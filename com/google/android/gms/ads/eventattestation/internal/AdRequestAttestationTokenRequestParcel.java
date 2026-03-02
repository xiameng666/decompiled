package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AdRequestAttestationTokenRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final Integer c;
    public final String d;

    static {
        AdRequestAttestationTokenRequestParcel.CREATOR = new b();
    }

    public AdRequestAttestationTokenRequestParcel(String s, byte[] arr_b, Integer integer0, String s1) {
        this.a = s;
        this.b = arr_b;
        this.c = integer0;
        this.d = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.F(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.c(parcel0, v1);
    }
}

