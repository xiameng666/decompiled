package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import emuh;
import java.util.List;

public class FieldMask extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        FieldMask.CREATOR = new emuh();
    }

    public FieldMask(List list0) {
        this.a = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

