package com.google.android.gms.auth.firstparty.dataservice;

import ajnd;
import ajol;
import ajpt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConsentResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final String a = "com.google.android.gms.auth.firstparty.dataservice.ConsentResult";
    public final int b;
    public final String c;
    public final String d;
    public final FACLConfig e;
    public final String f;
    public final String g;
    public final String h;

    static {
        ConsentResult.CREATOR = new ajnd();
    }

    public ConsentResult(int v, String s, String s1, FACLConfig fACLConfig0, String s2, String s3, String s4) {
        this.b = v;
        batl.s(s);
        this.c = s;
        this.d = s1;
        this.e = fACLConfig0;
        this.f = s2;
        this.g = s3;
        this.h = s4;
    }

    public ConsentResult(ajpt ajpt0, ajol ajol0, String s) {
        batl.s(ajpt0);
        batl.s(ajol0);
        this(3, ajpt0.toString(), null, null, ajol0.toString(), null, s);
    }

    public ConsentResult(ajpt ajpt0, String s, FACLConfig fACLConfig0, ajol ajol0, String s1) {
        batl.s(ajpt0);
        batl.s(ajol0);
        this(3, ajpt0.toString(), s, fACLConfig0, ajol0.toString(), s1, null);
    }

    public final ajol a() {
        return ajol.a(this.f);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.b);
        baub.v(parcel0, 2, this.c, false);
        baub.v(parcel0, 3, this.d, false);
        baub.t(parcel0, 4, this.e, v, false);
        baub.v(parcel0, 5, this.f, false);
        baub.v(parcel0, 6, this.g, false);
        baub.v(parcel0, 7, this.h, false);
        baub.c(parcel0, v1);
    }
}

