package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evrh;

public class CallSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;

    static {
        CallSpamOptions.CREATOR = new evrh();
    }

    public CallSpamOptions(int v, String s, long v1, int v2, long v3) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

