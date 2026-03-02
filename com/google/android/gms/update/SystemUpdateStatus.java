package com.google.android.gms.update;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezvq;

public class SystemUpdateStatus extends AbstractSafeParcelable {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public static final Parcelable.Creator CREATOR;
    public final ExpeditedUpdateStatus D;
    public final long E;
    public final long F;
    public final int G;
    public final long H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final Bundle L;
    public final UpdateInfo M;
    public final boolean N;
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final double f;
    public final DownloadOptions g;
    public final InstallationOptions h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final ActivityStatus r;
    public final long s;
    public final String t;
    public final boolean u;
    public final long v;
    public final String w;
    public final UpdateDescription x;
    public final boolean y;
    public final boolean z;

    static {
        SystemUpdateStatus.CREATOR = new ezvq();
    }

    public SystemUpdateStatus(String s, boolean z, int v, int v1, int v2, double f, DownloadOptions downloadOptions0, InstallationOptions installationOptions0, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, long v3, long v4, long v5, long v6, ActivityStatus activityStatus0, long v7, String s1, boolean z6, long v8, String s2, UpdateDescription updateDescription0, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ExpeditedUpdateStatus expeditedUpdateStatus0, long v9, long v10, int v11, long v12, boolean z12, boolean z13, boolean z14, Bundle bundle0, UpdateInfo updateInfo0, boolean z15) {
        this.a = s;
        this.b = z;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = f;
        this.g = downloadOptions0;
        this.h = installationOptions0;
        this.i = z1;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = v3;
        this.o = v4;
        this.p = v5;
        this.q = v6;
        this.r = activityStatus0;
        this.s = v7;
        this.t = s1;
        this.u = z6;
        this.v = v8;
        this.w = s2;
        this.x = updateDescription0;
        this.y = z7;
        this.z = z8;
        this.A = z9;
        this.B = z10;
        this.C = z11;
        this.D = expeditedUpdateStatus0;
        this.E = v9;
        this.F = v10;
        this.G = v11;
        this.H = v12;
        this.I = z12;
        this.J = z13;
        this.K = z14;
        this.L = bundle0;
        this.M = updateInfo0;
        this.N = z15;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.j(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.e(parcel0, 9, this.i);
        baub.e(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.e(parcel0, 12, this.l);
        baub.e(parcel0, 13, this.m);
        baub.q(parcel0, 14, this.n);
        baub.q(parcel0, 15, this.o);
        baub.q(parcel0, 16, this.p);
        baub.q(parcel0, 17, this.q);
        baub.t(parcel0, 18, this.r, v, false);
        baub.q(parcel0, 19, this.s);
        baub.v(parcel0, 20, this.t, false);
        baub.e(parcel0, 21, this.u);
        baub.q(parcel0, 22, this.v);
        baub.v(parcel0, 23, this.w, false);
        baub.t(parcel0, 24, this.x, v, false);
        baub.e(parcel0, 25, this.y);
        baub.e(parcel0, 26, this.z);
        baub.e(parcel0, 27, this.A);
        baub.e(parcel0, 28, this.B);
        baub.e(parcel0, 30, this.C);
        baub.t(parcel0, 0x1F, this.D, v, false);
        baub.q(parcel0, 0x20, this.E);
        baub.q(parcel0, 33, this.F);
        baub.o(parcel0, 34, this.G);
        baub.q(parcel0, 35, this.H);
        baub.e(parcel0, 36, this.I);
        baub.e(parcel0, 37, this.J);
        baub.e(parcel0, 38, this.K);
        baub.g(parcel0, 39, this.L, false);
        baub.t(parcel0, 40, this.M, v, false);
        baub.e(parcel0, 41, this.N);
        baub.c(parcel0, v1);
    }
}

