package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import cnqa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AliasedPlacesResult extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final Status a;
    public final List b;

    static {
        AliasedPlacesResult.CREATOR = new cnqa();
    }

    public AliasedPlacesResult(Status status0, List list0) {
        this.a = status0;
        this.b = list0;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

