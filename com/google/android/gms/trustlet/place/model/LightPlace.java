package com.google.android.gms.trustlet.place.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import ezls;

public abstract class LightPlace implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        LightPlace.CREATOR = new ezls();
    }

    public abstract LatLng a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b());
        parcel0.writeString(this.c());
        parcel0.writeString(this.d());
        LatLng latLng0 = this.a();
        if(latLng0 != null) {
            parcel0.writeDouble(latLng0.a);
            parcel0.writeDouble(latLng0.b);
        }
    }
}

