package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azpm;
import basz;
import bata;
import baub;
import cnpv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class PlacesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final PlacesParams a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    static {
        PlacesParams.a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
        PlacesParams.CREATOR = new cnpv();
    }

    public PlacesParams(String s, String s1, String s2, String s3, int v, int v1) {
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v;
        this.g = v1;
    }

    public PlacesParams(String s, Locale locale0, String s1) {
        this(s, locale0.toLanguageTag(), s1, null, azpm.b, 0);
    }

    public PlacesParams(String s, Locale locale0, String s1, String s2, int v) {
        this(s, locale0.toLanguageTag(), s1, s2, azpm.b, v);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && (object0 instanceof PlacesParams) && this.f == ((PlacesParams)object0).f && this.g == ((PlacesParams)object0).g && this.c.equals(((PlacesParams)object0).c) && this.b.equals(((PlacesParams)object0).b) && bata.b(this.d, ((PlacesParams)object0).d) && bata.b(this.e, ((PlacesParams)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, ((int)this.f), ((int)this.g)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("clientPackageName", this.b, arrayList0);
        basz.b("locale", this.c, arrayList0);
        basz.b("accountName", this.d, arrayList0);
        basz.b("gCoreClientName", this.e, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.b, false);
        baub.v(parcel0, 2, this.c, false);
        baub.v(parcel0, 3, this.d, false);
        baub.v(parcel0, 4, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.o(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

