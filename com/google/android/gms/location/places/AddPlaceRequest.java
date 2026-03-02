package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import basz;
import batl;
import baub;
import cnmg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final LatLng b;
    public final String c;
    public final List d;
    public final String e;
    public final Uri f;

    static {
        AddPlaceRequest.CREATOR = new cnmg();
    }

    public AddPlaceRequest(String s, LatLng latLng0, String s1, List list0, String s2, Uri uri0) {
        batl.q(s);
        this.a = s;
        batl.s(latLng0);
        this.b = latLng0;
        batl.q(s1);
        this.c = s1;
        batl.s(list0);
        ArrayList arrayList0 = new ArrayList(list0);
        this.d = arrayList0;
        boolean z = true;
        batl.c(((boolean)(arrayList0.isEmpty() ^ 1)), "At least one place type should be provided.");
        if(TextUtils.isEmpty(s2) && uri0 == null) {
            z = false;
        }
        batl.c(z, "One of phone number or URI should be provided.");
        this.e = s2;
        this.f = uri0;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("name", this.a, arrayList0);
        basz.b("latLng", this.b, arrayList0);
        basz.b("address", this.c, arrayList0);
        basz.b("placeTypes", this.d, arrayList0);
        basz.b("phoneNumer", this.e, arrayList0);
        basz.b("websiteUri", this.f, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.E(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

