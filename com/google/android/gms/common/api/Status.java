package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aztk;
import azuj;
import azum;
import basz;
import bata;
import batl;
import baub;
import bbqa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable implements azuj, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public final int i;
    public final String j;
    public final PendingIntent k;
    public final ConnectionResult l;

    static {
        Status.a = new Status(-1);
        Status.b = new Status(0);
        Status.c = new Status(14);
        Status.d = new Status(8);
        Status.e = new Status(15);
        Status.f = new Status(16);
        Status.g = new Status(17);
        Status.h = new Status(18);
        Status.CREATOR = new azum();
    }

    public Status(int v) {
        this(v, null);
    }

    public Status(int v, String s) {
        this(v, s, null);
    }

    public Status(int v, String s, PendingIntent pendingIntent0) {
        this(v, s, pendingIntent0, null);
    }

    public Status(int v, String s, PendingIntent pendingIntent0, ConnectionResult connectionResult0) {
        this.i = v;
        this.j = s;
        this.k = pendingIntent0;
        this.l = connectionResult0;
    }

    public Status(ConnectionResult connectionResult0, String s) {
        this(17, s, connectionResult0.d, connectionResult0);
    }

    @Override  // azuj
    public final Status a() {
        return this;
    }

    public final String b() {
        return this.j == null ? aztk.d(this.i) : this.j;
    }

    public final void c(Activity activity0, int v) {
        if(!this.d()) {
            return;
        }
        batl.s(this.k);
        activity0.startIntentSenderForResult(this.k.getIntentSender(), v, null, 0, 0, 0, (bbqa.d() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null));
    }

    public final boolean d() {
        return this.k != null;
    }

    public final boolean e() {
        return this.i <= 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof Status) ? this.i == ((Status)object0).i && bata.b(this.j, ((Status)object0).j) && bata.b(this.k, ((Status)object0).k) && bata.b(this.l, ((Status)object0).l) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.i), this.j, this.k, this.l});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("statusCode", this.b(), arrayList0);
        basz.b("resolution", this.k, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.i);
        baub.v(parcel0, 2, this.j, false);
        baub.t(parcel0, 3, this.k, v, false);
        baub.t(parcel0, 4, this.l, v, false);
        baub.c(parcel0, v1);
    }
}

