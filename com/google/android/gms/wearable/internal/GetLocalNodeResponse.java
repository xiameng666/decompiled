package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdil;

public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final NodeParcelable b;

    static {
        GetLocalNodeResponse.CREATOR = new fdil();
    }

    public GetLocalNodeResponse(int v, NodeParcelable nodeParcelable0) {
        this.a = v;
        this.b = nodeParcelable0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.t(parcel0, 3, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

