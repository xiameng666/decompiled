package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bzvv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class InstantAppPreLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final boolean c;
    public final Intent d;
    public final Intent e;
    public final AppInfo f;
    public final Route g;
    public final boolean h;
    public final byte[] i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final byte[] n;
    public final Bundle o;

    static {
        InstantAppPreLaunchInfo.CREATOR = new bzvv();
    }

    public InstantAppPreLaunchInfo(int v, String s, boolean z, Intent intent0, Intent intent1, AppInfo appInfo0, Route route0, boolean z1, byte[] arr_b, String s1, int v1, int v2, String s2, byte[] arr_b1, Bundle bundle0) {
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = intent0;
        this.e = intent1;
        this.f = appInfo0;
        this.g = route0;
        this.h = z1;
        this.i = arr_b;
        this.j = s1;
        this.k = v1;
        this.m = s2;
        this.l = v2;
        this.n = arr_b1;
        this.o = bundle0;
    }

    public static InstantAppPreLaunchInfo a(Intent intent0, boolean z, byte[] arr_b) {
        batl.s(intent0);
        return new InstantAppPreLaunchInfo(0, null, z, null, intent0, null, null, false, arr_b, null, 0, 0, null, null, null);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.e(parcel0, 4, this.c);
        baub.t(parcel0, 5, this.d, v, false);
        baub.t(parcel0, 6, this.e, v, false);
        baub.t(parcel0, 8, this.f, v, false);
        baub.t(parcel0, 9, this.g, v, false);
        baub.e(parcel0, 10, this.h);
        baub.i(parcel0, 11, this.i, false);
        baub.v(parcel0, 12, this.j, false);
        baub.o(parcel0, 13, this.k);
        baub.v(parcel0, 14, this.m, false);
        baub.g(parcel0, 15, this.o, false);
        baub.o(parcel0, 16, this.l);
        baub.i(parcel0, 17, this.n, false);
        baub.c(parcel0, v1);
    }
}

