package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.MotionEvent;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClickAttestationTokenRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final MotionEvent b;
    public final MotionEvent c;
    public final Integer d;
    public final String e;

    static {
        ClickAttestationTokenRequestParcel.CREATOR = new e();
    }

    public ClickAttestationTokenRequestParcel(String s, MotionEvent motionEvent0, MotionEvent motionEvent1, Integer integer0, String s1) {
        this.a = s;
        this.b = motionEvent0;
        this.c = motionEvent1;
        this.d = integer0;
        this.e = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.F(parcel0, 5, this.d);
        baub.v(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

