package com.google.android.gms.auth.aang;

import actg;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AppRestrictionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    static {
        AppRestrictionInfo.CREATOR = new actg();
    }

    public AppRestrictionInfo(String s, String s1, String s2, String s3, byte[] arr_b) {
        this.a = s;
        this.d = s2;
        this.c = s1;
        this.e = s3;
        this.b = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.i(parcel0, 6, this.b, false);
        baub.c(parcel0, v1);
    }
}

