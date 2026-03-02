package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dkhs;

public class OcrAvailabilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;

    static {
        OcrAvailabilityRequest.CREATOR = new dkhs();
    }

    public OcrAvailabilityRequest(long v) {
        this.a = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

