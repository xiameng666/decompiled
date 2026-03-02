package com.google.android.gms.auth.uiflows.addaccount;

import alwx;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final Intent f;
    public final String g;
    public final boolean h;
    public final boolean i;

    static {
        AccountDetail.CREATOR = new alwx();
    }

    public AccountDetail(String s, String s1, boolean z, String s2, boolean z1, Intent intent0, String s3, boolean z2, boolean z3) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = s2;
        this.e = z1;
        this.f = intent0;
        this.g = s3;
        this.h = z2;
        this.i = z3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.v(parcel0, 7, this.g, false);
        baub.e(parcel0, 8, this.h);
        baub.e(parcel0, 9, this.i);
        baub.c(parcel0, v1);
    }
}

