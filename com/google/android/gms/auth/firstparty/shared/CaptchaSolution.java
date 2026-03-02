package com.google.android.gms.auth.firstparty.shared;

import ajpk;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CaptchaSolution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    public final String c;

    static {
        CaptchaSolution.CREATOR = new ajpk();
    }

    public CaptchaSolution(int v, String s, String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

