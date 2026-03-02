package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elaa;

public class RequestAppIndexingUpdateIndexCall.Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        RequestAppIndexingUpdateIndexCall.Request.CREATOR = new elaa();
    }

    public RequestAppIndexingUpdateIndexCall.Request(String s) {
        this.a = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

