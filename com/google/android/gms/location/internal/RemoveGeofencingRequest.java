package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import cnlf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gged_interceptors;
import ggna;
import java.util.List;

public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final PendingIntent b;
    public final String c;

    static {
        RemoveGeofencingRequest.CREATOR = new cnlf();
    }

    public RemoveGeofencingRequest(List list0, PendingIntent pendingIntent0, String s) {
        this.a = list0 == null ? ggna.a : gged_interceptors.i(list0);
        this.b = pendingIntent0;
        this.c = s;
    }

    public static RemoveGeofencingRequest a(List list0) {
        batl.t(list0, "geofence can\'t be null.");
        batl.c(((boolean)(list0.isEmpty() ^ 1)), "Geofences must contains at least one id.");
        return new RemoveGeofencingRequest(list0, null, "");
    }

    public static RemoveGeofencingRequest b(PendingIntent pendingIntent0) {
        batl.t(pendingIntent0, "PendingIntent can not be null.");
        return new RemoveGeofencingRequest(null, pendingIntent0, "");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

