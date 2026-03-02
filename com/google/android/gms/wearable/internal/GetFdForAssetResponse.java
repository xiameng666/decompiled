package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdij;

public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final ParcelFileDescriptor b;

    static {
        GetFdForAssetResponse.CREATOR = new fdij();
    }

    public GetFdForAssetResponse(int v, ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = v;
        this.b = parcelFileDescriptor0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.t(parcel0, 3, this.b, v | 1, false);
        baub.c(parcel0, v1);
    }
}

