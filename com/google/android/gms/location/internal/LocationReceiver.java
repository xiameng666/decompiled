package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import cmnr;
import cmnt;
import cmnu;
import cmnw;
import cnij;
import cnil;
import cnla;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    static {
        LocationReceiver.CREATOR = new cnla();
    }

    public LocationReceiver(int v, IBinder iBinder0, IBinder iBinder1, PendingIntent pendingIntent0, String s) {
        this.a = v;
        this.b = iBinder0;
        this.c = iBinder1;
        this.d = pendingIntent0;
        this.e = s;
    }

    public final PendingIntent a() {
        batl.l(this.a == 3);
        return (PendingIntent)Objects.requireNonNull(this.d);
    }

    public final cmnt b() {
        batl.l(this.a == 2);
        IBinder iBinder0 = (IBinder)Objects.requireNonNull(this.c);
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return (iInterface0 instanceof cmnt) ? ((cmnt)iInterface0) : new cmnr(iBinder0);
    }

    public final cmnw c() {
        batl.l(this.a == 1);
        IBinder iBinder0 = (IBinder)Objects.requireNonNull(this.c);
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return (iInterface0 instanceof cmnw) ? ((cmnw)iInterface0) : new cmnu(iBinder0);
    }

    public final cnil d() {
        batl.l(this.a == 4);
        IBinder iBinder0 = (IBinder)Objects.requireNonNull(this.c);
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.internal.ILocationStatusCallback");
        return (iInterface0 instanceof cnil) ? ((cnil)iInterface0) : new cnij(iBinder0);
    }

    public static LocationReceiver e(PendingIntent pendingIntent0) {
        return new LocationReceiver(3, null, null, pendingIntent0, "PendingIntent@" + pendingIntent0.hashCode());
    }

    public static LocationReceiver f(cmnt cmnt0) {
        return LocationReceiver.i(null, cmnt0, "ILocationCallback@" + System.identityHashCode(cmnt0.asBinder()));
    }

    public static LocationReceiver g(cmnw cmnw0) {
        return LocationReceiver.j(null, cmnw0, "ILocationListener@" + System.identityHashCode(cmnw0.asBinder()));
    }

    public static LocationReceiver h(cnil cnil0) {
        return new LocationReceiver(4, null, cnil0.asBinder(), null, null);
    }

    public static LocationReceiver i(IInterface iInterface0, cmnt cmnt0, String s) {
        if(iInterface0 == null) {
            iInterface0 = null;
        }
        return new LocationReceiver(2, ((IBinder)iInterface0), cmnt0.asBinder(), null, s);
    }

    public static LocationReceiver j(IInterface iInterface0, cmnw cmnw0, String s) {
        if(iInterface0 == null) {
            iInterface0 = null;
        }
        return new LocationReceiver(1, ((IBinder)iInterface0), cmnw0.asBinder(), null, s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.b);
        baub.D(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

