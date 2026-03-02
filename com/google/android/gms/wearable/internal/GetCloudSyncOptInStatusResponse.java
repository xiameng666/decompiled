package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdhz;

public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        GetCloudSyncOptInStatusResponse.CREATOR = new fdhz();
    }

    public GetCloudSyncOptInStatusResponse(int v, boolean z, boolean z1) {
        this.a = v;
        this.b = z;
        this.c = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

