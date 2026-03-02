package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdlh;
import java.util.List;

public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final long b;
    public final List c;

    static {
        StorageInfoResponse.CREATOR = new fdlh();
    }

    public StorageInfoResponse(int v, long v1, List list0) {
        this.a = v;
        this.b = v1;
        this.c = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.q(parcel0, 3, this.b);
        baub.y(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

