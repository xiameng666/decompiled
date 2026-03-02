package com.google.android.gms.auth;

import acrt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;

    static {
        BrowserResolutionCookie.CREATOR = new acrt();
    }

    public BrowserResolutionCookie() {
        this.d = "/";
        this.e = -1L;
    }

    public BrowserResolutionCookie(String s, String s1, String s2, String s3, long v, boolean z, boolean z1) {
        this.d = "/";
        this.e = -1L;
        batl.q(s);
        this.a = s;
        batl.q(s1);
        this.b = s1;
        batl.q(s2);
        this.c = s2;
        batl.q(s3);
        this.d = s3;
        this.e = v;
        this.f = z;
        this.g = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof BrowserResolutionCookie) && bata.b(this.a, ((BrowserResolutionCookie)object0).a) && bata.b(this.b, ((BrowserResolutionCookie)object0).b) && bata.b(this.c, ((BrowserResolutionCookie)object0).c) && bata.b(this.d, ((BrowserResolutionCookie)object0).d) && bata.b(Long.valueOf(this.e), Long.valueOf(((BrowserResolutionCookie)object0).e)) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((BrowserResolutionCookie)object0).f)) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((BrowserResolutionCookie)object0).g));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, ((long)this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.q(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

