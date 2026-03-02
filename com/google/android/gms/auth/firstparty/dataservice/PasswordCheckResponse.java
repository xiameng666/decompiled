package com.google.android.gms.auth.firstparty.dataservice;

import ajof;
import ajpt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PasswordCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String a;
    String b;
    String c;

    static {
        PasswordCheckResponse.CREATOR = new ajof();
    }

    public PasswordCheckResponse(ajpt ajpt0) {
        this(ajpt0, null, null);
    }

    public PasswordCheckResponse(ajpt ajpt0, String s, String s1) {
        batl.s(ajpt0);
        this.a = ajpt0.ak;
        this.b = s;
        this.c = s1;
    }

    public PasswordCheckResponse(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

