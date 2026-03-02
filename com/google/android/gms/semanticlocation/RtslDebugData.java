package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elwe;
import java.util.List;

public class RtslDebugData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;

    static {
        RtslDebugData.CREATOR = new elwe();
    }

    public RtslDebugData(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.H(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

