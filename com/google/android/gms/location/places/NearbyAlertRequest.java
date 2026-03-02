package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import cnmt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final NearbyAlertFilter c;
    public final boolean d;
    public final int e;
    public int f;

    static {
        NearbyAlertRequest.CREATOR = new cnmt();
    }

    public NearbyAlertRequest(int v, int v1, PlaceFilter placeFilter0, NearbyAlertFilter nearbyAlertFilter0, boolean z, int v2, int v3) {
        NearbyAlertFilter nearbyAlertFilter1 = null;
        super();
        this.f = 110;
        this.a = v;
        this.b = v1;
        if(nearbyAlertFilter0 != null) {
            this.c = nearbyAlertFilter0;
        }
        else if(placeFilter0 == null) {
            this.c = null;
        }
        else if(placeFilter0.f != null && !placeFilter0.f.isEmpty()) {
            this.c = NearbyAlertFilter.b(placeFilter0.f);
        }
        else {
            if(placeFilter0.e != null && !placeFilter0.e.isEmpty()) {
                nearbyAlertFilter1 = NearbyAlertFilter.c(placeFilter0.e);
            }
            this.c = nearbyAlertFilter1;
        }
        this.d = z;
        this.e = v2;
        this.f = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof NearbyAlertRequest) ? this.a == ((NearbyAlertRequest)object0).a && this.b == ((NearbyAlertRequest)object0).b && bata.b(this.c, ((NearbyAlertRequest)object0).c) && this.f == ((NearbyAlertRequest)object0).f && this.e == ((NearbyAlertRequest)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), this.c, ((int)this.f), ((int)this.e)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("transitionTypes", Integer.valueOf(this.a), arrayList0);
        basz.b("loiteringTimeMillis", Integer.valueOf(this.b), arrayList0);
        basz.b("nearbyAlertFilter", this.c, arrayList0);
        basz.b("priority", Integer.valueOf(this.f), arrayList0);
        basz.b("radiusType", Integer.valueOf(this.e), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 4, this.c, v, false);
        baub.e(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.o(parcel0, 7, this.f);
        baub.c(parcel0, v1);
    }
}

