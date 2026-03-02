package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import cnnu;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    public final String c;
    public final String d;

    static {
        PlaceReport.CREATOR = new cnnu();
    }

    public PlaceReport(int v, String s, String s1, String s2) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PlaceReport) ? bata.b(this.b, ((PlaceReport)object0).b) && bata.b(this.c, ((PlaceReport)object0).c) && bata.b(this.d, ((PlaceReport)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("placeId", this.b, arrayList0);
        basz.b("tag", this.c, arrayList0);
        String s = this.d;
        if(!"unknown".equals(s)) {
            basz.b("source", s, arrayList0);
        }
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

