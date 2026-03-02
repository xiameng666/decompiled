package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cnpr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.List;

public class PlaceOpeningHoursEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final List a;
    final List b;

    static {
        PlaceOpeningHoursEntity.CREATOR = new cnpr();
    }

    public PlaceOpeningHoursEntity(List list0, List list1) {
        this.a = DesugarCollections.unmodifiableList(list0);
        this.b = DesugarCollections.unmodifiableList(list1);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

