package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import emur;
import java.util.List;

public class LocationHistorySegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final FieldMask b;
    public final boolean c;

    static {
        LocationHistorySegmentRequest.CREATOR = new emur();
    }

    public LocationHistorySegmentRequest(List list0, FieldMask fieldMask0, boolean z) {
        this.a = list0;
        this.b = fieldMask0;
        this.c = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.e(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

