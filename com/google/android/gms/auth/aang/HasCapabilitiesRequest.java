package com.google.android.gms.auth.aang;

import actx;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final GoogleAccount a;
    public final List b;

    static {
        HasCapabilitiesRequest.CREATOR = new actx();
    }

    public HasCapabilitiesRequest(GoogleAccount googleAccount0, List list0) {
        this.a = googleAccount0;
        this.b = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.x(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

