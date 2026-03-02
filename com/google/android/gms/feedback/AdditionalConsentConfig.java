package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import baub;
import bkue;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AdditionalConsentConfig extends AbstractSafeParcelable {
    public static final bkue CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Bundle f;

    static {
        AdditionalConsentConfig.CREATOR = new bkue();
    }

    public AdditionalConsentConfig(String s, String s1, String s2, String s3, String s4, Bundle bundle0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.g(parcel0, 7, this.f, false);
        baub.c(parcel0, v1);
    }
}

