package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czfh;
import czfj;
import czfk;
import czfm;
import czfx;
import czfz;
import czid;
import java.util.Arrays;

public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfz a;
    public czfj b;
    public String c;
    public long d;
    public DiscoveryOptions e;
    public czfm f;
    public String g;

    static {
        StartDiscoveryParams.CREATOR = new czid();
    }

    public StartDiscoveryParams() {
    }

    public StartDiscoveryParams(IBinder iBinder0, IBinder iBinder1, String s, long v, DiscoveryOptions discoveryOptions0, IBinder iBinder2, String s1) {
        czfj czfj0;
        czfz czfz0;
        czfm czfm0 = null;
        if(iBinder0 == null) {
            czfz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            czfz0 = (iInterface0 instanceof czfz) ? ((czfz)iInterface0) : new czfx(iBinder0);
        }
        if(iBinder1 == null) {
            czfj0 = null;
        }
        else {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            czfj0 = (iInterface1 instanceof czfj) ? ((czfj)iInterface1) : new czfh(iBinder1);
        }
        if(iBinder2 != null) {
            IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            czfm0 = (iInterface2 instanceof czfm) ? ((czfm)iInterface2) : new czfk(iBinder2);
        }
        super();
        this.a = czfz0;
        this.b = czfj0;
        this.c = s;
        this.d = v;
        this.e = discoveryOptions0;
        this.f = czfm0;
        this.g = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof StartDiscoveryParams) && bata.b(this.a, ((StartDiscoveryParams)object0).a) && bata.b(this.b, ((StartDiscoveryParams)object0).b) && bata.b(this.c, ((StartDiscoveryParams)object0).c) && bata.b(Long.valueOf(this.d), Long.valueOf(((StartDiscoveryParams)object0).d)) && bata.b(this.e, ((StartDiscoveryParams)object0).e) && bata.b(this.f, ((StartDiscoveryParams)object0).f) && bata.b(this.g, ((StartDiscoveryParams)object0).g);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, ((long)this.d), this.e, this.f, this.g});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        IBinder iBinder0 = null;
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.D(parcel0, 2, (this.b == null ? null : this.b.asBinder()));
        baub.v(parcel0, 3, this.c, false);
        baub.q(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        czfm czfm0 = this.f;
        if(czfm0 != null) {
            iBinder0 = czfm0.asBinder();
        }
        baub.D(parcel0, 6, iBinder0);
        baub.v(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}

