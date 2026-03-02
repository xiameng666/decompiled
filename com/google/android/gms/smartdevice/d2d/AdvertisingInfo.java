package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import epwm;

public class AdvertisingInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public boolean e;

    static {
        AdvertisingInfo.CREATOR = new epwm();
    }

    public AdvertisingInfo(String s, String s1, String s2, String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    public AdvertisingInfo(String s, String s1, String s2, String s3, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.e(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

