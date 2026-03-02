package com.google.android.gms.auth.firstparty.dataservice;

import ajoh;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PinSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    static {
        PinSettings.CREATOR = new ajoh();
    }

    public PinSettings(int v, String s, String s1, String s2, String s3, int v1) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.o(parcel0, 5, this.f);
        baub.v(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

