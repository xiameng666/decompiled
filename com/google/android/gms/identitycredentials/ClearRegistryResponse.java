package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxuc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ClearRegistryResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        ClearRegistryResponse.CREATOR = new bxuc();
    }

    public ClearRegistryResponse(boolean z) {
        this.a = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

