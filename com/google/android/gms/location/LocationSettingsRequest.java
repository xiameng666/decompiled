package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cmoh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        LocationSettingsRequest.CREATOR = new cmoh();
    }

    public LocationSettingsRequest(List list0, boolean z, boolean z1) {
        this.c = list0;
        this.a = z;
        this.b = z1;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a(), false);
        baub.e(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

