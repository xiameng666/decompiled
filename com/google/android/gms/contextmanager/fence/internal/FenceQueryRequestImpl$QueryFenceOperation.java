package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bcuu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class FenceQueryRequestImpl.QueryFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final List b;

    static {
        FenceQueryRequestImpl.QueryFenceOperation.CREATOR = new bcuu();
    }

    public FenceQueryRequestImpl.QueryFenceOperation(int v, List list0) {
        this.a = v;
        this.b = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.x(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

