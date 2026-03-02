package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SearchAdRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        SearchAdRequestParcel.CREATOR = new bv();
    }

    public SearchAdRequestParcel(String s) {
        this.a = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 15, this.a, false);
        baub.c(parcel0, v1);
    }
}

