package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azed;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SamplerDecisionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final long b;

    static {
        SamplerDecisionParcelable.CREATOR = new azed();
    }

    public SamplerDecisionParcelable(boolean z, long v) {
        this.a = z;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

