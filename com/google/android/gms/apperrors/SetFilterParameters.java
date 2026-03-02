package com.google.android.gms.apperrors;

import acal;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class SetFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final int b;

    static {
        SetFilterParameters.CREATOR = new acal();
    }

    public SetFilterParameters(List list0, int v) {
        this.a = list0;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

