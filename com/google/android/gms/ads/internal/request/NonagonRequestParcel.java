package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class NonagonRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;
    public final VersionInfoParcel b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public final PoolConfiguration i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Bundle m;
    public final Bundle n;
    public final int o;

    static {
        NonagonRequestParcel.CREATOR = new p();
    }

    public NonagonRequestParcel(Bundle bundle0, VersionInfoParcel versionInfoParcel0, ApplicationInfo applicationInfo0, String s, List list0, PackageInfo packageInfo0, String s1, String s2, PoolConfiguration poolConfiguration0, String s3, boolean z, boolean z1, Bundle bundle1, Bundle bundle2, int v) {
        this.a = bundle0;
        this.b = versionInfoParcel0;
        this.d = s;
        this.c = applicationInfo0;
        this.e = list0;
        this.f = packageInfo0;
        this.g = s1;
        this.h = s2;
        this.i = poolConfiguration0;
        this.j = s3;
        this.k = z;
        this.l = z1;
        this.m = bundle1;
        this.n = bundle2;
        this.o = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.g(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.v(parcel0, 4, this.d, false);
        baub.x(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 9, this.h, false);
        baub.t(parcel0, 10, this.i, v, false);
        baub.v(parcel0, 11, this.j, false);
        baub.e(parcel0, 12, this.k);
        baub.e(parcel0, 13, this.l);
        baub.g(parcel0, 14, this.m, false);
        baub.g(parcel0, 15, this.n, false);
        baub.o(parcel0, 16, this.o);
        baub.c(parcel0, v1);
    }
}

